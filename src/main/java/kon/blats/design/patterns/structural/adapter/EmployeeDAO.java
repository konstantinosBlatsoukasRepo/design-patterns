package kon.blats.design.patterns.structural.adapter;

/**
 * Created by k.blatsoukas on 2/14/2018.
 */
public interface EmployeeDAO {
  Employee fetchEmployee(String id);
  void update(Employee employee);
  void delete(Employee employee);
}
