package com.ilkayaktas.springbootdatamongodb.rest;

import com.ilkayaktas.springbootdatamongodb.entity.PersistentData;
import com.ilkayaktas.springbootdatamongodb.repository.PersistentDataMongodbRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by iaktas on 21.05.2018 at 17:06.
 */

@RepositoryRestController // if you use @RestController, auto generated rest method are dismissed.
public class PersistentDataController {

    private Logger logger = LoggerFactory.getLogger("MessageTransferServer");

    @Autowired
    PersistentDataMongodbRepository persistentDataMongodbRepository;

    @RequestMapping(value = "/persist", method = RequestMethod.POST)
    public ResponseEntity<PersistentData> savePersistentData(@RequestBody PersistentData persistentData){
        logger.info("PersistenData"+" persistent:"+persistentData.toString());

        persistentDataMongodbRepository.save(persistentData);
        return new ResponseEntity<>(persistentData, HttpStatus.OK);
    }
}
