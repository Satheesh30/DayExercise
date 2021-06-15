package week2book;

public class Add {
	public static void main(String[] args) {
		int x [][]= {{23,22,11},{34,12,33},{12,44,22}};
		int y [][]= {{45,64,75},{29,89,84},{23,31,45}};
		int z[][]=new int[3][3];
		for (int i=0;i<3;i++)
		{
		for (int j=0;j<3;j++)
		{
			z[i][j]=x[i][j]+y[i][j];
		}
		}
		for(int i=0;i<3;i++)
		{
			for(int j =0;j<3;j++)
			{
			System.out.print(z[i][j]+" ");
			}
			System.out.print("\n");
		}
		
	}

}
