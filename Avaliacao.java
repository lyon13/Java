package Funcionalidades;

public class Avaliacao {
    private int id;
    private int notaQualidadeAr;
    private int notaPoluicaoSonora;
    private int notaColetaResiduos;
    private int notaTransporte;
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
    private int idAreaverde;
    private int calcularId;


    public int getId() {
        return id;
    }

    public Avaliacao(int notaColetaResiduos,
                     int notaTransporte,
                     int notaQualidadeAr,
                     int notaPoluicaoSonora,
                     int notaArvores,
                     int notaArbustos,
                    int notaGrama,
                    int notaCaminhada,
                    int notaCiclismo,
                    int notaFutebol,
                    int notaVolei,
                    int notaQuadrasDeAreia,
                    int notaPiquenique,
                    int notaParquinhoInfantil,
                    int notaPedalinho,
                    int notaOutros,
                     int idAreaverde) {
        this.notaColetaResiduos = notaColetaResiduos;
        this.notaTransporte = notaTransporte;
        this.notaQualidadeAr = notaQualidadeAr;
        this.notaPoluicaoSonora = notaPoluicaoSonora;
        this.notaArvores = notaArvores;
        this.notaArbustos = notaArbustos;
        this.notaGrama = notaGrama;
        this.notaCaminhada = notaCaminhada;
        this.notaCiclismo = notaCiclismo;
        this.notaFutebol = notaFutebol;
        this.notaVolei = notaVolei;
        this.notaQuadrasDeAreia = notaQuadrasDeAreia;
        this.notaPiquenique = notaPiquenique;
        this.notaParquinhoInfantil = notaParquinhoInfantil;
        this.notaPedalinho = notaPedalinho;
        this.notaOutros = notaOutros;
        this.idAreaverde = idAreaverde;
        this.id = calcularId++;
        RepositorioAvaliacoes.inserir(Avaliacao.this);
    }


    public double calcularMedia() {
        int sum = 0;
        int count = 0;

        if (notaArvores > 0) {
            sum += notaArvores;
            count++;
        }
        if (notaArbustos > 0) {
            sum += notaArbustos;
            count++;
        }
        if (notaGrama > 0) {
            sum += notaGrama;
            count++;
        }
        if (notaCaminhada > 0) {
            sum += notaCaminhada;
            count++;
        }
        if (notaCiclismo > 0) {
            sum += notaCiclismo;
            count++;
        }
        if (notaFutebol > 0) {
            sum += notaFutebol;
            count++;
        }
        if (notaVolei > 0) {
            sum += notaVolei;
            count++;
        }
        if (notaQuadrasDeAreia > 0) {
            sum += notaQuadrasDeAreia;
            count++;
        }
        if (notaPiquenique > 0) {
            sum += notaPiquenique;
            count++;
        }
        if (notaParquinhoInfantil > 0) {
            sum += notaParquinhoInfantil;
            count++;
        }
        if (notaPedalinho > 0) {
            sum += notaPedalinho;
            count++;
        }
        if (notaOutros > 0) {
            sum += notaOutros;
            count++;
        }
        if (notaColetaResiduos > 0) {
            sum += notaColetaResiduos;
            count++;
        }
        if (notaTransporte > 0) {
            sum += notaTransporte;
            count++;
        }
        if (notaQualidadeAr > 0) {
            sum += notaQualidadeAr;
            count++;
        }
        if (notaPoluicaoSonora > 0) {
            sum += notaPoluicaoSonora;
            count++;
        }

        return count > 0 ? (double) sum / count : 0;
    }

    public int getIdAreaverde() {
        return idAreaverde;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "id=" + id +
                ", areaVerdeId=" + idAreaverde +
                ", qualidadeAr=" + notaQualidadeAr +
                ", ausenciaPoluicaoSonora=" + notaPoluicaoSonora +
                ", coletaResiduos=" + notaColetaResiduos +
                ", facilidadeTransportePublico=" + notaTransporte +
                ", media=" + calcularMedia() +
                '}';
    }
}
