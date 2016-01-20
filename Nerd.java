public class Nerd extends Character{
    
    public Nerd(){
	HP = 10;
	MP= 20;
	att= 5;
	def= 5;
	str= 5;
	dex= 10;
	wis= 15;
	cha= 5;
	con= 10;
	intel= 20;
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


