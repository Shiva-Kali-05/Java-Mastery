package ex_28_Collection_Framework.Set;

import java.util.HashSet;
import java.util.*;

public class Lab0208_Set_HS_LHS_TS {
    public static void main(String[] args) {
        Set<String> st = new HashSet();
        st.add("Apple");
        st.add("Orange");
        st.add("Banana");
        st.add("Banana");
        //can we add null - one null can allow
        st.add(null);
        st.add(null);
        System.out.println(st);
        //Linked List//
        Set link = new LinkedHashSet();
        link.add("Pravin");
        link.add("Pravin");
        System.out.println(link);//no duplicates
        System.out.println(link.size());
        System.out.println(link.isEmpty());
        System.out.println(link.add("pravin"));













    }
}
