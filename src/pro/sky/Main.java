package pro.sky;

public class Main {
    public static void main(String[] args) {

        employeeList[0] = new Employee("fullName1", "1", 100_000);
        employeeList[1] = new Employee("fullName2", "1", 100_000);
        employeeList[2] = new Employee("fullName3", "2", 100_000);
        employeeList[3] = new Employee("fullName4", "2", 100_000);
        employeeList[4] = new Employee("fullName5", "3", 100_000);
        employeeList[5] = new Employee("fullName6", "3", 100_000);
        employeeList[6] = new Employee("fullName7", "4", 100_000);
        employeeList[7] = new Employee("fullName8", "4", 100_000);
        employeeList[8] = new Employee("fullName9", "5", 100_000);
        employeeList[9] = new Employee("fullName10", "5", 100_000);

        printEmployeeData();
        countMonthSalarySum();
        countMinMonthSalary();
        countMaxMonthSalary();
        countAvgMonthSalary();
        printFullName();
    }

    static Employee[] employeeList = new Employee[10];

    private static void printEmployeeData() {
        for (Employee employee : Main.employeeList) {
            System.out.println(employee);
        }
    }

    private static double countMonthSalarySum() {
        double sumMonthSalary = 0;
        for (Employee employee : Main.employeeList) {
            double salary = employee.getSalary();
            sumMonthSalary = sumMonthSalary + salary;
        }
        return sumMonthSalary;
    }

    private static void countMinMonthSalary() {
        double minMonthSalary = 250_000;
        for (Employee employee : Main.employeeList) {
            double currentMonthSalary = employee.getSalary();
            if (currentMonthSalary < minMonthSalary) {
                minMonthSalary = currentMonthSalary;
            }
        }
        System.out.println("minMonthSalary = " + minMonthSalary);
        System.out.println();
    }

    private static void countMaxMonthSalary() {
        double maxMonthSalary = -1;
        for (Employee employee : Main.employeeList) {
            double currentMonthSalary = employee.getSalary();
            if (currentMonthSalary > maxMonthSalary) {
                maxMonthSalary = currentMonthSalary;
            }
        }
        System.out.println("maxMonthSalary = " + maxMonthSalary);
        System.out.println();
    }

    private static void countAvgMonthSalary() {
        double employeeNumber = employeeList.length;
        double sumMonthSalary = countMonthSalarySum();
        double avgMonthSalary = sumMonthSalary / employeeNumber;
        String avgMonthSalaryRound = String.format("%.2f", avgMonthSalary);
        System.out.println("Средняя сумма ЗП " + avgMonthSalaryRound + " рублей.");
        System.out.println();
    }

    private static void printFullName() {
        for (int j = 0; j < Main.employeeList.length; j++) {
            if (j != Main.employeeList.length - 1) {
                System.out.print(Main.employeeList[j].getFullName() + ", ");
            } else {
                System.out.print(Main.employeeList[j].getFullName());
            }
        }
        System.out.println();
    }
}