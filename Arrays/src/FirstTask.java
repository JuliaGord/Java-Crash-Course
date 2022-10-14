import java.util.Arrays;

class FirstTask {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int min = 0;
        int maxIndex = 0;
        int minIndex = 0;
        int max = 0;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            numbers[i] = (int)(Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(numbers));
        min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max){
                max = numbers[i];
                maxIndex = i;
            }
            if(numbers[i] < min){
                min = numbers[i];
                minIndex = i;
        }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
        if(maxIndex < minIndex){
            for (int i = maxIndex+1; i < minIndex; i++){
                sum += numbers[i];
            }
            System.out.println(sum);
        } else{
            for (int i = minIndex+1; i < maxIndex; i++){
                sum += numbers[i];
            }
            System.out.println(sum);
        }
    }
}
