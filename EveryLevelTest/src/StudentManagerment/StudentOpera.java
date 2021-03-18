package StudentManagerment;

import java.util.ArrayList;
import java.util.HashSet;

public interface StudentOpera {//接口中定义方法，其实现类中完成对方法的实现
    //登录
    Managers LoginStu(Managers m, ArrayList<Managers> arrayMgList);
    //注册
    boolean RegistStu(Managers m, ArrayList<Managers> arrayMgList);
    //添加
    HashSet<Student> AddStu(int choice,HashSet<Student> hStu);
    //删除
    void RemoveStu(HashSet<Student> hStu,String num);
    //修改
    void ResetStu();
    //查询
    void GetStu();

    void GetStu(Student stu);
}
