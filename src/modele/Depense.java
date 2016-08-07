package modele;

import java.math.BigDecimal;
import java.util.List;

public class Depense {
	private int idDepense;
	private String libelleDepense;
	private BigDecimal montant;
	private Personne depenseur;
	private List<Personne> creanciers;

	public Depense(int idDepense, String libelleDepense, BigDecimal montant, Personne depenseur,
			List<Personne> creanciers) {
		super();
		this.idDepense = idDepense;
		this.libelleDepense = libelleDepense;
		this.montant = montant;
		this.depenseur = depenseur;
		this.creanciers = creanciers;
	}

	public int getIdDepense() {
		return idDepense;
	}

	public void setIdDepense(int idDepense) {
		this.idDepense = idDepense;
	}

	public BigDecimal getMontant() {
		return montant;
	}

	public void setMontant(BigDecimal montant) {
		this.montant = montant;
	}

	public Personne getDepenseur() {
		return depenseur;
	}

	public void setDepenseur(Personne depenseur) {
		this.depenseur = depenseur;
	}

	public List<Personne> getCreanciers() {
		return creanciers;
	}

	public void setCreanciers(List<Personne> creanciers) {
		this.creanciers = creanciers;
	}

	public String getLibelleDepense() {
		return libelleDepense;
	}

	public void setLibelleDepense(String libelleDepense) {
		this.libelleDepense = libelleDepense;
	}

}
