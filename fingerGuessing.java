import java.util.*;

class  fingerGuessing
{
	public static void main(String[] args) 
	{
		while(true)
		{
		Scanner in = new Scanner(System.in);
		System.out.println("���ȭ");
		System.out.println("ʯͷ��1��������2������3");
		int gamer = in.nextInt();
		int computer = (int)(Math.random()*3+1);
        int result = Rules.fingerGuessing(gamer,computer); 
		if(result == 1)
			System.out.println("���ԣ�"+computer+"  �����ƽ��");
		else if (result == 2)
			System.out.println("���ԣ�"+computer+"  ��������ʤ");
		else if (result == 3)
			System.out.println("���ԣ�"+computer+"  ���������ʤ");
		}
	}
}
class Rules
{
	public static int fingerGuessing(int gamer,int computer)
	{
		if(gamer == computer)
			return 1;
		else if (gamer == (computer-1) || (gamer == 3 && computer == 1))
			return 2;
		else 
			return 3;
	}
} 		

