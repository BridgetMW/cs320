public class Assignment1Part1 {

    final static  String keyword = "";
    final static  String identfier = "";
    final static  String number = "";
    final static  String operator = "";


    public String getIntegerLiteral(int *pstart, String buffer) {
        boolean isinteger = false;

        // decimal integer:
        //
        // skip white space. not part of the token
        //
        // First char, should be +,-,0-9
        // following chars should be 0-9
        // The end of the token happens when not 0-9
        // Copy those chars into a new String named token
        // return token;
        // hex and octal integer not implemented
        //
        
    }

    public boolean isIntegerLiteral(int start, String buffer) {
        boolean isinteger = false;

        // decimal integer:
        //
        // skip white space

        // First char, should be +,-,0-9
        // following chars should be 0-9
        // return true
        // hex and octal integer not implemented
        //
        
    }

    public boolean isLiteral(int start, String buffer) {

	if (isIntegerLiteral(*pstart, buffer)) {
            return true;
        }
	else if (isFloatingPointLiteral(*pstart, buffer)) {
            return true;
        }
	else if (isBooleanLiteral(*pstart, buffer)) {			
            return true;
        }
	else if (isCharacterLiteral(*pstart, buffer)) {
            return true;
        }
	else if (isStringLiteral(*pstart, buffer)) {
            return true;
        }
	else if (isNullLiteral(*pstart, buffer)) {
            return true;
        }
        return false;
    }

    public String Tokenize(int *pstart, String buffer) {
        String token = new String();

	if (isIdentifier(*pstart, buffer)) {
	    token = getIdentifier(pstart, buffer);
        }
        else if (isKeyword(*pstart, buffer)) {
	Keyword
	    token = getKeyword(pstart, buffer);
        }
        else if (isLiteral(*pstart, buffer)) {
	    token = getLiteral(pstart, buffer);
        }
        else if (isSeparator(*pstart, buffer)) {
	    token = getSeparator(pstart, buffer);
        }
        else if (isOperator(*pstart, buffer)) {
	    token = getOperator(pstart, buffer);
        }
        else if (isComment(*pstart, buffer)) {
	    SkipComment(pstart, buffer);
        }

        return token;
    }

    static public int main(String[] args) {

       int start = 0;
       String buffer = null;

      // Read file into buffer
      //
       do {
           token = Tokenize(&start, buffer) ) {
   
           // Print the lexical tokens for now... then will do something better and actually look for declarations.
           //
       } while (start > 0); // Tokenize will return -1 when it reaches the end of the buffer
    }
}
