package Funcionalidades;

import java.util.ArrayList;
import java.util.List;
import Funcionalidades.Avaliacao;

public class RepositorioAvaliacoes {
    private static final ArrayList<Avaliacao> AVALIACOES = new ArrayList<>();

    public static void inserir(Avaliacao avaliacao) {
        AVALIACOES.add(avaliacao);
    }


    public static double calcularMedia(int areaVerdeId) {
        double soma = 0;
        int count = 0;
        for (Avaliacao avaliacao : AVALIACOES) {
            if (avaliacao.getIdAreaverde() == areaVerdeId) {
                soma += avaliacao.calcularMedia();
                count++;
            }
        }
        return count == 0 ? 0 : soma / count;
    }

    public static Avaliacao buscarPorId(int id) {
        for (Avaliacao avaliacao : AVALIACOES) {
            if (avaliacao.getId() == id) {
                return avaliacao;
            }
        }
        return null;
    }
    public static ArrayList<Avaliacao> buscarTodasAvaliacoes() {
        return new ArrayList<>(AVALIACOES);
    }
}
