public class Jock extends Character{

    public Jock(String n){
	maxHP= 20;
	maxMP= 5;
	HP= maxHP;
	MP= maxHP;
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
	name= n;
	cash = 100;
    }

    public String toString(){
	return name+" the Jock";
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

