import java.util.Scanner;

public class Transpose {
    public void encrypt(String text){
        char[][] arr=new char[4][4];
        int ind=0;
        for(int i=0;i<4;i++){
            
            for(int j=0;j<4;j++){
                if(ind==text.length()){
                    break;
                }
                else{
                    arr[i][j]=text.charAt(ind);
                System.out.println(arr[i][j]);
                ind=ind+1;
                }
            }
           
        }
        String cipher="";
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                cipher=cipher+arr[j][i];
            }
        }
        System.out.println(cipher);

        //decrytion

        char[][] newarr=new char[4][4];
        String plain="";
        int col=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(col==cipher.length()){
                    break;
                }
                newarr[j][i]=cipher.charAt(col);
                col=col+1;
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                plain=plain+newarr[i][j];
            }
        }
        System.out.println(plain);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the plain text:");
        String plainText= s.nextLine();
        // System.out.println("Enter the key:");
        // String key= s.nextLine();
        Transpose t=new Transpose();
        t.encrypt(plainText);
    }
}
