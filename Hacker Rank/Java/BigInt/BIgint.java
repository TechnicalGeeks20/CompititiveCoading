import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class BIgint {

	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
		 String s=scanner.next();
	        BigInteger n=new BigInteger(s);
	   
	            if(n.isProbablePrime(100000)){
	                   System.out.println("prime");
	            }
	            else{
	                   System.out.println("not prime");
	            }

	           BigInteger p=new BigInteger(s);
	           
	           System.out.println(p.add(n));
	           System.out.println(p.multiply(n));
	        scanner.close();
}
}