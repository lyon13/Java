package Funcionalidades;


import java.util.ArrayList;


public class RepositorioLocalizacoes {
    private static int contadorId = 1;
    private static int id;
    private static final ArrayList<Localizacao> LOCALIZACOES = new ArrayList<>();

    public static void inserir(Localizacao localizacao) {
        localizacao.setId(contadorId++);
        LOCALIZACOES.add(localizacao);


    }
    public static Localizacao buscarPorAreaVerdeId(String nomeAreaVerde) {
        for (Localizacao localizacao : LOCALIZACOES) {
            if (localizacao.getNome().equals(nomeAreaVerde)) {
                return localizacao;
            }
        }
        return null;
    }


    public static ArrayList<Localizacao> listarTodasLocalizacoes() {

        return LOCALIZACOES;
    }

    public static int getContadorId() {
        return contadorId;
    }

    public static Localizacao buscarPorId(int id) {
        for (Localizacao loc : LOCALIZACOES) {
            if (loc.getId() == id) {
                return loc;
            }
        }
        return null;
    }


}
