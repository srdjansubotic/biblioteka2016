package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {

	private LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();

	public void dodajKnjigu(Knjiga knjiga) {

		knjige.add(knjiga);

	}

	public void obrisiKnjigu(Knjiga knjiga) {

		knjige.remove(knjiga);

	}

	public LinkedList<Knjiga> vratiSveKnjige() {

		return knjige;

	}

	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, long isbn, String naslov, String izdavac) {
		LinkedList<Knjiga> rezultat = new LinkedList<Knjiga>();

		for (int i = 0; i < knjige.size(); i++) {
			if (knjige.get(i).getNaslov().contains(naslov)) {
				rezultat.add(knjige.get(i));
			}
		}

		return rezultat;
	}

}
