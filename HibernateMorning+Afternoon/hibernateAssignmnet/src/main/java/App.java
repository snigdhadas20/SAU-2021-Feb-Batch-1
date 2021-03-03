import java.util.List;

import dao.EmployeeDao;
import model.Employee;
public class App {

	public static void main(String[] args) {
		
		EmployeeDao employeeDao =new EmployeeDao();
		
		Employee employee1=new Employee("Rohan","Singh",25, 50000.2,"SDE");
		employeeDao.saveEmployee(employee1);
		
		employee1.setFname("Riya");
		employeeDao.updateEmployee(employee1);
		Employee employee2 =employeeDao.getEmployeeById(employee1.getId());
		
		
		List<Employee> employees=employeeDao.getAllEmployee();
		employees.forEach(employee3 -> System.out.println(employee3.getId()));
		
		employeeDao.deleteEmployee(employee1.getId());
	
	}

}
