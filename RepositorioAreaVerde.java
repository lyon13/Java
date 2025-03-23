package Funcionalidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Funcionalidades.RepositorioLocalizacoes.buscarPorId;

public class RepositorioAreaVerde {
    private static int contadorId = 1;
    private static final ArrayList<AreaVerde> AREASVERDES = new ArrayList<>();





    public static int getContadorId() {
        return contadorId;
    }
    public static void verDetalheAreaVerde(Scanner entrada) {
        System.out.println("Digite o ID da Área Verde que deseja ver detalhes:");
        int id = entrada.nextInt();
        entrada.nextLine(); // Consume newline
        AreaVerde area = buscarPorId(id);
        if (area != null) {
            System.out.println(area);
        } else {
            System.out.println("Área Verde não encontrada.");
        }
    }

    public static void avaliarAreaVerde(Scanner entrada) {
        System.out.println("Digite o ID da Área Verde que deseja avaliar:");
        int id = entrada.nextInt();
        entrada.nextLine();
        AreaVerde area = buscarPorId(id);
        if (area != null) {
            area.avaliarAtributos();
            System.out.println("Avaliação registrada com sucesso!\n");
        } else {
            System.out.println("Área Verde não encontrada.\n");
        }
    }
    public static AreaVerde buscarPorId(int id) {

        for (AreaVerde areaVerde : AREASVERDES) {
            if (areaVerde.getId() == id) {
                return areaVerde;
            }
        }
            return null;
    }

    public static void listarTodasAreasVerdes() {
        for(AreaVerde area : AREASVERDES){
            Localizacao localizacao = RepositorioLocalizacoes.buscarPorAreaVerdeId(area.getAreaVerdeNome());
            double mediaAvaliacoes = RepositorioAvaliacoes.calcularMedia(area.getId());

            if(localizacao != null){
                System.out.println(area + "Localização: " + localizacao + "Média de avaliações: " + mediaAvaliacoes + "\n" + "-----------------------------------");
            } else {
                System.out.println("Localização não encontrada para a área verde: " + area.getAreaVerdeNome());
            }
        }
    }



    public static double calcularMediaAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
        if (avaliacoes.isEmpty()) {
            return 0;
        }
        double soma = 0;
        for (Avaliacao avaliacao : avaliacoes) {
            soma += avaliacao.calcularMedia();
        }
        return soma / avaliacoes.size();
    }

    public static void inserir(AreaVerde areaVerde) {
        areaVerde.setId(contadorId++);
        AREASVERDES.add(areaVerde);
    }

    public static void cadastrarNovaAreaVerde(Scanner entrada) {
        System.out.println("Digite os dados da nova Área Verde:");
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        System.out.print("Latitude: ");
        double latitude = entrada.nextDouble();
        System.out.print("Longitude: ");
        double longitude = entrada.nextDouble();
        System.out.print("Obtem Arvores? (1 para sim, 0 para não): ");
        boolean arvores = false;
        int arvoresRepositorio = entrada.nextInt();
        if (arvoresRepositorio == 1) {
           arvores = true;
        }
        System.out.print("Obtem Arbustos? (1 para sim, 0 para não): ");
        boolean arbustos = false;
        int arbustosRepositorio = entrada.nextInt();
        if (arbustosRepositorio == 1) {
            arbustos = true;
        }
        System.out.print("Obtem Grama? (1 para sim, 0 para não): ");
        boolean grama = false;
        int gramaRepositorio = entrada.nextInt();
        if (gramaRepositorio == 1) {
            grama = true;
        }
        System.out.print("Horário do início de Funcionamento: ");
        double horarioFuncionamento = entrada.nextDouble();
        System.out.print("Possibilidade de Caminhada? (1 para sim, 0 para não): ");
        boolean caminhada = false;
        int caminhadaRepositorio = entrada.nextInt();
        if (caminhadaRepositorio == 1) {
          caminhada = true;
        }
        System.out.print("Possibilidade de Ciclismo? (1 para sim, 0 para não): ");
        boolean ciclismo = false;
        int ciclismoRepositorio = entrada.nextInt();
        if (ciclismoRepositorio == 1) {
            ciclismo = true;
        }
        System.out.print("Obtem quadra de futebol? (1 para sim, 0 para não): ");
        boolean futebol = false;
        int futebolRepositorio = entrada.nextInt();
        if (futebolRepositorio == 1) {
            futebol = true;
        }
        System.out.print("Obtem quadra de Volei? (1 para sim, 0 para não): ");
        boolean volei = false;
        int voleiRepositorio = entrada.nextInt();
        if (voleiRepositorio == 1) {
            volei = true;
        }
        System.out.print("Obtem quadras de areia? (1 para sim, 0 para não): ");
        boolean quadrasDeAreia = false;
        int quadrasDeAreiaRepositorio = entrada.nextInt();
        if (quadrasDeAreiaRepositorio == 1) {
            quadrasDeAreia = true;
        }
        System.out.print("Pode haver Piquenique? (1 para sim, 0 para não): ");
        boolean piquenique = false;
        int piqueniqueRepositorio = entrada.nextInt();
        if (piqueniqueRepositorio == 1) {
            piquenique = true;
        }
        System.out.print("Obtem Parquinho Infantil? (1 para sim, 0 para não): ");
        boolean parquinhoInfantil = false;
        int parquinhoInfantilRepositorio = entrada.nextInt();
        if (parquinhoInfantilRepositorio == 1) {
            parquinhoInfantil = true;
        }
        System.out.print("Obtem Pedalinho? (1 para sim, 0 para não): ");
        boolean pedalinho = false;
        int pedalinhoRepositorio = entrada.nextInt();
        if (pedalinhoRepositorio == 1) {
            pedalinho = true;
        }
        System.out.print("Outros? (1 para sim, 0 para não): ");
        boolean outros = false;
        int outrosRepositorio = entrada.nextInt();
        if (outrosRepositorio == 1) {
           outros = true;
        }
        System.out.println("Área Verde cadastrada com sucesso!");
        AreaVerde area = new AreaVerde(nome, latitude, longitude, arvores, arbustos, grama, horarioFuncionamento, caminhada, ciclismo, futebol, volei, quadrasDeAreia, piquenique, parquinhoInfantil, pedalinho, outros);
        area.setId(contadorId++);
        AREASVERDES.add(area);
    }



}