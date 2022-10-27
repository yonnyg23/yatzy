public class YatzeGame {

	private int rollnumber=0;
	
	private Dice[] die= new Dice[6];
	
	public void reroll(){
		for(int y=0; y<die.length&&rollnumber<3;y++) {
			int keepn= die[y].getKeep();
			if(keepn==0) {
				die[y].roll();
				rollnumber++;
				System.out.print("Turn: "+ rollnumber);
			}else {
				System.out.print("Out of turns");
			}
			
		}
		
	}
	
	public void keep(int diceNum) {
		die[diceNum].keep();
	}
	
	public void getValue() {
		for(int y=0; y<die.length;y++) {
			die[y].getValue();
		}
	}
}
