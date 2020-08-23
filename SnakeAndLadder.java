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
   public static void main(String ag[])
   {
	   System.out.println("	welcome to the Snake & Ladder Game");
	   SnakeLadder sl = new SnakeLadder();
	   sl.fromPositionZero();
	   sl.getRandomNum();
   }
}