public abstract class Character{
    
    protected int HP ;
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
    protected String name;

    //accessors
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
    public String getName() {return name;}

    //mutators
    //REMEMBER: SET NEG VALUES TO REDUCE, POS TO INCREASE
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

    //methods
    abstract void useItem(Item x); //
    abstract void performAttack();
    abstract void die();
    abstract boolean isDead();
    abstract void levelUp();
    
}
