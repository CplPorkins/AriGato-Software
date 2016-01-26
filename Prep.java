public class Prep extends Character{

    public Prep(String n){
	maxHP = 15;
	maxMP = 10;
	HP = maxHP;
	MP = maxMP;
	att= 10;
	def= 10;
	str= 10;
	dex= 5;
	wis= 10;
	cha= 10;
	con= 10;
	intel= 15;
	lev= 1;
	XP= 0;
	name= n;
	cash = 100;
	createShelves();
    }

    public String toString(){
	return name+" the Prep";
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
	c.setStr(-c.getStr()+1);
	c.setHP(-damage);
	System.out.println("You used Swagger(5MP). "+c.getName()+"'s strength has been reduced to 1.");
	return damage;
    }
}


