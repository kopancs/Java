
public class Main {

	public static void main(String[] args) {
		int a=2;
		int b= 3;
		int c=5;
		int szam=12;
		
		if(szam%a==0) {
			System.out.println(szam+" osztható 2-vel");
		}else {
			System.out.println(szam+" nem osztható 2-vel");
		}
		if(szam%b==0) {
			System.out.println(szam+" osztható 3-mal");
		}else {
			System.out.println(szam+" nem osztható 3-mal");
		}
		if(szam%c==0) {
			System.out.println(szam+" osztható 5-tel");
		}else {
			System.out.println(szam+" nem osztható 5-tel");
		}
	}

}
