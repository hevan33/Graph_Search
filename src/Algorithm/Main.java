package Algorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner fr = new Scanner(new File("C://Users//User//IdeaProjects//Zaliczenie//src//Algorithm//dane.txt"));
        List<String> tablicaDanych = new ArrayList<String>();
        String liniaWierzcholkow;
        Character wierzcholekPoczatkowy;
        String typAlgorytmu;
        int counter = 0;
        while(fr.hasNextLine()){
            tablicaDanych.add(fr.nextLine().replaceAll(" ", ""));
            counter++;
        }
        liniaWierzcholkow = tablicaDanych.get(0);
        typAlgorytmu = tablicaDanych.get(tablicaDanych.size()-1);
        wierzcholekPoczatkowy = tablicaDanych.get(tablicaDanych.size()-2).charAt(0);

        List<Wierzcholek> graf = new ArrayList<>();
        for(int i =1;i<tablicaDanych.size()-2;i++){
            Wierzcholek wierzcholek = new Wierzcholek();
            wierzcholek.wPierwszy = tablicaDanych.get(i).charAt(0);
            for(int j =1;j<tablicaDanych.get(i).length();j++){
                wierzcholek.dodajPolaczenie(tablicaDanych.get(i).charAt(j));
            }
            graf.add(wierzcholek);
        }
        if(typAlgorytmu.equals("BFS")){
            BFS algorytm = new BFS();
            algorytm.przegladaj(graf,liniaWierzcholkow,wierzcholekPoczatkowy);
        } else if (typAlgorytmu.equals("DFS")) {
            DFS algorytm = new DFS();
            algorytm.przegladaj(graf,liniaWierzcholkow,wierzcholekPoczatkowy);
        }
    }
}
