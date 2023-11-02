//Question-1:-
/*
Write a program that reads a list of strings and removes duplicate strings from the list
using the Stream API. Avoid using lambda expressions for this task.
*/
//Input:-
//Package Name:-
package Streams;
//Importing Array Class
import java.util.Arrays;
//Importing List Class
import java.util.List;
//Importing Collectors Class
import java.util.stream.Collectors;
//File Name:-
public class StreamAPIDemo1 {
    public static void main(String[] args) {
        // Input list of strings
        List<String> inputList = Arrays.asList("apple", "orange", "banana", "apple", "grape", "orange");

        // Remove duplicates using Stream API
        List<String> uniqueList = inputList.stream()
                .distinct()
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Original list: " + inputList);
        System.out.println("List with duplicates removed: " + uniqueList);
    }
}
//Output:-
/*
Original list: [apple, orange, banana, apple, grape, orange]
List with duplicates removed: [apple, orange, banana, grape]
*/