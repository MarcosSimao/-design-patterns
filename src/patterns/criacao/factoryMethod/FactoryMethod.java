package patterns.criacao.factoryMethod;

import java.util.Calendar;
import java.util.GregorianCalendar;

/*
FACTORY METHOD
INtencao: definir uma interface para criar um objeto, mas deixar as subclasses decidirem que classe instanciar.
criar uma instancia de varias classes drivadas.

 */
public class FactoryMethod {

    public static void main(String[] args){
        Empresa viacaoABCLocal = new EmpresaDeOnibusUrbano();

        Empresa viacaoXYZInter = new EmpresaDeOnibusInterestadual();

        //Emite passagens
        Passagem pUrbano = viacaoABCLocal.emitePassagem("S�o Paulo", "Campinas", new GregorianCalendar(2016, Calendar.MARCH, 10, 11, 0));

        Passagem pInterestadual = viacaoXYZInter.emitePassagem("S�o Paulo", "Rio de Janeiro", new GregorianCalendar(2016, Calendar.APRIL, 20, 8, 30));

        //Exibe detalhes da passagem
        pUrbano.exibeDetalhes();

        pInterestadual.exibeDetalhes();
    }
}
