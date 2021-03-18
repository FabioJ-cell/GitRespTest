package StudentManagerment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class StuOperaClass implements StudentOpera {

    //登录实现
    @Override
    public Managers LoginStu(Managers m, ArrayList<Managers> arrayMgList) {
        //直接进入，后续处理
        if( arrayMgList.contains(m)){
            return  m;
        }else if(arrayMgList==null){
            return m=null;
        }else {
            return m=null;
        }
        //return m;
    }
    //注册实现
    @Override
    public boolean RegistStu(Managers m, ArrayList<Managers> arrayMgList) {
        if(m==null){
            System.out.println("异常");
        }else if(arrayMgList.contains(m)){
            System.out.println("该用户已经存在");
        }else {
            arrayMgList.add(m);
            return true;
        }
        return false;
    }
    //添加实现
    @Override
    public HashSet<Student> AddStu(int choice,HashSet<Student> hStu) {
        Scanner sc=new Scanner(System.in);
        System.out.println("PLS input student's number(Jxxx):");
        String sNum=sc.nextLine();
        System.out.println("PLS input student's name:");
        String sName = sc.nextLine();
        System.out.println("PLS input student's sex:");
        String sSex = sc.nextLine();
        System.out.println("PLS input student's age:");
        int sAge=sc.nextInt();
        System.out.println("PLS input date:");
        String sDate=sc.nextLine();
        JavaStudent student=new JavaStudent(sNum,sName,sSex,sAge,0.0,sDate,null);
        //hStuHashSet<Student> =new HashSet<Student>();

        if(choice==1){
            student.setStuClass(JavaStudent.stuClass);
            hStu.add(student);
            return hStu;
        }else {
            student.setStuClass(CStudent.stuClass);
            hStu.add(student);
            return hStu;
        }
    }
    //删除实现
    @Override
    public void RemoveStu(HashSet<Student> hStu,String num) {
        for(Student st:hStu){
            if(st.getStuNum().equals(num)){
                hStu.remove(st);
            }else {
                System.out.println("学号不正确！");
            }
        }
    }
    //修改实现
    @Override
    public void ResetStu() {

    }
    //查询实现--all
    @Override
    public void GetStu() {

    }
    //查询实现--individual
    @Override
    public void GetStu(Student stu) {

    }
}
