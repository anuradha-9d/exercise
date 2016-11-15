//Sum of the first n numbers is equal to the sum of the last n numbers.

	//[3, 2, 4, 3, 5, 3, 4, 4, 1]

	//ex: if a user enters 2 then your program should calculate 3+2 = 4+1 i.e. the sum of the first two digits and the sum of the last two digits is equal.


package com.exercise;

public class sumofNum {

		public boolean sumofn(int[] arr,int n){
			int forwardSum = 0;
			int backwardSum = 0;

			for(int i=arr.length-1;i>arr.length-n-1;i--){
				backwardSum = arr[i]+backwardSum;
			}
			for(int i=0;i<n;i++){
				forwardSum = arr[i]+forwardSum;
			}

			if(forwardSum == backwardSum)
				return true;
			else
				return false;
		}

		public static void main(String[] args){

			int[] arr = {2,4,5,0,78,2,3,5,1};
			//System.out.println(arr[arr.length-3]);
			int n =4;
			sumofNum sn = new sumofNum();
			System.out.println(sn.sumofn(arr, n));
			//sn.sumofn(arr, n);

		}
	}


