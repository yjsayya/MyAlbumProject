package com.example.myalbums.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter @Setter
public class Pictures {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="picture_id")
    private Long id;

    @Column
    private String picName;

    @Column
    private String picThumbUrl;

    @Column
    private LocalDate picUploadDate;

    @Column
    private int picSize;

    @Column
    private String picOriginalUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="album_id")
    private Albums albums;

} // pictures entity