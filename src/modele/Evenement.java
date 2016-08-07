package modele;

import java.util.List;

import modele.Depense;
import modele.Personne;

public class Evenement {

	private int idEvenement;
	private String libelleEvenement;
	private List<Depense> listeDepense;
	private List<Personne> listeParticipants;

	public Evenement(int idEvenement, String libelleEvenement, List<Depense> listeDepense,
			List<Personne> listeParticipants) {
		super();
		this.idEvenement = idEvenement;
		this.libelleEvenement = libelleEvenement;
		this.listeDepense = listeDepense;
		this.listeParticipants = listeParticipants;
	}

	public int getIdEvenement() {
		return idEvenement;
	}

	public void setIdEvenement(int idEvenement) {
		this.idEvenement = idEvenement;
	}

	public String getLibelleEvenement() {
		return libelleEvenement;
	}

	public void setLibelleEvenement(String libelleEvenement) {
		this.libelleEvenement = libelleEvenement;
	}

	public List<Depense> getListeDepense() {
		return listeDepense;
	}

	public void setListeDepense(List<Depense> listeDepense) {
		this.listeDepense = listeDepense;
	}

	public List<Personne> getListeParticipants() {
		return listeParticipants;
	}

	public void setListeParticipants(List<Personne> listeParticipants) {
		this.listeParticipants = listeParticipants;
	}

}
