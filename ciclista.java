package exercicio;

import javax.swing.JOptionPane;

public abstract class ciclista {

    private int distancia;
    private String TipoBike;
    private String Marca;

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getTipoBike() {
        return TipoBike;
    }

    public void setTipoBike(String tipoBike) {
        this.TipoBike = tipoBike;
    }

    public abstract void atualizarDistancia(int distancia);

    int distanciaFormat = this.distancia;
    String marca = this.Marca;
    String tipoDaBike = this.TipoBike;

    public void inserirDados() {
        this.distancia = Integer.parseInt(JOptionPane.showInputDialog("Digite a distancia percorrida"));
        this.Marca = JOptionPane.showInputDialog("Escreva a marca da bike");
        this.TipoBike = JOptionPane.showInputDialog("Escreva o tipo da bike");

    }

    public void mostrarDados() {
        String mensagem = "Ciclista de " + TipoBike.substring(0, 1).toUpperCase().concat(TipoBike.substring(1));
        mensagem += "\nDistancia percorrida : " + this.distancia + " KM";
        mensagem += "\nTipo da Bike : " + TipoBike.substring(0, 1).toUpperCase().concat(TipoBike.substring(1));
        mensagem += "\nMarca da Bike : " + Marca.substring(0, 1).toUpperCase().concat(Marca.substring(1));		

        JOptionPane.showMessageDialog(null, mensagem);
    }    
}
