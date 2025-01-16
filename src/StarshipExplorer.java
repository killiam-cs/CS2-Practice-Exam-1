public class StarshipExplorer {

    // variable declaration section
    private String alienLanguage = "Vrlnq*T xm!ow b*aF#nmpq*k^s jfy*e* *m&xlqw*e tT@br* lm*t oT%*ovnzr* oY#rwqs*y uo@L*oe^t aE!wqlm*u*r aD@rzxs* eB&vnyp Rlkzx*l W tnl@qp*e eXm*a#kyr*d aM^yplw o*e&mnbs*r eI!k*,srn* pC#txry*B cO@pb*elm Hlmpq*y P tn!*ojlwl rE#kxtm*n eF^l*cqrx tO&wtnq*e fC*!xtpm oK#xrnl nT@klpm cT@vrqp";
    public Alien[] aliens;

    public static void main(String[] args) {
        StarshipExplorer ship = new StarshipExplorer();
    }

    public StarshipExplorer() {
        System.out.println("Hello world! Good luck on your exams!");
        aliens = new Alien[50];
        for (int i = 0; i < 50; i++) {
            // Math.random() gives a decimal b/n 0-1
            int energy = (int) (Math.random() * 75 + 1);
            int hostility = (int) (Math.random() * 101);
            aliens[i] = new Alien(energy, hostility);
        }
        displayAliens();
        boolean c = checkEnergy();
        System.out.println("It is " + c + " that two aliens have the same energy level.");
        decipher(alienLanguage);
    } // end of constructor
    public void displayAliens() {
        for (int i = 0; i < aliens.length; i++) {
            aliens[i].printInfo();
        }
    }

    public boolean checkEnergy() {
        // check whether at least two energyLevel
        // values in the aliens array are equal
        boolean sameEnergy = false;

        // check whether aliens[0] energy is the same as anyone else
        for (int x = 0; x < aliens.length; x++) {
            for (int i = 0; i < aliens.length; i++) {
                if (aliens[i].getEnergyLevel() == aliens[x].getEnergyLevel() && (i != x)) {
                    sameEnergy = true;
//                    System.out.println("aliens[" + i + "] energy: " + aliens[i].getEnergyLevel());
//                    System.out.println("aliens[" + x + "] energy: " + aliens[x].getEnergyLevel());
                }
            }
        }

        // return true if at least two alien energy levels are equal.
        // Otherwise, return false
        if (sameEnergy == true) {
            return true;
        }
        else {
            return false;
        }
    } // end of checkEnergy

    public String decipher(String languageSample) {
        String decodedString = "";
        // find each character that appears directly after a “*” character
        System.out.println(languageSample);
        // indexOf, contains, substring
        int al = languageSample.indexOf("*") + 1;
        while (al != 0) {
            String sub = languageSample.substring(al, al + 1);
            decodedString += sub;
            al = languageSample.indexOf("*", al) + 1;
        }
        System.out.println(decodedString);

        return decodedString;
    }

}