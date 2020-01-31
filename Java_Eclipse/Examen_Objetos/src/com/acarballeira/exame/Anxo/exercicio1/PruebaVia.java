package com.acarballeira.exame.Anxo.exercicio1;

/**
 *
 * @author dual108
 * @date 31 ene. 2020
 * @version 1.0
 *
 */

public class PruebaVia {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		
		final int TAMANO=6;
		
		Via[] vector = new Via[TAMANO];
		
		vector[0] = new CicloVia("C01", TipoTitularidade.AUTONOMICO, -25, 5, 5, "#000125");
		vector[1] = new CicloVia("C02", TipoTitularidade.AUTONOMICO, 230, 10, 10, "#AFF125");
		vector[2] = new Sendero("S01", TipoTitularidade.AUTONOMICO, 225, 5, 5, true);
		vector[3] = new Sendero("S02", TipoTitularidade.AUTONOMICO, 230, 10, 10, false);
		vector[4] = new Estrada("E01", TipoTitularidade.AUTONOMICO, 225, 5, 5, 3);
		vector[5] = new Estrada("E02", TipoTitularidade.AUTONOMICO, 225, 5, 5, 4);
		
		for (Via via : vector) {
			System.out.println(via);
		}
}

}
