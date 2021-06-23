
public class BomberPlane extends Plane {
	int AantalBommen;

	public BomberPlane(String Naam, int Vluchtplafond, int Stuwkracht, int BreedteVleugelSpanWijdte, int Lengte,
			int AantalBommen) {
		super(Naam, Vluchtplafond, Stuwkracht, BreedteVleugelSpanWijdte, Lengte);
		this.AantalBommen = AantalBommen;

	}

	public BomberPlane() {
		super();
	}
}
