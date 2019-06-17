package com.nnxy.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author litianfu
 * @version 1.0
 * @email 1035869369@qq.com
 * @date 2019-06-10 18:07
 */
public class Board implements Serializable {
    /**
     * 牌令Id
     */
    private Integer boardId;
    /**
     * 用户Id
     */
    private Integer userId;
    /**
     * 牌令标题
     */
    private String title;
    /**
     * 牌令内容
     */
    private String content;
    /**
     * 牌令发布日期
     */
    private Date boardPutoutDate;
    /**
     * 点赞数
     */
    private int likeNum;
    /**
     * 评论数
     */
    private int commentNum;

    @Override
    public String toString() {
        return "Board{" +
                "boardId=" + boardId +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", boardPutoutDate=" + boardPutoutDate +
                ", likeNum=" + likeNum +
                ", commentNum=" + commentNum +
                '}';
    }

    public Integer getBoardId() {
        return boardId;
    }

    public void setBoardId(Integer boardId) {
        this.boardId = boardId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getBoardPutoutDate() {
        return boardPutoutDate;
    }

    public void setBoardPutoutDate(Date boardPutoutDate) {
        this.boardPutoutDate = boardPutoutDate;
    }

    public int getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(int likeNum) {
        this.likeNum = likeNum;
    }

    public int getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(int commentNum) {
        this.commentNum = commentNum;
    }
}
