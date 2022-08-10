package com.wavemaker.training;

import com.wavemaker.training.db.dao.DepartmentDAO;
import com.wavemaker.training.db.dao.EmployeeDAO;
import com.wavemaker.training.db.model.Department;
import com.wavemaker.training.db.model.Employee;
import java.util.List;

public class Main {

    private EmployeeDAO employeeDAO = new EmployeeDAO();
    private DepartmentDAO departmentDAO = new DepartmentDAO();
    public  void printEmployees() {
        List<Employee> listOfEmployees = employeeDAO.getListOfEmployees();
        if (listOfEmployees != null) {
            for (Employee employee : listOfEmployees) {
                System.out.println(employee);
            }
        }
    }
        public  void printDepartments() {
            List<Department> listOfDepartments = departmentDAO.getListOfDepartments();
            if(listOfDepartments != null) {
                for (Department department : listOfDepartments) {
                    System.out.println(department);
                }
            }
    }
    public static void main(String[] args) {
        System.out.println("Main Program");
        new Main().printEmployees();
        new Main().printDepartments();
        new Main().employeeDAO.createEmployee(new Employee());
        new Main().employeeDAO.deleteEmployee(new Employee());
        new Main().employeeDAO.UpdateEmployee(new Employee());


    }
}