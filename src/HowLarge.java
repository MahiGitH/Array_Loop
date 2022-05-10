import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> text = new ArrayList<String>();
        System.out.println("Enter text");
        for (int i = 0; i < text.size()+1; i++) {
            String myString = scanner.nextLine();
            if(myString.isBlank()){
                System.out.println("The amount of items in the list was: " + text.size() + ".");
            } else {
                text.add(myString);
            }
        }
    }
}
