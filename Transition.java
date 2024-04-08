import java.util.ArrayList;

public class Transition {
    public ArrayList<String> read; // char to read
    public String write; // char to write
    public String move; // R / L
    public String nextState;

    public Transition(ArrayList<String> symbols, String write, String direction, String state) {
        this.read = symbols;
        this.write = write;
        this.move = direction;
        this.nextState = state;
    }
}