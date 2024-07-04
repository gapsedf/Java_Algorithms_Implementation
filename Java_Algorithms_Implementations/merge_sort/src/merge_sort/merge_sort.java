package merge_sort;

public class merge_sort {
	
	/*
	 * Create the merge sort for the recursive method
	 * In this method we try to analyze first inputs.
	 * Each input define new inputs. 
	 * So lastly we have indexes 0,1 subarrays with n times.
	 * Use merge method for each subarrays.
	 */
	static void merge_sorty(int[] a,int p,int r)
	{
		if(p>=r)
		{
			return;
		}
		
		int q=(p+r)/2;
		merge_sorty(a,p,q);
		merge_sorty(a,q+1,r);
		merge(a,p,q,r);
	}
	
	/*
	 * Merge method for one array according to p,q,r variables.
	 */
	static void merge(int[] a,int p, int q, int r)
	{
		int nl = q-p+1;
		int nr = r-q;
		int[] left_Array = new int[nl];
		int[] right_Array = new int[nr];
		
		for(int i=0;i<nl;i++)
		{
			left_Array[i] = a[p+i];
		}
		
		for(int j=0;j<nr;j++)
		{
			right_Array[j] = a[q+j+1];
		}
		
		int i=0;
		int j=0;
		int k=p;
		
		while(i<nl&&j<nr)
		{
			if(left_Array[i]<=right_Array[j])
			{
				a[k]=left_Array[i];
				i++;
			}else
			{
				a[k]=right_Array[j];
				j++;
			}
			k++;
		}
		
		while(i<nl)
		{
			a[k]=left_Array[i];
			i++;
			k++;
		}
		
		while(j<nr)
		{
			a[k]=right_Array[j];
			j++;
			k++;
		}
		
	}

	public static void main(String[] args) {
		
		// Declare a array to be sorted.
		int[] array1= {12,3,7,9,14,6,11,2};
		
		// Call the recursive method.
		merge_sorty(array1,0,7);
		
		// Print the newly organized array.
		for(int i=0;i<8;i++)
		{
			System.out.print(array1[i]+" ");
		}

	}

}
