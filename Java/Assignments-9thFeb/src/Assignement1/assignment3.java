package Assignement1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
    a. create an array of Integer containing atleast 8 values
    b. use lambda expression to find and print the maximum value int the array
    c. create a list of strings(words) contaiing at least 5 different words
    d. use lambda expression to filter the list to include only words that contain the letter "a"
    e. use lambda expression to map the filtered words to uppercase and store the result in a new list
    f. print the resulting list of uppercase words.
    g. create an interface named 'MathOperation' with a single abstract method that takes two integers as parameters and return
        an integer result. define Func Interface for addition, subtraction, multiplicatiob abd division using MathOperation.
    h. implement a method 'operate' that takes two integer and a 'MathOperation' and performs the specified operation
    i. use the 'operate' method to perform addition, substraction, multiplication, division, operation with two integer and print
        result using lambda expression and function interface
 */
/*
interface MathOperation{
    int methodOfMethOp(int a, int b);
}
class addition implements MathOperation{
    @Override
    public int methodOfMethOp(int a, int b) {
        return a+b;
    }
}*/
public class assignment3 {
    public static void main(String[] args) {
        int[] arr = {1,423,3,4,5,6,7,8};
//        Arrays.asList(arr).stream().reduce((a, b) -> a > b ? a : b); // if we dont pass identity it takes 0th index value.
        System.out.println(Arrays.stream(arr).reduce(-1,(a, b) -> a > b ? a : b)); //reduce(identity, BinaryOperator Function)
//        identity = initial value, BinaryOperator Function = (result, accumulator)  result of lambda function will be stored in result
//        which will be passed as accumulator for next loop. (ie accumulator will be equal to result
        List<String> words = Arrays.asList("Sankalp", "Sarfaraz", "Ajay", "Shubh", "Om");
        String word = "Sankalp";
        Stream<String> filteredWords = words.stream().filter((s)->s.contains("a"));
        List<String> upperListWords = new ArrayList<String>();

        Iterator<String> it = filteredWords.iterator();
        while (it.hasNext()){
            upperListWords.add(it.next().toUpperCase());
        }
        System.out.println(upperListWords);
    }
}
