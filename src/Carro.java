import java.util.Calendar;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void retornaFichaTecnica () {
        System.out.printf("""
                ====================FICHA TECNICA====================
                Modelo: %s
                Ano de Fabricação: %d
                Cor do carro: %s
                =====================================================
                """, this.modelo, this.ano, this.cor);
    }

    int calculaIdade () {
        Calendar calendario = Calendar.getInstance();
        return (int) calendario.get(Calendar.YEAR) - this.ano;
    }
}
