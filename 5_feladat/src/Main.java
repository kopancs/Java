
public class Main {

	public static void main(String[] args) {
		int szam=12;
		if (szam%2==0) {
			System.out.println(szam+" páros");
		}else {
			System.out.println(szam+" páratlan");
		}

	
		switch (szam%2) {
		case 0: System.out.println(szam+" páros");
		break;
		case 1: System.out.println(szam+" páratlan");
		break;
		}
	}

}
