package binarysearch;

public class SearchAnElement {

	public static int searchInSorted(int arr[], int N, int K) 
	{ 
	    int left = 0;
	    int right = N-1;
	    int mid = 0;
	    
	    while(left <= right){
	        mid = left + ((right - left)/2);
	        if(arr[mid] == K)
	            return 1;
	        else if(K < arr[mid])
	            right = mid - 1;
	        else
	            left = mid + 1;
	    }
	       return -1;
	}
	
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,6};
		
		System.out.println(searchInSorted(arr, 5, 6));
	}
}
