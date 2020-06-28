import java.util.Scanner;

public class GuessNumber {
    Scanner scanner = new Scanner(System.in);
    public void getNumber() {
        int number;
        do {
            System.out.println("Podaj liczbe");
            number = scanner.nextInt();
            if (number < 100) {
                System.out.println("Liczna jest za mala");
            } else if (number > 200) {
                System.out.println("Liczba jest za duza");
            } else if (number % 3 != 0 && number > 99 && number < 201) {
                System.out.println("Liczba nie jest podzielna przez 3");
            } else {
                System.out.println("Liczba jest ok");
            }
        }
        while (number % 3 != 0 && number > 99 && number < 201 ||  number > 200 || number < 100);

    }
}
