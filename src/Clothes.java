
public class Clothes {
	
	String category;
	String brand;
	String color;
	String season;
	
	public Clothes() {
		
	}
	public Clothes(String category, String brand) {
		this.category = category;
		this.brand = brand;
	}
	
	public Clothes(String category, String brand, String color, String season) {
		this.category = category;
		this.brand = brand;
		this.color = color;
		this.season = season;
	}
	
	public void printInfo() {
		System.out.println("category: "+category);
		System.out.println("brand: "+brand);
		System.out.println("color: "+color);
		System.out.println("season: "+season);
	}

}
