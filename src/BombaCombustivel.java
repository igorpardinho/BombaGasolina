public class BombaCombustivel {

  private  String tipoDeCombustivel;
  private float valorPorLitro;
  private float quantidadeDeCombustivel;



    public float abastecerPorValor(float valor){

        quantidadeDeCombustivel = valor / valorPorLitro;

        return quantidadeDeCombustivel;

    }

    public float abastecerPorLitro(float litro){

        float valor = valorPorLitro;
        quantidadeDeCombustivel = valor * litro;

        return quantidadeDeCombustivel;
    }

    public void alterarCombustivel(String combustivel){
        tipoDeCombustivel = combustivel;
        System.out.println("Voce selecionou: " + tipoDeCombustivel);
    }

    public float alterarValor(float valor){
        valorPorLitro = valor;
        return valorPorLitro;
    }


    public float alterarQuantidadeCombustivel(float valor){
        quantidadeDeCombustivel = valor;
        return quantidadeDeCombustivel;
    }



    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public float getValorPorLitro() {
        return valorPorLitro;
    }

    public void setValorPorLitro(float valorPorLitro) {
        this.valorPorLitro = valorPorLitro;
    }

    public float getQuantidadeDeCombustivel() {
        return quantidadeDeCombustivel;
    }

    public void setQuantidadeDeCombustivel(float quantidadeDeCombustivel) {
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
    }



}