package employeeDAOImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import employeeDAO.EmployeeDAO;
import pojo.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public void numOfEmployeesByDepts(List<Employee> employeeList) {
		List<String> employeesDepts = new ArrayList<>();
		
		for (Employee employee : employeeList) {
			employeesDepts.add(employee.getDepartment());
		}
		
		Map<String, Integer> duplicateCountMap = 
				employeesDepts.stream().collect(Collectors.toMap(Function.identity(), dept -> 1, Math::addExact));
		
		System.out.println("Number of employees in each department: \n");
		duplicateCountMap.forEach((dept, count) -> System.out.println(dept + ": " + count));
	}
}