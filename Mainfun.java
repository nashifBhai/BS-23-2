import java.util.*;

class Student{
   private int studentId;
   private String firstName;
   private double cgpa;
   public Student(int studentId, String firstName, double cgpa) {
      super();
      this.studentId = studentId;
      this.firstName = firstName;
      this.cgpa = cgpa;
   }
   public int getId() {
      return studentId;
       
   }
      
   public String getFirstname() {
      return firstName;
   }
   public double getCgpa() {
      return cgpa;
   }
}

public class Mainfun
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int n = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(n>0){
         int studentId = in.nextInt();
         String firstName = in.next();
         double cgpa = in.nextDouble();
         
         Student a1 = new Student(studentId, firstName, cgpa);
         studentList.add(a1);
         
         n--;
      }
      Collections.sort(studentList,  Comparator.comparing(Student :: getCgpa).reversed().thenComparing(Student :: getFirstname).thenComparing(Student :: getId));
         for(Student a1: studentList){
         System.out.println(a1.getFirstname());
      }
   }
}