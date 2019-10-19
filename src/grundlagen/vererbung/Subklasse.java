package grundlagen.vererbung;

public class Subklasse extends Superklasse {

    void direkterZugriffAufGeerbteAttribute() {
        publicVar = "Public vererbt";
        protectedVar = "Protected vererbt";
        packagePrivateVar = "Package vererbt";
        // privateVar = "Private nicht an Subklasse vererbt, daher nicht direkt zugreifbar";
    }

    /**
     * Indirekter Zugriff auf die private Variable über Methode ist möglich,
     * da die private Instanzvariable in der Instanz der umgebenden Klasse existieren muss.
     */
    void indirekterZugriffAufPrivateAttribut() {
        setPrivateVar("Indirekter Zugriff"); // Schreiben
        System.out.println(getPrivateVar()); // Lesen
    }

}
