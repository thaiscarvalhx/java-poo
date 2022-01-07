package POO.Veiculo;

public class Veiculo {

    private
    String marca;
    String modelo;
    String placa;
    String cor;
    Float km;
    Boolean isLigado;
    Integer litrosCombustivel;
    Integer velocidade;
    Double preco;

    public Veiculo(String marca, String modelo, String placa, String cor, Float km, Boolean isLigado, Integer litrosCombustivel, Integer velocidade, Double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.km = km;
        this.isLigado = isLigado;
        this.litrosCombustivel = litrosCombustivel;
        this.velocidade = velocidade;
        this.preco = preco;
    }
    /*------------------------------------
                    FUNÇÕES
    --------------------------------------*/

    public
    String situacao() {
        System.out.println("{" +
                "O carro está ligado? " + isLigado + '\n' +
                "combustivel = " + litrosCombustivel + '\n' +
                "velocidade = " + velocidade + '\n' +
                "marca = " + marca + '\n' +
                "modelo = " + modelo + '\n' +
                "placa = " + placa + '\n' +
                "cor = " + cor + '\n' +
                "preco = " + preco +
                '}');
         return null;
    }

    void acelerar(){
        if(velocidade == 240){
            System.out.println("Velocidade máxima atingida. Diminua a " +
                    "velocidade.");
        } else {
            this.velocidade = velocidade + 20;;
        }
    }

    void abastecer(int combustivel){
        this.litrosCombustivel += combustivel;
        if (litrosCombustivel >= 60) {
            this.litrosCombustivel = 60;
            System.out.println("O tanque de combustível está cheio.");
        }
    }

    void frear(){
        if(velocidade == 0){
            System.out.println("Velocidade mínima atingida. Caso queira " +
                    "desligar o carro, digite o comando DESLIGAR, caso não, " +
                    "acelere.");
        } else {
            this.velocidade = velocidade - 20;
        }
    }

    void pintar(String cor){
        this.cor = cor;
    }

    void ligar(){
        if(velocidade == 0){
            this.velocidade = velocidade + 10;
        } else {
            System.out.println("O carro está ligado.");
        }
    }

    void desligar(){
        if(velocidade == 0){
            this.isLigado = false;
            System.out.println("O carro está desligado.");
        } else {
            this.isLigado = true;
            System.out.println("Diminua a velocidade para 0km/hr para " +
                    "desligar o carro.");
        }
    }

    /*------------------------------------

    --------------------------------------*/

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Float getKm() {
        return km;
    }

    public void setKm(Float km) {
        this.km = km;
    }

    public Boolean getLigado() {
        return isLigado;
    }

    public void setLigado(Boolean ligado) {
        isLigado = ligado;
    }

    public Integer getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(Integer litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
