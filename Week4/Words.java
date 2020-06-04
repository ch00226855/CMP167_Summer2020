/*
Write a Java program that asks the user a sentence: word1 word2 word3  word4.
Your prompts to the user must be:

    Enter four works:

Output word1 and the length of word1 and the position of all the vowels (a, e, i, o, u) in word1
Output word2 and the length of word2 and the position of all the vowels (a, e, i, o, u) in word2
Output word3 and the length of word3 and the position of all the vowels (a, e, i, o, u) in word3
Output word4 and the length of word4 and the position of all the vowels (a, e, i, o, u) in word4
 */
import java.sql.SQLOutput;
import java.util.Scanner;

public class Words {

    public static void main(String[] args) {

        // 1. Use a scanner to load four words from user
        Scanner scnr = new Scanner(System.in);
        String word1, word2, word3, word4;
        System.out.println("Enter four words:");
        word1 = scnr.next();
        word2 = scnr.next();
        word3 = scnr.next();
        word4 = scnr.next();

//        System.out.println("word1:" + word1);
//        System.out.println("word2:" + word2);
//        System.out.println("word3:" + word3);
//        System.out.println("word4:" + word4);

        // 2. Find the length of each word
        int length1, length2, length3, length4;
        length1 = word1.length();
        length2 = word2.length();
        length3 = word3.length();
        length4 = word4.length();

//        System.out.println("length1:" + length1);
//        System.out.println("length2:" + length2);
//        System.out.println("length3:" + length3);
//        System.out.println("length4:" + length4);


        // 3. Find the position of vowels in each word
        int word1PosA, word1PosE, word1PosI, word1PosO, word1PosU;
        int word2PosA, word2PosE, word2PosI, word2PosO, word2PosU;
        int word3PosA, word3PosE, word3PosI, word3PosO, word3PosU;
        int word4PosA, word4PosE, word4PosI, word4PosO, word4PosU;
        word1PosA = word1.indexOf('a');
        word1PosE = word1.indexOf('e');
        word1PosI = word1.indexOf('i');
        word1PosO = word1.indexOf('o');
        word1PosU = word1.indexOf('u');

        word2PosA = word2.indexOf('a');
        word2PosE = word2.indexOf('e');
        word2PosI = word2.indexOf('i');
        word2PosO = word2.indexOf('o');
        word2PosU = word2.indexOf('u');

        word3PosA = word3.indexOf('a');
        word3PosE = word3.indexOf('e');
        word3PosI = word3.indexOf('i');
        word3PosO = word3.indexOf('o');
        word3PosU = word3.indexOf('u');

        word4PosA = word4.indexOf('a');
        word4PosE = word4.indexOf('e');
        word4PosI = word4.indexOf('i');
        word4PosO = word4.indexOf('o');
        word4PosU = word4.indexOf('u');


        // 4. Output the results

    }
}
