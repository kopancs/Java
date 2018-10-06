
public class Main {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
				
		double diszkriminans=(double) Math.sqrt((b*b)-(4*a*c));
		
//		if ((b*b-4*a*c)>0) {
	        double x1=((-b+diszkriminans)/(2*a));
	        double x2=((-b-diszkriminans)/(2*a));
	        System.out.println("2 különbözõ valós gyök: x1="+x1+" x2="+x2);
////	        }
//	    else if  ((b*b-4*a*c)==0) {
	        System.out.println("2 megegyezõ valós gyök: x1=x2="+(-b/2*a));
//	    }
//	    else {System.out.println("Nincs valós megoldás.");}
//		

	}

}
