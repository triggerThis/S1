package com.lqSite1.smvc1.employee;
 
import java.io.Serializable;
 
 
//这个类作为MVC模式的模型。
public class EmployeeVO implements Serializable
{
    private static final long serialVersionUID = 1L;
 
    private Integer id;
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	private String firstName;
    public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	private String lastName;
	
	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getLastName() {
		return lastName;
	}

	private String addr;
 
    //Setters and Getters
 
    @Override
    public String toString() {
        return "EmployeeVO [id=" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + "]";
    }

	
}
