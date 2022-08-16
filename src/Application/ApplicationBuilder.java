package Application;

import java.util.Scanner;

public class ApplicationBuilder {
    private final ApplicationBuilder builder = new ApplicationBuilder();
    private Scanner scanner = new Scanner(System.in);

    public ApplicationBuilder getInstance(){
        return this;
    }

    public void run() {
        int actionNumber = 0;
        do {
            actionNumber = scanner.nextInt();
            System.out.println(showMenu());
            doAction(actionNumber);
        } while (actionNumber == 3);
    }

    private String showMenu(){
        String menu = "---------------------";
        menu += "Welcome to Testing System";
        menu += "1. Triangle";
        menu += "2. Commission";
        menu += "3. Exit";
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
        System.out.println("testing Triangle is running");
    }

    private void testCommission(){
        System.out.println("testing commission is running");
    }
}
