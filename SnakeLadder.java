import java.util.Queue;
import java.lang.Math;
//Uc1 for position 0
public class SnakeLadder{
private int start_position=0;
private int end_position=100;

	public SnakeLadder(int start_poistion,int end_position){
		this.start_position=0;
		this.end_position=100;
}
		public int getStart_position(){
			return 0;
}
		public int getEnd_position(){
		return 100;
}
}
//UC2 for roll and dice between 1 to 6 
 class DiceService{
    private int diceroll() {
        return new Random().nextInt(6) + 1; 

//UC3 for player

 class Player {

private int player=2;
private int dice_num;
private int position1;
privte int position2;
		Random rand = new Random();
		optionDice = rand.nextInt(3);
		position1= 0;
		
		switch((int) option){
		case 0:
			System.out.println("player get ladder");
			position=position1+dice_num;
		break;
		case 1:
			System.out.println("player gt snake");
			position = position2 -dice_num;
						
		break;
		case 2:
			System.out.println("if no play");
			position=position1;
}
}


//UC4 for  player reaches wining position 100

class PlayerService{

private int player_position;
this.position=player_position;
}
public static void main( String[] args )
	    {
	        System.out.println( "Let's start the Game with player and position is"+" "+player+" "+"and"+" "+position);
	       while(position1<100 && position2<100) {
	        if(value) {
	        ParticipateTwoPlayer player1= new ParticipateTwoPlayer(position1);
	        position1= check_option();
	        value=false;
	        if(position1==100)
	        	System.out.println("player1 reaches at 100 and Won the Game");}
	        else {
	         ParticipateTwoPlayer player2= new ParticipateTwoPlayer(position2);
	        position2=check_option();
	        value=true;
	        if(position2==100)
	        	System.out.println("player2 reaches at 100 and Won the Game");}

	    }
	}
}
