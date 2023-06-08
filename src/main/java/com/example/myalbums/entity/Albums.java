package com.example.myalbums.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@Table(name="albums", schema="photo_album", uniqueConstraints = {@UniqueConstraint(columnNames = "album_id")})
public class Albums {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="album_id")
    private Long id;

    @Column
    private String albumName;

    @Column
    private LocalDate createdDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="member_id")
    private Member member;

    @OneToMany(mappedBy = "picture_id")
    private List<Pictures> pictures = new ArrayList<>();

} // albums entity