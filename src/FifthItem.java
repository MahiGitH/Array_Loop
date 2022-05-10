import java.util.Scanner;
import java.util.ArrayList;
public class FifthItem {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> text = new ArrayList<String>();
        System.out.println("Enter text");
        for (int i = 0; i < text.size()+1; i++) {;
            String myString = scanner.nextLine();
            if(myString.isBlank()){
                System.out.println("The fifth item in the list is: " + text.get(4) + ".");
            } else {
                text.add(myString);
            }

        }
    }
}
