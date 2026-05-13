import java.sql.*;
import java.util.Scanner;

public class EmployeeManagement {

    static void addEmployee(Connection con, Scanner sc) {

        try {

            System.out.println("Enter Employee ID:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Employee Name:");
            String name = sc.nextLine();

            System.out.println("Enter Salary:");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter Department:");
            String dept = sc.nextLine();

            String query =
                "INSERT INTO employee VALUES (?, ?, ?, ?)";

            PreparedStatement ps =
                con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setDouble(3, salary);
            ps.setString(4, dept);

            int rows = ps.executeUpdate();

            if (rows > 0) {

                System.out.println("Employee Added Successfully");
            }

        } catch (Exception e) {

            System.out.println("Error: " + e);
        }
    }

    static void viewEmployees(Connection con) {

        try {

            String query = "SELECT * FROM employee";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            System.out.println("\nID\tName\tSalary\tDepartment");

            while (rs.next()) {

                System.out.println(
                    rs.getInt(1) + "\t" +
                    rs.getString(2) + "\t" +
                    rs.getDouble(3) + "\t" +
                    rs.getString(4)
                );
            }

        } catch (Exception e) {

            System.out.println("Error: " + e);
        }
    }

    static void updateEmployee(Connection con, Scanner sc) {

        try {

            System.out.println("Enter Employee ID:");
            int id = sc.nextInt();

            System.out.println("Enter New Salary:");
            double salary = sc.nextDouble();

            String query =
                "UPDATE employee SET salary=? WHERE id=?";

            PreparedStatement ps =
                con.prepareStatement(query);

            ps.setDouble(1, salary);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {

                System.out.println("Employee Updated Successfully");

            } else {

                System.out.println("Employee Not Found");
            }

        } catch (Exception e) {

            System.out.println("Error: " + e);
        }
    }

    static void deleteEmployee(Connection con, Scanner sc) {

        try {

            System.out.println("Enter Employee ID:");
            int id = sc.nextInt();

            String query =
                "DELETE FROM employee WHERE id=?";

            PreparedStatement ps =
                con.prepareStatement(query);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {

                System.out.println("Employee Deleted Successfully");

            } else {

                System.out.println("Employee Not Found");
            }

        } catch (Exception e) {

            System.out.println("Error: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Connection con = DBConnection.getConnection();

        if (con == null) {

            System.out.println("Connection Failed");
            return;
        }

        int choice;

        do {

            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");

            System.out.println("Enter Choice:");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployee(con, sc);
                    break;

                case 2:
                    viewEmployees(con);
                    break;

                case 3:
                    updateEmployee(con, sc);
                    break;

                case 4:
                    deleteEmployee(con, sc);
                    break;

                case 5:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        try {

            con.close();

        } catch (Exception e) {

            System.out.println(e);
        }

        sc.close();
    }
}
