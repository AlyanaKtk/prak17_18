package pr17;

public class employeeview
{
    public void printEmployeeDetails(String name, String surname, int salary, int id){
        System.out.println("Employee Details:");
        System.out.println("Full name: " + name + " " + surname);
        System.out.println("Salary: " + salary);
        System.out.println("ID: " + id);
    }
}
