class LC_2531_FirstCharToAppearTwice {
    public char repeatedCharacter(String s) {
        int mask=0;
        for(char x:s.toCharArray())
        {
            int pos=x-'a';
            if((mask & (1<<pos))!=0) return x;
            mask|=(1<<pos);
        }
        return ' ';
    }
}
