import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        int pos = arr[scanner.nextInt() - 1];
        
        int max = arr[n-1];
        int min = arr[0];

        if (t >= pos - min || t >= max - pos || t >= max){
            int result = max - min;
            System.out.println(result);
        }
        else{
            int result = Math.min(pos - min + max - min, max - pos + max - min);
            System.out.println(result);
        }
    }
}
