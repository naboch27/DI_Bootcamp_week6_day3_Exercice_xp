import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            int user = 0;

            System.out.println("Enter on nombre: ");

            user = scanner.nextInt();

            scanner.nextLine();

            String[] digits = String.valueOf(user).split("", 0);

            List<String> digitsList = new ArrayList<String>();

            for (int i = digits.length - 1; i >= 0; i--) {

                digitsList.add(digits[i]);
            }

            System.out.println(" Reversed  of enter for a user: " + String.join("", digitsList));

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

}
