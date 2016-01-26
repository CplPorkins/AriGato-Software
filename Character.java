//ArrayList's implementation is in the java.util package
import java.util.ArrayList;
    
public abstract class Character{
    
    protected int maxHP ;
    protected int maxMP;
    protected int HP;
    protected int MP;
    protected int XP;
    protected int lev;
    protected int att;
    protected int def;
    protected int str;
    protected int dex;
    protected int wis;
    protected int cha;
    protected int intel;
    protected int con;
    protected int cash;
    protected String name;
    //basic inventory
    //protected ArrayList<Item> inventory;
    //2D inventory
    protected ArrayList<ArrayList<Item>> inventory = new ArrayList<ArrayList<Item>>();  

    //accessors
    public int getmaxHP() {return maxHP;}
    public int getmaxMP() {return maxMP;}
    public int getHP() {return HP;}
    public int getMP() {return MP;}
    public int getXP() {return XP;}
    public int getLev() {return lev;}
    public int getAtt() {return att;}
    public int getDef() {return def;}
    public int getStr() {return str;}
    public int getDex() {return dex;}
    public int getWis() {return wis;}
    public int getCha() {return cha;}
    public int getIntel() {return intel;}
    public int getCon() {return con;}
    public int getCash() {return cash;}
    public String getName() {return name;}

    //mutators
    //REMEMBER: SET NEG VALUES TO REDUCE, POS TO INCREASE
    public void setmaxHP(int health) {maxHP = health;}
    public void setmaxMP(int mana) {maxMP = mana;}
    public void setHP(int health) {HP += health;}
    public void setMP(int mana) {MP += mana;}
    public void setXP(int exp) {XP += exp;}
    public void setLev(int level) {lev += level;}
    public void setAtt(int attack) {att += attack;}
    public void setDef(int defense) {def += defense;}
    public void setStr(int strength) {str += strength;}
    public void setDex(int dexterity) {dex += dexterity;}
    public void setWis(int wisdom) {wis += wisdom;}
    public void setCha(int charisma) {cha += charisma;}
    public void setIntel(int intelligence) {intel += intelligence;}
    public void setCon(int constitution) {con += constitution;}
    public void setName(String input) {name = input;}
    public void setCash(int amount) {cash += amount;}
    
    //methods

    //adds four shelves for HP, MP, weapon, and armor
    public void createShelves() {
	for(int i=0;i<4; i++){
	    ArrayList<Item> x = new ArrayList<Item>();
	    inventory.add(x);
	}	
    }
    
    public boolean isDead(){return HP<=0;};

    public void levelUp(){
	System.out.println("Congratulations!");
	System.out.println("You have leveled up!");
	System.out.println("You are now Level " + getLev());
	System.out.println("All your stats have been increased by 5!");
	setLev(1);
	setXP(-50);
	setmaxHP(getmaxHP() + 5);
	setmaxMP(getmaxMP() + 5);
	setAtt(5);
	setDef(5);
	setStr(5);
	setDex(5);
	setWis(5);
	setCha(5);
	setIntel(5);
	setCon(5);	
    } 

    public void addHPPotion()
    {
	HPPotion x = new HPPotion();
	inventory.get(0).add(x);
    }

    public void addMPPotion()
    {
	MPPotion y = new MPPotion();
	inventory.get(1).add(y);
    }

    public void removeHPPotion()
    {
	inventory.get(0).remove(0);
    }

    public void removeMPPotion()
    {
	inventory.get(1).remove(0);
    }        

    public void printInv()
    {
	String s= "";
	s += "Your inventory\n";
	s += "Cash: " + getCash() + "\n";
	s += "HP Potions x " + inventory.get(0).size() + "\n";
	s += "MP Potions x " + inventory.get(1).size() + "\n";

	// weapons on same lines, separated by commas
	s += "Weapons:\n";
	for (int n = 0; n < inventory.get(2).size(); n++)
	    {
		s += inventory.get(2).get(n) + ", ";
		s=s.substring(0,s.length()-1);
	    }
	s += "\n";

	// armor on same lines, separated by commas
	s += "Armor:" /*+ inventory.get(3).size()*/ + "\n";
	for (int a = 0; a < inventory.get(3).size(); a++)
	    {
		s += inventory.get(3).get(a) + ", ";
		s=s.substring(0,s.length()-1);
	    }
	System.out.println(s);	
    }

    public void printStatus() {
	String s;
	s = "Name: " + getName() + "\n";
	s += "HP: " + getHP() + "\n";
	s += "MP: " + getMP() + "\n";
	s += "XP: " + getXP() + "/50" +  "\n";
	s += "Level: " + getLev() + "\n\n";
	s += "Attack: " + getAtt() + "\n";
	s += "Defense: " + getDef() + "\n";
	s += "Strength: " + getStr() + "\n";
	s += "Dexterity: " + getDex() + "\n";
	s += "Wisdom: " + getWis() + "\n";
	s += "Charisma: " + getCha() + "\n";
	s += "Intelligence: " + getIntel() + "\n";
	s += "Constitution: " + getCon() + "\n";
	System.out.println(s);
    }

    //returns the damage dealt
    int basicAttack(Character c)
    {
	int dmod =(int) (att*(0.5*str) - c.getDef());
	if (dmod<=1){
	    c.setHP(-1);
	    return 1;
	}
	int damage;
	damage = (int)(Math.random() * (att*(0.5*str) - c.getDef()));
	c.setHP(-damage);
	return damage;
    }    

    //with 2D arrays, unnecessary
    /*
    //invSearch returns index of first occurence or returns -1
    public int invSearch(Item target) {
	//default assume it's not there
	int index = -1;
	for (int i = 0; i < inventory.size(); i++) {
	    //check if current the same item as target
	    if (inventory.get(i).equals(target)) {
		index = i;
	    }
	}
	return index;
    }
    */

    //abstract methods
    //abstract void useItem(Item x);
    //abstract void levelUp();
    //abstract void pickUp();
    int specialAttack(Character c){return 0;}
    
}
