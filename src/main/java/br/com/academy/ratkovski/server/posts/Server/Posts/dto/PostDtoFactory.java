package br.com.academy.ratkovski.server.posts.Server.Posts.dto;/*
 * @created 30/01/2022 - 13:46
 * @project Server-posts
 * @author Ratkovski
 */

public class PostDtoFactory {
  public static PostsDto obtemPost(String userId){
    PostsDto  postsDto = new PostsDto(userId,userId, "Titulo", "um body");
    return postsDto;

  }
}
