package Algorithm;
import java.util.ArrayList;
import java.util.List;
public class DFS extends PrzegladanieGrafu{
    protected List<Character> stos = new ArrayList<Character>();
    public DFS() {
    }
    @Override
    public void wstaw(Character wierzcholek) {
        stos.add(0, wierzcholek);
    }
    @Override
    public void pobierz() {

    }
    @Override
    public void przegladaj(List<Wierzcholek> graf, String wierzcholki, Character wierzcholekPoczatkowy) {
        for( Wierzcholek w : graf){
            if(w.wPierwszy == wierzcholekPoczatkowy){
                w.odwiedzony = true;
                for(Character c : w.polaczenia){
                    wstaw(c);
                }
                System.out.print(w.wPierwszy + " ");
            }
        }
        while (stos.size() != 0) {

            for( Wierzcholek w : graf ) {
                if(stos.get(0) == w.wPierwszy){
                    w.odwiedzony = true;
                    System.out.print(w.wPierwszy + " ");
                    stos.remove(0);
                    for(Character c : w.polaczenia){
                        for(Wierzcholek w2 : graf){
                            if(w2.wPierwszy == c){
                                if(w2.odwiedzony == false){
                                    wstaw(c);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
