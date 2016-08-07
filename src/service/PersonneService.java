package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IPersonneDao;
import modele.Personne;

@Service
public class PersonneService implements IPersonneService {

	@Autowired
	IPersonneDao personneDao;
	
	@Override
	public Personne getPersonne(int idPersonne) {
		personneDao.getPersonne(idPersonne);
		return null;
	}

}
