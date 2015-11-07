package com.lqSite1.huiju;

public class StudentTest {
    public static void main(String[] args) {
       // TODO Auto-generated method stub
       //
       Student stu=new Student();
       stu.setId(006);
       stu.setSname("chen");
       stu.setSno("03170217");
       stu.setSex("张运维李项目王代码");
       stu.setEmail("chenchuang.sy@163.com");

       // StudentOperate
       StudentOperate op=new StudentOperate();
       op.insert(stu);
    }
    
    public static void inset() {
        // TODO Auto-generated method stub
        //
        Student stu=new Student();
        stu.setId(006);
        stu.setSname("chen");
        stu.setSno("03170217");
        stu.setSex("张运维李项目王代码");
        stu.setEmail("chenchuang.sy@163.com");

        // StudentOperate
        StudentOperate op=new StudentOperate();
        op.insert(stu);
     }
    
    public  void inset1() {
        // TODO Auto-generated method stub
        //
        Student stu=new Student();
        stu.setId(006);
        stu.setSname("chen");
        stu.setSno("03170217");
        stu.setSex("张运维李项目王代码");
        stu.setEmail("chenchuang.sy@163.com");

        // StudentOperate
        StudentOperate op=new StudentOperate();
        op.insert(stu);
     }
}