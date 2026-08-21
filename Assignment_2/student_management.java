
import java.util.ArrayList;
import java.util.HashMap;



public class student_management {
    ArrayList<Student> studlist=new ArrayList<>();

    HashMap<Integer,Student> smap=new HashMap<>();;
    public void add_student(Student stud) throws StudentException{
        if(smap.containsKey(stud.getRoll_no())){
            // System.out.println("Record already exists");
        throw new StudentException("Record already exists");

            
        }
        studlist.add(stud);



        
        smap.put(stud.getRoll_no(), stud);
    }

public void display () throws StudentException{
    if(studlist.isEmpty()){
        // System.out.println("List is empty !");
        throw new StudentException("List is empty !");
        
        
    }
    for(Student s:studlist){
        System.out.println(s);
    }
}
public void search_Student(int rollno) throws StudentException{
    if(smap.containsKey(rollno)){
        System.out.println("Student Found "+ smap.get(rollno));
    }
    else{
        // System.out.println("Student Not Found !");
        throw new StudentException ("Student Not Found !");


        
    }
}

public void update_Student(int rollno,String name,float cgpa) throws StudentException{
    Student s=smap.get(rollno);
    if(s==null){
        // System.out.println("Student Not Found !");
        throw new StudentException ("Student Not Found !");
        

        

    }
    s.setName(name);
    s.setCGPA(cgpa);
    System.out.println("Student Updated !"+ s);

}

public void delete_Student(int rollno) throws StudentException{
    Student s=smap.get(rollno);
    if(s==null){
        // System.out.println("Student Not Found !");
        throw new StudentException ("Student Not Found !");
    }
    studlist.remove(s);
    smap.remove(rollno);
}




    
}
