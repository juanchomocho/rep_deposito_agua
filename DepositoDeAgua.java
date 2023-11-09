public class DepositoDeAgua {
    //nombre del depósito
    private String name;
    //litros del depósito
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
}