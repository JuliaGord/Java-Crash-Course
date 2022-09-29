import java.util.Scanner;

class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = number % 10 == 3 ? "Yes!" : "No!";
        System.out.println(result);
    }
}
