import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++){
            if (arr[i] % 2 != (i+1) % 2){
                list.add(i);
            }
        }

        if (list.size() != 2){
            System.out.println("-1 -1");
        } else if(list.get(0) % 2 == list.get(1) % 2){
            System.out.println("-1 -1");
        } else{
            System.out.println((Math.min(list.get(0), list.get(1)) + 1) + " " + (Math.max(list.get(0), list.get(1)) + 1));
        }
    }
}
