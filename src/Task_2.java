import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double log = Math.log(N) / Math.log(2);
        int result = (int) Math.ceil(log);
        System.out.println(result);
    }
}
