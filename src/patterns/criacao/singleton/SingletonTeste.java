package patterns.criacao.singleton;

import javax.swing.*;

/*
*Singleton:
* -intencao: garantir que uma DETERMINADA CLASSE TENHA uma e somente
* uma instancia, mantendo um ponto global de acesso paraa  mesma
 */
public class SingletonTeste{

    public static void main(String[] args){
      Janela j= Janela.getInstance();
      j.pack();
      j.setVisible(true);
        Janela j2= Janela.getInstance();
        j2.pack();
        j2.setVisible(true);

    }


}
