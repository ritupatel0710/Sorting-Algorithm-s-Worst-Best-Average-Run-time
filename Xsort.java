import java.util.Random;


public class Xsort { 
		public static void main(String p[]){
			
			double avgQuick, avgBubble, avgBST;
			int countQuick, countBubble, countBST;
			System.out.print("       QuickSort \t\t\t\t\t\t\tBubbleSort\t\t\t\t\t\t\t    BST\n");
			System.out.print("       n         av        (av/(n))      (av/(n^2))      (av/(nlogn))");
			System.out.print("       av        (av/(n))      (av/(n^2))      (av/(nlogn))");
			System.out.print("       av        (av/(n))      (av/(n^2))      (av/(nlogn))\n");
			for(int n=1000;n<=10000;n=n+100){
				int totalQuick=0,totalBubble=0,totalBST=0;
				
				for(int j=1;j<=30;j++){
					int[] x = perm(n);
					int[] y=x.clone();
					int [] z=x.clone();
					countQuick = QuickSort.quickSort(x,0,x.length-1);
					totalQuick+=countQuick;
					
					
					countBubble=BubbleSort.bubbleSort(y, n);
					totalBubble+=countBubble;
					
					countBST=0;
					BST b= new BST();
					for(int a=0;a<x.length;a++){
					countBST+=b.insert(z[a]);
					}
					//b.inorder(b.getRoot());
					totalBST+=countBST;
				}
				avgQuick=(double)totalQuick/30;
				avgBubble=(double)totalBubble/30;
				avgBST=(double)totalBST/30;
				double nlog=(Math.log(n)/Math.log(2))*n;
				System.out.print("       "+n+"       ");
				System.out.format("%.4f", avgQuick);
				System.out.print("         ");
				System.out.format("%.4f", avgQuick/n);
				System.out.print("         ");
				System.out.format("%.4f", avgQuick/(n*n));
				System.out.print("         ");
				System.out.format("%.4f", avgQuick/nlog);
				
				System.out.print("       ");
				System.out.format("%6.4f", avgBubble);
				System.out.print("         ");
				System.out.format("%.4f", avgBubble/n);
				System.out.print("         ");
				System.out.format("%.4f", avgBubble/(n*n));
				System.out.print("         ");
				System.out.format("%.4f", avgBubble/nlog);
				
				System.out.print("       ");
				System.out.format("%6.4f", avgBST);
				System.out.print("         ");
				System.out.format("%.4f", avgBST/n);
				System.out.print("         ");
				System.out.format("%.4f", avgBST/(n*n));
				System.out.print("         ");
				System.out.format("%.4f", avgBST/nlog);
				System.out.print("\n");
				
				
				//System.out.print("\t"+n+"\t"+avgQuick+"\t"+(avgQuick/n)+"\t"+(avgQuick/(n*n))+"\t"+avgQuick/nlog+"\n");
			}
	}

	private static int[] perm(int n) {
		// TODO Auto-generated method stub
		int [] x=new int[n];
		Random r= new Random();
		for(int a=0;a<n;a++){
			x[a]=a+1;
			//System.out.print(x[a]+" ");
		}
		
			for(int k=n-1;k>=1;k--){
					int rand = r.nextInt(k+1);
					//System.out.println("\n rand : "+rand);
					int temp = x[rand];
					x[rand] = x[k];
					x[k] = temp;
				/*	for(int a=0;a<n;a++){
			
						System.out.print(x[a]+" ");
					}*/
			}
		
		return x;
	}
}
