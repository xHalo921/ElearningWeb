package bean;
public class Grade {
    private int sNo;
    private String sName;
    private int uGrade;
    private int mGrade;
    private int fGrade;
    private int pGrade;
    private int overGrade;

    public Grade(int id, String name, int ug, int mg,int fg, int pg, int og) {
		// TODO Auto-generated constructor stub
    	this.setsNo(id);
    	this.setsName(name);
    	this.setuGrade(ug);
    	this.setmGrade(mg);
    	this.setfGrade(fg);
    	this.setpGrade(pg);
    	this.setOverGrade(og);
	}

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
}
