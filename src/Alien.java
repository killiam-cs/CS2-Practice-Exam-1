public class Alien {

    private int energyLevel;
    private int hostilityIndex;

    public Alien(int energyLevel, int paramHostilityIndex) {
        this.energyLevel = energyLevel;
        this.hostilityIndex = paramHostilityIndex;
    } // end of constructor

    public int getEnergyLevel() {
        return energyLevel;
    }
    public void setEnergyLevel(int paramEnergy) {
        this.energyLevel = paramEnergy;
    }
    public int getHostilityIndex() {
        return hostilityIndex;
    }
    public void setHostilityIndex(int paramHostility) {
        hostilityIndex = paramHostility;
        // this.hostilityIndex = paramHostility
    }
    public void printInfo() {
        System.out.println("Energy: " + energyLevel +
                ", Hostility: " + hostilityIndex);
    }

}
