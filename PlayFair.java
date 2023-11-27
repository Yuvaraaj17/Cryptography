import java.util.Scanner;

public class PlayFair {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter text:");
        String text=s.nextLine();
        String newstr="";
        int i=0;
        while (i<text.length()) {
            if(i==text.length()-1){
                if((newstr.length()+1)%2!=0){
                    newstr=newstr+text.charAt(i)+'z';
                    break;
                }
                else{
                    newstr=newstr+text.charAt(i);
                    break;
                }
                
            }
            else{
                if(text.charAt(i)==text.charAt(i+1)){
                newstr=newstr+text.charAt(i)+'x';
                i=i+1;
            }
            else{
                newstr=newstr+text.charAt(i)+text.charAt(i+1);
                i=i+2;
            }
            }        
        }
        System.out.println(newstr);
        System.out.println("Enter the key:");
        // String key=s.nextLine();
        s.close();
    }
}

