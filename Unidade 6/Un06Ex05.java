import java.util.Scanner;
import java.util.Arrays;

public class Un06Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Responda com SIM, NAO ou IND");
        
        String man[] = new String[5], woman[] = new String[5]; 

        String[] firstPerson = likes(input, man);
        String[] secondPerson = likes(input, woman);
        int indexForResponse = compare(firstPerson, secondPerson);

        System.out.println(indexForResponse);
        input.close();
    }

    private static String[] likes(Scanner input, String[] person) {
        System.out.println("Uma nova pessoa começa aqui.");

        System.out.println("Gosta de música sertaneja?");
        person[0] = input.next();

        System.out.println("Gosta de futebol?");
        person[1] = input.next();

        System.out.println("Gosta de seriados?");
        person[2] = input.next();

        System.out.println("Gosta de redes sociais?");
        person[3] = input.next();

        System.out.println("Gosta da Oktoberfest?");
        person[4] = input.next();

        return person;
    }

     private static int compare(String[] firstPerson, String[] secondPerson) {
        int index = 0;

         for (int i = 0; i < firstPerson.length; i++) {
             if (firstPerson[i].toString().equals(secondPerson[i].toString())) {
                 index += 3;
            }

            if((firstPerson[i].equalsIgnoreCase("ind") && secondPerson[i].toString() != "IND")||(secondPerson[i].equalsIgnoreCase("IND") && firstPerson[i].toString() != "IND")) {
                index += 1;
            }

            if ((firstPerson[i] != firstPerson[i]) && (firstPerson[i].toString() !=  "IND" || secondPerson[i].toString() != "IND")) {
                index -= 2;
            }
        }

        return index;
    }
}
