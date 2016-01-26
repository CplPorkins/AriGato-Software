public class M_ImpossibleFinal extends Character {
    public M_ImpossibleFinal()
    {
	maxHP = 15;
	maxMP= 10;
	HP = maxHP;
	MP = maxHP;
	att = 8;
	def = 8;
	str = 8;
	dex = 8;
	wis = 8;
	cha = 8;
	con = 8;
	intel = 8;
	lev = 1;
	XP = 0;
	name = "Impossible Test";
	cash = 100;
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
