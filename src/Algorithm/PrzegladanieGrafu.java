package Algorithm;

public abstract class PrzegladanieGrafu {
    public abstract void wstaw();
    public abstract void pobierz();
    public void przegladaj(){
        wstaw();
        pobierz();
    }
}
