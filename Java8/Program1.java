package Java8;
import java.util.*;
import java.util.stream.*;

public class Program1 {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "Akanksha", "Engineering", 90000),
                new Employee(2, "Ram", "Engineering", 75000),
                new Employee(3, "Shyam", "Manager", 85000),
                new Employee(4, "Ananya", "Engineering", 120000),
                new Employee(5, "Akriti", "Developer", 95000)
        );
        Map<String, List<Employee>> groupedEmployees =
                employees.stream()
                        .filter(e -> e.getDepartment().equals("Engineering"))
                        .filter(e -> e.getSalary() > 80000)
                        .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                        .collect(Collectors.groupingBy(Employee::getDepartment));

        groupedEmployees.forEach((dept, empList) -> {
            System.out.println("Department: " + dept);
            empList.forEach(System.out::println);
        });

        Map<String, Double> averageSalaryByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)
                        ));

        System.out.println("\nAverage Salary by Department:");
        averageSalaryByDept.forEach((dept, avg) ->
                System.out.println(dept + " -> " + avg)
        );
    }
}
class Employee {
    int id;
    String name;
    String department;
    double salary;
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    @Override
    public String toString() {
        return name + " - " + salary;
    }
}

