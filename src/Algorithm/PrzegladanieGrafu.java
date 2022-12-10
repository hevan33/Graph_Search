package Algorithm;

import java.util.ArrayList;
import java.util.List;

public abstract class PrzegladanieGrafu {
    protected List<PrzegladanieGrafu> lista = new ArrayList<>();
    protected int x;
    protected int y;

    public PrzegladanieGrafu(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void wstaw(int x, int y);
    public abstract void pobierz();
    public abstract void przegladaj();
}
