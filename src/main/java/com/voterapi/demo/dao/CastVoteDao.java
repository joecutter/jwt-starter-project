package com.voterapi.demo.dao;

import com.voterapi.demo.models.CastVoteRequestModel;

public interface CastVoteDao {
    boolean castVote(CastVoteRequestModel castVoteRequestModel);
    double countVote();
    boolean checkDoubleCast();
}
