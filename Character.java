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
    protected ArrayList<ArrayList<Item>> inventory=new ArrayList<ArrayList<Item>>();;    

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
    public boolean isDead(){return HP<=0;};

    public void printInv()
    {
	String s="";
	s += "Your inventory\n";
	s += "HP Potions x " + inventory.get(0).size() + "\n";
	s += "MP Potions x " + inventory.get(1).size() + "\n";

	// weapons on same lines, separated by commas
	s += "Weapons:\n";
	for (int n = 0; n < inventory.get(2).size(); n++)
	    {
		s += inventory.get(2).get(n) + ", "; //find way to remove trailing comma lol, too tired rn
		s=s.substring(0,s.length()-1);
	    }
	s += "\n";

	// armor on same lines, separated by commas
	s += "Armor:" /*+ inventory.get(3).size()*/ + "\n";
	for (int a = 0; a < inventory.get(3).size(); a++)
	    {
		s += inventory.get(3).get(a) + ", "; //find way to remove trailing comma lol, too tired rn
		s=s.substring(0,s.length()-1);
	    }
	System.out.println(s);	
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
    abstract void levelUp();
    //abstract void pickUp();
}
