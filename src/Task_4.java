import java.util.*;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        ArrayList<Integer> possible_profit = new ArrayList<Integer>();
        long result = 0;

        for (int i = 0; i < n; i++){
            int num = scanner.nextInt();
            int m = 0;
            while (num != 0){
                int x = num % 10;
                if (x != 9){
                    possible_profit.add((int) Math.pow(10, m) * (9 - x));
                }
                m++;
                num /= 10;
            }
        }

        Collections.sort(possible_profit);
        Collections.reverse(possible_profit);

        for (int i = 0; i < k; i++){
            try {
                result += possible_profit.get(i);
            } catch (Exception e){
                System.out.println(result);
                return;
            }
        }

        System.out.println(result);
    }
}
