package ex_04_Operators;

public class Lab0032_Logical_Operators {
    public static void main(String[] args) {
        //AND - This will be only true when both are true
        boolean b = true;
        System.out.println(b);
        // it will print normal true
        System.out.println(!b);// it will print reverse of b i.e. false this what the logical AND
        System.out.println(!!b);  //double !! means revers of old value i.e. true
        //OR
        boolean c = true || false;
        System.out.println(c);
        // in the above case - 1 - 0 --1 is for true and 0 is for false
        //1 --- 0 = true
        boolean l = false && true;
        System.out.println(l);
        //In case of &&  0-----1 is always false  0-false and 1-true


    }
}
