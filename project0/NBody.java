public class NBody {

	public static double readRadius(String TxtPath){
		In in = new In(TxtPath);
		int n = in.readInt();
		double r = in.readDouble();
		return r;
	}


	public static Planet[] readPlanets(String planetTxtPath){
		In in = new In(planetTxtPath);
		int n = in.readInt();
		double r = in.readDouble();
		Planet[] allP = new Planet[n];

		for(int j=0; j < n; j++){
			double xP = in.readDouble();
			double yP = in.readDouble();
			double xV = in.readDouble();
			double yV = in.readDouble();
			double m = in.readDouble();
			String i = in.readString();
			Planet P = new Planet(xP, yP, xV, yV, m, i);
			allP[j] = P;
		}

		return allP;
	}


	public static void main(String[] args) {
		double T = args[0];
		double dt = args[1];
		String filename = args[2];
		readRadius(filename);
		readPlanets(filename);

		public static String imageToDraw = "starfield.jpg";
		StdDraw.setScale(-100, 100);
		StdDraw.clear();
	}
}
