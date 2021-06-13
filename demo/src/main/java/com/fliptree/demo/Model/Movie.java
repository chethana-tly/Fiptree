package com.fliptree.demo.Model;

import java.sql.Date;
 
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Movie {
    @Id
    Integer movie_id;
    String title;
    String phase;
    String category_name;
    Number release_year;
    Number running_time;
    String rating_name;
    String disc_format_name;
    Integer number_discs;
    String viewing_format_name;
    String aspect_ratio_name;
    String status;
    Date release_date;
    Number budget;
    Number gross;
    Date time_stamp;

    public Integer getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(Integer movie_id) {
        this.movie_id = movie_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    @JsonProperty("releaseyear")
    public Number getRelease_year() {
        return release_year;
    }

    public void setRelease_year(Number release_year) {
        this.release_year = release_year;
    }

    public Number getRunning_time() {
        return running_time;
    }

    public void setRunning_time(Number running_time) {
        this.running_time = running_time;
    }

    public String getRating_name() {
        return rating_name;
    }

    public void setRating_name(String rating_name) {
        this.rating_name = rating_name;
    }

    public String getDisc_format_name() {
        return disc_format_name;
    }

    public void setDisc_format_name(String disc_format_name) {
        this.disc_format_name = disc_format_name;
    }

    public Integer getNumber_discs() {
        return number_discs;
    }

    public void setNumber_discs(Integer number_discs) {
        this.number_discs = number_discs;
    }

    public String getViewing_format_name() {
        return viewing_format_name;
    }

    public void setViewing_format_name(String viewing_format_name) {
        this.viewing_format_name = viewing_format_name;
    }

    public String getAspect_ratio_name() {
        return aspect_ratio_name;
    }

    public void setAspect_ratio_name(String aspect_ratio_name) {
        this.aspect_ratio_name = aspect_ratio_name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public Number getBudget() {
        return budget;
    }

    public void setBudget(Number budget) {
        this.budget = budget;
    }

    public Number getGross() {
        return gross;
    }

    public void setGross(Number gross) {
        this.gross = gross;
    }

    public Date getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(Date time_stamp) {
        this.time_stamp = time_stamp;
    }

 

}