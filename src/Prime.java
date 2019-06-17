public class Prime {
    int min;
    int max;
    int temp;
    boolean isPrime=true;

    public Prime(int min, int max) {
        this.min = min;
        this.max = max;
    }

    {
        // проверяем число на простоту
        for (int i=2; i<=max/2; i++) {
            temp = max % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }


    }
}