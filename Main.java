package main;
import Funcionalidades.Localizacao;
import Funcionalidades.RepositorioLocalizacoes;
import Funcionalidades.RepositorioAvaliacoes;
import Funcionalidades.Avaliacao;
import java.util.ArrayList;
import java.util.Scanner;

import Funcionalidades.AreaVerde;
import Funcionalidades.RepositorioAreaVerde;


import static Funcionalidades.RepositorioAreaVerde.calcularMediaAvaliacoes;
import static Funcionalidades.RepositorioAreaVerde.listarTodasAreasVerdes;
import static Funcionalidades.RepositorioAvaliacoes.buscarPorId;
import static Funcionalidades.RepositorioAvaliacoes.inserir;
import static Funcionalidades.RepositorioLocalizacoes.*;
import static Funcionalidades.RepositorioLocalizacoes.listarTodasLocalizacoes;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        AreaVerde area1 = new AreaVerde("Parque Ibirapuera", -23.5505, -46.6333, true, true, true, 6.0, true, true, true, true, true, true, true, true, false);
        area1.setId(RepositorioAreaVerde.getContadorId());
        RepositorioAreaVerde.inserir(area1);

        AreaVerde area2 = new AreaVerde("Jardim Botânico", -22.9068, -43.1729, true, true, true, 6.0, true, true, true, true, true, true, true, true, false);
        area2.setId(RepositorioAreaVerde.getContadorId());
        RepositorioAreaVerde.inserir(area2);

        area2.setNotaArvores(4);
        area2.setNotaArbustos(3);
        area2.setNotaGrama(5);
        area2.setNotaCaminhada(4);
        area2.setNotaCiclismo(3);
        area2.setNotaFutebol(5);
        area2.setNotaVolei(4);
        area2.setNotaQuadrasDeAreia(3);
        area2.setNotaPiquenique(5);
        area2.setNotaParquinhoInfantil(4);
        area2.setNotaPedalinho(3);
        area2.setNotaOutros(4);
        area2.setNotaColetaResiduos(5);
        area2.setNotaTransporte(4);
        area2.setNotaQualidadeAr(3);
        area2.setNotaPoluicaoSonora(2);

// Create an Avaliacao object
        Avaliacao avaliacao = new Avaliacao(
                area2.getNotaColetaResiduos(),
                area2.getNotaTransporte(),
                area2.getNotaQualidadeAr(),
                area2.getNotaPoluicaoSonora(),
                area2.getNotaArvores(),
                area2.getNotaArbustos(),
                area2.getNotaGrama(),
                area2.getNotaCaminhada(),
                area2.getNotaCiclismo(),
                area2.getNotaFutebol(),
                area2.getNotaVolei(),
                area2.getNotaQuadrasDeAreia(),
                area2.getNotaPiquenique(),
                area2.getNotaParquinhoInfantil(),
                area2.getNotaPedalinho(),
                area2.getNotaOutros(),
                area2.getId()
        );

// Insert the Avaliacao object into the repository
        RepositorioAvaliacoes.inserir(avaliacao);



        do {
            System.out.println("Digite a opção que deseja acessar:");
            System.out.println("1- Listar Áreas Verdes");
            System.out.println("2- Avaliar Área Verde");
            System.out.println("3- Ver detalhe de uma Área Verde");
            System.out.println("4- Cadastrar nova Área Verde");
            System.out.println("0- Sair");
            opcao = entrada.nextInt();
            entrada.nextLine();


            switch (opcao) {
                case 1:
                    ArrayList<Localizacao> localizacoes = RepositorioLocalizacoes.listarTodasLocalizacoes();
                    for (Localizacao loc : localizacoes) {
                        System.out.println(loc);
                    }
                    break;
                case 2:
                    RepositorioAreaVerde.avaliarAreaVerde(entrada);
                    break;
                case 3:
                    RepositorioAreaVerde.verDetalheAreaVerde(entrada);
                    break;
                case 4:
                    RepositorioAreaVerde.cadastrarNovaAreaVerde(entrada);
                    break;
                case 0:
                    System.out.println("Volte sempre!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);



    }



}




