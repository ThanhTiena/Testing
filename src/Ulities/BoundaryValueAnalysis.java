package Ulities;

import java.util.*;

public class BoundaryValueAnalysis {
    private Map<String, Object> data;
    private List<List<Integer>> testCases;

    public BoundaryValueAnalysis(){
        testCases = new ArrayList<>();
    }
    public void createTestData(Case... cases){
        for(Case temp: cases){
            testCases.add(temp.getBVATestCase());
        }

        testCases.stream().forEach(System.out::println);
    }
}
