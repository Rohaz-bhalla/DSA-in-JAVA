package CollectionClasses;


import java.util.*;

   class student
  {
    int roll_no;
    String name;
    int marks;

    student(int r, String n, int m )
    {
      roll_no = r;
      name = n;
      marks = m;
    }
  }
  
   public class objects_ArrayList
  {
    public static void main(String[] args) 
    {
      ArrayList<student> al = new ArrayList<>();
      al.add(new student (1,"Mukesh",90));
      al.add(new student(2,"Ram",70));
      al.add(new student(3,"Sham",88));

      for(student st:al)
      {
        System.out.println("The Roll Number is :"+st.roll_no);
        System.out.println("The Name of the Student is :"+st.name);
        System.out.println("The Marks of the is :"+st.marks);
      }
    }
  }

  

