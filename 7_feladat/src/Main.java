
public class Main {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		System.out.println("A háromszög oldalai: a="+args[0]+", b= "+args[1]+", c="+args[2]);
		
		if(a+b>c) {
			if(b+c>a) {
				if(a+c>b) {
					System.out.println("A háromszög szerkeszthetõ");
				}else {
					System.out.println("A háromszög nem szerkeszthetõ");
				}
			}else {
				System.out.println("A háromszög nem szerkeszthetõ");
			}
		}else {
			System.out.println("A háromszög nem szerkeszthetõ");
		}
	}

}
