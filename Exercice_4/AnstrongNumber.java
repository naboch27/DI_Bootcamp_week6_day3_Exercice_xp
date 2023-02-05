/**
 * AnstrongNumber
 */
public class AnstrongNumber {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 500; i++) {

            String[] TabAmstrong = String.valueOf(i).split("", 0);

            int sum = 0;

            for (int j = 0; j < TabAmstrong.length; j++) {

                sum += (int) Math.pow(Double.valueOf(TabAmstrong[j]), 3);

            }
            if (sum == i) {

                System.out.printf("\n%d is an Armstrong number.", i);

            }
        }

    }
}