/*
 * Copyright COCKTAIL (www.asso-cocktail.fr), 1995, 2017 This software 
 * is governed by the CeCILL license under French law and abiding by the
 * rules of distribution of free software. You can use, modify and/or 
 * redistribute the software under the terms of the CeCILL license as 
 * circulated by CEA, CNRS and INRIA at the following URL 
 * "http://www.cecill.info". 
 * As a counterpart to the access to the source code and rights to copy, modify 
 * and redistribute granted by the license, users are provided only with a 
 * limited warranty and the software's author, the holder of the economic 
 * rights, and the successive licensors have only limited liability. In this 
 * respect, the user's attention is drawn to the risks associated with loading,
 * using, modifying and/or developing or reproducing the software by the user 
 * in light of its specific status of free software, that may mean that it
 * is complicated to manipulate, and that also therefore means that it is 
 * reserved for developers and experienced professionals having in-depth
 * computer knowledge. Users are therefore encouraged to load and test the 
 * software's suitability as regards their requirements in conditions enabling
 * the security of their systems and/or data to be ensured and, more generally, 
 * to use and operate it in the same conditions as regards security. The
 * fact that you are presently reading this means that you have had knowledge 
 * of the CeCILL license and that you accept its terms.
 */
package org.cocktail.macroservice.rest.server.wo;

import java.util.Collection;
import java.util.Collections;

import org.cocktail.fwkcktlrestservices.serveur.annotations.ControllerPath;
import org.cocktail.fwkcktlrestservices.serveur.annotations.ResponseBody;
import org.cocktail.fwkcktlrestservices.serveur.controllers.CktlRestController;
import org.cocktail.fwkcktlrestservices.serveur.model.CktlRestServiceDescription;

import com.webobjects.appserver.WORequest;

import er.rest.routes.jsr311.GET;
import er.rest.routes.jsr311.Path;

@ControllerPath("/test")
public class ControllerTest extends CktlRestController {

    public ControllerTest(WORequest request) {
        super(request);
    }

    @GET
    @Path("/hello")
    @ResponseBody
    public String hello() {
        return "Hello world!";
    }

    @Override
    public Collection<CktlRestServiceDescription> getServicesList() {
        return Collections.emptyList();
    }

}
