package patterns.criacao.abstractFactory;

import java.util.Calendar;
import java.util.GregorianCalendar;

/*
ABSTRACT FACTORY
Intencao: fornecer uma interface para criacao de familias
de objetos relacionados ou dependentes sem especificar
suas classes concretas

criar uma instancia de varias familias
 */
public class AbstractFactory {


    public static void main(String [] args){
        //Empresas de �nibus
        EmpresaOnibus empresa = new ConcretaEmpresaOnibus();

        //Emite passagens
        PassagemOnibusUrbano pUrbano = empresa.emitePassagemUrbano("S�o Paulo", "Campinas", new GregorianCalendar(2016, Calendar.MARCH, 10, 11, 0));

        PassagemOnibusInterestadual pInterestadual = empresa.emitePassagemInterEstadual("S�o Paulo", "Rio de Janeiro", new GregorianCalendar(2016, Calendar.APRIL, 20, 8, 30));

        //Exibe detalhes da passagem
        pUrbano.exibirDetalhes();

        pInterestadual.exibirDetalhes();
    }
}
