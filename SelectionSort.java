package lab10;

public class SelectionSort {
	 private int temp;

	/** Creates a new instance of SelectionSort */
   public SelectionSort() {
   }
   
   /* A simple SelectionSort algorithm
    * pre-condition: 
    * post-condition:
    * inputs:
    * outputs:
    * special conditions:
    */    
   public int[] basicSelectionSort(int arr[])  
   {  
       int i;
       int j;
       int min_m;  
       // One by one move boundary of unsorted subarray  
       for (i = 0; i < arr.length-1; i++)  
       {  
           // Find the min element in unsorted array  
           min_m = i;  
           for (j = i+1; j < arr.length; j++)  
           if (arr[j] < arr[min_m])  
               min_m = j; 
           // Swap the found min element with the first element   
           int temp;
           temp = arr[min_m];
           arr[min_m] = arr[i];
           arr[i] = temp;
       }
       return arr;
   }  


}

