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
		// TODO Auto-generated method stub

	}

	@Override
	public Artikal vratiArtikal(int sifra) {
		// TODO Auto-generated method stub
		return null;
	}
}
