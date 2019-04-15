package com.voterapi.demo.dao.DaoImpl;


import com.voterapi.demo.config.Graphql;
import com.voterapi.demo.dao.CastVoteDao;
import com.voterapi.demo.models.CastVoteRequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CastVoteDaoImpl implements CastVoteDao {

    @Autowired
    Graphql graphql;

    @Override
    public boolean castVote(CastVoteRequestModel castVoteRequestModel) {
        //post vote
        //might be true
        //or
        //false

        String address = castVoteRequestModel.getAddress();
        String privatekey = castVoteRequestModel.getPrivatekey();
        graphql.getAddressDetails(privatekey,address);
        return false;
    }

    @Override
    public double countVote() {
        return 0;
    }

    @Override
    public boolean checkDoubleCast() {
        return false;
    }
}
