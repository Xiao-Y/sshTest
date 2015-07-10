package com.xiaoy.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xiaoy.biz.EmployeeBiz;
import com.xiaoy.dao.EmployeeDao;
import com.xiaoy.entities.Employee;

@Service(value="employeeBiz")
public class EmployeeBizImpl implements EmployeeBiz
{
	//注入员工Dao
	@Resource
	private EmployeeDao employeeDao;
	
	public List<Employee> getEmployees()
	{
		List<Employee> list = employeeDao.getEmployees();
		return list;
	}

	@Override
	public void delete(Integer id)
	{
		employeeDao.delete(id);
	}

	@Override
	public Employee getEmployeeById(Integer id)
	{
		Employee employee = employeeDao.getEmployeeById(id);
		return employee;
	}

	@Override
	public void saveOrUpdate(Employee employee)
	{
		employeeDao.saveOrUpdate(employee);
	}
}
