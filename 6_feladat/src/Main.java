
public class Main {

	public static void main(String[] args) {
		int a=2;
		int b= 3;
		int c=5;
		int szam=12;
		
		if(szam%a==0) {
			System.out.println(szam+" oszthat� 2-vel");
		}else {
			System.out.println(szam+" nem oszthat� 2-vel");
		}
		if(szam%b==0) {
			System.out.println(szam+" oszthat� 3-mal");
		}else {
			System.out.println(szam+" nem oszthat� 3-mal");
		}
		if(szam%c==0) {
			System.out.println(szam+" oszthat� 5-tel");
		}else {
			System.out.println(szam+" nem oszthat� 5-tel");
		}
	}

}
