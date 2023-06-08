package com.example.myalbums.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="album_id")
    private Long id;

    private String userName;
    private String userID;
    private String userPW;
    private LocalDate createdDate;
    private LocalDate loginDate;

    @OneToMany(mappedBy = "album_id")
    private List<Albums> albums = new ArrayList<>();

} // member entity