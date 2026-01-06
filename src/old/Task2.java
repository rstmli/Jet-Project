package old;

import java.util.ArrayList;

public class Task2 {
  public static void main(String[] args) {
//    int[] arr = new int[51];
//    int index = 0;
//
//
//    for(int i = 0;i<=100;i++){
//      if(i%2==0){
//        arr[index] = i;
//        index++;
//      }
//    }
//    System.out.println(Arrays.toString(arr));


//
//    int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
//    int target = 6;
//    int left = 0;
//    int right = array.length -1;
//    while(left<=right){
//      int mid = left + (right - left) / 2;
//      if(array[mid]==target){
//        System.out.println("hedef tapildi");
//        break;
//      }else if (target > array[mid]){
//        left = mid + 1;
//      }
//      else {
//        right = mid - 1;
//      }
//    }


    ArrayList<Integer> array = new ArrayList<>();
    array.add(1);
    array.add(2);
    array.add(2);
    array.add(3);
    array.add(5);
    array.add(2);
    array.add(1);
    array.add(10);
    array.add(114);
    ArrayList<Integer> unDuplicateArray = new ArrayList<>();
    ArrayList<Integer> duplicateArray = new ArrayList<>();
   for(int i = 0;i<array.size();i++){
     for(int j = 0;j<array.size();j++){
      if(array.get(i).equals(array.get(j))){
        duplicateArray.add(array.get(i));
      }else {
        unDuplicateArray.add(array.get(i));
      }

     }

   }

    System.out.println(unDuplicateArray);
    System.out.println(duplicateArray);




  }

}




/*
class student
name,surname,age
private static final ArrayList<student> db = new ArrayList<>();



  public void addStudent(Student s){
    db.add(s);
}

public List<Student> getStudent(){
return db;
 */