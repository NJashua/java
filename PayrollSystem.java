import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PayrollSystem {
    static final String jdbcUrl = "jdbc:mysql://localhost:3306/payrollemployedetails";
    static final String username = "root";
    static final String password = "Jashua@9390779404";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Payroll Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. View Employees");
            System.out.println("4. View Employee Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    removeEmployee();
                    break;
                case 3:
                    viewEmployees();
                    break;
                case 4:
                    viewEmployeeDetails();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    private static void addEmployee() {
        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            System.out.println("Add Employee");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();
            System.out.print("Enter employee department: ");
            String department = scanner.nextLine();
            System.out.print("Enter employee designation: ");
            String designation = scanner.nextLine();
            System.out.print("Enter employee salary: ");
            double salary = scanner.nextDouble();

            String sql = "INSERT INTO employee (name, department, designation, salary) VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, name);
                statement.setString(2, department);
                statement.setString(3, designation);
                statement.setDouble(4, salary);
                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Employee added successfully!");
                } else {
                    System.out.println("Failed to add employee.");
                }
            }
        } catch (SQLException e) {
            System.err.println("Failed to add employee: " + e.getMessage());
        }
    }

    private static void removeEmployee() {
        // Implement remove employee functionality
        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            System.out.println("Remove Employee");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter employee ID to remove: ");
            int id = scanner.nextInt();

            String sql = "DELETE FROM employee WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, id);
                int rowsDeleted = statement.executeUpdate();
                if (rowsDeleted > 0) {
                    System.out.println("Employee removed successfully!");
                } else {
                    System.out.println("Employee not found.");
                }
            }
        } catch (SQLException e) {
            System.err.println("Failed to remove employee: " + e.getMessage());
        }
    }

    private static void viewEmployees() {
        // Implement view employees functionality
        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String sql = "SELECT * FROM employee";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                ResultSet resultSet = statement.executeQuery();
                System.out.println("Employee List:");
                while (resultSet.next()) {
                    System.out.printf("ID: %d, Name: %s, Department: %s, Designation: %s, Salary: %.2f%n",
                            resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getString("department"),
                            resultSet.getString("designation"),
                            resultSet.getDouble("salary"));
                }
            }
        } catch (SQLException e) {
            System.err.println("Failed to view employees: " + e.getMessage());
        }
    }

    private static void viewEmployeeDetails() {
        // Implement view employee details functionality
        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            System.out.println("View Employee Details");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();

            String sql = "SELECT * FROM employee WHERE name = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, name);
                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) {
                    System.out.printf("Name: %s, Department: %s, Designation: %s, Salary: %.2f%n",
                            resultSet.getString("name"),
                            resultSet.getString("department"),
                            resultSet.getString("designation"),
                            resultSet.getDouble("salary"));
                } else {
                    System.out.println("Employee not found.");
                }
            }
        } catch (SQLException e) {
            System.err.println("Failed to view employee details: " + e.getMessage());
        }
    }
}
