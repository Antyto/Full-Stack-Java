
public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	System.out.print("Galaxy " + getVersionNumber() + " dice ");
    	return getRingTone();
    }
    @Override
    public String unlock() {
    	return "Desbloqueo via huella digital";
    }
    @Override
    public void displayInfo() {
    	System.out.println("Galaxy A1 " + getVersionNumber() + " desde " + getCarrier() + " tiene un " + getBatteryPercentage() + "% de bateria."); 
    }
}
