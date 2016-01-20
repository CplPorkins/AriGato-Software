public class Jock extends Character{

    public Jock(){
	HP= 20;
	MP= 5;
	att= 15;
	def= 10;
	str= 15;
	dex= 10;
	wis= 5;
	cha= 10;
	con= 15;
	intel= 5;
	lev= 1;
	XP= 0;
    }

    void levelUp(){
	if (XP>=100){
	    lev+=1;
	    XP-=100;
	    //INCREASE STATS
	}
    }
}

