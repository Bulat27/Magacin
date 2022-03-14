package magacin.implementacija;

import java.util.List;

import artikli.Artikal;
import magacin.MagacinInterfejs;

public class Magacin implements MagacinInterfejs {

	private List<Artikal> artikli;

	@Override
	public void dodajArtikal(Artikal artikal) {
		boolean nasao = false;

		for (Artikal a : artikli) {
			if (a.equals(artikal)) {
				a.setKolicina(a.getKolicina() + 1);
				nasao = true;
			}
		}

		if (!nasao)
			artikli.add(artikal);
	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		for (Artikal a : artikli) {
			if (a.equals(artikal)) {
				a.setKolicina(a.getKolicina() - 1);
			}
		}
	}

	@Override
	public Artikal vratiArtikal(int sifra) {
		for (Artikal a : artikli) {
			if (a.getSifra() == sifra) {
				return a;
			}
		}
		return null;
	}
}
