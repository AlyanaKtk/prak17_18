package pr17;

public class employeecontroller
{
    private employeeview view;
    private employee model;
    public employeecontroller(employee model, employeeview view) {
        this.model = model;
        this.view = view;
    }
    public void setEmployeeName(String name) {
        model.setName(name);
    }
    public void setEmployeeSurname(String surname) {
        model.setSurname(surname);
    }
    public void setEmployeeId(int id) {
        model.setId(id);
    }
    public void setEmployeeSalary(int salary) {
        model.setSalary(salary);
    }
    public String getEmployeeName() {
        return model.getName();
    }
    public String getEmployeeSurname() {
        return model.getSurname();
    }
    public int getEmployeeId(int id) {
        return model.getId();
    }
    public int getEmployeeSalary(int salary) {
        return model.getSalary();
    }
    public void updateView()
    {
        view.printEmployeeDetails(model.getName(), model.getSurname(), model.getSalary(), model.getId());
    }
}
