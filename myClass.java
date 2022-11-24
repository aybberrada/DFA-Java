package myPackage;
import java.util.*;


public class myClass {
	
	public static void main(String[] args) {

	    //the states
	    char[] states = {'0', '1', '2', '3', '4'};
	    
	    //the symbols
	    char[] symbols = {'a', 'b'};
	    
	    //the final states (can be more than one)
	    char[] final_states = {'3'};
	    
	    //the transitions are defined in the following way :
	    //	for each [i][j] pair, i is the index of the state that we'll transition from, and j is the index of the symbol that we'll transition by
	    //	e.g. [0][1] is the state that we'll transition to, from the state of index 0 ('0') by the symbol of index 1 ('b')
	    //  in the following example, we'll transition from the state '0' to the state '2' by the symbol 'b'
	    //  we get the indices of the states and symbols from the two arrays states and symbols.
	    char[][] transitions = {{'1', '2'}, {'3', '1'}, {'3', '2'}, {'4','3'}, {'3', '4'}};
	    	    
	    
	    
	    /* if you want to provide the automata through the standard input
	    System.out.print("Enter the states: "); //e.g 01234
	    states = scanner.nextLine().toCharArray(); 
	    System.out.print("Enter the symbols: "); //e.g ab
	    symbols = scanner.nextLine().toCharArray();
	    System.out.print("What are the final states? "); //e.g 34
	    final_states = scanner.nextLine().toCharArray();
	    System.out.print("Please provide the transitions ");
	    
	    char[][] transitions = new char[states.length][symbols.length]; //{{'1', '2'}, {'3', '1'}, {'3', '2'}, {'4','3'}, {'3', '4'}}; //0,1,2,3,4
	    for(int state_ix=0; state_ix<states.length; state_ix++) {
	    	for(int symbol_ix=0; symbol_ix<symbols.length; symbol_ix++) {
	    		System.out.print("from state "+states[state_ix]+" by symbol "+symbols[symbol_ix]+"we'll transition to --> "); //e.g 12
	    		transitions[state_ix][symbol_ix] = scanner.nextLine().charAt(0);}}
*/
	    
	    
	    
		DFA automata = new DFA(states = states, symbols = symbols, final_states = final_states, transitions = transitions);
	    char[] word = {'a','a','a','a'};
	    boolean accepted = automata.AcceptORReject(word);
	    System.out.print("Accepted word?: "+accepted);

	}

}
