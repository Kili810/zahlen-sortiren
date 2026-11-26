import java . util . ArrayList ;
import java . util . Random ;

public class Zufallszahlen {
    public static void main ( String [] args ) {
    ArrayList < Integer > zahlen = new ArrayList < Integer >() ;
    
    // 20 Zufallszahlen von 1 bis 100 erzeugen
    Random zufall = new Random () ;
    for ( int i = 0; i < 20; i ++) {
        zahlen . add ( zufall . nextInt (100) + 1) ;
    }
    System . out . println ( " Vor dem Sortieren : " + zahlen ) ;

// Ergaenze hier den Sortieralgorithmus
    for ( int i = 0; i < ; i ++) {
        for ( int j = 0; j <; j ++) {
            if ( ) {
// Ergaenze hier das Programm entsprechend
// Vertausche die beiden Zahlen mit temp
            }
        }
    }
    System . out . println ( " Nach dem Sortieren : " + zahlen );
    }
}