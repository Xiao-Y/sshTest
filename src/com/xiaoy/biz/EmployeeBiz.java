package com.xiaoy.biz;

import java.util.List;

import com.xiaoy.entities.Employee;

public interface EmployeeBiz
{
	/**
	 * 查询出所有的员工
	 * @return	List &ltEmployee&gt
	 */
	List<Employee> getEmployees();

	/**
	 * 删除员工信息
	 * @param integer
	 */
	void delete(Integer integer);

	/**
	 * 通过ID查询出现用户信息
	 * @param integer	用户id
	 * @return	Employee
	 */
	Employee getEmployeeById(Integer integer);

	/**
	 * 添加修改员工信息
	 */
	void saveOrUpdate(Employee employee);

}
