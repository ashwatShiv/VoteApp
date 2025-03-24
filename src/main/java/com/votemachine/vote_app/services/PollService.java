package com.votemachine.vote_app.services;

import com.votemachine.vote_app.model.Poll;
import org.springframework.stereotype.Service;
import com.votemachine.vote_app.repositories.PollRepository;

@Service
public class PollService {
    private final PollRepository pollRepository;

    public PollService(PollRepository pollRepository) {

        this.pollRepository = pollRepository;
    }


    public Poll createPoll(Poll poll){

        return pollRepository.save(poll);

    }

}
