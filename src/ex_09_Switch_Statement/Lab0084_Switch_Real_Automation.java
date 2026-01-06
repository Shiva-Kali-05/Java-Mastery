package ex_09_Switch_Statement;

import java.util.Scanner;

public class Lab0084_Switch_Real_Automation {
    public static void main(String[] args) {
        //Web browser
        //I will ask the user to give me the input from browser which he wants, will start accordingly

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name");
        String browser = sc.nextLine();
        browser=browser.toLowerCase();
        switch (browser)
        {
            case "chrome":
                System.out.println("Starting the chrome browser");
                System.out.println(".......");
                System.out.println("Test case1");
                System.out.println("Test case 2");
                break;
            case "edge":
                System.out.println("Starting the edge browser");
                System.out.println(".......");
                System.out.println("Test case1");
                System.out.println("Test case 2");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                System.out.println(".......");
                System.out.println("Test case1");
                System.out.println("Test case 2");
                break;
            case "default":
                System.out.println("No idea about this browser");
                break;
        }
    }
}
