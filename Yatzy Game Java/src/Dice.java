import java.util.Random;
public class Dice {
	  	private int value;
	  	private Random rand;
	    private int keep=0;

	    public Dice() {
	        value = 0;
	        rand = new Random();
	    }

	    public void roll(){
	    	value =  1 + rand.nextInt(6);
	    }

	    public int getValue() {
	        return (value);
	    }
	    
	    public int getKeep() {
	        return (keep);
	    }
	    
	    public void keep() {
	        keep=1;
	    }
}
