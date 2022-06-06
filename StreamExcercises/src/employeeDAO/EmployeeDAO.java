package employeeDAO;

import java.util.List;
import pojo.Employee;

public interface EmployeeDAO {
	public void numOfEmployeesByDepts(List<Employee> employeeList);
}