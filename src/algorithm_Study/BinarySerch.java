package algorithm_Study;

//이진탐색
public class BinarySerch {

	static int binarySerch(int []a , int value) {
		int start = 0;
		int end = a.length-1;
		
		while(start<=end) {
			int mid = (start+end)/2;
			if(a[mid] > value) {
				end = mid-1;
			}
			else if(a[mid]< value) {
				start= mid+1;
			}
			else {
				return mid;
			}
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {

		int [] arr = {1,3,2,5,4,7,6,9,8,10};
		
		System.out.println(binarySerch(arr,4));
		
	}

}

//재귀를 이용한 이진탐색 알고리즘
//static boolean binarySearch2(int []a, int start, int end, int value) {
//	
//	if(start>end) {
//		return false;
//	}
//
//	int mid = (start+end)/2;
//	
//	if(a[mid] > value) {
//		return binarySearch2(a,start,mid-1,value);
//	}
//	else if(a[mid] <value) {
//		return binarySearch2(a,mid+1,end,value);
//	}
//	else {
//		return true;
//		
//	}
//}