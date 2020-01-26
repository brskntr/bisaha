package com.bisaha.cbd;


import com.bisaha.cbd.model.LiveScore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("")
    public String hello(){
        return "Hello bisaha app.";
    }

    @GetMapping("/second")
    public String helloSecond(){
        return "Hello Second controoler.";
    }


    @GetMapping("/liveScores")
    public List<LiveScore>  liveScores(){
        return createDummyScores();
    }

    public  List<LiveScore> createDummyScores(){
        List<LiveScore> scores = new ArrayList<>();
        LiveScore score1 = new LiveScore();
        score1.setHome("Arsenal");
        score1.setAway("Chelsea");
        score1.setHomeScore("2");
        score1.setAwayScore("1");
        score1.setTime("75");
        scores.add(score1);

        LiveScore score2 = new LiveScore();
        score2.setHome("Livepool");
        score2.setAway("Man Utd");
        score2.setHomeScore("4");
        score2.setAwayScore("2");
        score2.setTime("89");
        scores.add(score2);

        LiveScore score3 = new LiveScore();
        score3.setHome("Leichester");
        score3.setAway("Man City");
        score3.setHomeScore("1");
        score3.setAwayScore("3");
        score3.setTime("64");
        scores.add(score3);

        return scores;
    }
}
