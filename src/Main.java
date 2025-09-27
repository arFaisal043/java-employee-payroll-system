public class Main {
    public static void main(String[] args) throws Exception {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee fullTimeEmployee1 = new FullTimeEmployee("Faisal", 101, 70000);
        PartTimeEmployee partTimeEmployee1 = new PartTimeEmployee("Abdur Rahman", 202, 180, 10);

        payrollSystem.addEmployee(fullTimeEmployee1);
        payrollSystem.addEmployee(partTimeEmployee1);

        System.out.println("Initial Employee Details: ");

        payrollSystem.displayEmployee();

        System.out.println("Removing Employees...... ");
        payrollSystem.removeEmployee(202);

        System.out.println("Remaining Employee Details: ");
        payrollSystem.displayEmployee();
    }
}
