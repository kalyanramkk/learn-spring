package org.kalyan.learnspring.scope.cdi;

import javax.inject.Inject;
import javax.inject.Named;


@Named
public class SomeCdiBusiness {
	
	@Inject
	SomeCdiDAO someCdiDAO;

	public SomeCdiDAO getSomeCdiDAO() {
		return someCdiDAO;
	}

	public void setSomeCdiDAO(SomeCdiDAO someCdiDAO) {
		this.someCdiDAO = someCdiDAO;
	}
	
	

}
//CDI is Java EE Standard