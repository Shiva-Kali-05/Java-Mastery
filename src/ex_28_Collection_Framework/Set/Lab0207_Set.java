package ex_28_Collection_Framework.Set;

import com.sun.tools.javac.Main;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab0207_Set {
    public static void main(String[] args) {
        Set ab = new HashSet();//default capacity is given
        //can we add duplicates?
        ab.add("Shiva");
        ab.add("Shiva");
        ab.add("shiva");
        System.out.println(ab);// it will print only two names shiva and Shiva.

        Set l = new LinkedHashSet();
        l.add("Nihal");
        l.add("Nihal");
        l.add("nihal");
        System.out.println(l);

        Set t = new TreeSet();
        t.add("Kali");
        t.add("Kali");
        System.out.println(t);


    }


}
