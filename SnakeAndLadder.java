public class SnakeLadder
{
   public static void fromPositionZero()
   {
     System.out.println("Player Start from Zero");
   }
   public static void getRandomNum()
   {
        Random random = new Random();
	    int RandonNo1To6 = random.nextInt(6)+1;
	    System.out.println("random number is "+RandonNo1To6);
   }
   public static void CheckSnake_Ladder()
	{ 
         int RandonNo1To6=getRandomNum();
         Random random = new Random();
         int RandomCheck=random.nextInt(3);
         	if(RandomCheck == 2)
			{
				System.out.println("oops you step on snake you will got 2 step back");
			}
			else if(RandomCheck == 0)
			{
				System.out.println("you made a foult so you will be in same position");
			}
			else
				System.out.println("congrats you have incremented by "+RandonNo1To6);

        }
   public static void main(String ag[])
   {
	   System.out.println("	welcome to the Snake & Ladder Game");
	   fromPositionZero();
	   System.out.println(getRandomNum());
	   CheckSnake_Ladder();
   }
}