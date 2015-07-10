package com.xiaoy.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.xiaoy.dao.EmployeeDao;
import com.xiaoy.entities.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl extends Basic implements EmployeeDao
{

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getEmployees()
	{
		String hql = "from Employee ";
		List<Employee> list = (List<Employee>) this.getSession().createQuery(hql).list();
		return list;
	}

	@Override
	public void delete(Integer id)
	{
		String hql = "delete from Employee where id = :id";
		Query query = this.getSession().createQuery(hql);
		query.setParameter("id", id);
		query.executeUpdate();
	}

	@Override
	public Employee getEmployeeById(Integer id)
	{
		Employee employee = (Employee) this.getSession().get(Employee.class, id);
		return employee;
	}

	@Override
	public void saveOrUpdate(Employee employee)
	{
		this.getSession().saveOrUpdate(employee);
	}
}
