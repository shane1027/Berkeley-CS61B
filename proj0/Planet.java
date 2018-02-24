public class Planet {
	public double xxPos;
	public double yyPos;
	public double xxVel;
	public double yyVel;
	public double mass;
	public String imgFileName;

	public static final double G = 6.67e-11;

	/** calculate the distance between this and
	 * the given planet	*/
	public double calcDistance(Planet p) {
		double xDiff = Math.abs(this.xxPos - p.xxPos);
		double yDiff = Math.abs(this.yyPos - p.yyPos);
		
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}

	/**	calculate force exerted on this planet
	 * by another	*/
	public double calcForceExertedBy(Planet p) {
		return (G*this.mass*p.mass) / (calcDistance(p)*calcDistance(p));
	}

	/** calculate force in the x direction	*/
	public double calcForceExertedByX(Planet p) {
		return (calcForceExertedBy(p) *(p.xxPos - this.xxPos)) / calcDistance(p);
	}

	/** calculate force in the y direction 	*/
	public double calcForceExertedByY(Planet p) {
		return (calcForceExertedBy(p) *(p.yyPos - this.yyPos)) / calcDistance(p);
	}

	/** sum the net force in x direction 	*/
	public double calcNetForceExertedByX(Planet[] plnz) {
		double x_sum = 0;

		for (Planet p : plnz) {
			if (this.equals(p)) {
				continue;
			}
			x_sum += calcForceExertedByX(p);
		}
		
		return x_sum;
	}
		
	/** sum the net force in y direction 	*/
	public double calcNetForceExertedByY(Planet[] plnz) {
		double y_sum = 0;

		for (Planet p : plnz) {
			if (this.equals(p)) {
				continue;
			}
			y_sum += calcForceExertedByY(p);
		}
		
		return y_sum;
	}

	public void update(double time, double xNet, double yNet) {
		double xAccel = xNet / this.mass;
		double yAccel = yNet / this.mass;
		this.xxVel += time*xAccel;
		this.yyVel += time*yAccel;
		this.xxPos += time*this.xxVel;
		this.yyPos += time*this.yyVel;
	}

	/** draw the current planet to the screen	*/
	public void draw() {
		StdDraw.picture(this.xxPos, this.yyPos, "images/" + this.imgFileName);
	}

	public Planet(double xP, double yP, double xV,
				  double yV, double m, String img) {
		this.xxPos = xP;
		this.yyPos = yP;
		this.xxVel = xV;
		this.yyVel = yV;
		this.mass = m;
		this.imgFileName = img;
	}

	public Planet(Planet p) {
		this.xxPos = p.xxPos;
		this.yyPos = p.yyPos;
		this.xxVel = p.xxVel;
		this.yyVel = p.yyVel;
		this.mass = p.mass;
		this.imgFileName = p.imgFileName;
	}


}