public class Nerd extends Character{
    
    public Nerd(String n){
	maxHP = 10;
	maxMP = 20;
	HP= maxHP;
	MP= maxMP;
	att= 10;
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
	createShelves();
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

    //returns the damage dealt
    int basicAttack(Character c)
    {
	int damage;
	damage = (int)(Math.random() * (att - c.getDef()));
	c.setHP(-damage);
	return damage;
    }

    String specialAttack(Character c){
	int damage=10*getLev();
	setMP(-5);
	setDef(-getDef());
	return damage+"You used ThrowPencils. "+c.getName()+"'s defense power has been obliterated.";
    }
}


