//POJO
package com.lqSite1.huiju;
public class Student {
   //
    private Integer id;
    private String sname;
    private String sno;
    private String sex;
    private String email;
    
    
    public String getEmail() {
       return email;
    }
    public void setEmail(String email) {
       this.email = email;
    }
    public Integer getId() {
       return id;
    }
    public void setId(Integer id) {
       this.id = id;
    }
    public String getSex() {
       return sex;
    }

    public void setSex(String sex) {
       this.sex = sex;
    }

    public String getSname() {
       return sname;
    }

    public void setSname(String sname) {
       this.sname = sname;
    }

    public String getSno() {
       return sno;
    }

    public void setSno(String sno) {
       this.sno = sno;
    }
}