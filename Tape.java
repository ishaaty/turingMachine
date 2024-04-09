import java.util.ArrayList;

public class Tape {
    private ArrayList<String> list;
    private int currentPos = 0;


    public Tape(ArrayList<String> startingInput) {
        this.list = startingInput;
    }

    public void moveLeft() {
        if (currentPos != 0) {
            currentPos--;
        }
        else {
            ArrayList<String> temp = new ArrayList<>();
            temp.add("null");
            for (int i = 0; i < list.size(); i++){
                temp.add(list.get(i));
            }
            list = temp;
            currentPos = 0;
        }
    }

    public void moveRight() {
        currentPos++;
    }

    public String read() {
        if (currentPos >= list.size()) {
            list.add("null");
        }
        return list.get(currentPos);
        
    }

    public void write(String input) {
        list.set(currentPos, input);
    }

    public String toString() {
        return list.toString();
    }

    public String oneCount() {
        return "" + (list.size() - 2);
    }

}