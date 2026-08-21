// package Source.Assignment_1;

class Employee{
    private String empName;
    private int empId;
    private long salary;
    public Employee(String empName,int empId,long salary){
        this.empId=empId;
        this.empName=empName;
        this.salary=salary;

    }
    public void displayData(){
        System.out.println("Employee Name : "+empName+"\nID : "+empId+"\nSalary : "+salary);


    }
    String getname(){
        return empName;
     }

 



};