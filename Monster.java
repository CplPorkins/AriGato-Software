public class Monster extends Character{

    public Monster(){
	maxHP= 10;
	maxMP= 5;
	HP= maxHP;
	MP= maxHP;
	att= 5;
	def= 5;
	str= 5;
	dex= 5;
	wis= 5;
	cha= 5;
	con= 5;
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

