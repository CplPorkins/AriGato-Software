public class MPPotion{
    
    public void use(Character C){
	//maybe add an if to prevent wasting potions
	C.setMP(5);
	if(C.getMP()>C.getmaxMP()){
	    C.setMP(-(C.getMP()) + C.getmaxMP());
	}
    }
}
