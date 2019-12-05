package HomeAssignment;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] A= {
				{5,3,2},
				{4,1,2},
				{3,2,4}
		};
		int [][] B= {
				{6,7,8},
				{1,2,3},
				{1,5,4}
		};
		System.out.println("First matrix");
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[i].length;j++)
			{
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Second matrix");
		for(int i=0;i<B.length;i++)
		{
			for(int j=0;j<B[i].length;j++)
			{
				System.out.print(B[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Addition of two matrix");
		int add=0;
		for(int i=0;i<B.length;i++)
		{
			
			for(int j=0;j<B[i].length;j++)
			{
				add=A[i][j]+B[i][j];
				System.out.print(add+" ");
				add=0;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Substraction of two matrix");
		int sub=0;
		for(int i=0;i<B.length;i++)
		{
			for(int j=0;j<B[i].length;j++)
			{
				sub=A[i][j]-B[i][j];
				System.out.print(sub+" ");
				sub=0;
				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Multiplication of two matrix");
		int mul=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					mul=mul+A[i][k]*B[k][j];
				}
				System.out.print(mul+" ");
				mul=0;
			}
		System.out.println();
			
	}

}
}
