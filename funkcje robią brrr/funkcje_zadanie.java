import java.util.Random;
import java.util.Scanner;


class funkcje_robia_brrr {
    public static void main( String args[] ) {
    Random rand = new Random(); 
      
    int zadanie = rand.nextInt(5) + 1;
    int a = rand.nextInt(20) - 10 ; 
    int b = rand.nextInt(20) - 10 ; 
    int c = rand.nextInt(20) - 10 ; 
    int wzór = rand.nextInt(3) + 1;
    int delta = b^2 - 4(a*c) ;
    int p = -b/(2*a);
    int q = -delta/(4*a) ;
    int x_0 = -b/(2*a) ;
    int x_1 = -b-Math.sqrt(delta)/(2*a);
    int x_2 = -b+Math.sqrt(delta)/(2*a);
      
    if (a = 0) {
        a = a + 1;
      }
      
    System.out.println("f(x)=");

    switch(wzór){
        case 1:
            System.out.println("postać ogólna: f(x)= "+a+"x^2 + "+b+"x + "+c);
        break;

        case 2:
            System.out.println("postać iloczynowa: f(x)= "+a+"(x-p)^2 + "+q);
        break;

        case 3:
            System.out.println("postać kanoniczna: f(x)= "+a+"(x-x_1)*(x-x_2)");
        break:

    }
      
    switch(zadanie){

        case 1:
            System.out.println("oblicz delte");
        break;
        
        case 2:
            System.out.println("oblicz p i q");
        break;

        case 3:
            System.out.println("podaj a, b, c");
        break;

        case 4:
            System.out.println("olicz x_1 i x_2");
        break;

        case 5:

            if (wzór = 1) {
                System.out.println("zmień wzór na postać iloczyniową");
            } else if (wzór = 2) {
                System.out.println("zmień wzór na postać kanoniczną");
            } else {
                System.out.println("zmień wzór na postać ogólną");
            }

           
        break;

    }
    }
}
