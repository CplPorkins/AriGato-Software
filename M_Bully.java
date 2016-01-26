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
	cash = 20;
	createShelves();	
    }

    //returns the damage dealt
    int basicAttack(Character c)
    {
	int damage;
	damage = (int)(Math.random() * (att - c.getDef()));
	c.setHP(-damage);
	return damage;
    }
    
}
