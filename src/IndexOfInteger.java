import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Enter number");
        for (int i = 0; i < number.size()+1; i++) {
            int num = scan.nextInt();
            if(num==0){
                System.out.println("Done entering integers into the list");
                System.out.println("What number are you looking for in the list?");
                int num2 = scan.nextInt();
                for (int j =0; j< number.size(); j++){
                    if(number.get(j) == num2){
                       System.out.println(num2 + " is at index " + j);
                    }
                }
            } else {
                number.add(num);
            }
    }
        scan.close();
}
}
