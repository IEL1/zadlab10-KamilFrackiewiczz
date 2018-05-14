package pl.edu.ur.oopl10;

import java.util.Scanner;

public class WprowadzZKonsoli {
        
    static void wpiszInt(){
        Scanner klawiatura = new Scanner(System.in);
       try { int a=klawiatura.nextInt();  }
       catch (Exception e){
           System.out.println("Nie jest to int");
       }
    }
    public static void main(String[] args) {
      WprowadzZKonsoli.wpiszInt();
}
}