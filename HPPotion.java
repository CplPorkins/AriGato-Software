public class HPPotion implements Item{

    public void use(Character C){
	//maybe add an if to prevent wasting potions
	//C.setHP(5);
	//adds a fifth of current HP
	C.setHP(C.getHP() / 5);
	if(C.getHP() > C.getmaxHP()){
	    C.setHP(-(C.getHP()) + C.getmaxHP());
	}
    }
    
    public boolean equals(Object other) {
	if (other == null) {
	    throw new NullPointerException("you input null, dummy");
	}

	//alias check
	if (this == other) {
	    return true;
	}

	//check if input and other are different types
	if (!(other instanceof HPPotion)) {
	    return false;
	}
	//if passes all checks, then they are the same as far as I'm concerned
	else {return false;}
    }
}
