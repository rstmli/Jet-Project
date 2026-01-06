package studenttaskhard;

import java.util.ArrayList;
import java.util.List;

public class Student {
  private String name;
  private String surname;
  private Integer age;
  private static List<Student> dataBase = new ArrayList<>();

  public Student(String name, String surname, Integer age) {
    this.name = name;
    this.surname = surname;
    this.age = age;
  }

  public static void addStudent(Student s){
    dataBase.add(s);
  }

  public static List<Student> getDataBase(){
    return dataBase;
  }

  @Override
  public String toString() {
    return "studenttaskhard.Student{" +
            "name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", age=" + age +
            '}';
  }

  public static void deleteDataBaseElement(Student s){
    dataBase.remove(s);
  }

  public static List<Student> getByAge(int age){
    List<Student> list = new ArrayList<>();
    for(Student s : dataBase){
      if(s.age > age){
        list.add(s);
      }
    }
    return list;
  }

}
