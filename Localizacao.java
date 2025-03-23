package Funcionalidades;

public class Localizacao {
    private int id;
    private Double latitude;
    private Double longitude;
    private String areaVerdeNome;
    private String nome;





    public Localizacao(double latitude, double longitude, String areaVerdeNome) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.nome = areaVerdeNome;
        RepositorioLocalizacoes.inserir(this);
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return nome +"{" +
                "id=" + id +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}' + "\n";
    }
}
