import java.util.ArrayList;

public class Tape {
    private ArrayList<String> list = new ArrayList<>();
    private int pos = 0;


    public Tape(ArrayList<String> input) {
        list = input;
    }

    public void moveLeft() {
        if (pos != 0) {
            pos--;
        }
    }

    public void moveRight() {
        pos++;
    }

    public String read() {
        return list.get(pos);
    }

    public void write(String input) {
        list.set(pos, input);
    }

    public String toString() {
        return list.toString();
    }

}