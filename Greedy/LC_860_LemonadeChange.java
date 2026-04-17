class LC_860_LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int flag = 1;
        int five = 0, ten = 0;

        for(int x : bills)
        {
            if(x == 5) {
                five++;
            }
            else if(x == 10) {
                if(five >= 1) {
                    five--;
                    ten++;
                } else {
                    flag = 0;
                    break;
                }
            }
            else {
                if(ten >= 1 && five >= 1) {
                    ten--;
                    five--;
                }
                else if(five >= 3) {
                    five -= 3;
                }
                else {
                    flag = 0;
                    break;
                }
            }
        }
        return flag == 1;
    }
}
