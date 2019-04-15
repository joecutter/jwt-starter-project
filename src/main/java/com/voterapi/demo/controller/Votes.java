package com.voterapi.demo.controller;

import com.voterapi.demo.dao.CastVoteDao;
import com.voterapi.demo.models.CastVoteRequestModel;
import com.voterapi.demo.models.CastVoteResponseModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/votes")
public class Votes {

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CastVoteDao castVoteDao;

    @PostMapping("/validate")
    @ResponseBody
    public CastVoteResponseModel castVote(@RequestBody CastVoteRequestModel castVoteRequestModel){
        log.info("CastVotes Called");
        castVoteDao.castVote(castVoteRequestModel);
        return new CastVoteResponseModel(200,"Successful");
    }

    @GetMapping("/")
    @ResponseBody
    public CastVoteResponseModel countVote(){
        castVoteDao.countVote();
        return new CastVoteResponseModel(200,"Successful");
    }
}
