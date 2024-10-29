public class Filme {
    String titulo;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double avaliacao;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica() {
        System.out.printf("""
                *************************************************
               
                Nome: %s
                Ano de Lançamento: %d
                Incluido no Plano: %b
                Avaliação: %.2f
                Total de avaliações: %d
                Duração (min): %d
                *************************************************
               """, this.titulo, this.anoDeLancamento, this.incluidoNoPlano,  this.avaliacao, this.totalDeAvaliacoes, this.duracaoEmMinutos);
    }
}
