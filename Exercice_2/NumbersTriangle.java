/**
 * NumbersTriangle
 */
public class NumbersTriangle {

    public static void main(String[] args) {
        
      //posibilite 2
         for (int i = 1; i < 8; i++) {

               for (int j = i; j > 0; j--) {
                
                 System.out.print(""+i+"");
               }

               System.out.println("\n");

             }

    

    //posibilite 2

    // Exercise 2
    String chaine;
    for (int i = 1; i <= 7; i++) {
      chaine = "";
        for (int j = 1; j <= i; j++) {
          chaine += i;
        }
        System.out.println(chaine);
    }

}
}