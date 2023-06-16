package in.Practice;

public class Question1 {
	 public static int search(int[] num,int target) {
		int s=0;
		int e=num.length-1;
		int result=0;
		while(s<=e) {
			int m=(s+e)/2;
			if(num[m]==target) {
				return m;
			}
			else if(target<=num[m]) {
				e=m-1;
			}
			else {
				s=m+1;
			}
		}
		return s;
	}
	public static void main(String[] args) {
		int [] nums = {1,3,5,6};
		int target=5;
		System.out.println(search(nums,target));
		
	}
}
