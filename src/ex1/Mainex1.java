package ex1;

import java.util.HashMap;
import java.util.Map;

public class Mainex1 {
    public static void main(String[] args) {
        Map<String, Integer> catalog = new HashMap<>();
        catalog.put("Sergiu", 7);
        catalog.put("Sami", 9);
        catalog.put("Iustin", 8);
        catalog.put("Laurentiu", 10);

        System.out.println(catalog);

        String highestStudentGrade = "";
        int highestGrade = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : catalog.entrySet()) {
            int grade = entry.getValue();
            if (grade > highestGrade){
                highestGrade = grade;
                highestStudentGrade = entry.getKey();
            }
        }
        System.out.println("cea mai mare nota este: " + highestGrade);
        System.out.println("studentul cu cea mai mare nota este: " + highestStudentGrade);

    }
}