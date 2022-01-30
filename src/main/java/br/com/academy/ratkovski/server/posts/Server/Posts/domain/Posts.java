package br.com.academy.ratkovski.server.posts.Server.Posts.domain;/*
 * @created 30/01/2022 - 13:39
 * @project Server-posts
 * @author Ratkovski
 */

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Posts {

  private String userId;
  private String id;
  private String title;
  private String body;
}
