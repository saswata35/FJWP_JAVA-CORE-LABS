//Question-2:-
/*
Create a program that reads a list of strings and concatenates them into a single
string using the Stream API. Avoid using lambda expressions for concatenation.
*/
//Input:-
//Package Name:-
package Streams;
//Importing Arrays Class
import java.util.Arrays;
//Importing List Class
import java.util.List;
//Importing and Implementing Collectors Class
import java.util.stream.Collectors;
//File Name:-
public class StreamAPIDemo2 {
    public static void main(String[] args) {
    	//List<String> stringList = ...: The result of Arrays.asList(...) is assigned to the variable stringList. 
    	//Arrays.asList("..."): This creates a fixed-size list backed by an array and initializes it with the specified elements.
        List<String> stringList = Arrays.asList("Hello", " ", "World", "!");
        //stringList.stream(): This converts the List<String> called stringList into a stream of strings.
        //.collect(Collectors.joining()): This uses the Collectors.joining() collector from the Stream API. 
        //String concatenatedString = ...: Finally, the result of the concatenation is assigned to the variable concatenatedString, which is of type String.
        String concatenatedString = stringList.stream()
                .collect(Collectors.joining());
        System.out.println("Original List: " + stringList);
        System.out.println("Concatenated String: " + concatenatedString);
    }
}
//Output:-
/*
Original List: [Hello,  , World, !]
Concatenated String: Hello World!
*/