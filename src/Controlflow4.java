
public class Controlflow4 {

	public static void main(String[] args) {
		// if��
		int i = 1;
		switch (++i) {
		case 1: // ���� �˰� ���� �� switch�� �ۼ�. 
			System.out.println("1�Դϴ�.");
			break;
		case 2:
			System.out.println("2�Դϴ�.");
			break;
		case 3:
			System.out.println("3�Դϴ�.");
			break;
		case 4:
			System.out.println("4�Դϴ�.");
			break;
		case 5:
			System.out.println("5�Դϴ�.");
			break;
		default:
			System.out.println("1~5�ȿ� ���� �ƴմϴ�.");
			break;
		}
		if (i > 5) { // if�� ���� ����.
				System.out.println("5���� Ů�ϴ�.");
		} else if (i == 5) {  
				System.out.println("5�� �����ϴ�.");
		} else  {
			System.out.println("5���� �۽��ϴ�.");
			
		}
}
}