import java.util.Scanner;

class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        System.out.print("Будь ласка, введіть ваше число: ");
        int number = scanner.nextInt();
        for (int i = 2; i < number; i++){
            if(number % i != 0){
                continue;
            } else {
                flag= false;
                break;
            }
        }
        if(flag){
            System.out.println("Просте число!");
        } else {
            System.out.println("Складене число!");
        }


    }
}
