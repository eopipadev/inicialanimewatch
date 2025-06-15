public class Principal {
    public static void main(String[] args){
        Anime anime1 = new Anime();

        anime1.nome = "One Piece";
        anime1.anoDeLancamento = 1999;
        anime1.somaDasAvaliacoes = 5;
        anime1.incluidoNoPlano = true;

        anime1.exibeFichaTecnica();
        anime1.avalia(5);
        anime1.avalia(4.5);
        anime1.avalia(4.8);

        System.out.println("Media de avaliacoes do Anime: " +anime1.pegaMedia());
    }
}
