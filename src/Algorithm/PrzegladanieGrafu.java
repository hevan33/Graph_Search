package Algorithm;

import java.util.ArrayList;
import java.util.List;

public abstract class PrzegladanieGrafu {
    public PrzegladanieGrafu() {
    }
    public abstract void wstaw(Character wierzcholek);
    public abstract void pobierz();
    public abstract void przegladaj(List<Wierzcholek> graf, String wierzcholki, Character wierzcholekPoczatkowy);
}
