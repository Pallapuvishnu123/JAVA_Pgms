import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter character : ");
        char ch = s.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }

}
