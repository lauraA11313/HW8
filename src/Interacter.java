import java.util.Scanner;

public class Interacter {

    int min;
    int max;
    int threadsNum;


    public void getIntervalAndThreadsNumber(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Введите интервал поиска чисел:");
        System.out.println("min: ");
        min=scan.nextInt();
        System.out.println("max: ");
        max=scan.nextInt();
        System.out.println("Введите кол-во потоков:");
        threadsNum=scan.nextInt();
    }

    public  Thread [] divideOnIntervals() {
        int interval = max - min;
        if (interval < (Math.pow(2,threadsNum))) {
            int Leftover=interval%threadsNum;
            int n = interval / threadsNum;
            int[][] arr = new int[threadsNum][n];

            int n = interval / threadsNum;
            int[][] arr = new int[threadsNum][n];
            for (int i = 0;i < threadsNum; i++) {
                for (int j = 0; j < min + n; j++) {
                    arr[i][j] = min;
                    min++;
                }
            }
            return arr;
        }
        else {System.out.println("...");
        return null;}

    }
}
