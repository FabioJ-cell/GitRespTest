package StudentManagerment;
//管理员类
public class Managers extends StuOperaClass{
    private String mUserName;
    private String mPassWord;

    public Managers() {
    }

    public Managers(String mUserName, String mPassWord) {
        this.mUserName = mUserName;
        this.mPassWord = mPassWord;
    }

    public String getmUserName() {
        return mUserName;
    }

    public void setmUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    public String getmPassWord() {
        return mPassWord;
    }

    public void setmPassWord(String mPassWord) {
        this.mPassWord = mPassWord;
    }

    @Override
    public String toString() {
        return "Managers{" +
                "mUserName='" + mUserName + '\'' +
                ", mPassWord='" + mPassWord + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Managers managers = (Managers) o;

        if (mUserName != null ? !mUserName.equals(managers.mUserName) : managers.mUserName != null) return false;
        return mPassWord != null ? mPassWord.equals(managers.mPassWord) : managers.mPassWord == null;
    }

    @Override
    public int hashCode() {
        int result = mUserName != null ? mUserName.hashCode() : 0;
        result = 31 * result + (mPassWord != null ? mPassWord.hashCode() : 0);
        return result;
    }
}
