package org.example.soap;

import org.example.soapintegration.GetScoreRequest;
import org.example.soapintegration.GetScoreResponse;
import org.example.soapintegration.Score;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ScoreEndpoint {

    @PayloadRoot(namespace = "http://www.soapintegration.example.org/", localPart = "getScoreRequest")
    @ResponsePayload
    public GetScoreResponse getScore(@RequestPayload GetScoreRequest request) {

        Score score = new Score();
        if (request.getUser().equals("admin")) {
            score.setWins(100);
        } else  {
            score.setWins(99);
            score.setLosses(66);
            score.setTies(7);
        }

        GetScoreResponse response = new GetScoreResponse();
        response.setScore(score);

        return response;
    }
}
