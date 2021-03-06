package com.nick.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReplyComment {
    private int id;
    private int commentId;
    private String content;
    private int fromId;
    private int toId;
    private Timestamp releaseDateTime;
    private int likeCount;
}
