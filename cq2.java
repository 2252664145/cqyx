import java.util.Scanner;
public class cq2 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int person;
		char a;
	
	
	
			System.out.println("--------猜拳游戏--------");
			System.out.println("请出拳（1.剪刀 2.石头 3.布 N.退出）");
			person=in.nextInt();
			if(a='n'||b='N'){
				System.out.println("您选择退出");
				break;
			}else{
			while(person<1&&person>3){
				System.out.println("请不要输入不相关的内容！");
				System.out.println("请出拳（1.剪刀 2.石头 3.布 N.退出）");
			
			}
			}
			int computer=(Math.random()*3)+1;
			String Marks;
			String Marks2;
			switch(person){
				case 1:
					Marks="剪刀";
					break;
				case 2:
					Marks="石头";
					break;
				case 3:
					Marks="布";
					break;
				default:
					System.out.println("1234");
					break;
					
			}

			switch(computer){
				case 1:
					Marks2="剪刀";
					break;
				case 2:
					Marks2="石头";
					break;
				case 3:
					Marks2="布";
					break;
				default:
					System.out.println("1234");
					break;
			}
	
		
	}
}
