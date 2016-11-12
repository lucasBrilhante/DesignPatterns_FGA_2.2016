package view;

import model.ComponentPrototype;
import model.KeyboardPrototype;

public class MainScreen {

	public static void main(String[] args) {
		ComponentPrototype keyboard = new KeyboardPrototype();
		/**
		 *  O mesmo componente da origem a vários outros, sendo que a unica coisa que muda é o preço.
		 *  Se considerarmos que a inicializaçãode um KeyBoard preencha 100 campos que são pegos de um
		 *  banco de dados. Se quisermos instanciar 100 Keyboards que só mudam o preço, o prototype reduz
		 *  o número de operações de O(x*n) para O(n), onde x é o a complexidade de criação do objeto.
		 */
		 
		ComponentPrototype newKeyboard = keyboard.clone();
		newKeyboard.setPrice(700.00);
		ComponentPrototype oldKeyboard = keyboard.clone();
		oldKeyboard.setPrice(400.00);
		// .... Inumeras criações.
		System.out.println(newKeyboard.exibirInfo());
		System.out.println(oldKeyboard.exibirInfo());
		
	}

}
