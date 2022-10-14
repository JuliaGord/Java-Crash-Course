import java.util.Arrays;

class SecondTask {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = (int)(Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++){
            int temp = numbers[numbers.length-1];
            for(int j = numbers.length-1; j > 0; j--){
                numbers[j]=numbers[j-1];
            }
            numbers[0] = temp;
            System.out.println(Arrays.toString(numbers));
        }
        }


}
