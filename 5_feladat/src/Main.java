
public class Main {

	public static void main(String[] args) {
		int szam=12;
		if (szam%2==0) {
			System.out.println(szam+" p�ros");
		}else {
			System.out.println(szam+" p�ratlan");
		}

	
		switch (szam%2) {
		case 0: System.out.println(szam+" p�ros");
		break;
		case 1: System.out.println(szam+" p�ratlan");
		break;
		}
	}

}
