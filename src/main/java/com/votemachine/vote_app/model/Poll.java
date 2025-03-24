package com.votemachine.vote_app.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
//@Data
@NoArgsConstructor

public class Poll {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }


    private String question;
    public String getQuestion() {
        return question;
    }

    // Setter method
    public void setQuestion(String question) {
        this.question = question;
    }


    @ElementCollection
    private List<String> options=new ArrayList<>();
    public List<String> getOptions() {
        return options;
    }
    public void setOptions(List<String> options) {
        this.options = options;
    }



    @ElementCollection
    private List<Long> votes=new ArrayList<>();
    public List<Long> getVotes() {
        return votes;
    }

    // Setter method
    public void setVotes(List<Long> votes) {
        this.votes = votes;
    }




}
