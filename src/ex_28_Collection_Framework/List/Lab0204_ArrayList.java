package ex_28_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lab0204_ArrayList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Shiva");
        list.add(123);
        list.add(true);
        list.add("shiva");//list allowed duplicate value
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("abc"));
        System.out.println(list.get(2));
        System.out.println(list.isEmpty());
        System.out.println(list.iterator());
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        //Print the arraylist
        System.out.println("=========================");
        for(int i=0; i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        //for each loop
        System.out.println("===========");
        for(Object o : list)
        {
            System.out.println(o);
        }


    }
}
