package com.xiaoy.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.xiaoy.biz.EmployeeBiz;
import com.xiaoy.entities.Employee;

/**
 * 员工信息处理（增、删、改、查）
 *
 * @author XiaoY
 * @date: 
 * 2015年7月7日 下午2:49:18
 */
public class EmployeeAction implements ModelDriven<Employee>,RequestAware
{
	private Employee employee = new Employee();

	@Override
	public Employee getModel()
	{
		return employee;
	}
	
	private Map<String, Object> request;

	@Override
	public void setRequest(Map<String, Object> arg0)
	{
		request = arg0;
	}
	
	//注入员工Service
	@Resource
	private EmployeeBiz employeeBiz;

	/**
	 * 员工列表
	 * @return
	 */
	public String list()
	{
		List<Employee> list = employeeBiz.getEmployees();
		request.put("employees", list);
		return "list";
	}
	
	/**
	 * 删除某个员工信息
	 * @return
	 */
	public String delete()
	{
		employeeBiz.delete(employee.getId());
		return "success";
	}
	
	/**
	 * 进入编辑页面
	 * @return
	 */
	public String edit()
	{
		if(employee.getId() != null)
		{
			employee = employeeBiz.getEmployeeById(employee.getId());
			ActionContext.getContext().getValueStack().push(employee);
		}
		return "edit";
	}
	
	/**
	 * 添加修改员工信息
	 * @return
	 */
	public String saveOrUpdate()
	{
		employeeBiz.saveOrUpdate(employee);
		return "success";
	}
}
