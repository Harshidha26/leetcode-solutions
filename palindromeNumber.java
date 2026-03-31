class Solution {
    public static boolean isPalindrome(int x) {
       if(x<0 || (x%10==0&&x!=0))
       {
        return false;
       }
       if(x==0)
       {
        return true;
       }
       int num=x;
       int rev=0;
       int rem=0;
       while(x>0)
       {
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
       }
       if(num==rev)
       {
        return true;
       }
       return false;
    }

    static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n");
        int n=s.nextInt();
        System.out.println(isPalindrome(n));
    }
}
