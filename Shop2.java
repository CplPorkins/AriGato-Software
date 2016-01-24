import java.util.ArrayList;

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
	/*ArrayList<HPPotion> HPshelf = new ArrayList<HPPotion>();
	ArrayList<HPPotion> MPshelf = new ArrayList<HPPotion>();
	inventory.set(0, HPshelf); //HP shelf
	inventory.set(1, MPshelf); //MP shelf
	//inventory.get(0).add(999);*/
	for(int i=0;i<2; i++){
	    inventory.add(new ArrayList<Item>());
	}
	for(int count=0;count<20; count++){
	    HPPotion potion = new HPPotion();
	    inventory.get(0).add(potion);
	}
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

    public static void main(String[] args){
	Shop Hans = new Shop();
	System.out.println(Hans.inventory.get(0).get(0));
	//System.out.println(Hans.inventory.get(0).get(0));
    }
}

