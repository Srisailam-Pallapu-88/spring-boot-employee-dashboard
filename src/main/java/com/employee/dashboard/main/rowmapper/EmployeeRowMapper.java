/*
 * package com.employee.dashboard.main.rowmapper;
 * 
 * import java.sql.ResultSet; import java.sql.SQLException;
 * 
 * import org.springframework.jdbc.core.RowMapper;
 * 
 * import com.employee.dashboard.main.entity.Employee;
 * 
 * public class EmployeeRowMapper implements RowMapper<Employee> {
 * 
 * @Override public Employee mapRow(ResultSet rs, int rowNum) throws
 * SQLException { // TODO Auto-generated method stub
 * 
 * Employee employee = new Employee(); employee.setId(rs.getInt("id"));
 * employee.setFirstName(rs.getString("firstname"));
 * employee.setLastName(rs.getString("lastname"));
 * employee.setAge(rs.getString("age"));
 * employee.setGender(rs.getString("gender"));
 * employee.setCity(rs.getString("city"));
 * employee.setPincode(rs.getString("pincode")); return employee; }
 * 
 * }
 */