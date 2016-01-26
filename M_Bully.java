public class M_Bully extends Character {
    public M_Bully()
    {
	maxHP = 5;
	maxMP= 5;
	HP = maxHP;
	MP = maxHP;
	att = 5;
	def = 5;
	str = 5;
	dex = 5;
	wis = 5;
	cha = 5;
	con = 5;
	intel = 5;
	lev = 1;
	XP = 0;
	name = "Bully";
	cash = 40;
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
