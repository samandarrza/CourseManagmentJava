package bean;

public class Student extends Person {
  private String qrupNo;
  private int scholarship;

  public String getQrupNo() {
    return qrupNo;
  }

  public void setQrupNo(String qrupNo) {
    this.qrupNo = qrupNo;
  }

  public int getScholarship() {
    return scholarship;
  }

  public void setScholarship(int scholarship) {
    this.scholarship = scholarship;
  }
}
