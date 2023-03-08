package provas;
public class Provas {
    
    double p1;
    double p2;
    double exame;
    boolean verified;
    
    public double soma(){
        double soma = p1+p2;
        return soma;
    }
    public boolean verificaExame(){
        double media = (this.soma())/2;
        if (media >= 7){
            System.out.println("Sem exame");
            verified = false;
            
        }else{
            System.out.println("Necessario exame");
            verified = true;
        }
        return verified;
    }
    public void verificaSituacao(){
        double mediaExame = (this.soma()/2 + this.exame)/2;
        if (mediaExame >= 5){
            System.out.println("Aprovado");
        }else{
            System.out.println("Retido");
        }
    }
    
    public static void materia(){
        System.out.println("fisica");
    }
    
    public static void main (String[] args){;
    
        Provas prova = new Provas();
        prova.p1 = 3;
        prova.p2 = 4;  
        
        
        System.out.println(prova.soma());
    }
}
