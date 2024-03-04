package Assignement1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* try this methods with streams map and filter*/

class assignment1_b{

        public static void performActionOnString(){
            List<String> list = Arrays.asList("Aman", "Sankalp", "Ajay", "Sarfaraz", "Omkar"); //    list of string containing at least 5 different words
            List<String> sortedList = list.stream().sorted().toList();//    lambda expressiion to sort the list of words in alphabetical order
            System.out.println(sortedList);
            List<String> AString= new ArrayList<>();
            AString.addAll(sortedList.stream().filter(temp -> temp.charAt(0)=='A').toList());//      lambda expression to filter the words that starts with letter A and store them in different newList
            AString.forEach(System.out::println);//      print sorted list of "A" words
        }
        }

public class assignment1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10); // create a new list of 10 Integer
        List<Integer> evenNumList = new ArrayList<>(); // filter list and create new list containing only even nos.
        list.forEach(
                (temp)->{
                    if(temp%2==0){
                        evenNumList.add(temp);
                    };
        });
//        System.out.println(evenNumList);

        List<Integer> squaredList = new ArrayList<>();// create a new list to filter newlist to square the list

        evenNumList.
                forEach((temp)->
                    {
                        temp*=temp;
                        squaredList.add(temp);
                    }
                );
//        System.out.println(squaredList);


//        int c = 0;
//        int sum = 0; // use Stream API to print sum of squared values
//        sum = squaredList.stream().mapToInt(l->l).sum();
//        System.out.println(squaredList.stream().forEach(()->));
//        System.out.println(squaredList.stream().reduce(0,(element1,element2)->element1+element2));
//        what is this method call:
//        lets unwrap this:
//        squaredList.stream() = it converts list into stream of nos.
//        .reduce = I am using reduce() becoz I want to reduce the complete list into single value which is the sum of all elements.
//        reduce(0,(element1,element2)->element1+1element2) = 0 is the initial value
//                                  and 2nd expression is the lambda expression which implements BinaryOperator interface which extends biFunction.
//                                  so internally this binaryOperator calls apply of biFunction method for (ele1, ele2) = (result, ele2) which is implemented by this lambda expression
//        also this reduce method for loop so intarnally this addition is in loop.
        assignment1_b.performActionOnString();
    }

}
