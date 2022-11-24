package com.blog.mapper;

import com.blog.dto.CommentDto;
import com.blog.entities.Comment;

import java.util.stream.Collectors;

public class CommentMapper {

    //Map Comment to commentDto
    public static CommentDto mapToCommentDto(Comment comment) {
      return  CommentDto.builder()
                .id(comment.getId())
                .name(comment.getName())
                .email(comment.getEmail())
                .content(comment.getContent())
                .createOn(comment.getCreatedOn())
                .updateOn(comment.getUpdateOn())
                .build();
    }
    public static Comment mapToComment(CommentDto commentDto){
        return Comment.builder()
                .id(commentDto.getId())
                .name(commentDto.getName())
                .email(commentDto.getEmail())
                .content(commentDto.getContent())
                .createdOn(commentDto.getCreateOn())
                .updateOn(commentDto.getUpdateOn())
                .build();
    }
}
