/**
* 
* @author smart02
* 2022�� �޷��� ����Ͻÿ�. 
*/
public class Loop5_1 {

	public static void main(String[] args) {
		int j = 0;
		while (j<=12) {
			j++;
			int lastDayOfMonth = 0;
			switch (j) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				lastDayOfMonth = 31;
				break;
			case 2:
				lastDayOfMonth = 28;
				break;
			default:
				lastDayOfMonth = 30;
				break;
			}
			
			System.out.println(j+"�� ");
			for (int dayOfMonth = 1; dayOfMonth<=lastDayOfMonth; dayOfMonth++ ) {
				System.out.print(dayOfMonth+" ");	
			}
			System.out.println();
		}	
		
	}
}

	



