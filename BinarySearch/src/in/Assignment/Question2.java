package in.Assignment;

import java.util.Scanner;

public class Question2 {
	
	 public static int search(int[] num) {
		int left=0;
		int right=num.length-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if((mid==0 || num[mid]>num[mid-1]) && (mid==num.length-1 || num[mid]>num[mid+1])) {
				return mid;
			}else if(mid>0 && num[mid-1]>num[mid]) {
				right=mid-1;
			}else {
				left=mid+1;
			}
		}
		return left;
	}
	public static void main(String[] args) {
		int [] nums = {1,2,1,3,5,6,4};
		int peakIndex=search(nums);
		int peakElement=nums[peakIndex];
		
		System.out.println("peak Element : "+peakElement);
		System.out.println("peak Index : "+peakIndex);
	}
}
