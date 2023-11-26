import java.util.Scanner;
public class RSA {
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st prime num:");
        int a=s.nextInt();
        System.out.println("Enter 2nd prime num:");
        int b=s.nextInt();
        int n=a*b;
        double e=0;
        System.out.println(n);
        int phin=(a-1)*(b-1);
        System.out.println(phin);
        for(int i=2;i<phin;i++){
            if(gcd(i,phin)==1){
                e=i;
                break;
            }
        }
        System.out.println("Enter the message:");
        double msg=s.nextInt();
        double cipher=Math.pow(msg, e)%n;
        System.out.println(cipher);
    }
}