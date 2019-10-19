package grundlagen.sichtbarkeit.p1;

import grundlagen.sichtbarkeit.p2.B;
import grundlagen.sichtbarkeit.p2.Beta;

/**
 * Klasse Alpha, wird geerbt von {@link Beta} und {@link Gamma}
 */
public class Alpha {

    /**
     * Alle mit Zugriff auf die Klasse
     */
    public String publicVar;

    /**
     * Gleiches Paket sowie Zugriff aus vererbenden und erbenden Klassen von Außerhalb
     */
    protected String protectedVar;

    /**
     * Nur gleiches Paket (Standard)
     */
    String packagePrivateVar;

    /**
     * Nur Klasse
     */
    private String privateVar;

    /*
    Zugriff von
        v     public  protected   package   private   <Sichtbarkeit
     Klasse     x       x           x         x
     Paket      x       x           x         -
     Erbe       x       x           -         -
     Vererber   x       x           -         -
     Fremd      x       -           -         -
     */

    void keineEinschraenkungenBeiZugriffAufThis() {
        this.publicVar = "Instanz darf alles";
        this.protectedVar = "Instanz darf alles";
        this.packagePrivateVar = "Instanz darf alles";
        this.privateVar = "Instanz darf alles";
    }

    void zugriffAufErbendeKlasseGleichesPaket() {
        Gamma gamma = new Gamma();
        gamma.publicVar = "Allgemeiner Zugriff";
        gamma.protectedVar = "Hier trumpft gleiches Paket";
        gamma.packagePrivateVar = "Hier trumpft gleiches Paket";
        // gamma.privateVar = "has private access";
    }

    void zugriffAufErbendeKlasseAnderesPaket() {
        Beta beta = new Beta();
        beta.publicVar = "Allgemeiner Zugriff";
        beta.protectedVar = "Zugriff, da es eine erbende Subklasse ist";
        // beta.packagePrivateVar = "Cannot be accessed from outside package";
        // beta.privateVar = "has private access";
    }

    void zugriffAufInstanzKlasseGleichesPaket() {
        A a = new A();
        a.publicVar = "public ist sowieso public";
        a.protectedVar = "Zugriff, da gleiches Paket";
        a.packagePrivateVar = "Zugriff, da gleiches Paket";
        // a.privateVar = "has private access";
    }

    void zugriffAufInstanzKlasseAnderesPaket() {
        B b = new B();
        b.publicVar = "public ist sowieso public";
        // b.protectedVar = "has protected access";
        // b.packagePrivateVar = "Cannot be accessed from outside package";
        // b.privateVar = "has private access";
    }
}
