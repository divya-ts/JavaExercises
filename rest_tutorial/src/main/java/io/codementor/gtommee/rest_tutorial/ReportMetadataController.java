package io.codementor.gtommee.rest_tutorial;

import io.codementor.gtommee.rest_tutorial.models.ReportMetadata;
import io.codementor.gtommee.rest_tutorial.repositories.ReportMetadataRepository;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/reportmetadata")
public class ReportMetadataController {
	@Autowired
	private ReportMetadataRepository repository;

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ReportMetadata createReport(@Valid @RequestBody ReportMetadata reportmetadata) {

		if (reportmetadata.dateCreated != null ) {
			//LOGGER.info("Date is passed from request body");
		}
		else {
						
				reportmetadata.setDateCreated();
		}
		
		repository.save(reportmetadata);
		return reportmetadata;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<ReportMetadata> getAllReportMetadata() {
		return repository.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ReportMetadata getReportById(@PathVariable("id") String id) {
		return repository.findBy_id(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void modifyReportMetadataById(@PathVariable("id") String id,
			@Valid @RequestBody ReportMetadata reportmetadata) {
		reportmetadata.set_id(id);
		reportmetadata.setDateCreated();
		repository.save(reportmetadata);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteReport(@PathVariable String id) {
		repository.delete(repository.findBy_id(id));
	}
}