public class Opgave5 {

    /* Hvis du kører programmet får du en række fejl.
     * Fix programmet så det kan køre
     * outputtet bliver:
     * "7 is the smallest!"
     *
     *  OBS! Skriv hvad du har gjort som kommentar ud for hver linje du fixer
     */


    void main() {

        int a = 7, b = 42;

        /* minimum(a,b); denne har intet formål*/

        minimum(a,b);

        // !!! Fjernet hele if-statement i main og lagt prints ind i minimum-metoden.
        // Alt kaldes direkte fra metoden.

        /* if (minimum(a,b) == a) {    //if statement skal i parentes (rettet fra krølleparentes).
            //if statement kalder på minimum-metode i stedet for smaller-variabel (som ikke kunne tilgås)

            System.out.println(minimum(a,b) + " is the smallest!"); //den skal ikke skrive, at a er smallest, men derimod hente tallet fra minimum-metoden.
        } else if (minimum(a,b) == b) {
            System.out.println(minimum(a,b) + " is the smallest!");
        } else {
            System.out.println("They are equal");
        }

         */

    }

    int minimum(int a, int b) { //ændret metode fra void til int da den har en return til sidst.

        int smaller = 0; //int smaller skal deklareres før if-statement. Initialiseret for at den har en værdi.

        if (a < b) {

            smaller = a; //fjernet int, da smaller allerede er deklareret.
            System.out.println(a + " is the smallest!");

        } else if (a > b) { //ændret til else if og ændret til a > b i stedet for a >= b.

            smaller = b; //fjernet int, da smaller allerede er deklareret.
            System.out.println(b + " is the smallest!");

        } else { //Lavet else så den fanger scenarie hvor a og b er det samme.
            // Smaller får ikke en ny værdi.
            System.out.println("They are equal");
        }

        return smaller; //fjernet "int" før smaller fordi den allerede er blevet initialiseret.

    }
}
