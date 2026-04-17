class LC_605_CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flag = 0;

        for (int i = 0; i < flowerbed.length; i++) {

            int left = (i == 0) ? 0 : flowerbed[i - 1];
            int right = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];

            if (flowerbed[i] == 0 && left == 0 && right == 0) {
                flowerbed[i] = 1;
                flag++;   
            }

            if (flag >= n) return true;
        }

        return flag >= n;
    }
}
