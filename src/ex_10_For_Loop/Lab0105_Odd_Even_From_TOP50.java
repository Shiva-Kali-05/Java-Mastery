package ex_10_For_Loop;

public class Lab0105_Odd_Even_From_TOP50 {
    public static void main(String[] args) {
        for(int i =1;i<=50;i++)
        {
            if(i % 2==0)
            {
                System.out.println("Even Number" +i);
            }
            else if(i % 2 !=0)
            {
                System.out.println("Odd number" +i);
            }
        }
    }
}
