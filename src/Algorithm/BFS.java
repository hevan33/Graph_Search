package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class BFS extends PrzegladanieGrafu{
    protected List<Character> queue = new ArrayList<Character>();
    public BFS() {
    }
    @Override
    public void wstaw(Character wierzcholek) {
        queue.add(wierzcholek);
    }
    @Override
    public void pobierz() {
    }
    @Override
    public void przegladaj(List<Wierzcholek> graf, String wierzcholki, Character wierzcholekPoczatkowy) {
        for( Wierzcholek w : graf){
            if(w.wPierwszy == wierzcholekPoczatkowy){
                w.odwiedzony = true;
                wstaw(w.wPierwszy);
                System.out.print(w.wPierwszy + " ");
            }
        }
        while (queue.size() != 0) {
            for( Wierzcholek w : graf ) {
                if(w.wPierwszy == queue.get(0)) {
                    for(Character c : w.polaczenia){
                        for(Wierzcholek w2 : graf){
                            if(w2.wPierwszy == c){
                                if(w2.odwiedzony == false){
                                    wstaw(c);
                                    w2.odwiedzony = true;
                                    System.out.print(c + " ");
                                }
                            }
                        }
                    }
                }
            }
            queue.remove(0);
        }
    }
}
