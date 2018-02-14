package kon.blats.design.patterns.structural.adapter;

/**
 * Created by k.blatsoukas on 2/14/2018.
 */
public interface EmployeeRepository {
  Employee getEmployee(String id);
  void updateEmployee(Employee employee);
  void deleteEmployee(Employee employee);
}
