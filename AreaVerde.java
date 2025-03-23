package Funcionalidades;

import java.util.Scanner;
import java.util.ArrayList;

import static Funcionalidades.RepositorioAvaliacoes.calcularMedia;

public class AreaVerde {
    private int id;
    private boolean arvores;
    private boolean arbustos;
    private boolean grama;
    private double horarioFuncionamento;
    private boolean caminhada;
    private boolean ciclismo;
    private boolean futebol;
    private boolean volei;
    private boolean quadrasDeAreia;
    private boolean piquenique;
    private boolean parquinhoInfantil;
    private boolean pedalinho;
    private boolean outros;
    private static int contadorId = 0;
    private int notaArvores;
    private int notaArbustos;
    private int notaGrama;
    private int notaCaminhada;
    private int notaCiclismo;
    private int notaFutebol;
    private int notaVolei;
    private int notaQuadrasDeAreia;
    private int notaPiquenique;
    private int notaParquinhoInfantil;
    private int notaPedalinho;
    private int notaOutros;
    private Localizacao localizacao;
    private String nome = getAreaVerdeNome();
    private ArrayList <Avaliacao> avaliacoes;
    private int notaQualidadeAr;
    private int notaPoluicaoSonora;
    private int notaColetaResiduos;
    private int notaTransporte;



    public String getAreaVerdeNome(){
        if (localizacao != null) {
            return localizacao.getNome();
        } else {
            return null;
        }
    }

    public int getId() {
        return id;
    }

    public AreaVerde(String nome, double latitude, double longitude, boolean arvores, boolean arbustos, boolean grama, double horarioFuncionamento, boolean caminhada, boolean ciclismo, boolean futebol, boolean volei, boolean quadrasDeAreia, boolean piquenique, boolean parquinhoInfantil, boolean pedalinho, boolean outros) {

        this.id = contadorId++;
        this.nome = nome;
        localizacao = new Localizacao(latitude, longitude, nome);
        this.arvores = arvores;
        this.arbustos = arbustos;
        this.grama = grama;
        this.horarioFuncionamento = horarioFuncionamento;
        this.caminhada = caminhada;
        this.ciclismo = ciclismo;
        this.futebol = futebol;
        this.volei = volei;
        this.quadrasDeAreia = quadrasDeAreia;
        this.piquenique = piquenique;
        this.parquinhoInfantil = parquinhoInfantil;
        this.pedalinho = pedalinho;
        this.outros = outros;
        this.avaliacoes = new ArrayList<>();
    }

    public void setId(int id) {
        this.id = id;
    }



    public void avaliarAtributos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Avalie os seguintes critérios da area verde de 1 a 5:");

        if (this.arvores) {
            System.out.print("Arvores: \n");
            System.out.println("1 - Péssimo");
            System.out.println("2 - Ruim");
            System.out.println("3 - Regular");
            System.out.println("4 - Bom");
            System.out.println("5 - Excelente");
            this.notaArvores = obterNotaValida(scanner);
        }

        if (this.arbustos) {
            System.out.print("Arbustos: \n");
            System.out.println("1 - Péssimo");
            System.out.println("2 - Ruim");
            System.out.println("3 - Regular");
            System.out.println("4 - Bom");
            System.out.println("5 - Excelente");
            this.notaArbustos = obterNotaValida(scanner);
        }

        if (this.grama) {
            System.out.print("Grama: \n");
            System.out.println("1 - Péssimo");
            System.out.println("2 - Ruim");
            System.out.println("3 - Regular");
            System.out.println("4 - Bom");
            System.out.println("5 - Excelente");
            this.notaGrama = obterNotaValida(scanner);
        }

        if (this.caminhada) {
            System.out.print("Caminhada: \n");
            System.out.println("1 - Péssimo");
            System.out.println("2 - Ruim");
            System.out.println("3 - Regular");
            System.out.println("4 - Bom");
            System.out.println("5 - Excelente");
            this.notaCaminhada = obterNotaValida(scanner);
        }

        if (this.ciclismo) {
            System.out.print("Ciclismo: \n");
            System.out.println("1 - Péssimo");
            System.out.println("2 - Ruim");
            System.out.println("3 - Regular");
            System.out.println("4 - Bom");
            System.out.println("5 - Excelente");
            this.notaCiclismo = obterNotaValida(scanner);
        }

        if (this.futebol) {
            System.out.print("Futebol: \n");
            System.out.println("1 - Péssimo");
            System.out.println("2 - Ruim");
            System.out.println("3 - Regular");
            System.out.println("4 - Bom");
            System.out.println("5 - Excelente");
            this.notaFutebol = obterNotaValida(scanner);
        }

        if (this.volei) {
            System.out.print("Volei: \n");
            System.out.println("1 - Péssimo");
            System.out.println("2 - Ruim");
            System.out.println("3 - Regular");
            System.out.println("4 - Bom");
            System.out.println("5 - Excelente");
            this.notaVolei = obterNotaValida(scanner);
        }

        if (this.quadrasDeAreia) {
            System.out.print("Quadras de Areia: \n");
            System.out.println("1 - Péssimo");
            System.out.println("2 - Ruim");
            System.out.println("3 - Regular");
            System.out.println("4 - Bom");
            System.out.println("5 - Excelente");
            this.notaQuadrasDeAreia = obterNotaValida(scanner);
        }

        if (this.piquenique) {
            System.out.print("Piquenique: \n");
            System.out.println("1 - Péssimo");
            System.out.println("2 - Ruim");
            System.out.println("3 - Regular");
            System.out.println("4 - Bom");
            System.out.println("5 - Excelente");
            this.notaPiquenique = obterNotaValida(scanner);
        }

        if (this.parquinhoInfantil) {
            System.out.print("Parquinho Infantil: \n");
            System.out.println("1 - Péssimo");
            System.out.println("2 - Ruim");
            System.out.println("3 - Regular");
            System.out.println("4 - Bom");
            System.out.println("5 - Excelente");
            this.notaParquinhoInfantil = obterNotaValida(scanner);
        }

        if (this.pedalinho) {
            System.out.print("Pedalinho: \n");
            System.out.println("1 - Péssimo");
            System.out.println("2 - Ruim");
            System.out.println("3 - Regular");
            System.out.println("4 - Bom");
            System.out.println("5 - Excelente");
            this.notaPedalinho = obterNotaValida(scanner);
        }

        if (this.outros) {
            System.out.print("Outros: \n");
            System.out.println("1 - Péssimo");
            System.out.println("2 - Ruim");
            System.out.println("3 - Regular");
            System.out.println("4 - Bom");
            System.out.println("5 - Excelente");
            this.notaOutros = obterNotaValida(scanner);
        }

        if (this.notaColetaResiduos == 0) {
            System.out.println("Coleta de resíduos: \n");
            System.out.println("1 - Péssimo");
            System.out.println("2 - Ruim");
            System.out.println("3 - Regular");
            System.out.println("4 - Bom");
            System.out.println("5 - Excelente");
            this.notaColetaResiduos = obterNotaValida(scanner);
        }

        if (this.notaTransporte == 0) {
            System.out.println("Transporte: \n");
            System.out.println("1 - Péssimo");
            System.out.println("2 - Ruim");
            System.out.println("3 - Regular");
            System.out.println("4 - Bom");
            System.out.println("5 - Excelente");
            this.notaTransporte = obterNotaValida(scanner);
        }

        if (this.notaQualidadeAr == 0) {
            System.out.println("Qualidade do ar: \n");
            System.out.println("1 - Péssimo");
            System.out.println("2 - Ruim");
            System.out.println("3 - Regular");
            System.out.println("4 - Bom");
            System.out.println("5 - Excelente");
            this.notaQualidadeAr = obterNotaValida(scanner);
        }

        if (this.notaPoluicaoSonora == 0) {
            System.out.println("Poluição sonora: \n");
            System.out.println("1 - Péssimo");
            System.out.println("2 - Ruim");
            System.out.println("3 - Regular");
            System.out.println("4 - Bom");
            System.out.println("5 - Excelente");
            this.notaPoluicaoSonora = obterNotaValida(scanner);
        }

        Avaliacao avaliacao = new Avaliacao(notaColetaResiduos, notaTransporte, notaQualidadeAr, notaPoluicaoSonora, notaArvores, notaArbustos, notaGrama, notaCaminhada, notaCiclismo, notaFutebol, notaVolei, notaQuadrasDeAreia, notaPiquenique, notaParquinhoInfantil, notaPedalinho, notaOutros, getId());
        RepositorioAvaliacoes.inserir(avaliacao);
        this.avaliacoes.add(avaliacao);
    }

    private int obterNotaValida(Scanner scanner) {
        int nota = 0;
        while (true) {
            String input = scanner.nextLine();
            if (!input.isEmpty() && input.matches("[1-5]")) {
                nota = Integer.parseInt(input);
                break;
            } else {
                System.out.println("Entrada inválida. Por favor, insira um valor de 1 a 5:");
            }
        }
        return nota;
    }

    public void setNotaOutros(int notaOutros) {
        this.notaOutros = notaOutros;
    }

    public void setNotaPedalinho(int notaPedalinho) {
        this.notaPedalinho = notaPedalinho;
    }

    public void setNotaParquinhoInfantil(int notaParquinhoInfantil) {
        this.notaParquinhoInfantil = notaParquinhoInfantil;
    }

    public void setNotaPiquenique(int notaPiquenique) {
        this.notaPiquenique = notaPiquenique;
    }

    public void setNotaQuadrasDeAreia(int notaQuadrasDeAreia) {
        this.notaQuadrasDeAreia = notaQuadrasDeAreia;
    }

    public void setNotaVolei(int notaVolei) {
        this.notaVolei = notaVolei;
    }

    public void setNotaFutebol(int notaFutebol) {
        this.notaFutebol = notaFutebol;
    }

    public void setNotaQualidadeAr(int notaQualidadeAr) {
        this.notaQualidadeAr = notaQualidadeAr;
    }

    public void setNotaPoluicaoSonora(int notaPoluicaoSonora) {
        this.notaPoluicaoSonora = notaPoluicaoSonora;
    }

    public void setNotaColetaResiduos(int notaColetaResiduos) {
        this.notaColetaResiduos = notaColetaResiduos;
    }

    public void setNotaTransporte(int notaTransporte) {
        this.notaTransporte = notaTransporte;
    }

    public void setNotaArvores(int notaArvores) {
        this.notaArvores = notaArvores;
    }

    public void setNotaArbustos(int notaArbustos) {
        this.notaArbustos = notaArbustos;
    }

    public void setNotaGrama(int notaGrama) {
        this.notaGrama = notaGrama;
    }

    public void setNotaCaminhada(int notaCaminhada) {
        this.notaCaminhada = notaCaminhada;
    }

    public void setNotaCiclismo(int notaCiclismo) {
        this.notaCiclismo = notaCiclismo;
    }

    public int getNotaArvores() {
        return notaArvores;
    }

    public int getNotaArbustos() {
        return notaArbustos;
    }

    public int getNotaGrama() {
        return notaGrama;
    }

    public int getNotaCaminhada() {
        return notaCaminhada;
    }

    public int getNotaCiclismo() {
        return notaCiclismo;
    }

    public int getNotaFutebol() {
        return notaFutebol;
    }

    public int getNotaVolei() {
        return notaVolei;
    }

    public int getNotaQuadrasDeAreia() {
        return notaQuadrasDeAreia;
    }

    public int getNotaPiquenique() {
        return notaPiquenique;
    }

    public int getNotaParquinhoInfantil() {
        return notaParquinhoInfantil;
    }

    public int getNotaPedalinho() {
        return notaPedalinho;
    }

    public int getNotaOutros() {
        return notaOutros;
    }

    public int getNotaQualidadeAr() {
        return notaQualidadeAr;
    }

    public int getNotaPoluicaoSonora() {
        return notaPoluicaoSonora;
    }

    public int getNotaColetaResiduos() {
        return notaColetaResiduos;
    }

    public int getNotaTransporte() {
        return notaTransporte;
    }

    private String formatNota(int nota) {
        return (nota == 0) ? "ainda não há nota" : "nota = " + nota + "*";
    }

    @Override
    public String toString() {
        double mediaTotal = calcularMedia(id);

        return nome + " {" +
                "id = " + id +
                "| horarioFuncionamento = " + horarioFuncionamento +
                "|" + (arvores ? "tem árvores" : "não tem árvores") + (notaArvores == 0 ? "" : ", " + formatNota(notaArvores)) +
                "| " + (arbustos ? "tem arbustos" : "não tem arbustos") + (notaArbustos == 0 ? "" : ", " + formatNota(notaArbustos)) +
                "| \n" + (grama ? "tem grama" : "não tem grama") + (notaGrama == 0 ? "" : ", " + formatNota(notaGrama)) +
                "| " + (caminhada ? "tem trilhas para caminhada" : "não tem trilhas para caminhada") + (notaCaminhada == 0 ? "" : ", " + formatNota(notaCaminhada)) +
                "| " + (ciclismo ? "tem trilhas para ciclismo" : "não tem trilhas para ciclismo") + (notaCiclismo == 0 ? "" : ", " + formatNota(notaCiclismo)) +
                "| \n" + (futebol ? "tem campos de futebol" : "não tem campos de futebol") + (notaFutebol == 0 ? "" : ", " + formatNota(notaFutebol)) +
                "| " + (volei ? "tem quadras de vôlei" : "não tem quadras de vôlei") + (notaVolei == 0 ? "" : ", " + formatNota(notaVolei)) +
                "| " + (quadrasDeAreia ? "tem quadras de areia" : "não tem quadras de areia") + (notaQuadrasDeAreia == 0 ? "" : ", " + formatNota(notaQuadrasDeAreia)) +
                "| " + (piquenique ? "tem áreas para piquenique" : "não tem áreas para piquenique") + (notaPiquenique == 0 ? "" : ", " + formatNota(notaPiquenique)) +
                "| \n" + (parquinhoInfantil ? "tem parquinho infantil" : "não tem parquinho infantil") + (notaParquinhoInfantil == 0 ? "" : ", " + formatNota(notaParquinhoInfantil)) +
                "| " + (pedalinho ? "tem pedalinho" : "não tem pedalinho") + (notaPedalinho == 0 ? "" : ", " + formatNota(notaPedalinho)) +
                "| " + (outros ? "tem outras facilidades" : "não tem outras facilidades") + (notaOutros == 0 ? "" : ", " + formatNota(notaOutros)) +
                "| \n" + "Coleta de resíduos : " + formatNota(notaColetaResiduos) +
                "| Transporte : " + formatNota(notaTransporte) +
                "| Qualidade do ar : " + formatNota(notaQualidadeAr) +
                "|\nPoluição sonora : " + formatNota(notaPoluicaoSonora) +
                "| média total = " + (mediaTotal == 0 ? "ainda não há nenhuma avaliação" : mediaTotal) +
                '}' + "\n";
    }
}
