package com.ilkayaktas.springbootdatamongodb.repository;

import com.ilkayaktas.springbootdatamongodb.entity.PersistentData;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by aselsan on 23.05.2018 at 14:39.
 */

public interface PersistentDataPostgresqlRepository extends JpaRepository<PersistentData, String> {
}
