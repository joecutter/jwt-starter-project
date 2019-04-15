package com.voterapi.demo.config;

import com.voterapi.demo.models.Account;
import com.voterapi.demo.models.AccountRequestModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Graphql {

    Logger log = LoggerFactory.getLogger(this.getClass());
    String URL = "https://api.aion-graphql.com/graphql";

    RestTemplate restTemplate = new RestTemplate();


    public ResponseEntity getAddressDetails(String privatekey, String address){
        try{
            AccountRequestModel accountRequestModel = new AccountRequestModel(address,privatekey);
            ResponseEntity<Account> response = restTemplate.postForEntity(URL, accountRequestModel, Account.class);

            if(response.getStatusCode().equals(HttpStatus.OK)){
                log.info("Connection to AION NETWORK ESTABLISHED");
            }else{
                log.info("Connection to AION NETWORK FAILED");
            }

            return response;
        }catch (Exception ex){

        }

        return null;
    }
}
