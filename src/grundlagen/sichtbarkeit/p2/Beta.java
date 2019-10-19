package grundlagen.sichtbarkeit.p2;

import grundlagen.sichtbarkeit.p1.Alpha;

public class Beta extends Alpha {

    void zugriffAufGeerbteAttribute() {
        this.publicVar = "Mit mir kann alles gemacht werden, daher per this-Instanzzugriff sowieso";
        this.protectedVar = "Ich werde paketübergreifend an die Instanz vererbt";
        // this.packagePrivateVar = "Cannot be accessed from outside package";
        // this.privateVar = "has private access";
    }

    void zugriffAufInstanzSuperKlasseAnderesPaket() {
        Alpha alpha = new Alpha();
        alpha.publicVar = "public ist sowieso public";
        // alpha.protectedVar = "has protected access";
        // alpha.packagePrivateVar = "Cannot be accessed from outside package";
        // alpha.privateVar = "has private access";
    }
}
