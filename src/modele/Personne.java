package modele;

import java.util.Date;

public class Personne 
{
	private int id;
	private String nom;
	private String prenom;
	private int nbChromose;
	private Date date;
	private float montant;
	
	public Personne() {}
	
	public Personne(String nom, String prenom, int nbChromose, Date date, float montant) 
	{
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.nbChromose = nbChromose;
		this.date = date;
		this.montant = montant;
	}
	
	public String getNom() 
	{
		return nom;
	}
	public void setNom(String nom) 
	{
		this.nom = nom;
	}
	public String getPrenom() 
	{
		return prenom;
	}
	public void setPrenom(String prenom) 
	{
		this.prenom = prenom;
	}
	public int getNbChromose() 
	{
		return nbChromose;
	}
	public void setNbChromose(int nbChromose) 
	{
		this.nbChromose = nbChromose;
	}
	public Date getDate() 
	{
		return date;
	}
	public void setDate(Date date) 
	{
		this.date = date;
	}
	public float getMontant() 
	{
		return montant;
	}
	public void setMontant(float montant) 
	{
		this.montant = montant;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
}
