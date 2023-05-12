
package prog2;


public class CarroMain {

    public static void main(String[] args) {
        
        Carro carro = new Carro("Mercedes","AMG",2022);
        carro.acelerar();
        System.out.println(carro.velocidade);
         carro.acelerar();
        System.out.println(carro.velocidade);
         carro.frear();
        System.out.println(carro.velocidade);
        
        
        
     
    }
    
}
