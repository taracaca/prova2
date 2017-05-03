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
public class Ponto2D extends Ponto {

    protected double x,y,z;
    
    public Ponto2D() {
        // obrigatório pois a classe Pessoa não
        // implementa o construtor padrão Pessoa()
        super(0,0,0);
    }

    public Ponto2D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

}
