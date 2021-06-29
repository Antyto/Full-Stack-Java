
public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    @Override
    public String ring() {
    	 System.out.print("iPhone " + getVersionNumber() + " dice ");
         return getRingTone();
    }
    
    @Override
    public String unlock() {
    	 return "Reconocimiento facial completo, desbloqueado";
    }
    
    @Override
    public void displayInfo() {
    	System.out.println("iPhone " + getVersionNumber() + " desde " + getCarrier() + " tiene un " + getBatteryPercentage() + "% de bateria.");
    }
}
    
