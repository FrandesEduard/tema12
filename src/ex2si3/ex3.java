package ex2si3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ex3 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Corina", 32, "blond", "Oracle", 1900));
        employeeList.add(new Employee("Marcel", 22, "saten", "Ubisoft", 1500));
        employeeList.add(new Employee("Dorel", 32, "saten", "Oracle", 4000));
        employeeList.add(new Employee("Cristina", 32, "blond", "Ubisoft", 2300));

//      ex 3.1

        int givenSalary = 2000;
        List<String> overGivenSalary = new ArrayList<>();
        for (Employee current : employeeList) {
            if (current.getSalary() > givenSalary) {
                overGivenSalary.add(current.getName());
            }
        }
        System.out.println(overGivenSalary);
        System.out.println("-------------------------");

//      ex 3.2

        System.out.println(getPersonForCompany(employeeList));
        System.out.println("-------------------------");

//      ex 3.3

        System.out.println("salariile totale sunt in valoare de : " + getTotalSalaries(employeeList));
        System.out.println("-------------------------");

//      ex 3.4

        System.out.println(getHighestCompanySalary(employeeList));
        System.out.println("-------------------------");
    }

    public static Map<String, List<Person>> getPersonForCompany(List<Employee> employeeList) {
        Map<String, List<Person>> personForCompany = new HashMap<>();
        for (Employee employee : employeeList) {
            String company = employee.getCompany();
            if (!personForCompany.containsKey(company)) {
                personForCompany.put(company, new ArrayList<>());
            }
            personForCompany.get(company).add(employee);
        }
        return personForCompany;
    }

    public static int getTotalSalaries(List<Employee> employeeList) {
        int totalSalaries = 0;
        for (Employee employee : employeeList) {
            totalSalaries = totalSalaries + employee.getSalary();
        }
        return totalSalaries;
    }

    public static String getHighestCompanySalary (List<Employee> employeeList) {
        String companyWithHighestSalary = null;
        int highestSalary = Integer.MIN_VALUE;
        for (Employee employee : employeeList) {
            if (employee.getSalary() > highestSalary) {
                highestSalary = employee.getSalary();
                companyWithHighestSalary = employee.getCompany();
            }
        }
        return companyWithHighestSalary;
    }

}
