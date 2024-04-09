import java.util.ArrayList;

public class TuringMachineRunner {
    public static void main(String[] args) {
        ArrayList<String> startingTape = new ArrayList<>();
        startingTape.add("3");
        startingTape.add("3");
        startingTape.add("null");
        Tape tape = new Tape(startingTape);


        ArrayList<State> states = new ArrayList<>();
        ArrayList<String> finalStates = new ArrayList<>();
        finalStates.add("S2");



        ArrayList<Transition> s0Transitions = new ArrayList<>();

        ArrayList<String> symbols = new ArrayList<>();
        symbols.add("1");
        Transition transition = new Transition(symbols, "epsilon", "R", "S0");
        s0Transitions.add(transition);

        symbols = new ArrayList<>();
        symbols.add("2");
        transition = new Transition(symbols, "1", "R", "S12");
        s0Transitions.add(transition);

        symbols = new ArrayList<>();
        symbols.add("3");
        transition = new Transition(symbols, "2", "R", "S13");
        s0Transitions.add(transition);

        symbols = new ArrayList<>();
        symbols.add("null");
        transition = new Transition(symbols, "epsilon", "epsilon", "S2");
        s0Transitions.add(transition);

        State s0State = new State("S0", s0Transitions, finalStates);




        ArrayList<Transition> s12Transitions = new ArrayList<>();

        symbols = new ArrayList<>();
        symbols.add("1");
        symbols.add("2");
        symbols.add("3");
        transition = new Transition(symbols, "epsilon", "R", "S12");
        s12Transitions.add(transition);

        symbols = new ArrayList<>();
        symbols.add("null");
        transition = new Transition(symbols, "1", "R", "S22");
        s12Transitions.add(transition);

        State s12State = new State("S12", s12Transitions, finalStates);




        ArrayList<Transition> s22Transitions = new ArrayList<>();

        symbols = new ArrayList<>();
        symbols.add("null");
        transition = new Transition(symbols, "1", "L", "S1");
        s22Transitions.add(transition);

        State s22State = new State("S22", s22Transitions, finalStates);




        ArrayList<Transition> s1Transitions = new ArrayList<>();

        symbols = new ArrayList<>();
        symbols.add("1");
        symbols.add("2");
        symbols.add("3");
        transition = new Transition(symbols, "epsilon", "L", "S1");
        s1Transitions.add(transition);

        symbols = new ArrayList<>();
        symbols.add("null");
        transition = new Transition(symbols, "epsilon", "R", "S0");
        s1Transitions.add(transition);

        State s1State = new State("S1", s1Transitions, finalStates);




        ArrayList<Transition> s13Transitions = new ArrayList<>();

        symbols = new ArrayList<>();
        symbols.add("1");
        symbols.add("2");
        symbols.add("3");
        transition = new Transition(symbols, "epsilon", "R", "S13");
        s13Transitions.add(transition);

        symbols = new ArrayList<>();
        symbols.add("null");
        transition = new Transition(symbols, "2", "R", "S23");
        s13Transitions.add(transition);

        State s13State = new State("S13", s13Transitions, finalStates);




        ArrayList<Transition> s23Transitions = new ArrayList<>();

        symbols = new ArrayList<>();
        symbols.add("null");
        transition = new Transition(symbols, "2", "L", "S1");
        s23Transitions.add(transition);

        State s23State = new State("S23", s23Transitions, finalStates);
        
        
        
        
        ArrayList<Transition> s2Transitions = new ArrayList<>();
        State s2State = new State ("S2", s2Transitions, finalStates);




        states.add(s0State);
        states.add(s1State);
        states.add(s12State);
        states.add(s22State);
        states.add(s2State);
        states.add(s13State);
        states.add(s23State);


        TuringMachine turingMachine = new TuringMachine(s0State, states, tape);

        while (!(turingMachine.currentState.isFinalState())) {
            turingMachine.process(tape.read());
        }

        System.out.println(tape.toString());
        System.out.println(tape.oneCount());
    }
}