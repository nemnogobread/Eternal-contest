import javax.swing.*;
import java.util.Scanner;

public class Task_7 {

    static boolean check_cycle(int[] arr){
        int start = 1;
        int current = 1;
        int count = 0;
        boolean[] visited = new boolean[arr.length];

        while (!visited[current - 1]){
            if (count >= arr.length){
                return false;
            }
            visited[current - 1] = true;
            current = arr[current - 1];
            count++;
        }
        return count == arr.length && current == start;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] numberOfPointers = new int[n];
        for (int i = 0 ; i < n; i++){
            arr[i] = scanner.nextInt();
            numberOfPointers[arr[i] - 1] += 1;
        }

        if (check_cycle(arr)){
            System.out.println("-1 -1");
            return;
        }

        int numOf0 = 0;
        int numOf1 = 0;
        int numOf2 = 0;

        int ZeroEdgeVertex = 0;
        int TwoEdgeVertex = 0;

        for (int i = 0; i < n; i++){
            if (numberOfPointers[i] == 0){
                numOf0++;
                ZeroEdgeVertex = i + 1;
            } else if (numberOfPointers[i] == 1){
                numOf1++;
            } else if (numberOfPointers[i] == 2){
                numOf2++;
                TwoEdgeVertex = i + 1;
            }
        }

        if (numOf0 != 1 || numOf1 != n-2 || numOf2 != 1){
            System.out.println("-1 -1");
            return;
        }

        int toChangeStartVertex = 0;

        for (int i = 0 ; i < n; i++){
            if (arr[i] == TwoEdgeVertex){
                toChangeStartVertex = i + 1;
                int[] arr2 = arr.clone();
                arr2[toChangeStartVertex - 1] = ZeroEdgeVertex;
                if (check_cycle(arr2)){
                    System.out.println((toChangeStartVertex) + " " + (ZeroEdgeVertex));
                    return;
                }
            }
        }

        System.out.println("-1 -1");
    }
}
