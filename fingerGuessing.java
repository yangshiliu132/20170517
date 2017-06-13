import java.util.*;

class  fingerGuessing
{
	public static void main(String[] args) 
	{
		while(true)
		{
		Scanner in = new Scanner(System.in);
		System.out.println("请出拳");
		System.out.println("石头：1，剪刀：2，布：3");
		int gamer = in.nextInt();
		int computer = (int)(Math.random()*3+1);
        int result = Rules.fingerGuessing(gamer,computer); 
		if(result == 1)
			System.out.println("电脑："+computer+"  结果：平手");
		else if (result == 2)
			System.out.println("电脑："+computer+"  结果：玩家胜");
		else if (result == 3)
			System.out.println("电脑："+computer+"  结果：电脑胜");
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
			return 2;////
		else 
			return 3;////////
	}
} 		

