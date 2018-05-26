class ReverseString {

    String reverse(String inputString) {
        String result = new StringBuffer(inputString).reverse().toString();
        return result;
		

		// Second approach remember to create a String for the char[] result returned 
		
		// Learned I can created a string from an array of characters!

		/* String reverse = "";

    	char [] in = inputString.toCharArray();
    	char [] result = new char [in.length];
    	int len = in.length;
    	for (char c : in) {
    		result[len-1] = c; // inserts at the end of the array of result
    		len--;
    	}
    	reverse = (new String(result));
    	return reverse;
    	**/
    } 
  
}