public class TestPlanet {
	public static void main(String[] args) {
		Planet p1 = new Planet(0,0,10,10,1e3,"tiny1");
		Planet p2 = new Planet(5,5,-10,10,1e3,"tiny2");
		System.out.println("Force between " + p1.imgFileName 
			+ " and " + p2.imgFileName + " equals " + p1.calcForceExertedBy(p2));
	}
}