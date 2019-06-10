package bean;

public class Student {
    private int sNo;
    private String sPassword;
    private int sClass;
    private String sName;
    private int choice;
    private String sEmail;
    private String sPhone;
    private String notice;

    public int getsNo() {
        return sNo;
    }

    public void setsNo(int sNo) {
        this.sNo = sNo;
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword;
    }

    public int getsClass() {
        return sClass;
    }

    public void setsClass(int sClass) {
        this.sClass = sClass;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public void setStudent(int sNo,String sPassword,int sClass,String sName,Integer choice,String sEmail,String sPhone,String notice){
        this.sNo=sNo;
        this.sPassword=sPassword;
        this.sClass=sClass;
        this.sName=sName;
        this.choice=choice;
        this.sEmail=sEmail;
        this.sPhone=sPhone;
        this.notice=notice;
    }

    public void setStudent(int sNo,String sPassword,int sClass,String sName,String sEmail,String sPhone){
        this.sNo=sNo;
        this.sPassword=sPassword;
        this.sClass=sClass;
        this.sName=sName;
        this.choice=0;
        this.sEmail=sEmail;
        this.sPhone=sPhone;
        this.notice="";
    }

    @Override
    public String toString() {
        return "Student{" +
                "sNo=" + sNo +
                ", sPassword='" + sPassword + '\'' +
                ", sClass=" + sClass +
                ", sName='" + sName + '\'' +
                ", choice=" + choice +
                ", sEmail='" + sEmail + '\'' +
                ", sPhone='" + sPhone + '\'' +
                ", notice='" + notice + '\'' +
                '}';
    }
}
