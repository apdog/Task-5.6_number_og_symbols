import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        String name = in.nextLine();
        if (name.length() < 3 || name.length() > 10) {
            do {
                System.out.println("Ваше имя должно быть не меньше трех символов и не больше 10.\n Пожалуйста, введите другое имя");
                name = in.nextLine();
            } while (name.length() < 3 || name.length() > 10);
        }
        System.out.println("Добро пожаловать в наше сообщество," + name);
    }
}

