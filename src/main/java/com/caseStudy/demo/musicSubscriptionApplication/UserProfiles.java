package com.caseStudy.demo.musicSubscriptionApplication;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.SpringApplication;

@Entity
public class UserProfiles {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long userid;
     private String playlistHistory;
     private String listens;
     private String genres;
     private String playlist;

     public String getPlaylist() {
          return playlist;
     }

     public void setPlaylist(String playlist) {
          this.playlist = playlist;
     }

     public Long getUserid() {
          return userid;
     }

     public void setUserid(Long userid) {
          this.userid = userid;
     }

     public String getPlaylistHistory() {
          return playlistHistory;
     }

     public void setPlaylistHistory(String playlistHistory) {
          this.playlistHistory = playlistHistory;
     }

     public String getListens() {
          return listens;
     }

     public void setListens(String listens) {
          this.listens = listens;
     }

     public String getGenres() {
          return genres;
     }

     public void setGenres(String genres) {
          this.genres = genres;
     }
}
