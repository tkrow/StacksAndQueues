
public class BracketChecker {

	private String input; // input string 
	//--------------------------------------------------------------
	
	public BracketChecker(String in) { // constructor 
		input = in; 
	}
		//-------------------------------------------------------------- 
	public void check() {
		
		int stackSize = input.length(); // get max stack size
		Stack theStack = new Stack(stackSize); // make stack
		
		for(int j=0; j<input.length(); j++) { // get chars in turn 
			
			char ch = input.charAt(j);
			//System.out.print("char is: " + ch);
			
			switch(ch) {
				case '{':
				case '[':
				case '(':
					theStack.push(ch);
					System.out.print("\ntheStack[" + j + "]: found left " + ch + "; adding to stack");
					System.out.println(" with theStack.push('" + ch + "');");
					break;
				case '}':
				case ']':
				case ')':
					if( !theStack.isEmpty() ) {
					
						char chx = (char) theStack.pop(); // pop and check
						System.out.print("\ntheStack[" + j + "]: found right " + ch + "; adding to stack");
						System.out.println(" with theStack.pop();");
						
						if( (ch=='}' && chx!='{') ||
								(ch==']' && chx!='[') ||
								(ch==')' && chx!='(') ) {
									//System.out.println("\nError: " +ch+ " at "+j);
						}
					}
					else // prematurely empty 
					{ //System.out.println("\nError: " + ch + " at " + j);
						break;
					}
				default: // no action on other characters
					break;
					
			} // end switch
			
		} // end for
				
		// at this point, all characters have been processed
		if( !theStack.isEmpty() ) {
			System.out.println("\nError: missing right delimiter");
		}
		
	} // end check() //--------------------------------------------------------------

}
