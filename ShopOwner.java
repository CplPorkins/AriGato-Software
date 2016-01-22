public class Shop extends Character{
    
    public Shop(){
	maxHP = 9999;
	maxMP = 9999;
	HP = 9999;
	MP = 9999;
	att = 10;
	def = 10;
	str = 10;
	dex = 10;
	wis = 10;
	cha = 10;
	con = 10;
	intel = 10;
	lev = 99;
	XP = 0;
	inventory.add(new ArrayList<HPPotion>()); //HP shelf
	inventory.add(new ArrayList<MPPotion>()); //MP shelf
	inventory.get(0).add(999)
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

