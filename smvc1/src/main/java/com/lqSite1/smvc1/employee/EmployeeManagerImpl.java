package com.lqSite1.smvc1.employee;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.lqSite1.smvc1.employee.EmployeeDAO;
import com.lqSite1.smvc1.employee.EmployeeVO;
 
@Service
public class EmployeeManagerImpl implements EmployeeManager {
 
    @Autowired
    EmployeeDAO dao;
 
    public List<EmployeeVO> getAllEmployees()
    {
        return dao.getAllEmployees();
    }
}
