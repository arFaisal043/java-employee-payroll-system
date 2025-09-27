import java.util.ArrayList;

class PayrollSystem {

    // create a employee list ( ArrayList<integer> arr = new ArrayList<>() )
    private ArrayList<Employee> employeeList;

    public PayrollSystem() {
        employeeList = new ArrayList<>(); // create space/ArrayList when create a new object
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee); // Add employee on employeeList
    }

    // Remove employee by id   
    public void removeEmployee(int id) {
        Employee employeeToRemove = null;

        for(Employee emp : employeeList) {
            if(emp.getId() == id) {
                employeeToRemove = emp;
                break;
            }
        }
        if(employeeToRemove != null) {
            employeeList.remove(employeeToRemove);
        }
    }


    public void displayEmployee() {
        for(Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}
