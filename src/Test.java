import java.util.Scanner;

/*
1. The username is between 4 and 25 characters.
2. It must start with a letter.
3. It can only contain letters, numbers, and the underscore character.
4. It cannot end with an underscore character
 */
public class Test {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        str = sc.nextLine();
        if (str.length()<4 || str.length()>25){
            System.out.println("Invalid String");
        } else if (Character.isLetter(str.charAt(0))) {

        }
    }
}
