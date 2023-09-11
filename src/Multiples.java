public class Multiples {

    public static void main(String[] args) {
        int j = 0;
        int i = 1;
        while (i < 1000) {
            boolean DivisibilityBy3 = i % 3 == 0;
            boolean DivisibilityBy5 =  i % 5 == 0;

            if (DivisibilityBy3 && DivisibilityBy5) {
                j++;

            } else if (DivisibilityBy5) {
                j++;

            } else if (DivisibilityBy3) {
                j++;
            }
            i++;
        }
        System.out.println(j);

    }
}
