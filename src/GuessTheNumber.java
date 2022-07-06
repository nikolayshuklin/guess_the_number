import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int hiddenNumber = (int) (Math.random() * 100 + 1);// случайное число для угадывания от 1 до 100
        Scanner scanner = new Scanner(System.in);
        int count = 0; // кол-во попыток пользователя

        while (true){
            System.out.println("Ввведите число: ");
            int number = scanner.nextInt();
            count++;
            if (number < hiddenNumber) System.out.println("Загаданное число больше " + number);
            else if (number > hiddenNumber) System.out.println("Загаданное число меньше " + number);
            else {
                System.out.println("Вы угадали загаданное число \"" + number + "\" c " + count + " попытки.");
                System.out.println("Поздравляю!!!");
                break;
            }

        }
    }
}
