import java.util.ArrayList;

public class TuringMachine {
    public State currentState;
    public ArrayList<State> states;
    public Tape tape;

    public TuringMachine(State startState, ArrayList<State> states, Tape tape) {
        this.currentState = startState;
        this.states = states;
        this.tape = tape;
    }

    public void process(String input) {
        ArrayList<Transition> currentTransitions = currentState.transitions;
        Transition nextTransition = null;

        for (int i = 0; i < currentTransitions.size(); i++) {
            if (currentTransitions.get(i).read.contains(input)) {
                nextTransition = currentTransitions.get(i);
            }
        }

        if (!(nextTransition.write.equals("epsilon"))){
            tape.write(nextTransition.write);
        }
        
        if (nextTransition.move.equals("R")) {
            tape.moveRight();
        }
        else {
            tape.moveLeft();
        }

        for (int i = 0; i < states.size(); i++) {
            if (states.get(i).name.equals(nextTransition.nextState)) {
                currentState = states.get(i);
            }
        }
    }
}
