package magacin;

import artikli.Artikal;

public interface MagacinInterfejs {

	void dodajArtikal(Artikal artikal);
	void izbaciArtikal(Artikal artikal);
	Artikal vratiArtikal(int sifra);
}
