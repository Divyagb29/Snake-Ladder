public class SnakeLadder
{
   public static void fromPositionZero()
   {
     System.out.println("Player Start from Zero");
   }
   public static int getRandomNum()
   {
        Random random = new Random();
	    int RandonNo1To6 = random.nextInt(6)+1;
	    return RandonNo1To6;
   }
   public static void repeatTillReach100()
	{ 
        Random random = new Random();
		int Win=0;
		while(Win < 100)
		{
			int RandonNo1To6=getRandomNum();
			int RandomCheck=random.nextInt(3);
			if(RandomCheck == 2 && Win > RandonNo1To6)
			{

				System.out.println("oops you step on snake you will go "+RandonNo1To6+" step back");
				Win=Win-RandonNo1To6;
				System.out.println("you are in "+Win);

			}
			else if(RandomCheck == 0)
			{
				System.out.println("you made a foult you scored 0 so you will be in same position");
				System.out.println("you are in "+Win);

			}
			else 
			{
				Win=Win+RandonNo1To6;
				if(Win > 100)
				{
					Win=Win-RandonNo1To6;
				}
				else {
					System.out.println("congrats you have incremented by "+RandonNo1To6);
					System.out.println("you are in "+Win);
				}
			}
			if(Win == 100)
			{
				System.out.println("congrats you have reached till 100");

			}

        }
   public static void main(String ag[])
   {
	   System.out.println("	welcome to the Snake & Ladder Game");
	   fromPositionZero();
	   System.out.println(getRandomNum());
	   repeatTillReach100()
   }
}