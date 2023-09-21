// The string class doesn't have any method directly sorts the string.

// Methods:-
// 1). Without using the sort() method
// 2). By using the sort() method

// Example:-
// Input:- 'geeksforgeeks'
// Output:- 'eeeefggkkorss'

/*
 1. Convert the string into array with help of toCharArray() 
 2. Swap the elements of array
 3. Print the character array elements
 */

import java.util.Arrays;

public class String_Sort {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println("The string defined as:" + str);

        // Convert the string into array
        char arr[] = str.toCharArray();

        char temp ;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(arr);
        System.out.println("The characters of the string after sorting is"+ Arrays.toString(arr));
    }
}
