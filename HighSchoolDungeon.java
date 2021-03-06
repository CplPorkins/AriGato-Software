//Driver for HSD

import java.io.*;
import java.util.*;

public class HighSchoolDungeon{
    
    //Instance Vars
    private Character ryder;
    private Character smaug;
    private Prep _prep;
    private Jock _jock;
    private Nerd _nerd;
    private int gameStarted; //takes 1 or 0
    private boolean gameOver;

    private InputStreamReader isr;
    private BufferedReader in;
    private IOException win= new IOException();
    
    

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
	String s="";
	String name = "";
	s += "\n\nWelcome to High School Dungeon\n";
	s += "\nA slice-of-life high school dungeon crawling game.\n\n";

	s += "\n";
	s += "Enter 1 to continue..."; //just to test readint capability; remove later
	System.out.println(s);
	while (!(gameStarted==1)){
		try {
		    gameStarted = Integer.parseInt(in.readLine());
		    if (gameStarted !=1){
			throw win;
		    }
		}
		catch ( IOException | NumberFormatException  e ) {
		    System.out.println("That's not right");
		    System.out.println("Enter 1 to continue...");
		}
	}

	int line = 0;
	s = "\n\nOn a casual, nondescript March day, you received a letter in the mail.\n\n";
	s += "Enter 1 to open and read the letter..."; //just to test readint capability; remove later
	System.out.println(s);
	while (!(line == 1)){
		try {
		    line = Integer.parseInt(in.readLine());
		    if (line !=1){
			throw win;
		    }
		}
		catch ( IOException | NumberFormatException  e ) {
		    System.out.println("That's not right");
		    System.out.println("Enter 1 to continue...");
		}
	}

	line = 0;
	s = "Congratulations!\n\n"; //add flavor text later
	s += "You have been accepted into Save-a-saint High School!\n";
	s += "Our school is the premier dungeon adventurer high school in New Bork City.\n";
	s += "You should consider yourself extremely lucky as you are one of only 800 students out of the 3 million who applied to be accepted to this prestigious school.\n";
	s += "At Save-a-saint, we pride ourselves in subjecting our students to the best training possible. After all, what makes better training than actually having to go through a full, four floor dungeon as a high schooler?\n\n";
	s += "We look forward to seeing you at Save-a-Saint.\n";
	s += "We hope that you graduate!(AKA beat all four years!)\n";
	s += "Remember that failure to graduate means death so no pressure!\n\n";
	s += "Sincerely, Eij Gnahz, Principal of Save-a-saint High School.\n\n\n";
	s += "Enter 1 to begin your first day at Save-a-saint...";
	System.out.println(s);
	while (!(line == 1)){
		try {
		    line = Integer.parseInt(in.readLine());
		    if (line !=1){
			throw win;
		    }
		}
		catch ( IOException | NumberFormatException  e ) {
		    System.out.println("That's not right");
		    System.out.println("Enter 1 to continue...");
		}
	}

	line = 0;
	s = "You approach the ominous facade of Save-a-saint High School.\n";
	s += "You've heard that hundreds of kids just like you have died trying to complete all four floors.\n";
	s += "As you enter the school's menacing gates, you can't help but wonder if you're going to be any different...\n\n";
	s += "Enter 1 to enter the gates.";
	System.out.println(s);
	while (!(line == 1)){
		try {
		    line = Integer.parseInt(in.readLine());
		    if (line !=1){
			throw win;
		    }
		}
		catch ( IOException | NumberFormatException  e ) {
		    System.out.println("That's not right");
		    System.out.println("Enter 1 to continue...");
		}
	}

	s = "You see a huge atrium and stairs descending deep, deep down...\n";
	s += "Before you can approach the stairs any closer, your waist bumps into something.\n";
	s += "A lone table is in front of you with a sign-up sheet on top of it.";
	s += "You fill it out...\n\n";
	s += "What's your name?\n";
	s += "Name: ";
	System.out.print( s );
	
	try {
	    name = in.readLine();
	}
	catch ( IOException e ) { }
	
	//instantiate the player's character's shelves
	int charType=0;	

	s = "What were you renowned for in middle school?\n";
	s += "\t1: I was the top Jock. I was the master of the school yard.\n";
	s += "\n\t2: I was the top Nerd. I was the master of the library.\n";
	s += "\n\t3: I was the top Prep. I was the master of the cafeteria.\n";
	System.out.println( s );

	while ((charType!=1)&&(charType!=2)&&(charType!=3)){
	    try {
		charType = Integer.parseInt( in.readLine() );
		if (!((charType==1)||(charType==2)||(charType==3))){
		    throw win;
		}  
	    }
	    catch ( IOException | NumberFormatException e ) {
		System.out.println("That's not right,try again");
	    }
	}
	
	s = "\nYou are: ";
	
	if (charType==1){
	    ryder = new Jock(name);
	}

	if (charType==2){
	    ryder = new Nerd(name);
	}

	if (charType==3){
	    ryder = new Prep(name);
	}

	s+=ryder;
	System.out.println(s+"\n");
	int skillPoints = 10;
	s = "It's time for you to allocate your skill points.\n";
	s += "You have " + skillPoints + " left.\n";
	s += "1: Strength. It is currently at " + ryder.getStr() + ".\n";
	s += "2: Dexterity. It is currently at " + ryder.getDex() + ".\n";
	s += "3: Wisdom. It is currently at " + ryder.getWis() + ".\n";
	s += "4: Charisma. It is currently at " + ryder.getCha() + ".\n";
	s += "5: Intelligence. It is currently at " + ryder.getIntel() + ".\n";
	s += "6: Constitution. It is currently at " + ryder.getCon() + ".\n\n";
	s += "What would you like to spend a skill point on?\n";
	s += "Enter a number... (enter a letter to exit)\n";
	System.out.print(s);	

	while (skillPoints != 0) {
	    int choice = 0;
	    try {
		choice =  Integer.parseInt( in.readLine() );
	    }
	    catch ( IOException | NumberFormatException e ) {
		System.out.println("I suppose you don't want to use any more skill points.\n");
		break;
		}
	    if (choice == 1) {
		ryder.setStr(1);
		skillPoints -= 1;
	    }
	    if (choice == 2) {
		ryder.setDex(1);
		skillPoints -= 1;
	    }
	    if (choice == 3) {
		ryder.setWis(1);
		skillPoints -= 1;
	    }
	    if (choice == 4) {
		ryder.setCha(1);
		skillPoints -= 1;
	    }
	    if (choice == 5) {
		ryder.setIntel(1);
		skillPoints -= 1;
	    }
	    if (choice == 6) {
		ryder.setCon(1);
		skillPoints -= 1;
	    }
	    s = "You have " + skillPoints + " left.\n";
	    s += "1: Strength. It is currently at " + ryder.getStr() + ".\n";
	    s += "2: Dexterity. It is currently at " + ryder.getDex() + ".\n";
	    s += "3: Wisdom. It is currently at " + ryder.getWis() + ".\n";
	    s += "4: Charisma. It is currently at " + ryder.getCha() + ".\n";
	    s += "5: Intelligence. It is currently at " + ryder.getIntel() + ".\n";
	    s += "6: Constitution. It is currently at " + ryder.getCon() + ".\n\n";
	    s += "What would you like to spend a skill point on?\n";
	    s += "Enter a number... (enter a letter to exit)\n";
	    System.out.print(s);	    
	}

	line = 0;
	s = "\n\nThe moment you finish the form, it disappears!\n\n";
	s += "You find yourself alone in the atrium until...\n\n";
	s += "Enter 1 to find out.\n";
	System.out.println(s);
	while (!(line == 1)){
		try {
		    line = Integer.parseInt(in.readLine());
		    if (line !=1){
			throw win;
		    }
		}
		catch ( IOException | NumberFormatException  e ) {
		    System.out.println("That's not right");
		    System.out.println("Enter 1 to continue...");
		}
	}

	line = 0;
	s = "A man with a huge knapsack appears in front of you!\n";
	s += "Before you can say anything, he interrupts.\n\n";
	s += "'I'm the dungeon vendor! Everytime before you enter a new floor, I'll pop up!'\n";
	s += "You can buy HP and MP potions from me ... provided you've got the cash.\n";
	s += "Something tells you that will prove exceedingly handy...\n\n";
	s += "You decide to peruse his wares.\n\n";
	s += "Enter 1 to continue.\n\n";
	System.out.print(s + "\n");
	while (!(line == 1)){
		try {
		    line = Integer.parseInt(in.readLine());
		    if (line !=1){
			throw win;
		    }
		}
		catch ( IOException | NumberFormatException  e ) {
		    System.out.println("That's not right");
		    System.out.println("Enter 1 to continue...");
		}
	}	
	//first store encounter
	store();
	freshman();
	store();
	sophomore();
	store();
	junior();
	store();
	senior();
    }//end newGame()

    public void choice() {
	String s;
	int decision = 0;
	s = "What would you like to do?\n\n";
	s += "1: Look for the next floor.\n";
	s += "2: Check your status.\n";
	s += "3: Check your inventory.\n";
	s += "4: Use an item.\n\n";

	s += "Enter a number...\n";
	System.out.println(s);
	try {
	    decision = Integer.parseInt(in.readLine());
	}
	catch ( IOException | NumberFormatException  e ) {
	    System.out.println("That's not right\n");
	    System.out.println("You decided to look for the next floor.\n");
	}

	if (decision == 2) {
	    ryder.printStatus();
	    System.out.println("\n\n");
	    choice();	    
	}

	if (decision == 3) {
	    ryder.printInv();
	    System.out.println("\n\n");
	    choice();
	}

	if (decision == 4) {
	    int itemToUse = 0;
	    s = "Which item would you like to use?\n";
	    s += "1: An HP Potion which recovers 20% of my HP\n";
	    s += "2: An MP Potion which recovers 20% of my MP\n\n";
	    s += "Enter a number: ";
	    System.out.println(s);
	    try {
		itemToUse = Integer.parseInt(in.readLine());
	    }
	    catch ( IOException | NumberFormatException  e ) {
		System.out.println("That's not right\n");
		System.out.println("Try again.\n");
	    }

	    if (itemToUse == 1) {
		//if person has potions
		if (ryder.inventory.get(0).size() != 0) {
			ryder.setHP(ryder.getHP() / 5);
			if (ryder.getHP() > ryder.getmaxHP()) {
			    ryder.setHP(ryder.getmaxHP() - ryder.getHP());
			}
			ryder.removeHPPotion();
			System.out.println("You now have " +  ryder.getHP() + " HP.\n");
		}
		//if person doesn't have potions
		else {System.out.println("You don't have this potion.\n");}
	    }

	    if (itemToUse == 2) {
		//if person has potions
		if (ryder.inventory.get(1).size() != 0) {
			ryder.setMP(ryder.getMP() / 5);
			if (ryder.getMP() > ryder.getmaxMP()) {
			    ryder.setMP(ryder.getmaxMP() - ryder.getMP());
			}
			ryder.removeMPPotion();			
			System.out.println("You now have " +  ryder.getMP() + " MP.\n");
		}
		//if person doesn't have potions
		else {System.out.println("You don't have this potion.\n");}
	    }
	    choice();
	}//end decision 4

    }

    public void freshman() {
	int encounter = 0;
	String s;
	int c;
	s = "You descend the steps into the first 'year' of Save-a-saint: freshman year.\n";
	s += "You're filled with hope and promise for your upcoming adventure!\n";
	s += "You carry your ridiculously large backpack and get lost often in the labyrinth that is this floor.\n\n";
	s += "You don't realize what's about to come your way...\n";
	s += "You find yourself at a crossroads.\n\n";
	System.out.println(s);

	while (encounter < 3) {
	    choice();
	    s = "\n\n";
	    s += "Exploring freshman year, you think you hear a rustling in the distance...\n";
	    System.out.println(s);
	    //random enemy from 0 to 2
	    battle(0 + (int)(Math.random() * ((2 - 0) + 1)));
	    encounter += 1;
	}

	s = "\n\n";
	s += "You can see the base of the next set of stairs that'll take you deeper into the dungeon.\n";
	s += "You're so close to finishing your first year at Save-a-saint...\n";
	s += "...But there's one thing blocking your way...\n";
	s += "It's none other than that Impossible Final that butchers freshmen!\n\n";
	System.out.println(s + "\n");
	battle(3);
	s = "\n\n";
	s += "Not only did you pass the Impossible Final, you defeated it!\n";
	s += "Standing over its bloodied corpse, you notice a glimmer in the gore.\n\n";
	s += "You pick up a Golden Muji Pen. It provides you with additional attack power.\n\n";
	Weapon muji = new Weapon("Golden Muji Pen");
	ryder.addWeapon(muji); ryder.setAtt(3); //+3 b/c of pen
	s += "With pride of your freshman accomplishments in your heart, you march bravely forward...\n";
	s += "...into sophomore year.\n\n";
	System.out.println(s);
    }

    public void sophomore() {
	int encounter = 0;
	String s;
	int c;
	s = "You plunge further into the abyss that is Save-a-saint High School\n";
	s += "Not quite as optimistic as you were initially, but you feel more comfortable in this oppressive environment.\n";
	s += "As you wander these halls like a wise fool, you wonder if this nightmare will ever end...\n\n";
	s += "You're almost half-way there.\n";
	s += "You find yourself at a crossroads.\n\n";
	System.out.println(s);

	while (encounter < 9) {
	    choice();
	    s = "\n\n";
	    s += "Exploring sophomore year, you think you hear a rustling in the distance...\n";
	    System.out.println(s);
	    //random enemy from 0 to 2
	    battle(0 + (int)(Math.random() * ((2 - 0) + 1)));
	    encounter += 1;
	}

	s = "\n\n";
	s += "You can see the base of the next set of stairs that'll take you deeper into the dungeon.\n";
	s += "You're so close to finishing your second year at Save-a-saint...\n";
	s += "...But you feel a sudden chill and you don't know where it's come from...\n";
	s += "You see white for a flash of second and then it's on you!\n\n";
	System.out.println(s + "\n");
	battle(5);
	s = "\n";
	s += "You have braved the Snowstorm and you came to school regardless of its power!\n";
	s += "By the scene of the battle, you find a pair of galoshes that must have been left behind by a fallen comrade.\n";
	s += "You take them and you feel more confident in your ability to hold off enemy attacks.\n";
	Armor galoshes = new Armor("Galoshes");
	ryder.addArmor(galoshes); ryder.setDef(3);
	s += "With sophomore year behind you, you hesitate because you know what's next...\n";
	s += "The worst year of them all...\n";
	s += "Junior year.\n\n";
	System.out.println(s);	
    }

    public void junior() {
	int encounter = 0;
	String s;
	int c;
	s = "You are tired beyond comprehension. Nothing can comfort you. You are now a junior.\n";
	s += "At this point, you have lost of all hope of ever finishing this dungeon.\n";
	s += "You meander from catastrophe to catastrophe, hoping that maybe a monster will end your suffering here and now.\n\n";
	s += "You are utterly, completely hopeless.\n";
	s += "You find yourself at a crossroads.\n\n";
	System.out.println(s);

	while (encounter < 15) {
	    choice();
	    s = "\n\n";
	    s += "Exploring junior year, you think you hear a rustling in the distance...\n";
	    System.out.println(s);
	    //random enemy from 0 to 2
	    battle(0 + (int)(Math.random() * ((2 - 0) + 1)));
	    encounter += 1;
	}

	s = "\n\n";
	s += "You can see the base of the next set of stairs that'll take you deeper into the dungeon.\n";
	s += "You're so close. You're more than halfway there. Your feet feel like anchors as you drag them across the grimy floor.\n\n";
	s += "The room suddenly darkens. He's here.\n";
	s += "The author of all your pain. The man responsible for not canceling school on terrible snow days\n";
	s += "You prepare yourself for the fight of your life.\n";
	System.out.println(s + "\n");
	battle(4);
	s = "\n";
	s += "Somehow, you survived...\n";
	s += "You've done it. You've defeated the Mayor...\n";
	s += "Junior year is over...\n\n\n";
	s += "You take the Mayor's hat in victory. Before you even put it on, you already feel stronger.\n\n";
	Armor hat = new Armor("The Mayor's Hat");
	ryder.addArmor(hat); ryder.setStr(3);
	s += "You're near the end of the journey. You can almost taste the freedom from this barren, desolate land.\n";
	s += "You just have one more year to go: senior year.\n\n";
	System.out.println(s);	
    }

    public void senior() {
	int line = 0;
	int encounter = 0;
	String s;
	int c;
	s = "Mentally, physically exhausted, but you can see the light at the end of the tunnel.\n";
	s += "You're nearly through with the entire ordeal.\n";
	s += "Just a few more battles to fight and you'll be free.\n\n";
	s += "...or will you? Will all this be worth it?\n";
	s += "You find yourself at a crossroads.\n\n";
	System.out.println(s);

	while (encounter < 20) {
	    choice();
	    s = "\n\n";
	    s += "Exploring senior year, you think you hear a rustling in the distance...\n";
	    System.out.println(s);
	    //random enemy from 0 to 2
	    battle(0 + (int)(Math.random() * ((2 - 0) + 1)));
	    encounter += 1;
	}

	s = "\n\n";
	s += "You see the exit sign. You see the toga and hat. It's mere feet away.\n";
	s += "Four hard years and it's finally within grasp. You don't even care about your future as an adventurer anymore\n\n";
	s += "You just want to get out.\n\n.";
	s += "A figure blocks your exit.\n\n";
	s += "It's Mr. Brown, the man who taught you everything you know!\n";
	s += "You're incredulous. What is he doing here?\n";
	s += "You approach your mentor. He speaks before you do.\n\n";
	s += "'Ah, it's good to see you, " + ryder.getName() + ". I have an offer for you, if you're interested. You should be'\n";
	s += "Dumbstruck at your mentor's sudden apearance, Mr. Brown continues, 'I created Save-a-saint High. To breed a stronger student'\n";
	s += "You've lost it. Your mentor created this monstrosity?\n";
	s += "'Few have made it to the end of the dungeon and I could use some help. You could be my apprentice with all the benefits that entails. Fame? Power? Glory? All yours.'\n";
	s += "'What do you say?'\n\n";
	s += "1: I will never join you!\n";
	s += "2: Very well then.\n";
	s += "Make your choice... ";
	System.out.println(s);

	try {
	    line = Integer.parseInt(in.readLine());
	}
	catch ( IOException | NumberFormatException  e ) {
	    System.out.println("That's not right");
	    System.out.println("Try again.");
	}

	if (line == 1) {
	    s = "I see. You have elected the way of pain!\n\n";
	    System.out.println(s);
	    battle(6);
	    s = "\n\nIt's all over. You've defeated the architect of Save-a-saint High.\n";
	    s += "You have ended generations of torment and you have broken the cycle of violence.\n";
	    s += "Without the glue holding the school together, kids will be free to live their lives in peace once again.\n\n";
	    s += "The exit sign in front of you beckons. The rest of the world and most importantly ... your graduation await.\n\n\n";
	    s += "GAME OVER. Thanks for playing!\n";
	    System.out.println(s);
	}
	
	else {
	    s = "'You have chosen wisely. Come now ... my apprentice. You have graduated.'\n\n";
	    s += "Though you corrupted your soul in the process, you become extremely powerful and wealthy under Mr. Brown's tutelage.\n";
	    s += "Soon, you take control of the entire school itself; overseeing the torment of a whole new generation of students.\n\n";
	    s += "The world is in your hands and you've got the time... What's next to conquer?\n\n\n";
	    s += "GAME OVER. Thanks for playing!\n";
	    System.out.println(s);
	}
    }

    
    /*==============================================================================================================================================================
      void store
      launches the store interface, should use everytime we encounter a store
      ==============================================================================================================================================================*/
    public void store() {
	String y="";
	y += "I'm the dungeon vendor!\n";
	y += "What can I do for you, intrepid high school student?\n";
	int purchase = 0;
	y += "Something you'd like to buy?\n";
	y += "You currently have " + ryder.getCash() + " cash.\n\n";	
	y += "1: HP Potion. Recovers 20% of your health. Costs 100 cash.\n";
	y += "2: MP Potion. Recovers 20% of your mana. Costs 100 cash.\n";
	y += "3: I'm done with the store.\n";
	System.out.println( y );	
	System.out.print("Enter 1, 2, or 3...\n");
	// try buying something

	while ((purchase!=1)&&(purchase!=2)&&(purchase!=3)){
	    try {
		purchase = Integer.parseInt( in.readLine() );
		if (!((purchase==1)||(purchase==2)||(purchase==3))){
		    throw win;
		}
		//if want to buy HP Potion
		if (purchase==1){
		    if (ryder.getCash() >= 100)
			{
			    System.out.println("You bought a HP Potion! Here you go.");
			    ryder.setCash(-100);
			    System.out.print("Your cash reserve is now "); System.out.println(ryder.getCash());
			    ryder.addHPPotion();
			    store();
			}
		    else
			{
			    System.out.println("You don't have enough money, you twerp. You trying to chisel me?\n");
			    exitStore();
			}
		}
		//if want to buy MP Potion
		if (purchase==2){
		    if (ryder.getCash() >= 100)
			{
			    System.out.println("You bought a MP Potion! Here you go.");
			    ryder.setCash(-100);
			    System.out.print("Your cash reserve is now "); System.out.println(ryder.getCash());			
			    ryder.addMPPotion();
			    store();			
			}
		    else
			{
			    System.out.println("You don't have enough money, you twerp. You trying to chisel me?\n");
			    exitStore();
			}
		}
		//if want to leave
		if (purchase==3) {
		    exitStore();
		}
		
	    }
	    catch ( IOException | NumberFormatException e ) {
		System.out.println("Thats not right\n");
		store();
		break;
		}
	}
    } //end store()

    public void exitStore(){
	System.out.println("Are you sure you want to exit the store? Y/N");
	String exit="";
	while ((exit!="n")&&(exit!="y")&&(exit!="N")&&(exit!="Y")){
	    try {
		exit = in.readLine();
		if (!(exit.equals("n")||exit.equals("N")||exit.equals("y")||exit.equals("Y"))){
		    throw win;
		}
		if (exit.equals("N")|| exit.equals("n")){
		    store();
		}
		if (exit.equals("y") || exit.equals("Y")){
		    break;
		}
	    }
	    catch (IOException e) {
		//System.out.println("here1");
		System.out.println("I'm sorry, I didn't get that. Enter Y for yes or N for no.");	    
	    }
	    break;
	}
    }

    /*========================================================================================================================================================*/
   
    /*=============================================
      boolean battle -- simulates a round of combat
      pre:  Warrior pat has been initialized
      post: Returns true if player wins (monster dies).
      Returns false if monster wins (player dies).
      =============================================*/

    //monster will range from 0 to x, representing the different kind of monsters one can battle
    public boolean battle(int monster) {

	String s;
	String disp;
       	int i = 1;
	int d1, d2; //damage dealt

	//select the kind of monster smaug will be
	if (monster == 0)
	    {
		smaug = new M_Bully();
	    }
	if (monster == 1)
	    {
		smaug = new M_TBully();
	    }
	if (monster == 2)
	    {
		smaug = new M_UnfinishedHomework();
	    }
	if (monster == 3)
	    {
		smaug = new M_ImpossibleFinal();
	    }
	if (monster == 4)
	    {
		smaug = new M_MayorWillDeLazio();
	    }
	if (monster == 5)
	    {
		smaug = new M_Snowstorm();
	    }
	if (monster == 6)
	    {
		smaug = new M_MrBrown();
	    }	

	s = "You have encountered " + smaug.getName() + "\n";

	System.out.println(s);
	    while( !smaug.isDead() && !ryder.isDead() ) {

		    try {
			System.out.println("You have " + ryder.getHP() + " health.");
			System.out.println("You have " + ryder.getMP() + " mana.");		    
			System.out.println(smaug.getName() + " has " + smaug.getHP() + " health.");			    
			System.out.println( "\nWhat would you like to do?\n");	    
			System.out.println( "\t1: Basic attack!\n\t2: Secret technique!" );
			i = Integer.parseInt( in.readLine() );
		    }
		    catch (  IOException | NumberFormatException e ) {
			System.out.println("That's not right. Try again.\n");
		    }
		    
		    if ( i == 2 ){
			if (ryder.getMP()>=5){
			    d1 = ryder.specialAttack(smaug);
			    System.out.println( "\n" + ryder.getName() + " dealt " + d1 +
					    " points of damage.");			    
			}
			else{
			    System.out.println("You don't have enough MP to perform a special attack. (You have "+ryder.getMP()+" MP.)\nTry the basic attack.");
			}
		    }
		    
		    else{
			d1 = ryder.basicAttack(smaug);
			
			d2 = smaug.basicAttack(ryder );
			
			System.out.println( "\n" + ryder.getName() + " dealt " + d1 +
					    " points of damage.");
			
			System.out.println( smaug.getName() + " attacked " + ryder.getName() +
					    " for " + d2 + " points of damage.");
		    }
	    }//end while

	    if ( ryder.isDead() ) {
		System.out.println("\nYou have failed to graduate. GAME OVER.");
		System.exit(0);
		return false;
	    }
	
	    else if ( smaug.isDead() && ryder.isDead() ) {
		System.out.println("\nYou have failed to graduate. GAME OVER.");
		System.exit(0);
		return false;
	    }

	    else if ( smaug.isDead() ) {
		System.out.println( "You got 'em!" );
		ryder.setXP(smaug.getmaxHP());
		s = "You've gained " + smaug.getmaxHP() + " XP from this battle.\n";
		if (ryder.getXP() >= 50) {
		    ryder.levelUp();
		}
		ryder.setCash(smaug.getCash());
		s += "You have gained " + smaug.getCash() + " cash from this battle.\n\n";
		System.out.print(s);
		return true;
	    }
	    return true;
    }


    
    public static void main(String[] args) {      	
	//loading...
	HighSchoolDungeon game = new HighSchoolDungeon();
	if (!game.ryder.isDead()){
	    System.out.println("You won!! \nYou made it through Save-a-saint High School!! Congratulations!!");
	}
    }    
}


