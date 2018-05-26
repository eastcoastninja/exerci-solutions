class Twofer {
    String twofer(String name) {
        String output;
        if(name != null) {
			name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        	output = "One for " + name + ", one for me.";
   	  } else {
    	output = "One for you, one for me.";
    }
    return output;
	}
}
