public class CountOddNumbers {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 22, 37, 48, 51, 64, 79};
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                count++;
            }
        }

        System.out.println("Number of odd elements = " + count);
    }
}
