package preso;

public class PresoDrive {

	public static void main(String[] args) {
		
		Celdas c1=new Celdas("A01", true);
		Preso p1 = new Preso("Luis","Chispa","12345",12,c1);
		Preso p2 = new Preso("Manuel","Perro","23456",13,c1);
		Preso p3 = new Preso("Jose","Gato","34567",14,c1);
//		Guardia g1= new Guardia("Manuel", "23456");
//		Guardia g2= new Guardia("Luis", "33456");
//		Guardia g3= new Guardia("Pepe", "43456");
		
		c1.anadirPreso(p1);
		c1.anadirPreso(p2);
		c1.anadirPreso(p3);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);				

	}

}
