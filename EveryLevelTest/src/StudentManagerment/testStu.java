package StudentManagerment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
/*
* 1.接口实现类里面的方法在main中使用用什么方式实现？
* 2.用户登录后如何控制程序限制用户再登录
* */

public class testStu{//测试类

    public static void main(String[] args) {
        ArrayList<Managers> mg=new ArrayList<Managers>();
        HashSet<Student> hStu=new HashSet<Student>();
        WelcomeManager(mg,hStu);


    }

    public static void WelcomeManager(ArrayList<Managers> mg,HashSet<Student> hStu) {
        //打印菜单
        //System.out.println("--------****-------");
        System.out.println("------WELCOME------");
        System.out.println("1.Login...");
        System.out.println("2.Regist...");
        System.out.println("Pls input the NUMBER of (1~2) to choose function:");

        //Scanner对象获取键盘输入
        Scanner sc=new Scanner(System.in);
        int choose=sc.nextInt();
        //操作类对象调用方法
        //StuOperaClass op=new StuOperaClass();
        switch(choose){
            case 1:
                System.out.println("-----------LOGIN-----------");
                System.out.println("PLS input your USERNAME:");
                Scanner nsc=new Scanner(System.in);
                String userName = nsc.nextLine();
                System.out.println("PLS input your private PASSWORD:");
                String passWord = nsc.nextLine();
                Managers msg=new Managers(userName,passWord);
                Managers isLogin = msg.LoginStu(msg,mg);
                if(isLogin!=null){
                    //进入主界面，展示操作界面
                    StuOperaShow(isLogin,hStu);
                }else {
                    System.out.println("*_* PLS check your information or try to regist your acount!");
                    //后面调用方法回到欢迎界面
                    WelcomeManager(mg,hStu);
                    break;
                }
                break;
            case 2:
                System.out.println();
                System.out.println("-----------REGIST-----------");
                System.out.println("PLS input your USERNAME:");
                Scanner nsc1=new Scanner(System.in);
                String userName1 = nsc1.nextLine();
                System.out.println("PLS input your private PASSWORD:");
                String passWord1 = nsc1.nextLine();
                Managers msg1=new Managers(userName1,passWord1);
                if(msg1.RegistStu(msg1,mg)){
                    System.out.println("Regist success!");
                    WelcomeManager(mg,hStu);
                }else {
                    System.out.println("Regist default!");
                    WelcomeManager(mg,hStu);
                }
                break;
            default:
                System.out.println("登录/注册--输入选择异常");
                System.exit(0);
        }
    }

    //主界面
    public static void StuOperaShow(Managers m,HashSet<Student> hStu){
        System.out.println("Hello! Mr."+m.getmUserName()+",GOOD HEALTH!");
        System.out.println("------Student Management System------");
        System.out.println("1.new student");
        System.out.println("2.delete student");
        System.out.println("3.reset personnal information");
        System.out.println("4.get students' information");
        System.out.println("*************************************");
        System.out.println("PLS choose your choice:");
        Scanner osc=new Scanner(System.in);
        int choice = osc.nextInt();
        //异常获取
        switch(choice){
            case 1:
                System.out.println("-------------ADD Student-------------");
                System.out.println("which major's student do you want to add?");
                System.out.println("1.java profession");
                System.out.println("2.C profession");
                System.out.println("*************************************");
                System.out.println("PLS choose your choice:");
                int ch = osc.nextInt();
                m.AddStu(ch,hStu);
                if(!hStu.isEmpty()){
                    System.out.println("Add success!");
                }else {
                    System.out.println("Add default!");
                }
                for(Student s:hStu){
                    System.out.println(s);
                }
                StuOperaShow(m,hStu);
                break;
            case 2:
                System.out.println("PLS input the number which you want to delete:");
                String num=osc.nextLine();
                m.RemoveStu(hStu,num);
                StuOperaShow(m,hStu);
                break;
            case 3:

                break;
            case 4:

                break;
            default:
                break;
        }

    }
}
