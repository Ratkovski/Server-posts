package br.com.academy.ratkovski.server.posts.Server.Posts.controller;/*
 * @created 30/01/2022 - 13:39
 * @project Server-posts
 * @author Ratkovski
 */

import br.com.academy.ratkovski.server.posts.Server.Posts.dto.PostDtoFactory;
import br.com.academy.ratkovski.server.posts.Server.Posts.dto.PostsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostsController {
  @GetMapping("{userId}")
  public ResponseEntity<PostsDto> consutaServer(@PathVariable String userId){
    PostsDto postsDto = PostDtoFactory.obtemPost(userId);
    return ResponseEntity.ok().body(postsDto);


  }



}
