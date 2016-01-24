public class MPPotion{
    
    public void use(Character C){
	//maybe add an if to prevent wasting potions
	C.setMP(5);
	if(C.getMP()>C.getmaxMP()){
	    C.setMP(-(C.getMP()) + C.getmaxMP());
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
