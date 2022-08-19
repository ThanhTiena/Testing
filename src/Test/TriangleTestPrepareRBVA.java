package Test;

import Models.Triangle;
import Models.ValueDefault;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TriangleTestPrepareRBVA {
    private static List<Integer> data = Arrays.asList(
            ValueDefault.TRIANGLE_MIN_SIZE - 1,
            ValueDefault.TRIANGLE_MIN_SIZE,
            ValueDefault.TRIANGLE_MIN_SIZE + 1,
            Math.round((ValueDefault.TRIANGLE_MIN_SIZE + ValueDefault.TRIANGLE_MAX_SIZE) / 2),
            ValueDefault.TRIANGLE_MAX_SIZE - 1,
            ValueDefault.TRIANGLE_MAX_SIZE,
            ValueDefault.TRIANGLE_MAX_SIZE + 1
    );
    private int index = 1;
    private static StringBuilder output = new StringBuilder();

    public void createTest() {
        output.append("INDEX\tA\t\tB\t\tC\t\tEXPECTED\n");
        for(int value: data){
            output.append(index++ +"\t\t");
            output.append(value+"\t\t"+data.get(3)+"\t\t"+data.get(3)+"\t\t");
            Triangle triangle = new Triangle(value,data.get(3),data.get(3));
            output.append(triangle.classifyTriangle()+"\n");
        }
        for(int value: data){
            if(data.get(3)==value) continue;
            output.append(index++ +"\t\t");
            output.append(data.get(3)+"\t\t"+value+"\t\t"+data.get(3)+"\t\t");
            Triangle triangle = new Triangle(data.get(3),value,data.get(3));
            output.append(triangle.classifyTriangle()+"\n");
        }
        for(int value: data){
            if(data.get(3)==value) continue;
            output.append(index++ +"\t\t");
            output.append(data.get(3)+"\t\t"+data.get(3)+"\t\t"+value+"\t\t");
            Triangle triangle = new Triangle(data.get(3),data.get(3),value);
            output.append(triangle.classifyTriangle()+"\n");
        }
        System.out.println(output);
    }
}
