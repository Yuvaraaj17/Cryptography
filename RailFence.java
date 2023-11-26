import java.util.Scanner;

public class RailFence {
    public void encrypt(String text, int rail) {
        char[][] cipherMtrix = new char[rail][text.length()];
        int r = 0, c = 0;
        boolean flag = true;
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));

            if (flag) {
                System.out.println(r + " " + c);
                cipherMtrix[r][c] = text.charAt(i);
                r += 1;
                c += 1;
                if (r == rail) {
                    r -= 1;
                    c -= 1;
                    flag = false;
                }
            }

            else {
                r -= 1;
                c += 1;
                System.out.println(r + " " + c);
                cipherMtrix[r][c] = text.charAt(i);
                if (r == 0) {
                    r += 1;
                    c += 1;
                    flag = true;
                }

            }

        }

        String cipher = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < text.length(); j++) {
                cipher += cipherMtrix[i][j];
            }
        }
        System.out.println(cipher+" "+cipher.length()+" "+text.length());

        // char[][] newmat = cipherMtrix.clone();

       
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the plain text:");
        // String plainText = s.nextLine();
        String plainText = "geeksforgeeks";
        System.out.println("Enter the rails:");
        // int rail = s.nextInt();
        int rail = 3;
        RailFence rf = new RailFence();
        rf.encrypt(plainText, rail);
    }
}
