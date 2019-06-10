package bean;

public class Course {
    private int cNo;
    private String cName;
    private int cHour;
    private int cCredit;
    private String cStudent;

    public Course(int id, String name, int hour, int credit,String student) {
		// TODO Auto-generated constructor stub
    	this.setcNo(id);
    	this.setcName(name);
    	this.setcHour(hour);
    	this.setcCredit(credit);
    	this.setcStudent(student);
	}

	public int getcNo() {
        return cNo;
    }

    public void setcNo(int cNo) {
        this.cNo = cNo;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getcHour() {
        return cHour;
    }

    public void setcHour(int cHour) {
        this.cHour = cHour;
    }

    public int getcCredit() {
        return cCredit;
    }

    public void setcCredit(int cCredit) {
        this.cCredit = cCredit;
    }

    public String getcStudent() {
        return cStudent;
    }

    public void setcStudent(String student) {
        this.cStudent = student;
    }

}
