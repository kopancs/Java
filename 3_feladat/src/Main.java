
public class Main {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		int e = Integer.parseInt(args[4]);

		double avarage = (double) (a + b + c + d + e) / 5;
		System.out.println(
				"a: " + args[0] + ", b: " + args[1] + ", c: " + args[2] + ", d: " + args[3] + ", e: " + args[4]);
		System.out.println("A sz�mok sz�mtani k�zepe: " + avarage);

	}

}
