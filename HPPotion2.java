public class HPPotion implements Item{

    public void use(Character C){
	//maybe add an if to prevent wasting potions
	C.setHP(5);
	if(C.getHP()>C.getmaxHP()){
	    C.setHP(-(C.getHP()) + C.getmaxHP());
	}
    }

    public String toString(){
	return "HP Potion, cost: "+cost;
    }

}
