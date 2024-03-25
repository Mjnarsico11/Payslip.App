import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String employeeName;
        double hourlySalary;
        double regularPay, overtimePay, netPay;

        System.out.println("Enter employee ID:");
        int employeeID = scanner.nextInt();

        if (employeeID == 12345)
            employeeName = "Jay 12345";
        else if (employeeID == 23456)
            employeeName = "James 23456";
        else if (employeeID == 34567)
            employeeName = "Jake 34567";
        else if (employeeID == 45678)
            employeeName = "Jack 45678";
        else
            employeeName = "Unknown";

        System.out.println("Enter hourly salary:");
        hourlySalary = scanner.nextDouble();
        System.out.println("Enter weekly time:");
        double weeklyTime = scanner.nextDouble();

        if (weeklyTime <= 40) {
            regularPay = weeklyTime * hourlySalary;
            overtimePay = 0;
            netPay = regularPay;
        } else {
            regularPay = 40 * hourlySalary; // 
            double overtimeHours = weeklyTime - 40; 
            overtimePay = overtimeHours * hourlySalary * 1.5; 
            netPay = regularPay + overtimePay;
        }

        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID:" + employeeID);
        System.out.println("Hourly Salary: " + hourlySalary);
        System.out.println("Weekly Time: " + weeklyTime);
        System.out.println("Regular Pay: " + regularPay);
        System.out.println("Overtime Pay: " + overtimePay);
        System.out.println("Total Pay: " + netPay);

        scanner.close(); 

	}

}
