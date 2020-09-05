package com.cdc.apis.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.cdc.apis.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	NamedParameterJdbcTemplate template;

	/*
	 * @Override public List<Employee> findAll() { return
	 * template.query("select * from employee", new EmployeeRowMapper()); }
	 */

	@Override
	public int insertEmployee(Employee emp) {
		final String sql = "insert into employee(employeeId, employeeName , employeeAddress,employeeEmail) values(:employeeId,:employeeName,:employeeEmail,:employeeAddress)";
		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource().addValue("employeeId", emp.getEmployeeId())
				.addValue("employeeName", emp.getEmployeeName()).addValue("employeeEmail", emp.getEmployeeEmail())
				.addValue("employeeAddress", emp.getEmployeeAddress());
		return template.update(sql, param, holder);
	}

	/*
	 * @Override public void updateEmployee(Employee emp) { final String sql =
	 * "update employee set employeeName=:employeeName, employeeAddress=:employeeAddress, employeeEmail=:employeeEmail where employeeId=:employeeId"
	 * ; KeyHolder holder = new GeneratedKeyHolder(); SqlParameterSource param = new
	 * MapSqlParameterSource().addValue("employeeId", emp.getEmployeeId())
	 * .addValue("employeeName", emp.getEmployeeName()).addValue("employeeEmail",
	 * emp.getEmployeeEmail()) .addValue("employeeAddress",
	 * emp.getEmployeeAddress()); template.update(sql, param, holder); }
	 * 
	 * @Override public void executeUpdateEmployee(Employee emp) { final String sql
	 * =
	 * "update employee set employeeName=:employeeName, employeeAddress=:employeeAddress, employeeEmail=:employeeEmail where employeeId=:employeeId"
	 * ; Map<String, Object> map = new HashMap<String, Object>();
	 * map.put("employeeId", emp.getEmployeeId()); map.put("employeeName",
	 * emp.getEmployeeName()); map.put("employeeEmail", emp.getEmployeeEmail());
	 * map.put("employeeAddress", emp.getEmployeeAddress()); template.execute(sql,
	 * map, new PreparedStatementCallback<Object>() {
	 * 
	 * @Override public Object doInPreparedStatement(PreparedStatement ps) throws
	 * SQLException, DataAccessException { return ps.executeUpdate(); } }); }
	 * 
	 * @Override public void deleteEmployee(Employee emp) { final String sql =
	 * "delete from employee where employeeId=:employeeId"; Map<String, Object> map
	 * = new HashMap<String, Object>(); map.put("employeeId", emp.getEmployeeId());
	 * template.execute(sql, map, new PreparedStatementCallback<Object>() {
	 * 
	 * @Override public Object doInPreparedStatement(PreparedStatement ps) throws
	 * SQLException, DataAccessException { return ps.executeUpdate(); } }); }
	 */

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub

	}
}
