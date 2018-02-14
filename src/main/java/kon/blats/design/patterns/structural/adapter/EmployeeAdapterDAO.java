package kon.blats.design.patterns.structural.adapter;

/**
 * Created by k.blatsoukas on 2/14/2018.
 */
public class EmployeeAdapterDAO implements EmployeeRepository {

  private EmployeeDAO employeeDAO;

  public EmployeeAdapterDAO(EmployeeDAO employeeDAO) {
    this.employeeDAO = employeeDAO;
  }

  @Override
  public Employee getEmployee(String id) {
    return employeeDAO.fetchEmployee(id);
  }

  @Override
  public void updateEmployee(Employee employee) {
    employeeDAO.update(employee);
  }

  @Override
  public void deleteEmployee(Employee employee) {
    employeeDAO.delete(employee);
  }
}
