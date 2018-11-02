package com.stackroute.ChallangeCreator.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Document
@Data
@NoArgsConstructor
@Builder
public class Challange {

    @Id
    private int id ;
    @NotNull
    private String challangeTitle,challangeDescription,challangeStatement,inputFormat,programmingLang,solutionUrl;

    private double maxScore,maxRuntime,level,rating;

    public Challange(int id, String challangeTitle, String challangeDescription, String challangeStatement, String inputFormat, String programmingLang, String solutionUrl, double maxScore, double maxRuntime, double level, double rating) {
        this.id = id;
        this.challangeTitle = challangeTitle;
        this.challangeDescription = challangeDescription;
        this.challangeStatement = challangeStatement;
        this.inputFormat = inputFormat;
        this.programmingLang = programmingLang;
        this.solutionUrl = solutionUrl;
        this.maxScore = maxScore;
        this.maxRuntime = maxRuntime;
        this.level = level;
        this.rating = rating;
    }
}
