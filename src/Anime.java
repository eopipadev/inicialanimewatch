public class Anime {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("Nome do Anime: " + nome);
        System.out.println("Ano de Lancamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
