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
public class PontoXY extends Ponto2D {

    public PontoXY() {
        // obrigatório pois a classe Pessoa não
        // implementa o construtor padrão Pessoa()
        super(0, 0, 0);
    }

    public PontoXY(double x, double y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(getNome()).append("(").append(x).append(",").append(y).append(")");
        return s.toString();
    }
}
