public class Prep extends Character{

    public Prep(String n){
	maxHP= 15;
	maxMP= 10;
	HP= maxHP;
	MP= maxMP;
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
	name= n;
    }

    public String toString(){
	return name+" the Prep";
    }
    
    void levelUp(){
	if (XP>=100){
	    lev+=1;
	    XP-=100;
	    //INCREASE STATS
	}
    }

    void performAttack(Monster M){
	M.setHP((int)(((lev*(att+str))/2)-M.getDef()-(M.getCon()/2)));
    }
}


