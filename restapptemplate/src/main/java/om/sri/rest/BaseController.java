package om.sri.rest;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import om.sri.service.impl.PropertyFileUtilService;
public class BaseController {
	/**
	 * Property file access reference
	 */
	@Autowired
	protected transient PropertyFileUtilService propFileService;

	protected ResponseEntity<String> logError(Logger log, String message, Exception e, HttpStatus httpStatus) {
		log.error(e.getMessage(), e);
		return new ResponseEntity<>(message, httpStatus);
	}

}
