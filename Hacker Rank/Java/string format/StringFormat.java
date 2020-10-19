import java.util.Scanner;

public class StringFormat {


    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                String sa=String.format("%-15s %05d",s1,x);
                System.out.println(sa);
                //Complete this line
            }
            System.out.println("================================");

    }
}
