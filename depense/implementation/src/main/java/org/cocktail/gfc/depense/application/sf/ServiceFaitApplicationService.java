package org.cocktail.gfc.depense.application.sf;

import javax.inject.Named;
import javax.inject.Singleton;
import javax.transaction.Transactional;

@Named
@Singleton
@Transactional(rollbackOn = Exception.class)
public class ServiceFaitApplicationService {

}
