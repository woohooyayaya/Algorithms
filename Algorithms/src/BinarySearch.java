
public class BinarySearch {
	//if not found, return the position that should contain the number that is the next largest number after the target
	//this position could be out of bound
	public int searchInsert(int[] array, int target) {
        if(array==null||array.length==0){
			return 0;
		}
		
		int left=0;
		int right=array.length-1;
		
		while(left<=right){
			int midIndex=(left+right)/2;
			int mid=array[midIndex];
			if(mid==target){
				return midIndex;
			}
			else if(mid>target){
				right=midIndex-1;
			}
			else{
				left=midIndex+1;
			}
		}
		
		return left;
    }
}
