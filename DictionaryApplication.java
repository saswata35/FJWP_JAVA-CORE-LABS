//Question:-
/*
Write a Java program that demonstrates the functionality of this dictionary application
using a TreeMap. Your program should include the following features:
i)A TreeMap named dictionary to store word-definition pairs.
ii)A way to input word-definition pairs and add them to the dictionary.
iii)A way to retrieve and display the definition of a specific word.
iv)An iteration through the dictionary to display all word-definition pairs in
alphabetical order based on words.
*/
//Input:-
//Package Name:-
package Collections;
//Scanner Class:-
import java.util.Scanner;
//TreeMap Class:-
import java.util.TreeMap;
//File Name:-
public class DictionaryApplication {
    public static void main(String[] args) {
        //TreeMap Function-order of insertion is maintained
    	TreeMap<String, String> dictionary = new TreeMap<>();//dictionary-TreeMap Name object 
    	//Create a Object name scanner in Scanner Class:-
        Scanner scanner = new Scanner(System.in);
        //While Loop:-
        while (true) {
            System.out.println("Dictionary Application Menu:");
            System.out.println("1. Add Word-Definition Pair");
            System.out.println("2. Retrieve and Display Definition");
            System.out.println("3. Display All Word-Definition Pairs");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            //Enter the option as Integer value name choice in scanner object
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            //switch case:-
            switch (choice) {
                case 1:
                    System.out.print("Enter the word: ");
                    String word = scanner.nextLine(); //Enter the value in word object as a String Format
                    System.out.print("Enter the definition: ");
                    String definition = scanner.nextLine();//Enter the value in definition object as a String Format
                    dictionary.put(word, definition);//put and add the value of objects(word,definition) into the TreeMap object name dictionary
                    System.out.println("Word-Definition pair added successfully!\n");
                    break;//Terminate the loop called Break.

                case 2:
                    System.out.print("Enter the word to retrieve its definition: ");
                    String lookupWord = scanner.nextLine();//Enter the value in loopupWord(word) object to retrive as a String Format
                    String lookupDefinition = dictionary.get(lookupWord);//Atomatically show or display the value of lookupDefinition(Definition) from the given the storing value of lookupWord(Word) in word-Definition Pair
                    //Check the loopupDefinition is null or not by using if-else statement
                    if (lookupDefinition != null) {
                        System.out.println("Definition: " + lookupDefinition + "\n");
                    } else {
                        System.out.println("Word not found in the dictionary.\n");
                    }
                    break;//Terminate the loop called Break.

                case 3:
                    System.out.println("All Word-Definition Pairs (in alphabetical order):");//Output must show in alphabetically
                    //This is the for-each loop syntax. It iterates over each element (in this case, each key) in the set of keys obtained from the map.
                    for (String key : dictionary.keySet()) {
                        System.out.println(key + ": " + dictionary.get(key));//Output show like Word:definition
                    }
                    System.out.println();
                    break;//Terminate the loop called Break.

                case 4:
                    System.out.println("Exiting Dictionary Application. Goodbye!");
                    System.exit(0);//Exit from the loop

                default:
                    System.out.println("Invalid choice. Please enter a valid option.\n");
            }
        }
    }
}
//Output:-
/*
Dictionary Application Menu:
1. Add Word-Definition Pair
2. Retrieve and Display Definition
3. Display All Word-Definition Pairs
4. Exit
Enter your choice: 1
Enter the word: Coding
Enter the definition: Programming
Word-Definition pair added successfully!

Dictionary Application Menu:
1. Add Word-Definition Pair
2. Retrieve and Display Definition
3. Display All Word-Definition Pairs
4. Exit
Enter your choice: 1
Enter the word: Short_Circuit
Enter the definition: Fire
Word-Definition pair added successfully!

Dictionary Application Menu:
1. Add Word-Definition Pair
2. Retrieve and Display Definition
3. Display All Word-Definition Pairs
4. Exit
Enter your choice: 1
Enter the word: Cover_Page
Enter the definition: Heading
Word-Definition pair added successfully!

Dictionary Application Menu:
1. Add Word-Definition Pair
2. Retrieve and Display Definition
3. Display All Word-Definition Pairs
4. Exit
Enter your choice: 2
Enter the word to retrieve its definition: Short_Circuit
Definition: Fire

Dictionary Application Menu:
1. Add Word-Definition Pair
2. Retrieve and Display Definition
3. Display All Word-Definition Pairs
4. Exit
Enter your choice: 2
Enter the word to retrieve its definition: Coding
Definition: Programming

Dictionary Application Menu:
1. Add Word-Definition Pair
2. Retrieve and Display Definition
3. Display All Word-Definition Pairs
4. Exit
Enter your choice: 2
Enter the word to retrieve its definition: Cover_Page
Definition: Heading

Dictionary Application Menu:
1. Add Word-Definition Pair
2. Retrieve and Display Definition
3. Display All Word-Definition Pairs
4. Exit
Enter your choice: 3
All Word-Definition Pairs (in alphabetical order):
Coding: Programming
Cover_Page: Heading
Short_Circuit: Fire

Dictionary Application Menu:
1. Add Word-Definition Pair
2. Retrieve and Display Definition
3. Display All Word-Definition Pairs
4. Exit
Enter your choice: 4
Exiting Dictionary Application. Goodbye!
*/