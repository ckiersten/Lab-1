public class Multiples {

    static void main(String[] args) {
        System.out.println(findCount(1000));
    }

    private static int findCount(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }
        }
        return count;
    }
}
