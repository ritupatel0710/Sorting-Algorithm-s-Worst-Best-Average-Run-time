public class BubbleSort {
	static int count;
	  static int bubbleSort(int x[], int n)
	    {
		 count =0;
	     boolean swap = false;   
	        if (n == 1)
	            return count;
	   for(int j=n-1;j>=1;j--){
		   swap=false;
	        for (int i=0; i<j; i++){
	        	//System.out.println("\nCount "+count);
	        	count+=1;
	            if (x[i] > x[i+1])
	            {
	                int temp = x[i];
	                x[i] = x[i+1];
	                x[i+1] = temp;
	                swap=true;
	            }
	 
	           }
	        if(swap==false)
	        	break;
	   }
	    return count;  
	    }

}
