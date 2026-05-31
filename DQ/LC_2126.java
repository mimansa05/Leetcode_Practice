import java.util.Arrays;

class LC_2126 {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);

        long m = mass;

        for (int a : asteroids) {
            if (m < a) return false;
            m += a;
        }

        return true;
    }
}