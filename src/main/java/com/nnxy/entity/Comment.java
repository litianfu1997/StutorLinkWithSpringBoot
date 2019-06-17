package com.nnxy.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author litianfu
 * @version 1.0
 * @email 1035869369@qq.com
 * @date 2019-06-10 18:14
 */
public class Comment implements Serializable {
    /**
     * 评论id
     */
    private Integer commentId;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 评论发布时间
     */
    private Date commentPutoutDate;
    /**
     * 评论内容
     */
    private String content;
    /**
     * 点赞
     */
    private int likeNum;
    /**
     * 是否被采纳
     */
    private boolean isNotAccept;

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", userId=" + userId +
                ", commentPutoutDate=" + commentPutoutDate +
                ", content='" + content + '\'' +
                ", likeNum=" + likeNum +
                ", isNotAccept=" + isNotAccept +
                '}';
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCommentPutoutDate() {
        return commentPutoutDate;
    }

    public void setCommentPutoutDate(Date commentPutoutDate) {
        this.commentPutoutDate = commentPutoutDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(int likeNum) {
        this.likeNum = likeNum;
    }

    public boolean isNotAccept() {
        return isNotAccept;
    }

    public void setNotAccept(boolean notAccept) {
        isNotAccept = notAccept;
    }

}
