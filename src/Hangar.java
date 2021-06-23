import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hangar {
	int Hoogte;
	int Breedte;
	boolean BomberPlanSafe;

	public Hangar(int hoogte, int breedte, boolean BomberPlanSafe) {
		this.Hoogte = hoogte;
		this.Breedte = breedte;
		this.BomberPlanSafe = BomberPlanSafe;
	}

	public Hangar() {

	}

	Map map = new HashMap();

	public void fitsPlane(List<Plane> planes, List<Hangar> hangaren) {

		String naamPlane = null;
		int naamHangar = 0;
		for (Plane Vliegtuig : planes) {
			for (Hangar hangar : hangaren) {
				if (hangar.Breedte > Vliegtuig.BreedteVleugelSpanwijdte) {

					naamHangar = hangaren.indexOf(hangar);
					naamPlane = Vliegtuig.Naam;
					map.put(naamHangar, naamPlane);
				}
			}
		}
		System.out.println("deze passen");
		System.out.println(map);

	}
}
