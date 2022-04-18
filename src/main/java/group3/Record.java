package group3;

import java.util.Comparator;

public class Record implements Comparator<Record>{

    // Classe do exercicio 3
    
    private String name;
    private int score;


    public Record(String name, int score) {
        this.name = name;
        this.score = score;
    }


    public String getName() {
        return this.name;
    }
    public Integer getScore() {
        return this.score;
    }


    public String toString() {
        return "Recordista = " + this.name + ", Score = " + this.score;
    }


    @Override
    public int compare(Record o1, Record o2) {
        return o1.getScore().compareTo(o2.getScore());
    }
}

