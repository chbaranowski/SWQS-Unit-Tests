package swqs.quicksort;

import java.util.Comparator;

public class Quicksort<T> {
	
	private T[] elements;
	
	private Comparator<T> comparator;
	
	boolean slowIntegerSort = true;
	
	public Quicksort(Comparator<T> comparator) {
		super();
		this.comparator = comparator;
	}

	protected void sort(T[] values) {
		this.elements = values;
		if(elements[0].getClass().equals(Integer.class) && slowIntegerSort)
		{
			bubbleSort((Integer[]) values);
		} else
		{
			quicksort(0, values.length - 1);
		}
	}

	protected void quicksort(int low, int high) {
		int i = low, j = high;
		T pivot = elements[low + (high - low) / 2];
		while (i <= j) {
			while (comparator.compare(elements[i], pivot) < 0) {
				i++;
			}
			while (comparator.compare(elements[j], pivot) > 0) {
				j--;
			}
			if (i <= j) {
				T temp = elements[i];
				elements[i] = elements[j];
				elements[j] = temp;
				i++;
				j--;
			}
		}
		if (low < j)
			quicksort(low, j);
		if (i < high)
			quicksort(i, high);
	}
	
	protected void bubbleSort(Integer[] x) {
		  boolean unsortiert=true;
	      int temp;
	      while (unsortiert){
	         unsortiert = false;
	         for (int i=0; i < x.length-1; i++) 
	            if (x[i] > x[i+1]) {                      
	               temp       = x[i];
	               x[i]       = x[i+1];
	               x[i+1]     = temp;
	               unsortiert = true;
	            }          
	      } 
	   } 

}
