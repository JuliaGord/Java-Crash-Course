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
                System.out.println("У вас 2 гривні");
                break;
            case 3:
                System.out.println("У вас 3 гривні");
                break;
            case 4:
                System.out.println("У вас 4 гривні");
                break;
            case 5:
                System.out.println("У вас 5 гривень");
                break;
            case 6:
                System.out.println("У вас 6 гривень");
                break;
            case 7:
                System.out.println("У вас 7 гривень");
                break;
            case 8:
                System.out.println("У вас 8 гривень");
                break;
            case 9:
                System.out.println("У вас 9 гривень");
                break;
            case 10:
                System.out.println("У вас 10 гривень");
                break;
            default:
                System.out.println("Ви ввели неправильне число.");
        }

    }
}