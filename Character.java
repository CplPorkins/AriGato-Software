public class Character{
    
    protected int HP ;
    protected int attack ;
    protected int defense ;
    protected int mana;
    protected int strength ;
    protected int dexterity ;
    protected int wisdom ;
    protected int charisma ;
    protected int intelligence;
    protected int constitution;

    //Should we make methods public or protected?
    
    public void changeHP(int damage){
	HP-=damage;
    }

    public void changeMP(int cost){
	MP-=cost;
    }

    public boolean isDefeated(){
	return HP<=0;
    }

}
