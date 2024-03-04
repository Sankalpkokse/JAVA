package Assignement1;

import java.util.*;

public class assignment5 {
/*
1. create a class named 'collectionDemo' and main perform following task
        a. create an arrayList of string and add at least 5 different string to it
        b. create a hashset of integer and add at least 5 unique integer to it
        c. create a hashmap that mapps names(String) to ages(Integer) and add at least 3 unique name-age pair to it
        d. use an iterator to iterate through the arrayList and print each pair
        e. use a for each loop to iterate through hashSet and print each element
        e. use a for each loop to iterate through hashMap and print each name-age pair
        f. check if a specific name exists in the hashMap and if it  does, print the corresponding age
 */
    public static void main(String[] args) {
        List<String> arraylist = new ArrayList<String>(); // a
        arraylist.add("Sankalp");
        arraylist.add("Omkar");
        arraylist.add("Sarfaraz");
        arraylist.add("Ajay");
        arraylist.add("Shubham");

        Set<Integer> hashset = new HashSet<Integer>(); // b
        hashset.add(21);
        hashset.add(22);
        hashset.add(38);
        hashset.add(38);
        hashset.add(31);

        Map<String,Integer> hashmap = new HashMap<String, Integer>(); // c
        hashmap.put("Sankalp",22);
        hashmap.put("Omkar",22);
        hashmap.put("Sarfaraz",38);
        hashmap.put("Ajay",38);
        hashmap.put("Shubham",31);


        Iterator<String> it = arraylist.iterator(); // d
        System.out.print("Printing arrayList elements through iterator: ");
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();

        System.out.print("Printing hashSet elements: "); // e
        for(Integer i: hashset){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Printing hashMap elements by forEach(): "); // f
        hashmap.forEach((key,value)-> System.out.println("key: "+ key + " ,value: " + value)); //

        System.out.println("Printing hashMap elements by for-each loop");
        for(Map.Entry<String,Integer> j: hashmap.entrySet()){
            System.out.println("key:" + j.getKey() + " ,value: " + j.getValue());
        }

        System.out.println("printing the age of sankalp from hashMap: " + hashmap.get("Sankalp"));
    }
}
