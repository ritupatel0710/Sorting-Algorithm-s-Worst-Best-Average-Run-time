
public class QuickSort {
	private static int count;
	public static int quickSort(int[] x, int l, int r){
		count=0;
		if(r>=l){
			int sp=split(x,l,r);
			count+=quickSort(x,l,sp-1);
			count+=quickSort(x,sp+1,r);
		}
		return count;
	}
	
	private static int split(int[] x, int l, int r) {
		int pivot = x[l];
		int splitPt =l;
		for(int i=l+1;i<=r;i++){
			count+=1;
			if(x[i]<pivot)
			{
				splitPt+=1;
				int temp= x[i];
				x[i]=x[splitPt];
				x[splitPt]=temp;
			}
		}
		int temp=x[l];
		x[l]=x[splitPt];
		x[splitPt]=temp;
		return splitPt;
	}
}
