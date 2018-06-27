package com.ilkayaktas.springbootdatamongodb.repository;

import com.ilkayaktas.springbootdatamongodb.entity.PersistentData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by iaktas on 21.05.2018 at 16:53.
 */

@RepositoryRestResource(collectionResourceRel = "PersistentData", path = "persist") // The @RepositoryRestResource annotation is optional and is used to customize the REST endpoint. If we decided to omit it, Spring would automatically create an endpoint at “/websiteUsers” instead of “/users“.
public interface PersistentDataMongodbRepository extends MongoRepository<PersistentData, String> {
}
