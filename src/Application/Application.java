package Application;


import Test.CommissionBVA;
import Test.CommissionRobustBVA;
import Test.TriangleTestPrepareBVA;
import Test.TriangleTestPrepareRBVA;

public class Application {
    public static void main(String[] args) {
        ApplicationBuilder builder = ApplicationBuilder.getInstance();
        builder.run();
    }
}
