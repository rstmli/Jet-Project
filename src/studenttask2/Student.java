package studenttask2;

import java.util.*;

public class Student
{
  private String name;
  private String surname;
  private Integer age;


  static ArrayList<Student> dataBase = new ArrayList<>();


  public Student(String name, String surname, Integer age) {
    this.name = name;
    this.surname = surname;
    this.age = age;
  }


  public Integer getAge() {
    return age;
  }

  public static ArrayList<Student> getDataBase() {
    return dataBase;
  }

  public static void addStudent(Student s){
    try{
      if(s.getAge() > 18){
        dataBase.add(s);
      }else {
        throw new InvalidAgeException("Yasiniz uygun deyil");
      }
    }catch (InvalidAgeException e ){
      System.out.println(e.getMessage());
    }
  }


  public static void main(String[] args) {
//    Student nemet = new Student("Nemet","Huseynov",24);
//    Student samir = new Student("Samir","Hesimov",21);
//    Student ferid = new Student("Ferid","Haciyev",22);
//    Student qorxmaz = new Student("Qorxmaz","Feyziyev",16);
//
//
//    addStudent(nemet);
//    addStudent(samir);
//    addStudent(ferid);
//    addStudent(qorxmaz);
//

//    System.out.println(getDataBase());

    Set<String> setList = new HashSet<>();
    setList.add("Nemet");
    setList.add("Ferid");
    setList.add("Qorxmaz");
    setList.add("Samir");
    setList.add("Nemet");
    setList.add("Gunay");
    setList.add("Arzu");
    setList.add("Zehra");






}





  @Override
  public String toString() {
    return "studenttask2.Student{" +
            "name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", age=" + age +
            '}';
  }
}



/*

 */