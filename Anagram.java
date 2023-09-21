package com.company;

/*
An anagram of a string is another string that contains the same characters, only the order of characters can be different.
 For example, “abcd” and “dabc” are an anagram of each other.
*/

// Logic:-
/*
1. Sort both the strings
2. Compare the sorted strings
3. If they are equal return true
else return false
*/

import java.util.Arrays;

public class Anagram {

    static boolean areAnagrams(char[] str1, char[] str2) {
        // Get lengths of the strings
        int n1 = str1.length;
        int n2 = str2.length;

        // If lengths of both strings are not equal they cannot be anagrams
        if(n1 != n2){
            return false;
        }

        // Compare sorted strings
        Arrays.sort(str1);
        Arrays.sort(str2);

        // Compare sorted strings
        for(int i = 0; i < n1; i++) {
           if(str1[i] != str2[i]) return false;
        }

    return true;
    }

    public static void main(String[] args) {
    char str1[] = {'g', 'r', 'a','m'};
    char str2[] = {'a', 'r','m','g'};

    if(areAnagrams(str1, str2))
        System.out.println("The two strings are anagram of each other");
    else
        System.out.println("The two strings are not anagram of each other");
    }
}
