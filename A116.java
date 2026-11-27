import java.util.Scanner;

public class A116 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int passengers = 0;
        int capacity = 0;

        for (int i = 0; i < n; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            passengers = passengers - a + b;

            if (passengers > capacity) {
                capacity = passengers;
            }
        }

        System.out.println(capacity);

        sc.close();
    }
}