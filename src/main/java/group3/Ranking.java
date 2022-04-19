package group3;

import java.util.LinkedList;

public class Ranking{

    // Classe do exercicio 3

    LinkedList<Record> ranking;

    public Ranking() {
        this.ranking = new LinkedList<>();
    }
		
	// Insere novo registro na lista mantendo a ordenação
    // Retorna true se a inserção foi possível
	public boolean add(Record record) {
        if(record == null){
            return false;
        }
        ranking.add(record);
        ranking.sort(record);
        return true;
    }

    // Retorna à quantidade de registros armazenados
	public int numRecords() {
        return ranking.size();
    }

    // Retorna o i-ésimo registro armazenado ou
    // null se o valor de i for inválido
	public Record getScore(int i) {
        return ranking.get(i);
    }

    // Retorna o pior score armazenado
    // Retorna null se a lista estiver vazia
	public Record worstScore() {
        return ranking.getLast();
    }

    // Retorna o melhor score armazenado
    // Retorna null se a lista estiver vazia
	public Record bestScore() {
        return ranking.getFirst();
    }

}
