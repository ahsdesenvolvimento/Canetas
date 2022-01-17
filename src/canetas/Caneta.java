package canetas;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
     public Caneta(String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
        this.cor = "Azul";
    }
    
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p ){
        this.ponta = p;
    }
    public void rabiscar(){
        if(tampada == false){
            System.out.println("Estou rabiscando");
        }
        else{
            System.out.println("Não posso rabiscar");
        }
    }
    public void tampar(){
        if(tampada == false){
            tampada =  true;
        }
            else{
                 System.out.println("ERRO! Já estou tampada");   
                    }
        }
    
    
    public void destampar(){
        if(tampada == true){
            tampada =  false;
        }
            else{
                 System.out.println("ERRO! Já estou destampada");   
                    }
    }
    public void status(){
        System.out.println(" ");
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Nivel de carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
}
    }


   