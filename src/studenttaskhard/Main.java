package studenttaskhard;

import java.sql.SQLOutput;

public class Main {
  public static void main(String[] args) {
    Student neymet = new Student("Nemet","Huseynov",24);
    Student ferid = new Student("Ferid","Haciyev",22);
    Student qorxmaz = new Student("Qorxmaz","Feyziyev",28);
    Student samir = new Student("Samir","Hasimov",21);
    Student aqshin = new Student("Aqshin","Quliyev",26);

   Student.addStudent(neymet);
   Student.addStudent(ferid);
   Student.addStudent(qorxmaz);
   Student.addStudent(samir);
   Student.addStudent(aqshin);


    System.out.println(Student.getDataBase());
    Student.deleteDataBaseElement(neymet);
    System.out.println(Student.getDataBase());
    System.out.println(Student.getByAge(21));




  }
}



/*
  Student classımız içərisində ad soyad yaş olsun
  dataBase ArrayListi olsun
  databazaya Studenti əlavə edərkən Yaşini yoxlayaq 18 den
   boyukduse elave etsin
  kicikdirse exception atsin
 */
