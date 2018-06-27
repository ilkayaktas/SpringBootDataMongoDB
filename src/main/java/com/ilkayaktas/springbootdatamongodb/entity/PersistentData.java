package com.ilkayaktas.springbootdatamongodb.entity;

import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by iaktas on 21.05.2018 at 16:51.
 */

@ToString
@Document(collection = "PersistentData")
public class PersistentData {
    @Id
    public String id;

    public String name;

    public String surname;
}
