package StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    //主方法
    public static void main(String[] args) {
        //定义Scanner对象，便于从外部获取数据
        Scanner sc=new Scanner(System.in);
        //创建ArrayList对象，用于保存Student对象数据
        ArrayList<Student> student=new ArrayList<>();
        loop:
        while(true){
            //打印菜单
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看学生");
            System.out.println("5 退出");
            System.out.println("请输入您的选择:");

            String input = sc.next();//输入选择数据
            //从键盘输入选择，根据选择进入不同分支
            switch(input){
                case "1":
                    //学生添加
                    addStudent(student);
                    break;
                case "2":
                    System.out.println("请输入要删除的学生的学号：");
                    String dnum = sc.next();
                    deleteStudent(student,chaXun(student,dnum));
                    break;
                case "3":
                    System.out.println("请输入要修改的学生的学号：");
                    String rnum = sc.next();
                    resetStudent(student,chaXun(student,rnum));
                    break;
                case "4":
                    printStudent(student);
                    break;
                case "5":
                    System.out.println("感谢使用");
                    break loop;
                default:
                    System.out.println("输入有误！请重新选择！");
                    break;

            }
        }

    }
//测试git提交到远程库
    private static void resetStudent(ArrayList<Student> student,int num) {
        //对传递进来的num值做判断，-1弹栈，不是-1则正常操作
        if(num==-1) {
            System.out.println("要修改信息的学生不存在！请重新输入！");
        }else{
            Scanner rsc=new Scanner(System.in);
            System.out.println("请修改学生的姓名：");
            String nName = rsc.next();
            System.out.println("请修改学生的年龄：");
            String nAge = rsc.next();
            System.out.println("请修改学生的生日：");
            String nBirth = rsc.next();
            student.get(num).setsStuName(nName);
            student.get(num).setsStuAge(nAge);
            student.get(num).setsStuBirth(nBirth);
            System.out.println("学生信息修改成功！");
        }
    }

    private static void deleteStudent(ArrayList<Student> student,int num) {
        //对传递进来的num值做判断，-1弹栈，不是-1则正常操作
        if(num==-1){
            System.out.println("要删除的学生不存在！请重新输入！");
        }else{
            student.remove(num);
            System.out.println("该学生删除成功！");
            return;
        }
    }

    private static void printStudent(ArrayList<Student> student) {
        //审查集合，若空则提示，若不空则遍历
        //当传入的集合为空，查询失败返回-1并提示
        if(student.isEmpty()){
            System.out.println("当前没有数据，请添加后再试！");
            return ;
        }else{
            /*System.out.println("学号"+"\t"+"姓名"+"\t"+"年龄"+"\t"+"生日"+"\t"+"学校");
            for(Student s:student){
                System.out.println(s.getsStuNum()+"\t"+s.getsStuName()+"\t"+s.getsStuAge()+"\t"+s.getsStuBirth()+"\t"+s.getsStuSchool());
            }*/
            for(Student s:student){
                System.out.println(s.toString());
            }
        }
    }

    //添加学生实现方法
    private static void addStudent(ArrayList<Student> student) {
        //传入集合对象，后续给集合里添加
        //界面输入学生信息，以学号为标准进行检索，当查询结果为-1时可继续添加，否则说明学号重复
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要添加学生的学号：");
        String nNum = sc.next();
        System.out.println("请输入要添加学生的姓名：");
        String nName = sc.next();
        System.out.println("请输入要添加学生的年龄：");
        String nAge = sc.next();
        System.out.println("请输入要添加学生的生日：");
        String nBirth = sc.next();
        //判断学号是否合法
        if(chaXun(student,nNum)==-1){
            Student nstudent=new Student(nNum,nName,nAge,nBirth);
            student.add(nstudent);
            System.out.println("学生"+nName+"添加成功！");
        }else{
            System.out.println("该学号已经存在！");
            return;
        }
    }
    //集合内按照学号查询学生对象，返回其索引值
    private static int chaXun(ArrayList<Student> student,String stuNum){
        //初始化索引值
        int index=-1;

        //集合不为空时，依据学号查询
        for (int i = 0; i < student.size(); i++) {
            if(student.get(i).getsStuNum().equals(stuNum)){
                //成功查询到该学号学生,修改索引并返回
                index=i;
                return index;
            }
        }
        return index;
    }
}
