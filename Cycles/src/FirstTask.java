import java.util.Scanner;

class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter your number: ");
        int number = scanner.nextInt();
        int j = 1;
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if(i != number-1){
                System.out.print(j + " + ");
            } else {
                System.out.print(j);
            }
            sum+=j;
            j+=2;
        }
        System.out.print(" = " + sum);

    }
}

