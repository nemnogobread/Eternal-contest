import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextInt();
        long r = scanner.nextInt();
        long left = l;
        long pos1 = 0;
        int ml = 0;
        int result = 0;
        long increment = 0;

        while (left > 0){
            pos1 = left % 10;
            left /= 10;
            ml++;
        }

        left = 0;
        for (int i = 0; i < ml; i++){
            left = left * 10 + pos1;
            increment = increment * 10 + 1;
        }

        if (l <= left){
            left = increment * pos1;
        }
        else{
            left = increment * pos1 + increment;
        }

        while (left <= r){
            if ((left + increment) / increment >= 10){
                increment = increment * 10 + 1;
                left = increment;
            }
            else{
                left += increment;
            }
            result ++;
        }

        System.out.println(result);
    }
}
