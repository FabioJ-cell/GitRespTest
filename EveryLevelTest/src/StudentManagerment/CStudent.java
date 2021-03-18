package StudentManagerment;

public class CStudent extends Student{
    public static final String stuClass="C语言321" ;//static静态变量表示子类可以直接使用类名调用，final表示无法再次更改
    //重写study
    @Override
    public void study() {
        System.out.println("这是C语言班级的学生");
    }
}
