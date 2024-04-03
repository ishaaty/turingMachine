import java.util.ArrayList;

abstract class State {

    public String name;
    public ArrayList<ArrayList<String>> transitions;
    public ArrayList<String> finalStates;
    
    public State(String name, ArrayList<ArrayList<String>> transitions, ArrayList<String> finalStates){
        this.name = name;
        this.transitions = transitions;
        this.finalStates = finalStates;
    }

    public boolean isFinalState(){

        for (int i = 0; i < finalStates.size(); i++){
            if (finalStates.get(i) == name){
                return true;
            }
        }
        return false;

    }

}