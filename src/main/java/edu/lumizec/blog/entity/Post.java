package edu.lumizec.blog.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String postName;

    @Column(length = 5000)
    private String postContent;

    private String img;

    private String postedBy;

    private int likeCount;

    private int viewCount;
}
