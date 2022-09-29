import java.util.Scanner;

class ThirdTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число a: ");
        int a = scanner.nextInt();
        System.out.print("Введіть число b: ");
        int b = scanner.nextInt();
        System.out.print("Введіть число c: ");
        int c = scanner.nextInt();
        int d = b * b - 4 * a * c;
        if (d > 0) {
            double x1 = ((-b) + Math.sqrt(d)) / (2 * a);
            double x2 = ((-b) - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1 + "\n" + "x2 = " + x2);
        } else if (d == 0) {
            int x1 = -b / (2 * a);
            System.out.println("x1, x2 = " + x1);
        } else {
            System.out.println("Рівняння не має дійсних коренів");
        }

    }
}