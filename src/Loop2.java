/**
* 
* @author smart02
* 구구단을 외자!
*/
public class Loop2 {

	public static void main(String[] args) {
		for (int n = 1; n <=9; n++) {
			System.out.println("============");
			System.out.println(n+"단");
			for (int i=0; i<10; i++) {
			  if (n>=1 && n<=9 && i>0) {
				
			  	System.out.println(n + "*" + i + "=" + n*i);
			  	try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  
			 }
			 
			//System.out.println();
	
		}
	}
}
	}

	



