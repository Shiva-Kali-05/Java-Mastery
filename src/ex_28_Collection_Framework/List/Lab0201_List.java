package ex_28_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab0201_List {
    public static void main(String[] args) {
        //List is a Interface- (Interface allow only two methods one is default and one is static)
        List fruits = List.of("Orange","Apple","Banana", "Orange");//it allow duplicate value
        System.out.println(fruits);

        //Question - Can we create an object of the list? Ans is "No" because List is an interface and we cannot create a object
        //List mylist = new List();
        // for object creation, will have to use ArrayList - ArrayList is class which implements List interface

        // if something is implements then we can use dynamic dispatch

        List mylist1 = new ArrayList(); //dynamic dispatch
        // the advantages of using dynamic dispatch is - we use all the inbuilt methods of arraylist
        // examples of add method, here we can add any type of data, this is one of the advantage
         mylist1.add("Nihal");
         mylist1.add(1234);
         mylist1.add(12.255);
         mylist1.add(true);
         mylist1.add('a');
         mylist1.add("Nihal");
         //it solves the biggest problem of array
        System.out.println(mylist1);




    }
}
