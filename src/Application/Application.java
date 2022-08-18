package Application;

import Ulities.BoundaryValueAnalysis;
import Ulities.Case;

public class Application {
    public static void main(String[] args) {
//        ApplicationBuilder builder = ApplicationBuilder.getInstance();
//        builder.run();

        BoundaryValueAnalysis test = new BoundaryValueAnalysis();
        test.createTestData(new Case(5,205),new Case(5,205),new Case(5,205));
    }
}
