import java.util.*;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]==target-nums[i])
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {};
    }
    public static void main(String args[])
    {
        
        int target,n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n:");
        n=s.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the array:");
        for(int i=0;i<n;i++)
        {
            nums[i]=s.nextInt();
        }
        System.out.println("enter target:");
        target=s.nextInt();
        int[] result=twoSum(nums,target);
        System.out.println("["+result[0]+","+result[1]+"]");
    }
}
