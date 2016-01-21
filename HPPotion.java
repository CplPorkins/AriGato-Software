public class HPPotion implements Item{

    public void use(){
	//maybe add an if to prevent wasting potions
	setHP(5);
	if(getHP()>getmaxHP()){
	    setHP(-getHP() + getmaxHP());
	}
    }

}
