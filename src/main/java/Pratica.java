
import utfpr.ct.dainf.pratica.Ponto;
import utfpr.ct.dainf.pratica.PontoXY;
import utfpr.ct.dainf.pratica.PontoXZ;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná DAINF - Departamento
 * Acadêmico de Informática
 *
 * @author
 */
public class Pratica {

    public static void main(String[] args) {
        PontoXZ xz = new PontoXZ(-3, 2);
        PontoXY xy = new PontoXY(0, 2);
        Ponto p = new Ponto(0,0,0);
        
        System.out.printf("Distancia= %2f", (p.dist(xz) - p.dist(xy)));
    }
}
