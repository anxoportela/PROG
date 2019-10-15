
package prueba;

public class Persona {
    
    int peso;
    String nome;
    
    Persona (String nome, int peso){
        this.peso = peso;
        this.nome = nome;
    }
    
    public static void main(String[] args){

        Persona p1,p2;

        p1 = new Persona("Pepe", 50);
        p2 = new Persona("Luis", 70);

        System.out.println(p1.nome);
        
    }
    
}