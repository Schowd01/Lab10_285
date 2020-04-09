package lab10;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        SelectionSort selectionSort = new SelectionSort();
        arr = selectionSort.basicSelectionSort(arr);
        assertTrue("First sorted value is 2", arr[0] == Sortedarr[0]);
        assertTrue("Second sorted value is 7", arr[1] == Sortedarr[1]);

    }
    
    public void testNegative(){
        
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;
        SelectionSort selectionSort = new SelectionSort();
        arr = selectionSort.basicSelectionSort(arr);
        assertTrue("First sorted value is -10", arr[0] == Sortedarr[0]);
        assertTrue("Second sorted value is -9", arr[1] == Sortedarr[1]);
    }
    
    public void testMixed(){
        
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = 0;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -9;
        Sortedarr[1] = -8;
        Sortedarr[2] = 0;
        Sortedarr[3] = 2;
        Sortedarr[4] = 10;
        SelectionSort selectionSort = new SelectionSort();
        arr = selectionSort.basicSelectionSort(arr);
        assertTrue("First sorted value is -9", arr[0] == Sortedarr[0]);
        assertTrue("Second sorted value is -8", arr[1] == Sortedarr[1]);
    }
    
    public void testDuplicates(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -8;
        arr[2] = 0;
        arr[3] = 10;
        arr[4] = 10;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -8;
        Sortedarr[1] = -8;
        Sortedarr[2] = 0;
        Sortedarr[3] = 10;
        Sortedarr[4] = 10;
        SelectionSort selectionSort = new SelectionSort();
        arr = selectionSort.basicSelectionSort(arr);
        assertTrue("First sorted value is -5", arr[0] == Sortedarr[0]);
        assertTrue("Second sorted value is -5", arr[1] == Sortedarr[1]);
    }
    


}
