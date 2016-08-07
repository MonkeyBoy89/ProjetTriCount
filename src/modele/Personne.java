package modele;

import java.util.Date;

public class Personne {
	private int id;
	private String nom;
	private String prenom;
	private int nbChromosome;
	private Date date;
	private float montant;

	public Personne() {
	}

	public Personne(String nom, String prenom, int nbChromosome, Date date, float montant) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.nbChromosome = nbChromosome;
		this.date = date;
		this.montant = montant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getNbChromosome() {
		return nbChromosome;
	}

	public void setNbChromosome(int nbChromosome) {
		this.nbChromosome = nbChromosome;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
