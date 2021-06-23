
public class Plane {
	public String Naam;
	public int Vluchtplafond;
	public int Stuwkracht;
	public int BreedteVleugelSpanwijdte;
	public int Lengte;
	public static int aantal = 0;

	public Plane(String Naam, int Vluchtplafond, int Stuwkracht, int BreedteVleugelSpanWijdte, int Lengte) {
		this.Naam = Naam;
		this.Vluchtplafond = Vluchtplafond;
		this.Stuwkracht = Stuwkracht;
		this.BreedteVleugelSpanwijdte = BreedteVleugelSpanWijdte;
		this.Lengte = Lengte;
		aantal++;
	}

	public Plane() {
		aantal++;
	}
}
