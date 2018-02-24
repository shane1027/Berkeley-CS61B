public class DrawTriangle {
	public int default_dims = 3;


	public void draw_n_dims () {
		int i; int j;
		for (i = 1; i <= default_dims; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public DrawTriangle(int user_dims) {
		default_dims = user_dims;		
	}
}