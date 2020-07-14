package lessonnew1;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr1= {78,64,35,92,48,98,87,94,80,83};
int even =0;

for(int i=0;i<arr1.length;i++) {
	if(arr1[i]% 2 == 0) 
		even++;
	}
		System.out.println(even);	
	
	
	for(int i:arr1)
	{
		if( i %2!=0) 
		{
			System.out.println(i+" ");
	}
		}
	}
} 


