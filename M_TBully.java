public class M_TBully extends Character {
    public M_TBully()
    {
	maxHP = 10;
	maxMP= 10;
	HP = maxHP;
	MP = maxHP;
	att = 10;
	def = 10;
	str = 10;
	dex = 10;
	wis = 10;
	cha = 10;
	con = 10;
	intel = 10;
	lev = 1;
	XP = 0;
	name = "Tough Bully";
	cash = 60;
	createShelves();	
    }

    //returns the damage dealt
    int basicAttack(Character c)
    {
	int damage;
	int dmod =(int) (Math.random() * (att - c.getDef()));
	if (dmod<=1){
	    damage=1+(int)(Math.random()*c.getLev()+Math.random()*3);
	}
	else{
	    damage = (int)(Math.random() * (att - c.getDef()));
	}
	c.setHP(-damage);
	return damage;
    }
    
}
