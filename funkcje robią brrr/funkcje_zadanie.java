import java.util.Random;
import java.util.Scanner;


class GenerateRandom {
    public static void main( String args[] ) {
      Random rand = new Random(); 
      
        
      int a = rand.nextInt(10) ; 
      int b = rand.nextInt(10) ; 
      int c = rand.nextInt(10) ; 

      int delta = b^2 - 4(a*c) ;
      int p = -b/(2*a);
      int q = -delta/(4*a) ;
      int x_0 = -b/(2*a) ;
      int x_1 = (-b-Math.sqrt(delta))/(2*a);
      int x_2 = -b+Math.sqrt(delta))/(2*a);
      
      
      
      System.out.println(f(x)=);
      
    }
}
