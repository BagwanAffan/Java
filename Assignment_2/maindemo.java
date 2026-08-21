
import java.util.Scanner;
public class maindemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        student_management s1=new student_management();
        int choice=0;
        int rollno;
        String name;
        Float cgpa;
        

        while(choice!=6){
            try{
            System.out.println("1.Add Student \n"+"2.Display List\n"+"3.Search Student\n"+"4.Update Student\n"+"5.Delete Student\n"+"6.Exit\n");
            System.out.println("Enter Your Choice : ");
            choice=sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Enter Roll No : ");
                    rollno=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Name : ");
                    name=sc.nextLine();
                    System.out.println("Enter CGPA : ");
                    cgpa=sc.nextFloat();
                    Student stud=new Student(rollno,name,cgpa);
                    s1.add_student(stud);

                    
                    
                    break;
                case 2:
                    s1.display();
                    
                    break;
                case 3:
                    System.out.println("Enter Roll No : ");
                    rollno=sc.nextInt();
                    sc.nextLine();
                    s1.search_Student(rollno);



                    

                    
                    
                    break;
                case 4:
                    System.out.println("Enter Roll No : ");
                    rollno=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Updated Name : ");
                    name=sc.nextLine();
                    System.out.println("Enter Updated CGPA : ");
                    cgpa=sc.nextFloat();



                    s1.update_Student(rollno, name, rollno);
                    
                    
                    
                    break;
                case 5:
                    System.out.println("Enter Roll No to Delete its data : ");
                    rollno=sc.nextInt();
                    s1.delete_Student(rollno);
                    
                    
                    break;
                case 6:
                    System.out.println("Thank You For Using Our Portal !\n");
                    
                    break;
            
                default:
                    break;
            }

        }
          catch(StudentException e){
        e.printStackTrace();
    }
    }
  
        sc.close();
        
    }
    
}
