package pr17;

public class mvc {
    public static void main(String[] args)
    {
        employee model = retriveEmployeeFromDatabase();
        employeeview view = new employeeview();
        employeecontroller controller = new employeecontroller(model, view);
        controller.updateView();
        controller.setEmployeeName("Petr");
        controller.setEmployeeSurname("Ivanov");
        System.out.println("After updating");
        controller.updateView();
    }
    private static employee retriveEmployeeFromDatabase() {
        employee employee = new employee();
        employee.setName("Ivan");
        employee.setSurname("Petrov");
        employee.setSalary(35000);
        employee.setId(13);
        return employee;
    }
}