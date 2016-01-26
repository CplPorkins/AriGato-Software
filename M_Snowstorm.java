public class M_Snowstorm extends Character {
    public M_Snowstorm()
    {
	maxHP = 30;
	maxMP= 12;
	HP = maxHP;
	MP = maxHP;
	att = 15;
	def = 10;
	str = 10;
	dex = 10;
	wis = 10;
	cha = 10;
	con = 10;
	intel = 10;
	lev = 1;
	XP = 0;
	name = "Snowstorm";
	cash = 300;
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
