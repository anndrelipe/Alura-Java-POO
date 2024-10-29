public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao = 0;
    int numDeAvaliacao = 0;

    void exibeFichaTecnica () {
        System.out.printf("""
                ====================FICHA TÉCNICA====================
                Título -> %s
                Compositor -> %s
                Ano de lançamento -> %d
                Nota de avaliação -> %.2f
                Número de avaliações -> %d
                =====================================================
                """, this.titulo, this.artista, this.anoDeLancamento, this.avaliacao, this.numDeAvaliacao);
    }

    void avaliaMusica (int nota) {
        this.avaliacao += nota;
        this.numDeAvaliacao ++;
        System.out.println("Feita a avaliação da música!");
    }

    double calculaMediaAvaliacao () {
        return avaliacao/numDeAvaliacao;
    }
}
