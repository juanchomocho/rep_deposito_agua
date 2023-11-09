public class DepositoDeAgua {
    //nombre del dep�sito
    private String name;
    //litros del dep�sito
    private int litrosAgua;
    //estado del grifo de vaciado
    private boolean vaciando;
    
    public DepositoDeAgua(String nName, boolean nVaciando) {
        name = nName;
        litrosAgua = 2500;
        vaciando = nVaciando;
    }
    
    public String getName() {
        return name;
    }
    
    public int getLitros() {
        return litrosAgua;
    }
    
    public boolean getVaciando() {
        return vaciando;
    }
    
    public void setName(String newName) {
        name = newName;
    }
    
    public void rellenarDeposito(int newLitros) {
        litrosAgua = litrosAgua + newLitros;
    }
    
    public void cerrarOAbrirGrifo() {
        if (vaciando) {
            vaciando = false;
        }
        else {
            vaciando = true;
        }
    }
    
    public void imprimirEstado() {
        String abierto;
        if (vaciando) {
            abierto = "abierto";
        }
        else {
            abierto = "cerrado";
        }
        System.out.println("El nombre de este dep�sito es " + name + " | El dep�sito contiene " + litrosAgua + " litros de agua" + " | El grifo est� " + abierto);
    }
    
    public String getEstado() {
        String abierto;
        if (vaciando) {
            abierto = "abierto";
        }
        else {
            abierto = "cerrado";
        }
        return ("Nombre: " + name + " | Litros de gasolina: " + litrosAgua + " | Grifo: " +  abierto);
    }
}