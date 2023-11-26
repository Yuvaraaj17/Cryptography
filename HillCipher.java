import java.util.Scanner;

public class HillCipher{

    public void encrypt(String text,String key){
        String alphabets="abcdefghijklmnopqrstuvwxyz";
        int length=text.length();
        if((length*length) == key.length()){
            int[][] keyMatrix = new int[length][length];
            int[][] textMatrix = new int[length][1];
            int ind=0;
            for(int k=0;k<length;k++){ // for adding elemets in text matrix
                int charValue=alphabets.indexOf(text.charAt(k));
                textMatrix[k][0]=charValue;
                // System.out.println(charValue);
            }


            for(int i=0;i<length;i++){ // for adding elements in key matrix
                for(int j=0;j<length;j++){ 
                    int charValue=alphabets.indexOf(key.charAt(ind));
                    keyMatrix[i][j]=charValue;
                    // System.out.print(charValue+" ");
                    ind=ind+1;
                }
                // System.out.println(" ");
            }

            // matrix multiplication
            int[][] resultMatrix=new int[length][1];
            // System.out.println("MAtrix mul");
            for(int i=0;i<length;i++){
                int result=0;
                for(int j=0;j<length;j++){
                    result=result+(keyMatrix[i][j]*textMatrix[j][0]);
                    
                }
                // System.out.println(result%26+" "+i);
                resultMatrix[i][0]=result%26;
            }

            // display result
            String cipherText="";
            for(int i=0;i<length;i++){
                cipherText=cipherText+alphabets.charAt(resultMatrix[i][0]);
                
            }
            System.out.println("Cipher text : "+cipherText); 
        }

    }

    // public static decrypt(String cipher){
    //     // initialise inversre of the matrix as it is a long pocess to find inverse

    // }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the plain text:");
        String plainText= s.nextLine();
        System.out.println("Enter the key:");
        String key= s.nextLine();
        HillCipher h=new HillCipher();
        h.encrypt(plainText,key);
    }
}