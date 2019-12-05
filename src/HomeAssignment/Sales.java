package HomeAssignment;

public class Sales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sale[][]= {
				{1000,5000,6000,3000},
				{2000,6000,3000,7500},
				{2100,2700,5000,1870}
										};
		int year=0;
		int quar=0;
		System.out.println("Sales data is as follows");
		for(int i=0;i<sale.length;i++)
		{
			for(int j=0;j<sale[i].length;j++)
			{
				System.out.print(sale[i][j]+"\t");
			}
			System.out.println();
			
		}	
		
		for(int i=0;i<sale.length;i++)
		{
			for(int j=0;j<sale[i].length;j++)
			{
				year=year+sale[i][j];
				
			}
			System.out.println("Year wise sales = "+year);
			year=0;

		}
		
		for(int i=0;i<sale[0].length;i++)
		{
			for(int j=0;j<sale.length;j++)
			{
				quar=quar+sale[j][i];
			}
			System.out.println("Quarter wise sale = "+ quar);
			quar=0;
		}
		
		
		
	}

}
