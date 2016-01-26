public class Jock extends Character{

    public Jock(String n){
	maxHP = 20;
	maxMP = 5;
	HP = maxHP;
	MP = maxHP;
	att= 15;
	def= 15;
	str= 15;
	dex= 10;
	wis= 5;
	cha= 10;
	con= 15;
	intel= 5;
	lev= 1;
	XP= 0;
	name= n;
	cash = 100;
	createShelves();
    }

    public String toString(){
	return name+" the Jock";
    }

    //returns the damage dealt
    int basicAttack(Character c)
    {
	int damage;
	damage = (int)(Math.random() * (att - c.getDef()));
	c.setHP(-damage);
	return damage;
    }

    int specialAttack(Character c){
	int damage=5*getLev();
	setMP(-5);
	c.setAtt(-5);
	c.setHP(-damage);
	System.out.println("You used LockerShove(5MP). "+c.getName()+"'s attack power decreased");
	return damage;
    }
	
    
}

