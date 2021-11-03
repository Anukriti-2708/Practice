import java.util.Scanner;

public class power {
    public static void main(String[]args){

       Scanner sn = new Scanner(System.in);
       int x = sn.nextInt();
       int n = sn.nextInt();
       int xn= square(x,n);

      System.out.println(xn);
       sn.close();
    }
    public static int square(int x,int n){
        if(n==0){
            return 1;
        }
        int xn = square (x,n-1);
        int xnx = x*xn;
        return xnx;

           
    }
}
