package Test;

import Models.Triangle;
import Models.ValueDefault;

import java.util.*;

public class TriangleTestPrepareBVA {
    private static List<Integer> data = Arrays.asList(ValueDefault.TRIANGLE_MIN_SIZE,
            ValueDefault.TRIANGLE_MIN_SIZE + 1,
            Math.round((ValueDefault.TRIANGLE_MIN_SIZE + ValueDefault.TRIANGLE_MAX_SIZE) / 2),
            ValueDefault.TRIANGLE_MAX_SIZE - 1,
            ValueDefault.TRIANGLE_MAX_SIZE
    );
    private int index = 1;
    private static StringBuilder output = new StringBuilder();

    public void createTest() {
        output.append("INDEX\tA\t\tB\t\tC\t\tEXPECTED\n");
        for(int value: data){
            output.append(index++ +"\t\t");
            output.append(value+"\t\t"+data.get(2)+"\t\t"+data.get(2)+"\t\t");
            Triangle triangle = new Triangle(value,data.get(2),data.get(2));
            output.append(triangle.classifyTriangle()+"\n");
        }
        for(int value: data){
            if(data.get(2)==value) continue;
            output.append(index++ +"\t\t");
            output.append(data.get(2)+"\t\t"+value+"\t\t"+data.get(2)+"\t\t");
            Triangle triangle = new Triangle(data.get(2),value,data.get(2));
            output.append(triangle.classifyTriangle()+"\n");
        }
        for(int value: data){
            if(data.get(2)==value) continue;
            output.append(index++ +"\t\t");
            output.append(data.get(2)+"\t\t"+data.get(2)+"\t\t"+value+"\t\t");
            Triangle triangle = new Triangle(data.get(2),data.get(2),value);
            output.append(triangle.classifyTriangle()+"\n");
        }
        System.out.println(output);
    }
}
