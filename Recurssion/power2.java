import java.util.Scanner;

public class power2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int xn = square(x,n);
        System.out.println(xn);
    }
  public static int square(int x, int n){
      if(n==0){
          return 1;

      }
      int xn = square(x,n/2);
      int xnx = xn*xn;
      if(n%2==1){
          xnx=xnx * x;
      }
      return xnx;
  }
}
