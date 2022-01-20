
public class Variable6 { // class block

	public static void main(String[] args) { // method block


		
			int i = 10;
			int j = 20;
			// start
			int k = j; 
			j = i; 
			i = k;
			// end
			/* 그릇에 물 옮겨담기로 생각하기
			 * 1. 1번과 2번에 물이 담겨져 있다.
			 * 2. 3번 그릇을 하나 들고 온다.
			 * 3. 1번 또는 2번 그릇의 물을 3번으로 옮긴다.
			 * ex 1.) 1번을 3번으로 옮겼을 경우, 2번을 1번으로, 다시 3번을 2번으로 옮긴다.
			 * ex 2.) 2번을 3번으로 옮겼을 경우, 1번을 2번으로, 다시 3번을 1번으로 옮긴다.*/
			System.out.println("i값은" + i);
			System.out.println("j값은" + j);
			
		
	}
}
