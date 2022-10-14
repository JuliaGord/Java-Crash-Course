import java.util.Arrays;

class ThirdTask {
    public static void main(String[] args) {
        int[] firstArray = new int[6];
        for (int i = 0; i < 6; i++) {
            firstArray[i] = (int)(Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(firstArray));
        int[] secondArray = new int[4];
        for (int i = 0; i < 4; i++) {
            secondArray[i] = (int)(Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(secondArray));
        int[] result = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray,0,result,0,firstArray.length);
        System.arraycopy(secondArray,0,result, firstArray.length, secondArray.length);
        System.out.println(Arrays.toString(result));
    }
}
