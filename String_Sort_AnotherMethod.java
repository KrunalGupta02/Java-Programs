// 2) Using the sort() method - natural sorting

import java.util.Arrays;
import java.util.Scanner;

public class String_Sort_AnotherMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String Value");
        String str = sc.nextLine();

        char charArray[] = str.toCharArray();

        Arrays.sort(charArray);
        System.out.println(new String(charArray));
        
        sc.close();
        
    }
}