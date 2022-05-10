import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Integer> arrayListSum = new ArrayList<Integer>();
        System.out.println("Enter numbers"); //if user enters =0; loop ends

        int value;
        while ((value = input.nextInt()) != 0) {
            arrayListSum.add(value);
        }

        for (int i = 0; i < arrayListSum.size(); i++) {
            if (i < arrayListSum.size() - 1) {
                System.out.print(arrayListSum.get(i) + ", ");
            } else
                System.out.println("and " + arrayListSum.get(i) + " were in the array list. The sum of that list is:\n" + sum(arrayListSum));
        }
    }
        public static int sum (ArrayList < Integer > arrayListSum) {
            int total = 0;
            for (int x : arrayListSum) {
                total += x;
            }
            return total;

        }
    }
