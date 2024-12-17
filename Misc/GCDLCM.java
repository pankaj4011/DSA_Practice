import java.util.Scanner;

public class GCDLCM {
    static int gcd(int a, int b){
        if(b==0)
            return a;
        else   
            return gcd(b, a%b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int  a = s.nextInt();
        int b  = s.nextInt();
        int gcd = gcd(a,b);
        int lcm  = (a*b)/gcd;
        System.out.println("GCD = "+gcd);
        System.out.println("LCM = "+lcm);

        s.close();
    }
    
}
