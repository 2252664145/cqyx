import java.util.Scanner;
public class cq2 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int person;
		char a;
	
	
	
			System.out.println("--------��ȭ��Ϸ--------");
			System.out.println("���ȭ��1.���� 2.ʯͷ 3.�� N.�˳���");
			person=in.nextInt();
			if(a='n'||b='N'){
				System.out.println("��ѡ���˳�");
				break;
			}else{
			while(person<1&&person>3){
				System.out.println("�벻Ҫ���벻��ص����ݣ�");
				System.out.println("���ȭ��1.���� 2.ʯͷ 3.�� N.�˳���");
			
			}
			}
			int computer=(Math.random()*3)+1;
			String Marks;
			String Marks2;
			switch(person){
				case 1:
					Marks="����";
					break;
				case 2:
					Marks="ʯͷ";
					break;
				case 3:
					Marks="��";
					break;
				default:
					System.out.println("1234");
					break;
					
			}

			switch(computer){
				case 1:
					Marks2="����";
					break;
				case 2:
					Marks2="ʯͷ";
					break;
				case 3:
					Marks2="��";
					break;
				default:
					System.out.println("1234");
					break;
			}
	
		
	}
}
