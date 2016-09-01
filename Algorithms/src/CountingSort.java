
public class CountingSort {
	//k is range's upperbound+1(lowerbound is 0).
	public void sortColors(int[] nums,int k) {
        if(nums==null||nums.length==0){
            return;
        }
        int[] result=new int[nums.length];
        int[] count=new int[k];
        for(int i:nums){
            count[i]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        for(int i=nums.length-1;i>=0;i--){
            result[count[nums[i]]-1]=nums[i];
            count[nums[i]]--;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=result[i];
        }
    }
}
