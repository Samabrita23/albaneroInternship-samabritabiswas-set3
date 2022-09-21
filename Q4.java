// java program to return final Image
import java.io.*;
import java.util.Arrays;
class Q4{
public static void main(String[] args)
{

	// Driver code
	int[][] mat = { { 1, 0, 0 },
				{ 0, 1, 0 },
				{ 0, 0, 1 }};
	int[][] matrix = flipped_Invert_Image(mat);
	for (int[] matele : matrix) {
	System.out.print(Arrays.toString(matele));
	}
}
public static int[][] flipped_Invert_Image(int[][] mat)
{
	for (int[] row : mat) {
	for (int i = 0; i < (mat[0].length + 1) / 2; i++)
	{
		// swap
		int temp = row[i] ^ 1;
		row[i] = row[mat[0].length - 1 - i] ^ 1;
		row[mat[0].length - 1 - i] = temp;
	}
	}
	// return Flipped and Inverted image
	return mat;
}
}
