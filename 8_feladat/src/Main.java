
public class Main {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		
		if(0<a && a<10) {
			System.out.println("A szám 1-jegyû");
		}else if(0<a && a<100) {
			System.out.println("A szám 2-jegyû");
		}else if(0<a && a<1000) {
			System.out.println("A szám 3-jegyû");
		}else if(0<a && a<10000) {
			System.out.println("A szám 4-jegyû");
		}else if(0<a && a<100000) {
			System.out.println("A szám 5-jegyû");
		}else if(0<a && a<1000000) {
			System.out.println("A szám 6-jegyû");
		}else {
			System.out.println("A számnak 1 és 1000000 között kell lennie.");
		}
		

	}

}
