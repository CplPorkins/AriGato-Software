public class M_MayorWillDeLazio extends Character {
    public M_MayorWillDeLazio()
    {
	maxHP = 60;
	maxMP= 20;
	HP = maxHP;
	MP = maxHP;
	att = 20;
	def = 15;
	str = 15;
	dex = 15;
	wis = 15;
	cha = 15;
	con = 15;
	intel = 15;
	lev = 1;
	XP = 0;
	name = "Mayor Will de Lazio";
	cash = 500;
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
