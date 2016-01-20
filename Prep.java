public class Prep extends Character{

    public Prep(){
	HP= 15;
	MP= 10;
	att= 10;
	def= 10;
	str= 10;
	dex= 5;
	wis= 10;
	cha= 10;
	con= 10;
	intel= 15;
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


