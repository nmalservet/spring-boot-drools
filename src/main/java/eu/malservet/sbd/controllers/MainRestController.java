package eu.malservet.sbd.controllers;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import eu.malservet.sbd.domain.Patient;

@RestController
public class MainRestController {
	
	@Autowired
	private  KieContainer kieContainer;

	/**
	 * compute the age and if adult for a patient with a given birth date
	 * @param patient
	 * @return
	 */
	@PostMapping("/computeAge")
	private Patient computeAge(@RequestBody Patient patient) {
	    KieSession kieSession = kieContainer.newKieSession();
	    kieSession.insert(patient);
	    kieSession.fireAllRules();
	    kieSession.dispose();
	    return patient;
	}
}
