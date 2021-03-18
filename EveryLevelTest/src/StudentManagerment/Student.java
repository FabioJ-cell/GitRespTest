package StudentManagerment;
//抽象类：学生类--Student.java，是实体类的超类

/*
 *成员变量：学号、姓名、性别、年龄、成绩、**入学时间**、班级
 *成员方法：*学习
 *
 * 抽象类无法直接实例化，需要通过子类对象向上转型实现
 * */
public abstract class Student {//abstract他妈的放在class后面就炸了！！
    private String stuNum;//学号
    private String stuName;//姓名
    private String stuSex;//性别
    private int stuAge;//年龄
    private double stuScore;//成绩
    private String stuJoinTime;//入学时间
    private String stuClass;//班级
    //无参构造
    public Student() {
    }
    //有参构造
    public Student(String stuNum, String stuName, String stuSex, int stuAge, double stuScore, String stuJoinTime, String stuClass) {
        this.stuNum = stuNum;
        this.stuName = stuName;
        this.stuSex = stuSex;
        this.stuAge = stuAge;
        this.stuScore = stuScore;
        this.stuJoinTime = stuJoinTime;
        this.stuClass = stuClass;
    }
    //抽象成员方法study()
    public abstract void study();
    //get/set

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(char stuChar) {
        this.stuSex = stuSex;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public double getStuScore() {
        return stuScore;
    }

    public void setStuScore(double stuScore) {
        this.stuScore = stuScore;
    }

    public String getStuJoinTime() {
        return stuJoinTime;
    }

    public void setStuJoinTime(String stuJoinTime) {
        this.stuJoinTime = stuJoinTime;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNum='" + stuNum + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuChar=" + stuSex +
                ", stuAge=" + stuAge +
                ", stuScore=" + stuScore +
                ", stuJoinTime='" + stuJoinTime + '\'' +
                ", stuClass='" + stuClass + '\'' +
                '}';
    }
}
