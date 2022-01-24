/**
* 
* @author smart02
* 2022년부터 본인의 생년까지 반복해서 출력.
*/
public class Loop3_1 {

	public static void main(String[] args) {
		int myAge=1998;
		int p = 2022;
		while (p >= myAge) {
			
			System.out.printf("년도 %d, 나이 %d%n", p, p - (myAge-1));
			p--;
		}
	}
}

	



