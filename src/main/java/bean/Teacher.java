package bean;

public class Teacher {
    private int tNo;
    private String tPassword;
    private int tClass;
    private String tName;
    private String tEmail;
    private String tPhone;

    public int gettNo() {
        return tNo;
    }

    public void settNo(int tNo) {
        this.tNo = tNo;
    }

    public String gettPassword() {
        return tPassword;
    }

    public void settPassword(String tPassword) {
        this.tPassword = tPassword;
    }

    public int gettClass() {
        return tClass;
    }

    public void settClass(int tClass) {
        this.tClass = tClass;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettEmail() {
        return tEmail;
    }

    public void settEmail(String tEmali) {
        this.tEmail = tEmali;
    }

    public String gettPhone() {
        return tPhone;
    }

    public void settPhone(String tPhone) {
        this.tPhone = tPhone;
    }
}
