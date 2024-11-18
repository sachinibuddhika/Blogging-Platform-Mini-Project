package com.miniProject2.blogServer.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;


@Entity
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Column(length = 5000)
    private String content;
    private String postedBy;
    private String img;
    private Date date;
    private int likeCount;
    private int viewCount;
    @ElementCollection
   private List<String> tags;
}
