package br.com.academy.ratkovski.server.posts.Server.Posts.dto;/*
 * @created 30/01/2022 - 13:39
 * @project Server-posts
 * @author Ratkovski
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PostsDto {
  @JsonProperty
  private String userId;
  @JsonProperty
  private String id;
  @JsonProperty
  private String title;
  @JsonProperty
  private String body;
}
