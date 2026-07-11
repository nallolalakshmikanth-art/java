public class ric{
    public static void main(String[] args) {
        int a = 15;
        int b = 28;
        int c = 21;

        if (a >= b && a >= c) {
            System.out.println(a + " is the largest number.");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the largest number.");
        } else {
            System.out.println(c + " is the largest number.");
        }
    }
}
