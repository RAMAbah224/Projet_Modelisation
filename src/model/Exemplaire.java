package model;

public class Exemplaire {
    private String rfid;
    private Livre livre;
    private boolean disponible = true;

    public Exemplaire(String rfid, Livre livre) {
        this.rfid = rfid;
        this.livre = livre;
    }

    public String getRfid() { return rfid; }
    public Livre getLivre() { return livre; }
    public boolean isDisponible() { return disponible; }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
