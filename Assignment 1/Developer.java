/**
 * Developer
 */
 class Developer extends Employee{
    Developer(String empName,int empId,long salary){
        super(empName,empId,salary);
    }
    private String skill;
    public void addskill(String skill){
        this.skill=skill;
        System.out.println(super.getname()+" Knows "+skill);
    }
    public void addskill(String skill,String level){
        this.skill=skill;
        System.out.println(super.getname()+" is "+level+" in skill "+skill);
    }
    public void addskill(String skill,int exp){
        this.skill=skill;
        System.out.println(super.getname()+" has "+exp+" year of experience in skill "+skill);
    }
    public void displayData(){
        super.displayData();
        System.out.println("Skill : "+skill);

        


    }
    

    
}