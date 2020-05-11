package com.example.banking;

import com.example.banking.entity.AccountDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
// Spring Data Mongo
public interface AccountRepository extends MongoRepository<AccountDocument, String> {

}
