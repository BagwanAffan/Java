import java.util.Scanner;
public class Assignment1{
    public static void main(String[] args) {
        int choice;
        Scanner var1 = new Scanner(System.in);
        do{
        System.out.println("1.Add Employee\n2.Add Manager\n3.Add Developer\n4.Exit");
        System.out.println("Enter Your Choice : ");
        choice=var1.nextInt();
        switch (choice) {
            case 1:
                Employee e=new Employee("Employee",101,90000);
        e.displayData();
                
                break;
            case 2:
                 Manager m=new Manager("Manager",21,9000000, 30000);
                 m.displayData();
                
                break;
            case 3:
                Developer d=new Developer("Developer",301,200000);
                d.addskill("Java");
                d.addskill("Python","Expert");

                d.addskill("Java",10);
                d.displayData();
                
                break;
            case 4:
                System.out.println("Thank You For Using Our Portal !");
                break;

        
            default:
                System.out.println("Invalid Choice !");
                break;
        }
    }
    while(choice!=4);
      
       
        

    }
};