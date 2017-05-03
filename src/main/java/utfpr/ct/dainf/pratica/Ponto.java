package utfpr.ct.dainf.pratica;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná DAINF - Departamento
 * Acadêmico de Informática
 *
 * @author
 */
public class Ponto {

    private double x, y, z;

    public Ponto(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Ponto() {
        this(0, 0, 0);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    /**
     * Retorna o nome não qualificado da classe.
     *
     * @return O nome não qualificado da classe.
     */
    public String getNome() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(getNome()).append("(").append(x).append(",").append(y).append(",").append(z).append(")");
        return s.toString();
    }

    @Override
    public boolean equals(Object obj) {

        if (obj != null && obj instanceof Ponto) {

            return (getX() == ((Ponto) obj).getY());

        } else {
            return false;

        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.z) ^ (Double.doubleToLongBits(this.z) >>> 32));
        return hash;
    }
    
    public double dist(Ponto p){
        return (p.getX() - p.getY()) + (p.getX() - p.getZ()) + (p.getY() - p.getZ());
    }
}
