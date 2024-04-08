import java.util.ArrayList;

public class Tape {
    private ArrayList<Boolean> list = new ArrayList<>();
    private pos = 0;


    public Tape(input) {
        list = input;
    }

    public moveLeft() { // need to account for adding extra tape to the left side
        pos--;
    }

    public moveRight() {
        pos++;
    }

    public read() {
        return list.get(pos);
    }

    public write(input) {
        list.set(pos, input);
    }

    public toString() {
        list.toString();
    }

}