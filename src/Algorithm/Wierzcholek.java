package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class Wierzcholek {
    protected Character wPierwszy;
    protected boolean odwiedzony = false;
    protected List<Character> polaczenia = new ArrayList<Character>();
    protected void dodajPolaczenie(char c){
        polaczenia.add(c);
    }
}
