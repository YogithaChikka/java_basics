public class HackerEarth_CountDivisors {
    public static void main(String[] args) {
        int l = 1;
        int r = 10;
        int k = 1;
        int count = 0;
        for (int i = l; i <= r; i++)
        {
            if (i % k == 0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
