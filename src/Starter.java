import java.util.ArrayList;

import java.util.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Starter {
	public static List<Plane> planes = new ArrayList<Plane>();
	public static List<Hangar> hangaren = new ArrayList<Hangar>();
	File myObj = new File("output.txt");

	public static void main(String[] args) {
		Plane Plane1 = new Plane("F16", 4500, 420, 18, 32);
		Plane Plane2 = new Plane("F36", 3800, 320, 25, 38);
		Plane Plane3 = new Plane("F31", 3500, 340, 16, 26);
		Plane Plane4 = new Plane("C230", 2500, 520, 45, 38);
		Plane Plane5 = new Plane("Boeing", 3400, 510, 45, 32);
		Plane Plane6 = new Plane("Boeing374", 3800, 500, 43, 30);
		Plane Plane7 = new Plane("Boeing375", 3600, 490, 42, 33);
		BomberPlane Plane8 = new BomberPlane("Spirit Stealht Bomber2", 4800, 560, 21, 36, 18);
		BomberPlane Plane9 = new BomberPlane("Spirit Stealht Bomber3", 4600, 540, 23, 34, 25);
		BomberPlane Plane10 = new BomberPlane();
		Plane10.Naam = "Spirit Stealht Bomber4";
		Plane10.Vluchtplafond = 5000;
		Plane10.Stuwkracht = 530;
		Plane10.BreedteVleugelSpanwijdte = 25;
		Plane10.Lengte = 34;
		Plane10.AantalBommen = 23;
		Starter s = new Starter();
		planes.add(Plane1);
		planes.add(Plane2);
		planes.add(Plane3);
		planes.add(Plane4);
		planes.add(Plane5);
		planes.add(Plane6);
		planes.add(Plane7);
		planes.add(Plane8);
		planes.add(Plane9);
		planes.add(Plane10);
		s.VluchPlafondBerekenen();
		s.maximumStuw();
		s.minimumLengte();

		Hangar h = new Hangar();
		Hangar hangar1 = new Hangar(20, 10, false);
		Hangar hangar2 = new Hangar(25, 15, true);
		Hangar hangar3 = new Hangar(21, 11, false);
		Hangar hangar4 = new Hangar(19, 12, true);
		Hangar hangar5 = new Hangar(15, 13, false);
		Hangar hangar6 = new Hangar(30, 14, false);
		Hangar hangar7 = new Hangar(28, 16, true);
		Hangar hangar8 = new Hangar(26, 17, false);
		Hangar hangar9 = new Hangar(24, 18, false);
		Hangar hangar10 = new Hangar(26, 19, true);
		Hangar hangar11 = new Hangar(22, 20, false);
		Hangar hangar12 = new Hangar(23, 26, true);
		Hangar hangar13 = new Hangar(29, 21, false);
		Hangar hangar14 = new Hangar(30, 23, false);
		Hangar hangar15 = new Hangar(27, 22, true);

		hangaren.add(hangar1);
		hangaren.add(hangar2);
		hangaren.add(hangar3);
		hangaren.add(hangar4);
		hangaren.add(hangar5);
		hangaren.add(hangar6);
		hangaren.add(hangar7);
		hangaren.add(hangar8);
		hangaren.add(hangar9);
		hangaren.add(hangar10);
		hangaren.add(hangar11);
		hangaren.add(hangar12);
		hangaren.add(hangar13);
		hangaren.add(hangar14);
		hangaren.add(hangar15);
		h.fitsPlane(planes, hangaren);
		s.aantal();
	}

	public void VluchPlafondBerekenen() {
		int total = 0;
		for (Plane Vliegtuig : planes) {
			total = total + Vliegtuig.Vluchtplafond;
		}
		try {
			FileWriter myWriter = new FileWriter("output.txt", true);
			myWriter.write("Het gemiddelde is: " + total / 10 + "\n");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

	public void maximumStuw() {
		double max = Double.NEGATIVE_INFINITY;
		String naam = null;
		for (Plane Vliegtuig : planes) {
			max = Math.max(max, Vliegtuig.Stuwkracht);
			int maximum = (int) max;
			if (Vliegtuig.Stuwkracht >= maximum) {
				naam = Vliegtuig.Naam;
			}
		}
		try {
			FileWriter myWriter = new FileWriter("output.txt", true);
			myWriter.write("maximum stuwkracht is: " + max + "\n");
			myWriter.write("Naam vliegtuig: " + naam + "\n");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

	public void minimumLengte() {
		double min = Double.POSITIVE_INFINITY;
		String naam = null;
		for (Plane Vliegtuig : planes) {
			min = Math.min(min, Vliegtuig.Lengte);
			int minimum = (int) min;
			if (Vliegtuig.Lengte >= minimum) {
				naam = Vliegtuig.Naam;
			}
		}
		try {
			FileWriter myWriter = new FileWriter("output.txt", true);
			myWriter.write("minimum lengte is: " + min + "\n");
			myWriter.write("Naam vliegtuig: " + naam + "\n");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

	public void aantal() {
		System.out.println("aantal vliegtuigen in totaal: " + Plane.aantal);
	}
}
