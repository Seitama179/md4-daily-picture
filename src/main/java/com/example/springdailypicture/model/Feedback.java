package com.example.springdailypicture.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Feedback {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        private String author;

        private int rating;

        private String comment;

        private LocalDate date;

        private int likes;

        public Feedback() {}

        public Feedback(Integer id, String author, int rating, String comment, LocalDate date, int likes) {
                this.id = id;
                this.author = author;
                this.rating = rating;
                this.comment = comment;
                this.date = date;
                this.likes = likes;
        }

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getAuthor() {
                return author;
        }

        public void setAuthor(String author) {
                this.author = author;
        }

        public int getRating() {
                return rating;
        }

        public void setRating(int rating) {
                this.rating = rating;
        }

        public String getComment() {
                return comment;
        }

        public void setComment(String comment) {
                this.comment = comment;
        }

        public LocalDate getDate() {
                return date;
        }

        public void setDate(LocalDate date) {
                this.date = date;
        }

        public int getLikes() {
                return likes;
        }

        public void setLikes(int likes) {
                this.likes = likes;
        }
}
