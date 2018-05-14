
package pl.edu.ur.oopl10;

import java.util.Scanner;

public class Zadanie2 {
  static void tablica(){
      int[] tab={1,2,3,4,5};
      Scanner klawiatura = new Scanner(System.in);
      int index=klawiatura.nextInt();
      klawiatura.close();
      try{
           System.out.println(tab[index]);
      }catch (ArrayIndexOutOfBoundsException e){
          System.err.println("Indeks tablicy poza zakresem");
      }
  }
    public static void main(String[] args) {
      Zadanie2.tablica();
}
}