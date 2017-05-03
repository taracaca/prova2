/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.pratica;

/**
 *
 * @author Ayrton
 */
public class PontoXZ extends Ponto2D {

    public PontoXZ() {
        // obrigatório pois a classe Pessoa não
        // implementa o construtor padrão Pessoa()
        super(0, 0, 0);
    }

    public PontoXZ(double x, double z) {
        this.x = x;
        this.y = 0;
        this.z = z;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(getNome()).append("(").append(x).append(",").append(z).append(")");
        return s.toString();
    }
}
