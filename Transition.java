import java.util.ArrayList;

public class Transition {
    public String input = ""; // char to read
    // public ArrayList<ArrayList<String>> transitions;
    public String write = ""; // char to write
    public String direction = ""; // r/l
    public String nextState = "";

    public Transition(String i, String w, String d, String s) {
        input = i;
        write = w;
        direction = d;
        nextState = s;
    }



    
}
