package controller;

import br.edu.fateczl.lista.listaint.Lista;
import br.edu.fateczl.quick.Controller_Quick;


public class lista2controller {

	
	public void Exercicio1(int v[]) throws Exception {
		System.out.print("Lista fora de Ordem: ");
		PreencheLista(v);
		
		QuickOP(v, 0, v.length - 1);
		
		
		System.out.print("Lista Ordenada: ");		
		PreencheLista(v);
		
	}
	
	public void PreencheLista(int v[]) throws Exception {
		Lista l = new Lista();

		for(int p = 0 ; p < 10 ; p++) {
			try {
				l.add(v[p], p);
			} catch (Exception e) {
				l.addFirst(v[p]);
			}		
		}
		System.out.println(l);
		
	}
	
	public void QuickOP(int[] v, int inicio, int fim) {
		
		Controller_Quick sort = new Controller_Quick();
		
		sort.QS(v, inicio, fim);
		
	}

}
