import java.util.*;
class MaxSubArray{
    public int maxArray(int[] nums){
        int maxSoFar=Integer.MIN_VALUE,maxEndingHere=0;
        int size=nums.length;
        for(int i=0;i<size;i++){
            maxEndingHere=maxEndingHere+nums[i];
            if(maxSoFar<maxEndingHere){
                maxSoFar=maxEndingHere;
            }
            if(maxEndingHere<0){
                maxEndingHere=0;
            }
        }
        return maxSoFar;
    }
    public static void main(String args[]){
        MaxSubArray m=new MaxSubArray();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=s.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the values into array:");
        for(int i=0;i<size;i++){
            array[i]=s.nextInt();
        }
        int result=m.maxArray(array);
        System.out.println("The maximum sub array is:"+" "+result);
    }
}
