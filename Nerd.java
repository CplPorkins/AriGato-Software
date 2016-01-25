public class Nerd extends Character{
    
    public Nerd(String n){
	maxHP= 10;
	maxMP= 20;
	HP= maxHP;
	MP= maxMP;
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
	name= n;
	cash = 100;
    }

    public String toString(){
	return name+" the Nerd";
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


