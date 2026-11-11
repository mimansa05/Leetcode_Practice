
class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth,
                            int need1, int need2) {

        // Strategy 1: Buy individual items only
        long a = (long)cost1 * need1 + (long)cost2 * need2;

        long x = Math.min(need1, need2);

        // Strategy 2: Buy common items + remaining individual items
        long b = x * costBoth
               + (long)cost1 * (need1 - x)
               + (long)cost2 * (need2 - x);

        // Strategy 3: Buy only common items
        long c = (long)Math.max(need1, need2) * costBoth;

        return Math.min(a, Math.min(b, c));
    }
}
