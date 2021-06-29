
public class PhoneTest {
	public static void main(String[] args) {
		//Create new phones with it's values:
		Galaxy S = new Galaxy("S21", 100, "Exynos", "Designed for");
		IPhone iphoneTwelve = new IPhone("iPhone 12", 96, "Bionic", "Mas alla de la velocidad");
		
		//Details of OnePlus 7 Pro:
		S.displayInfo();
		System.out.println(S.ring());
		System.out.println(S.unlock());
		System.out.println();
		
		//Details of iPhone 11:
		iphoneTwelve.displayInfo();
		System.out.println(iphoneTwelve.ring());
		System.out.println(iphoneTwelve.unlock());
	}
}
