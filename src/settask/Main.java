package settask;


import java.util.*;

public class Main {

  public static void main(String[] args) {
//    /*Set<Integer> list1 = new HashSet<>();
//    list1.add(1);
//    list1.add(2);
//    list1.add(3);
//    list1.add(4);
//    Set<Integer> list2 = new HashSet<>();
//    list2.add(3);
//    list2.add(4);
//    list2.add(5);
//    list2.add(6);
//    Set<Integer> ortaqlar = new HashSet<>();
//    Set<Integer> hamisi = new HashSet<>();
//
//
//
//    for(Integer l1 : list1){
//      if(list2.contains(l1)){
//        ortaqlar.add(l1);
//      }
//    }
//
//
//    System.out.println("ortaqlar: " + ortaqlar);
//
//
//
//    hamisi.addAll(list1);
//    hamisi.addAll(list2);
//
//
//    Set<Integer> tekrarlanmayanlar = new HashSet<>();
//
//    for(Integer l1 : hamisi){
//      if(!ortaqlar.contains(l1)){
//        tekrarlanmayanlar.add(l1);
//      }
//    }
//
//    System.out.println("tekrarlanmayanlar: " + tekrarlanmayanlar);
//
//*/


    /*
    password validation
     */
    boolean lower = false;
    boolean upper = false;
    boolean reqem = false;
    boolean symbol = false;
//    int score = 0;
//
//    Scanner sc = new Scanner(System.in);
//
//    String password = sc.next();
//    ArrayList<Character> passwordCharacter = new ArrayList<>();
//    System.out.println(score);
//    for (int i = 0; i < password.length(); i++) {
//      passwordCharacter.add(password.charAt(i));
//    }
//    System.out.println(passwordCharacter);
////S4
//    for (Character s : passwordCharacter) {
//      if (Character.isUpperCase(s)) upper = true;
//      if (Character.isLowerCase(s)) lower = true;
//      if (Character.isDigit(s)) reqem = true;
//      if ("!@#$%^&*()_".contains(String.valueOf(s))) symbol = true;
//
//    }
//
//
    Map<String, Map<String,Integer>> orders = new HashMap<>();


    // samir Telefon 4
    orders.put("Samir",Map.of("Telefon",1,"netebook",10)); // 2
    orders.put("Qorxmaz",Map.of("B",1,"c",3)); // 2
    orders.put("Aqshin",Map.of("a",1,"d",10)); // 2
    orders.put("Nemet",Map.of("g",1,"h",10)); // 2
    orders.put("Ferid",Map.of("r",4)); // 1
    System.out.println(orders);
    List<String> keys = new ArrayList<>();

    for(var order : orders.entrySet()){
      for(var product : order.getValue().entrySet()){
       if(order.getValue().size() < 2){
       keys.add(order.getKey());

       }
      }
    }


    for(String key : keys){
      orders.remove(key);
    }
    System.out.println(orders);
//
//    int[][][] array = {
//            {
//                    {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}
//            },
//            {
//                    {13, 14, 15, 16}, {17, 18, 19, 20}
//            },
//            {
//                    {21, 22, 23, 24, 25}
//            }
//            // result: 24
//
//
//    };



//
//    if (upper) score++;
//    if (reqem) score++;
//    if (symbol) score++;
//    if (lower) score++;
//    if (score > 3) System.out.println("guclu parol");
//    else if (score > 2) System.out.println("orta parol");
//    else System.out.println("zeif parol");
//    System.out.println(score);
//

  }
}
