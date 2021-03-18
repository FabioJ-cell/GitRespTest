package StudentManagerment;

public class JavaStudent extends Student{
    public static final String stuClass="java123" ;//static静态变量表示子类可以直接使用类名调用，final表示无法再次更改

    public JavaStudent() {
    }

    public JavaStudent(String stuNum, String stuName, String stuSex, int stuAge, double stuScore, String stuJoinTime, String stuClass) {
        super(stuNum, stuName, stuSex, stuAge, stuScore, stuJoinTime, stuClass);
    }

    //重写study
    @Override
    public void study() {
        System.out.println("这是java班级的学生");
    }
}
