import java.util.ArrayList; // Import ArrayList for dynamic array storage
import java.util.Comparator; // Import Comparator for sorting
import java.util.HashSet; // Import HashSet for storing unique skills
import java.util.List; // Import List interface for storing employee lists
import java.util.Map; // Import Map for key-value pairs
import java.util.Set; // Import Set interface for unique collections
import java.util.function.Predicate; // Import Predicate for filtering
import java.util.stream.Collectors; // Import Collectors for stream operations
import java.util.stream.Stream; // Import Stream for working with streams

public class EmployeeStream {

    // Method to initialize employee data
    public List<Employee> initializeData() {
        List<Employee> emplist = new ArrayList<>(); // Create a list to hold employees

        // Create and add employees with their skills
        Set<String> skills = new HashSet<>();
        skills.add("Java");
        skills.add("Python");
        emplist.add(new Employee(105, "Omkar", 85000, skills, "IT"));

        Set<String> skills1 = new HashSet<>();
        skills1.add("Java");
        skills1.add("C++");
        emplist.add(new Employee(102, "Daksh", 95000, skills1, "Sales"));

        Set<String> skills2 = new HashSet<>();
        skills2.add("Python");
        skills2.add("C++");
        emplist.add(new Employee(104, "Ram", 65000, skills2, "Marketing"));

        Set<String> skills3 = new HashSet<>();
        skills3.add("JavaScript");
        skills3.add("C");
        emplist.add(new Employee(103, "Dhruv", 80000, skills3, "Product"));

        Set<String> skills4 = new HashSet<>();
        skills4.add("Java");
        skills4.add("C#");
        emplist.add(new Employee(101, "Omen", 75000, skills4, "Analyst"));

        return emplist; // Return the list of employees
    }

    public static void main(String[] args) {
        EmployeeStream e = new EmployeeStream(); // Create an instance of EmployeeStream
        List<Employee> emplist = e.initializeData(); // Initialize employee data

        Stream<Employee> stream = emplist.stream(); // Create a stream from the employee list

        // Sort and print employees by name
        Comparator<Employee> byname = Comparator.comparing(Employee::getName);
        System.out.println("---Sorting by name---");
        stream.sorted(byname).forEach(System.out::println); // Print sorted employees

        // Reinitialize the stream to sort by department and then by name
        stream = emplist.stream();
        Comparator<Employee> bydept = Comparator.comparing(Employee::getDepartment).thenComparing(byname);
        System.out.println("---Sorting by name for dept---");
        stream.sorted(bydept).forEach(System.out::println); // Print sorted employees

        // Filter employees by salary range and print
        System.out.println("------Filter by salary range-----");
        stream = emplist.stream();
        Predicate<Employee> salrange = emp -> emp.getSalary() >= 70000 && emp.getSalary() <= 90000; // Define salary range
        stream.filter(salrange).forEach(System.out::println); // Print filtered employees

        // Filter employees who have "Java" in their skill set
        System.out.println("----Filter by Skill---");
        stream = emplist.stream();
        stream.filter(emp -> emp.getSkillset().contains("Java")).forEach(System.out::println); // Print filtered employees

        // Group employees by department and print
        System.out.println("----Group by Department-----");
        stream = emplist.stream();
        Map<String, List<Employee>> empsbydept = stream.collect(Collectors.groupingBy(Employee::getDepartment));
        empsbydept.forEach((k, v) -> System.out.println(k + ", " + v)); // Print grouped employees

        // Create and print a list of Department objects from employees
        System.out.println("-------------------");
        stream = emplist.stream();
        List<Department> departments = stream.map(emp -> new Department(emp.getEmpid(), emp.getDepartment()))
                .collect(Collectors.toList()); // Collect Department objects into a list
        departments.forEach(System.out::println); // Print department objects

        // Calculate and print the total salary of all employees
        System.out.println("----------------------");
        stream = emplist.stream();
        double totalsal = stream.mapToDouble(Employee::getSalary).reduce(0, Double::sum); // Calculate total salary
        System.out.println(totalsal); // Print total salary
    }
}
