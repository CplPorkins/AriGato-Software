public class M_MrBrown extends Character {
    public M_MrBrown()
    {
	maxHP = 60;
	maxMP= 50;
	HP = maxHP;
	MP = maxHP;
	att = 25;
	def = 20;
	str = 20;
	dex = 20;
	wis = 20;
	cha = 20;
	con = 20;
	intel = 20;
	lev = 1;
	XP = 0;
	name = "Mr. Brown";
	cash = 9000;
	createShelves();	
    }

    //returns the damage dealt
    int basicAttack(Character c)
    {
	int damage;
	int dmod =(int) (Math.random() * (att - c.getDef()));
	if (dmod<=1){
	    damage=1+(int)(Math.random()*c.getLev()+Math.random()*2);
	}
	else{
	    damage = (int)(Math.random() * (att - c.getDef()));
	}
	c.setHP(-damage);
	return damage;
    }
}
