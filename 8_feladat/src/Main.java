
public class Main {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		
		if(0<a && a<10) {
			System.out.println("A sz�m 1-jegy�");
		}else if(0<a && a<100) {
			System.out.println("A sz�m 2-jegy�");
		}else if(0<a && a<1000) {
			System.out.println("A sz�m 3-jegy�");
		}else if(0<a && a<10000) {
			System.out.println("A sz�m 4-jegy�");
		}else if(0<a && a<100000) {
			System.out.println("A sz�m 5-jegy�");
		}else if(0<a && a<1000000) {
			System.out.println("A sz�m 6-jegy�");
		}else {
			System.out.println("A sz�mnak 1 �s 1000000 k�z�tt kell lennie.");
		}
		

	}

}
