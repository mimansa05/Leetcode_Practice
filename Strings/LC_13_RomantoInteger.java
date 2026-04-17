class LC_13_RomantoInteger {
    public int romanToInt(String s) {
        //String val[]=["","I","V","X","L","C","D","M"];
        int v=0;
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='I')
            {
                v=1;
            }
            else if(ch=='V')
            {
                v=5;
            }
            if(ch=='X')
            {
                v=10;
            }
            if(ch=='L')
            {
                v=50;
            }
            if(ch=='C')
            {
                v=100;
            }
            if(ch=='D')
            {
                v=500;
            }
            if(ch=='M')
            {
                v=1000;
            }
            if (i < s.length() - 1) {
                char next = s.charAt(i + 1);
                int nextVal = 0;

                if (next == 'I') nextVal = 1;
                else if (next == 'V') nextVal = 5;
                else if (next == 'X') nextVal = 10;
                else if (next == 'L') nextVal = 50;
                else if (next == 'C') nextVal = 100;
                else if (next == 'D') nextVal = 500;
                else if (next == 'M') nextVal = 1000;

                if (v < nextVal) {
                    sum -= v; 
                    continue;
                }
            }


            sum=sum+v;

        }
        
        return sum;
        
    }
}
