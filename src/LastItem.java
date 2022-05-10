import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> text = new ArrayList<String>();
        System.out.println("Enter text");
        for (int i = 0; i < text.size()+1; i++) {
            String myString = sc.nextLine();
            if(myString.isBlank()){
                System.out.println("The last item in the list is: " + text.get(text.size() -1) + ".");
            } else {
                text.add(myString);
            }
    }
}
}
