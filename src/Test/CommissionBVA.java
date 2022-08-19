package Test;

import Models.Commission;
import Models.ValueDefault;

public class CommissionBVA {
    private double[] locks = new double[]{
            ValueDefault.COMMISSION_LOCK_MIN_SIZE,
            ValueDefault.COMMISSION_LOCK_MIN_SIZE + 1,
            Math.round((ValueDefault.COMMISSION_LOCK_MIN_SIZE + ValueDefault.COMMISSION_LOCK_MAX_SIZE) / 2),
            ValueDefault.COMMISSION_LOCK_MAX_SIZE - 1,
            ValueDefault.COMMISSION_LOCK_MAX_SIZE
    };
    private double[] stocks = new double[]{
            ValueDefault.COMMISSION_STOCK_MIN_SIZE,
            ValueDefault.COMMISSION_STOCK_MIN_SIZE + 1,
            Math.round((ValueDefault.COMMISSION_STOCK_MIN_SIZE + ValueDefault.COMMISSION_STOCK_MAX_SIZE) / 2),
            ValueDefault.COMMISSION_STOCK_MAX_SIZE - 1,
            ValueDefault.COMMISSION_STOCK_MAX_SIZE
    };
    private double[] barrales = new double[]{
            ValueDefault.COMMISSION_BARRALE_MIN_SIZE,
            ValueDefault.COMMISSION_BARRALE_MIN_SIZE + 1,
            Math.round((ValueDefault.COMMISSION_BARRALE_MIN_SIZE + ValueDefault.COMMISSION_BARRALE_MAX_SIZE) / 2),
            ValueDefault.COMMISSION_BARRALE_MAX_SIZE - 1,
            ValueDefault.COMMISSION_BARRALE_MAX_SIZE
    };
    private int index = 1;
    private StringBuilder output = new StringBuilder();
    public void createTest(){
        output.append("Index\tA\t\tB\t\tC\t\tEXPECTED\n");
        for(double testData: locks){
            output.append(index++ +"\t\t"+testData+"\t\t"+stocks[2]+"\t\t"+barrales[2]+"\t\t");
            double expect = new Commission(testData,stocks[2],barrales[2]).calculateCommission(100);
            output.append(expect+"\t\t\n");
        }
        for(double testData: stocks){
            output.append(index++ +"\t\t"+locks[2]+"\t\t"+testData+"\t\t"+barrales[2]+"\t\t");
            double expect = new Commission(locks[2],testData,barrales[2]).calculateCommission(100);
            output.append(expect+"\t\t\n");
        }
        for(double testData: barrales){
            output.append(index++ +"\t\t"+locks[2]+"\t\t"+stocks[2]+"\t\t"+testData+"\t\t");
            double expect = new Commission(locks[2],stocks[2],testData).calculateCommission(100);
            output.append(expect+"\t\t\n");
        }
        System.out.println(output);
    }

}
