package bean;
public class Grade {
    private int sNo;
    private String sName;
    private int sClass;
    private int uGrade;
    private int mGrade;
    private int fGrade;
    private int pGrade;
    private int overGrade;

    public int getsNo() {
        return sNo;
    }

    public void setsNo(int sNo) {
        this.sNo = sNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsClass() {
        return sClass;
    }

    public void setsClass(int sClass) {
        this.sClass = sClass;
    }

    public int getuGrade() {
        return uGrade;
    }

    public void setuGrade(int uGrade) {
        this.uGrade = uGrade;
    }

    public int getmGrade() {
        return mGrade;
    }

    public void setmGrade(int mGrade) {
        this.mGrade = mGrade;
    }

    public int getfGrade() {
        return fGrade;
    }

    public void setfGrade(int fGrade) {
        this.fGrade = fGrade;
    }

    public int getpGrade() {
        return pGrade;
    }

    public void setpGrade(int pGrade) {
        this.pGrade = pGrade;
    }

    public int getOverGrade() {
        return overGrade;
    }

    public void setOverGrade(int overGrade) {
        this.overGrade = overGrade;
    }

    public void setGrade(int sNo,String sName,int sClass,int uGrade,int mGrade,int fGrade,int pGrade,int overGrade){
        this.sNo = sNo;
        this.sName = sName;
        this.sClass = sClass;
        this.uGrade = uGrade;
        this.mGrade = mGrade;
        this.fGrade = fGrade;
        this.pGrade = pGrade;
        this.overGrade = overGrade;
    }
}
