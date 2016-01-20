//Driver for HSD

import java.io.*;
import java.util.*;

public class HighSchoolDungeon{
    
    //Instance Vars
    private Character ryder;
    private Prep _prep;
    private Jock _jock;
    private Nerd _nerd;
    private int gameStarted; //takes 1 or 0
    private boolean gameOver;

    private InputStreamReader isr;
    private BufferedReader in;

        // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
    public HighSchoolDungeon() {
	gameOver = false;
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
	newGame();
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

    /*=============================================
      void newGame() -- facilitates info gathering to begin a new game
      pre:  
      post: according to user input, modifies instance var for difficulty 
      and instantiates a Warrior
      =============================================*/
    public void newGame() {

	String s;
	String name = "";
	s = "High School Dungeon\n";
	s += "An everyday high school dungeon crawler\n";
	s += "An Ari-Gato Software Production\n";

	s += "\n";
	s += "Enter 1 to continue..."; //just to test readint capability; remove later
	try {
	    gameStarted = Integer.parseInt(in.readLine());
	}
	catch (IOException e) {}
	
	
	/* Will implement if time allows 
	s += "\nChoose your difficulty: \n";
	s += "\t1: Easy\n";
	s += "\t2: Not so easy\n";
	s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
	s += "Selection: ";
	System.out.print( s );

	try { // IMPORTANT
	    difficulty = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }
	*/

	s = "Congratulations on getting into a prestigious NYC public high school!\n"; //add flavor text later
	s += "Blah, blah, blah, exposition and introductions\n";
	s += "'Alright, everyone.' the teacher says. 'Introduce yourself!'\n";
	s += "What's your name?\n";
	s += "Name:"
	System.out.print( s );
	
	try {
	    name = in.readLine();
	}
	catch ( IOException e ) { }
	
	//instantiate the player's character
	int charType=1;

	//add flavor text here
	s = "What were you renowned for in middle school?\n";
	s += "\t1: I was the top Jock. I was the master of the school yard.\n";
	//s += _jock.about(); //maybe implement later or remove entirely
	s += "\n\t2: I was the top Nerd. I was the master of the library.\n";
	//s += _nerd.about();
	s += "\n\t3: I was the top Prep. I was the master of the cafeteria.\n";
	//s += _prep.about();
	System.out.println( s );
	
	try {
	    charType = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }
	
	s += "\nYou were a: ";
	
	if (charType==1){
	    pat = new Warrior(name);
	    s+="Warrior";
	}
	
	if (charType==2){
	    pat = new Mage(name);
	    s+="Mage";
	}
	
	if (charType==3){
	    pat = new Rogue(name); 
	    s+="Rogue";
	}
	
	if (charType==4){
	    pat = new Lawyer(name);
	    s+="Lawyer";
	}
	
	if (charType==5){
	    pat = new CSTeacher(name);
	    s+="CS Teacher";
	}
	System.out.println(s);
	
    }//end newGame()
    
    
    /*=============================================
      boolean playTurn -- simulates a round of combat
      pre:  Warrior pat has been initialized
      post: Returns true if player wins (monster dies).
      Returns false if monster wins (player dies).
      =============================================*/
    public boolean playTurn() {
	
	int i = 1;
	int d1, d2;
	
	if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "\nNothing to see here. Move along!" );
	else {
	    System.out.println( "\nLo, yonder monster approacheth!" );
	    
	    smaug = new Monster();
	    
	    while( smaug.isAlive() && pat.isAlive() ) {
		
		// Give user the option of using a special attack:
		// If you land a hit, you incur greater damage,
		// ...but if you get hit, you take more damage.
		try {
		    System.out.println( "\nDo you feel lucky?" );
		    System.out.println( "\t1: Nay.\n\t2: Aye!" );
		    i = Integer.parseInt( in.readLine() );
		}
		catch ( IOException e ) { }
		
		if ( i == 2 )
		    pat.specialize();
		else
		    pat.normalize();
		
		d1 = pat.attack( smaug );
		d2 = smaug.attack( pat );
		
		System.out.println( "\n" + pat.getName() + " dealt " + d1 +
				    " points of damage.");
		
		System.out.println( "\n" + "Ye Olde Monster smacked " + pat.getName() +
				    " for " + d2 + " points of damage.");
	    }//end while
	    
	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
		System.out.println( "'Twas an epic battle, to be sure... " + 
				    "You cut ye olde monster down, but " +
				    "with its dying breath ye olde monster. " +
				    "laid a fatal blow upon thy skull." );
		return false;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
		System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );
		return true;
						}
	    //option 3: the beast slays you
	    else if ( !pat.isAlive() ) {
		System.out.println( "Ye olde self hath expired. You got dead." );
		return false;
	    }
	}//end else
	
	return true;
    }//end playTurn()

    public static void main(String[] args) {      	
	//loading...
	YoRPG game = new YoRPG();
	
	int encounters = 0;
	
	while( encounters < MAX_ENCOUNTERS ) {
	    if ( !game.playTurn() )
		break;
	    encounters++;
	    System.out.println();
	}
				
	System.out.println( "Thy game doth be over." );
    }    
}


