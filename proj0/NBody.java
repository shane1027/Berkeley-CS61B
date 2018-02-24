public class NBody {
	public static void main(String[] args) {
		if (args.length < 3) {
			System.out.println("Please enter three arguments:");
			System.out.println("{Time} {Time Interval} {Planet Filename}");
			return;
		}

		// need to check if 'filename' exists here

		double T = Double.parseDouble(args[0]);
		double dt = Double.parseDouble(args[1]);
		String filename = args[2];
		double univRadius = readRadius(filename);
		Planet[] plnz = readPlanets(filename);

		StdDraw.enableDoubleBuffering();



		double time = 0;
		while (time < T) {
			double[] xForces = new double[plnz.length];
			double[] yForces = new double[plnz.length];

			drawBackground(univRadius*1.2, "./images/starfield.jpg");

			for (int i = 0; i < plnz.length; i++) {
				xForces[i] = plnz[i].calcNetForceExertedByX(plnz);
				yForces[i] = plnz[i].calcNetForceExertedByY(plnz);
				plnz[i].update(dt, xForces[i], yForces[i]);
				plnz[i].draw();
			}

			StdDraw.show();
			StdDraw.pause(10);
			time += dt;
		}


	}

	public static void drawBackground(double scale, String filename) {
		StdDraw.setScale(-scale,scale);
		StdDraw.clear();
		StdDraw.picture(0,0,filename,2*scale,2*scale);
	}


	public static double readRadius(String filename) {
		In file = new In(filename);
		file.readDouble();
		return file.readDouble();
	}

	public static Planet[] readPlanets(String filename) {
		In file = new In(filename);
		int numPlanets = file.readInt();
		file.readDouble();

		Planet[] plnz = new Planet[numPlanets];
		Planet temp = new Planet(0.0,0.0,0.0,0.0,0.0,"Null");

		for (int i = 0; i < numPlanets; i++) {
			temp.xxPos = file.readDouble();
			temp.yyPos = file.readDouble();
			temp.xxVel = file.readDouble();
			temp.yyVel = file.readDouble();
			temp.mass = file.readDouble();
			temp.imgFileName = file.readString();
			plnz[i] = new Planet(temp);
		}
		return plnz;
	}
}