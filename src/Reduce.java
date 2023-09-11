public class Reduce {

    public static void main(String[] args) {
        int n = 100;
        int j = 0;
        while (n > 0) {
            boolean CheckEven = n % 2 == 0 ;
            if (CheckEven) {
                n = n / 2;
                j++;

            } else {
                n = n - 1;
                j++;
            }

        }
        System.out.println(j);
    }
}
