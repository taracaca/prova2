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
public class PontoYZ extends Ponto2D {

    public PontoYZ() {
        // obrigatório pois a classe Pessoa não
        // implementa o construtor padrão Pessoa()
        super(0, 0, 0);
    }

    public PontoYZ(double x, double y, double z) {
        this.x = 0;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(getNome()).append("(").append(y).append(",").append(z).append(")");
        return s.toString();
    }
}
