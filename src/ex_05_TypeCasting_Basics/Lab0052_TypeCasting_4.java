package ex_05_TypeCasting_Basics;

public class Lab0052_TypeCasting_4 {
    public static void main(String[] args) {
        int course = 100;
        float NSRT_GST = 18.98f;
        int total = course+ (int)NSRT_GST; // we cannot use int
        System.out.println(total); // in this case .98 is not considering
        float total1=course+NSRT_GST; //
        System.out.println(total1);// This will provide a perfect answer so use float


    }
}
