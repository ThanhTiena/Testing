package Application;

import Test.CommissionBVA;
import Test.CommissionRobustBVA;
import Test.TriangleTestPrepareBVA;
import Test.TriangleTestPrepareRBVA;

import java.util.Scanner;

public class ApplicationBuilder {
    private static ApplicationBuilder instance = new ApplicationBuilder();
    private Scanner scanner = new Scanner(System.in);

    public static ApplicationBuilder getInstance(){
        return instance;
    }

    public void run() {
        int actionNumber = 0;
        do {
            System.out.println(showMenu());
            actionNumber = scanner.nextInt();
            doAction(actionNumber);
        } while (actionNumber != 3);
    }

    private String showMenu(){
        String menu = "---------------------\n";
        menu += "Welcome to Testing System\n";
        menu += "1. Triangle\n";
        menu += "2. Commission\n";
        menu += "3. Exit\n";
        menu += "---------------------";
        return menu;
    }

    private void doAction(int number){
        switch (number){
            case 1:
                testTriangle();
                break;
            case 2:
                testCommission();
                break;
            case 3:
                System.out.println("Exiting the system...");
                break;
            default:
                System.out.println("Out Of Service...");
                break;
        }
    }
    private void testTriangle(){
        System.out.println("Testing Triangle is running");
        TriangleTestPrepareBVA test = new TriangleTestPrepareBVA();
        test.createTest();
        TriangleTestPrepareRBVA test1 = new TriangleTestPrepareRBVA();
        test1.createTest();
    }

    private void testCommission(){
        System.out.println("testing commission is running");
        CommissionBVA test = new CommissionBVA();
        test.createTest();
        CommissionRobustBVA test1 =new CommissionRobustBVA();
        test1.createTest();
    }
}
