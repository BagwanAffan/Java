
class Manager extends Employee{
    private long bonus;
    public Manager(String empName,int empId,long salary,long bonus ){
        super(empName,empId,salary);
        this.bonus=bonus;
    }
    public void displayData(){
        super.displayData();
        System.out.println("Bonus : "+bonus);
    }
 

};