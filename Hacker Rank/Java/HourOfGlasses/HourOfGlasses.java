import java.util.Scanner;

public class HourOgGlasses {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
        
                arr[i][j] =sc.nextInt();
            }
        }
        int max=0;
        int sum=0;
        for (int i = 0; i < 4; i++) {
        	
            for (int j = 0; j < 4; j++) {
            	sum=0;
            	sum=sum+arr[i][j]+arr[i][j+1]+arr[i][j+2];
            	sum=sum+arr[i+1][j+1];
            	sum=sum+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
            	 if(sum>max) {
                 	max=sum;
                 }
            }
           
            System.out.println(" ");
        }
        System.out.println(max);
  
    }

}
