package old;

public class Main {
  public static void main(String[] args) {
    int row = 5;


    for (int i = 0; i < row; i++) {
      for (int k = row; k > i; k--) System.out.print(" ");


      for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
      System.out.println();


    }
    for (int i = 1; i <= 3; i++) {
      for (int j = 1; j < row; j++) {
        System.out.print(" ");
      }
      System.out.println("|");
    }
  }
}