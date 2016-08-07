package modele;

import java.math.BigDecimal;
import java.util.List;

public class Depense 
{
	private int idDepense;
	private BigDecimal montant;
	private Personne depenseur;
	private List<Personne> creanciers;
	
	
	
	public int getIdDepense() 
	{
		return idDepense;
	}
	
	public void setIdDepense(int idDepense) 
	{
		this.idDepense = idDepense;
	}
	
	public BigDecimal getMontant() 
	{
		return montant;
	}
	
	public void setMontant(BigDecimal montant) 
	{
		this.montant = montant;
	}
	
	public Personne getDepenseur() 
	{
		return depenseur;
	}
	
	public void setDepenseur(Personne depenseur) 
	{
		this.depenseur = depenseur;
	}
	
	public List<Personne> getCreanciers() 
	{
		return creanciers;
	}
	
	public void setCreanciers(List<Personne> creanciers) 
	{
		this.creanciers = creanciers;
	}
	
}
