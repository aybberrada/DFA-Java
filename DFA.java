package myPackage;

public class DFA {
	
	private char[] states = null;
    private char[] symbols = null;
    private char[] final_states = null;
    private char[][] transitions = null;
    
	public DFA(char[] states, char[] symbols, char[] final_states, char[][] transitions) {
		super();
		this.states = states;
		this.symbols = symbols;
		this.final_states = final_states;
		this.transitions = transitions;
	}
    
	private static int getIndex(char[] arr, char symbol) {
		for (int i=0; i<arr.length; i++) {
			if (symbol == arr[i]) {
				return i;}
	}
		return -1;}
	
	private static boolean check(char[] arr, char symbol ) {
		for (int i=0; i<arr.length; i++) {
			if ( arr[i] == symbol ) {
				return true;
			}
		}
		return false;
		
	}
	
	public char[] getStates() {
		return states;
	}

	public void setStates(char[] states) {
		this.states = states;
	}
	
	public char[] getSymbols() {
		return symbols;
	}
	public void setSymbols(char[] symbols) {
		this.symbols = symbols;
	}
	
	public char[] getFinalStates() {
		return final_states;
	}
	public void setFinalStates(char[] f_states) {
		this.final_states = f_states;
	}
	
	public char[][] getTransitions() {
		return transitions;
	}
	public void setTransitions(char[][] transitions) {
		this.transitions = transitions;
	}
	
	public boolean AcceptORReject(char[] word) {
	    boolean accepted = false;
	    
    	char current_state, next_state = '0';
	    for (int i=0; i<word.length; i++) {
	    	current_state = next_state;
	    	char symbol = word[i];
	    	
	    	int symbol_index = getIndex(symbols,symbol);
	    	int state_index = getIndex(states,current_state);
	    	
	    	next_state = this.transitions[state_index][symbol_index];
	    	
	    	if ((i == (word.length-1))){
	    		if (check(final_states, next_state)) {
	    			accepted = true;
	    		}
	    	}
	    	
	    }
		return accepted;
		
	}


}
