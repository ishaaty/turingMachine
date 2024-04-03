import java.util.ArrayList;

public class Tape<E> {
    private ArrayList<E> list = new ArrayList<>();
    private int pos = 0;


    public Tape(ArrayList<E> input) {
        list = input;
    }

    public void moveLeft() { // need to account for adding extra tape to the left side
        pos--;
    }

    public void moveRight() {
        pos++;
    }

    public E read() {
        return list.get(pos);
    }

    public void write(E input) {
        list.set(pos, input);
    }

    public String toString() {
        return list.toString();
    }

}