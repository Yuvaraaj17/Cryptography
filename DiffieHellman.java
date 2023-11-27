import java.util.Scanner;

public class DiffieHellman {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter common prime number:");
        int p=s.nextInt();
        System.out.println("Enter alpha(primitive root):");
        double g=s.nextDouble();
        boolean flag=true;
        for(int i=1;i<p;i++){
            if((Math.pow(g, i)%p>p)){
                System.out.println("Invalid primitive root....");
                flag=false;
                break;
            }
        }
        System.out.println(g);
        if(flag){
            System.out.println("Enter secret key of A:");
            double a=s.nextDouble();
            System.out.println("Enter secret key of B:");
            double b=s.nextDouble();
            double pa=Math.pow(g, a)%p;
            // System.out.println(pa);
            double pb=Math.pow(g, b)%p;
            // System.out.println(pb);
            double ya=Math.pow(pb, a)%p;           
            double yb=Math.pow(pa, b)%p;
            System.out.println(ya+" "+yb);
        }
        
        s.close();
        
    }
    
}
