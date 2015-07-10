package com.xiaoy.dao;

import java.util.List;

import com.xiaoy.entities.Employee;

public interface EmployeeDao
{

	/**
	 * 获取所有员工的信息
	 * @return	List &ltEmployee&gt
	 */
	List<Employee> getEmployees();

	/**
	 * 删除员工信息
	 * @param id
	 */
	void delete(Integer id);

	/**
	 * 通过ID查询出现用户信息
	 * @param id	用户id
	 * @return	Employee
	 */
	Employee getEmployeeById(Integer id);

	/**
	 * 添加修改员工信息
	 */
	void saveOrUpdate(Employee employee);

}
