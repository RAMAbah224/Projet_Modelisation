package service;

import model.Usager;
import java.util.HashMap;

public class AuthService {

    private HashMap<String, Usager> usagers = new HashMap<>();

    public AuthService() {
        // Deux usagers de test
        usagers.put("jean123", new Usager("jean123", "1111"));
        usagers.put("jeanne456", new Usager("jeanne456", "2222"));
    }

    public Usager authentifier(String numeroCompte, String nip) {
        Usager u = usagers.get(numeroCompte);
        if (u != null && u.getNip().equals(nip)) {
            return u;
        }
        return null;
    }
}
