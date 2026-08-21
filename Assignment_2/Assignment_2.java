package Assignment_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment_2 {
    public static void main(String[] args) {
        {
            Student s1 =new Student(23301,"Arnav",9.8f);
            Student s2 =new Student(23302,"Arsh",9.7f);
            Student s3 =new Student(23303,"Aryan",9.75f);
            List<Student> ls=new ArrayList<Student>();
            Map <Integer,String> map =new HashMap<Integer,String>();
            ls.add(s1);
            map.put(s1.getRoll_no(),s1);

            
            
            

        }
    }
    
}
