class LC_735_AsteroidsCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s=new Stack<>();
        int n=asteroids.length;
        s.push(asteroids[0]);
        for(int i=1;i<n;i++)
        {
            while(!s.isEmpty() && asteroids[i]<0 && s.peek()>0)
            {
                {
                    if(Math.abs(asteroids[i])>s.peek())
                    {
                        s.pop();
                    }
                    else if(Math.abs(asteroids[i])==s.peek())
                    {
                        s.pop();
                        asteroids[i]=0;
                        break;
                    }
                    else
                    {
                        asteroids[i]=0;
                        break;
                    }
                }
            }
            if(asteroids[i]!=0) s.push(asteroids[i]);
        }
        int arr[]=new int[s.size()];
        for(int i=arr.length-1;i>=0;i--)
        {
            arr[i]=s.pop();
        }
        return arr;
    }
}