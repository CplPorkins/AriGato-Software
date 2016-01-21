public class MPPotion{
    
    public void use(){
	//maybe add an if to prevent wasting potions
	setMP(5);
	if(getMP()>getmaxMP()){
	    setMP(-getMP() + getmaxMP());
	}
    }
}
