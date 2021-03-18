package StudentSystem;

public class Student {
    //学生类属性：学号、姓名、年龄、生日、学校
    private String sStuNum;
    private String sStuName;
    private String sStuAge;
    private String sStuBirth;
    private static final String sStuSchool = "花果山幼儿园";//默认值，录入学生统一标签
    //无参构造

    public Student() {
    }
    //有参构造

    public Student(String sStuNum, String sStuName, String sStuAge, String sStuBirth) {
        this.sStuNum = sStuNum;
        this.sStuName = sStuName;
        this.sStuAge = sStuAge;
        this.sStuBirth = sStuBirth;
        //this.sStuSchool = sStuSchool;
    }
    //getter and setter

    public String getsStuNum() {
        return sStuNum;
    }

    public void setsStuNum(String sStuNum) {
        this.sStuNum = sStuNum;
    }

    public String getsStuName() {
        return sStuName;
    }

    public void setsStuName(String sStuName) {
        this.sStuName = sStuName;
    }

    public String getsStuAge() {
        return sStuAge;
    }

    public void setsStuAge(String sStuAge) {
        this.sStuAge = sStuAge;
    }

    public String getsStuBirth() {
        return sStuBirth;
    }

    public void setsStuBirth(String sStuBirth) {
        this.sStuBirth = sStuBirth;
    }

    public String getsStuSchool() {
        return sStuSchool;
    }

    @Override
    public String toString() {
        return "学生：" +
                "学号：'" + sStuNum + '\'' +
                ", 姓名：'" + sStuName + '\'' +
                ", 年龄：'" + sStuAge + '\'' +
                ", 生日：'" + sStuBirth + '\'' +
                ", 学校：'" + sStuSchool + '\'';
    }


}
