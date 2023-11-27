import java.util.*;

/**
 * Caesar
 */
public class Caesar {

    public static void main(String[] args) {
        String alphabets="abcdefghijklmnopqrstuvwxyz";
        String cipherString="";
        Scanner s=new Scanner(System.in);
        System.out.println("Enter plain text:");
        String plaintext=s.nextLine();
        for(int i=0;i<plaintext.length();i++){
            cipherString=cipherString+alphabets.charAt((alphabets.indexOf(plaintext.charAt(i))+3)%26);
            
        }
        System.out.println(cipherString);
        s.close();
    }
}