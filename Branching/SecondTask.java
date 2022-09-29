import java.util.Scanner;

class SecondTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число від 0 до 10: ");
        int number = scanner.nextInt();
        switch (number) {
            case 0:
                System.out.println("У вас 0 гривень");
                break;
            case 1:
                System.out.println("У вас 1 гривня");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("У вас " + number + " гривні");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("У вас " + number + " гривень");
                break;
            default:
                System.out.println("Ви ввели неправильне число.");
        }

    }
}