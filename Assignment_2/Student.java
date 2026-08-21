
public class Student {
    private int roll_no;
    private String name;
    private float CGPA;
    public Student(int roll_no, String name, float CGPA) {
        this.roll_no = roll_no;
        this.name = name;
        this.CGPA = CGPA;
    }
    public int getRoll_no() {
        return roll_no;
    }
    public void setRoll_no(int rollno) {
        roll_no=rollno;

        
    }
    public String getName() {
        return name;
    }
    public void setName(String Name) {
        name=Name;
    }
    public float getCGPA(){
        return CGPA;
    }
    public void setCGPA(float cgpa) {
        CGPA=cgpa;
    }
    @Override
    public String toString() {
        return "Student [roll_no=" + roll_no + ", name=" + name + ", CGPA=" + CGPA + "]";
    }
    

    
}
