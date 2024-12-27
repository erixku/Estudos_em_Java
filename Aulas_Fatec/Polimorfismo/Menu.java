package Aulas_Fatec.Polimorfismo;

import javax.swing.JOptionPane;

/**
 * Classe para apresentar um menu de opções (Cardápio) da Pizzaria
 * Autor: @erixku
 * @since Classe criada em 31 de outubro de 2024
 */

public class Menu{
    Forno forno = new Forno();//Objeto polimórfico
    Pizza pizza;//Objeto abstrato

    public Menu(){
        String menu;
        int opc;
        while(true){
            menu = "================================================"
                +"\n1- Margherita"
                +"\n2- Portuguesa"
                +"\n3- Frango com Catupiry"
                +"\n4- Califórnia"
                +"\n5- Baiana"
                +"\n6- M&M"
                +"\n----------Especiais-------------"
                +"\n7- Bolo de Laranja"
                +"\n8- Torta de Nozes"
                +"\n9- Pão de Calabresa"
                +"\n\n\n10- Finalizar";

            opc = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Escolha a sua opção: ", 3));

            switch(opc){
                case 1: pizza = new Margherita();
                        break;
                case 2: pizza = new Portuguesa();
                        break;
                case 3: pizza = new FrangoCatupiry();
                        break;
                case 4: pizza = new California();
                        break;
                case 5: pizza = new Baiana();
                        break;
                case 6: pizza = new MeM();
                        break;
                case 7: pizza = new BoloLaranja();
                        break;
                case 8: pizza = new TortaNozes();
                        break;
                case 9: pizza = new PaoCalabresa();
                        break;
                case 10: System.exit(0);

                default: JOptionPane.showMessageDialog(null, "Opção inválida!");
                         pizza = null;
            }//fim do switch
            if(pizza != null)
                forno.preparar(pizza);
        }//fim do while
    }//fim do construtor
}//fim da classe
