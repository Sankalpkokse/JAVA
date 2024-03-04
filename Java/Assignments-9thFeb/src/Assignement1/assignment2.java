package Assignement1;

import java.util.*;

class person{
    String name;
    String gender;
    public int age;
    person(String name,String gender,int age){
        this.age=age;
        this.gender=gender;
        this.name = name;
    }
}
public class assignment2 {

/*    public static void includeOnlyFemale(List<person> l){
//        List<String> filteredString = new ArrayList<String>();
        List<person> filteredString = new ArrayList<person>();

        filteredString = l.stream().filter((temp) -> Objects.equals(temp.gender, "FeMale")).toList();
        filteredString.forEach((temp)-> System.out.println(temp.name));
    }

 */
    public static void main(String[] args) {
        List<person> personList= new ArrayList<person>();// list of person object containing attributes like name, age, gender

        personList.add(new person("Sankalp","Male",22));
        personList.add(new person("Omkar","Male",22));
        personList.add(new person("Ajay","Male",38));
        personList.add(new person("Sarfaraz","Male",37));
        personList.add(new person("Sakshi","FeMale",25));
        personList.add(new person("Pooja","FeMale",31));

//        includeOnlyFemale(personList);
        List<person> filteredPersonList = new ArrayList<>(personList.stream().filter((temp) -> Objects.equals(temp.gender, "FeMale")).toList());
        Comparator<person> com = new Comparator<person>() {
            @Override
            public int compare(person o1, person o2) {
                if(o1.age>o2.age)
                    return 1;
                else
                    return -1;
            }
        };
        Collections.sort(filteredPersonList,com);
        filteredPersonList.forEach((o1)->System.out.println(o1.name + " - " + o1.age));

    }

//    stream api
//    - filter the list to include only females
//    - sort the filtered list by age in descending order
//    - map the sorted list tp new list of names (Strings) and store it in a new list
}
