package introducaoclasse;

public class pessoa {
    private double peso; 
    private double altura;
    private int idade;
    public String nome;

    public void setPeso(double peso){
        this.peso = peso;
     }  
    public double getPeso(){
        return this.peso;
    }
    public double getAltura(double altura){
        return this.altura;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setString (String nome){
        return this.nome = nome;
    }

}