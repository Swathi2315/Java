public class Employees {
    public static void main(String args[]) {
        String employees[] = {"Vinutha", "Priya", "Sri"};
        int salaries[] = {50000, 60000, 55000};
        long ids[] = {1234567890L, 9876543210L, 1122334455L};
        char departments[] = {'HR', 'IT', 'Finance'};

        System.out.print("Employees are: ");
        for (int i = 0; i < employees.length; i++) {
            System.out.print(employees[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Salaries are: ");
        for (int i = 0; i < salaries.length; i++) {
            System.out.print(salaries[i] + " ");
        }
        System.out.println("\n");

        System.out.print("IDs are: ");
        for (int i = 0; i < ids.length; i++) {
            System.out.print(ids[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Departments are: ");
        for (int i = 0; i < departments.length; i++) {
            System.out.print(departments[i] + " ");
        }
    }
}
