import java.util.Scanner;

class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;

        while (true) {
            n = sc.nextInt();
            if (n == -1)
                break;
            sum = sum + n;
        }

        System.out.println(sum);
    }
}