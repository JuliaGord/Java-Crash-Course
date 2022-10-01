class FourthTask {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;
        int temp = 0;
        double average = n1+n2;
        System.out.println("The first 20 Fibonacci numbers are: ");
        System.out.print(n1 + " " + n2);
        for (int i = 3; i <= 20; i++){
            temp = n1 + n2;
            n1 = n2;
            n2 = temp;
            System.out.print(" " + temp);
            average+=temp;
        }
        System.out.println ("\nThe average is: " + average/20);
    }
}
