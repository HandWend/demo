import java.util.Scanner;

/**
 * @author smart02
 *
 */
public class ArrayExam6 {

	public static void main(String[] args) {
		int [][] arr2 = new int [2][3];
		arr2[0][0]=1;
		arr2[0][1]=2;
		arr2[0][2]=3;
		arr2[1][0]=4;
		arr2[1][1]=5;
		arr2[1][2]=6;
		
		//System.out.println(arr2[0].length);
		for (int i = 0; i < arr2.length; i++) {
			for (int j=0; j <arr2[0].length; j++) {
				System.out.println(arr2[i][j]);
			}
		}
	}

}
