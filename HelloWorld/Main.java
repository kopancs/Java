
public class Main {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int felulet = 2 * (a * b + b * c + a * c);
		int terfogat = a * b * c;
		System.out.println(a + " " + b + " " + c);
		System.out.println(a + b + c);

		System.out.println("A test felsz�ne: " + felulet);
		System.out.println("A test t�rfogata: " + terfogat);

		int osszeg = a + b;
		int kulonbseg = a - b;
		int szorzat = a * b;
		double hanyados = (double) a / b;

		System.out.println("a:" + args[0] + ", b:" + args[1]);
		System.out.println("�sszeg: " + osszeg);
		System.out.println("K�l�nbs�g: " + kulonbseg);
		System.out.println("Szorzat: " + szorzat);
		System.out.println("H�nyados: " + hanyados);

		
	}

}
