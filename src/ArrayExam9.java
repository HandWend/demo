import java.util.Scanner;

/**
 * @author smart02
 *
 */
public class ArrayExam9 {

	public static void main(String[] args) {
		int [][] arr = {
							{11,18,25, 2, 9}, 
							{10, 12, 19, 21, 3},
							{4, 6, 13, 20, 22},
							{23, 5, 7, 14, 16},
							{17, 24, 1, 8, 15}
						};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
			System.out.println(arr[i][j]);
			}
		}
	}
}
