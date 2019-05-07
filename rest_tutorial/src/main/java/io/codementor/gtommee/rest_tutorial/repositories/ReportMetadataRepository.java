package io.codementor.gtommee.rest_tutorial.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.codementor.gtommee.rest_tutorial.models.ReportMetadata;

public interface ReportMetadataRepository extends MongoRepository<ReportMetadata, String> {
	ReportMetadata findBy_id(String _id);
	

}
