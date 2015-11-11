package com.lqSite1.smvc1.employee;

import java.util.List;
 
import com.lqSite1.smvc1.employee.EmployeeVO;
 
//这个类处于三层架构中的第二层。负责与DAO层交互。
public interface EmployeeManager
{
    public List<EmployeeVO> getAllEmployees();
}
