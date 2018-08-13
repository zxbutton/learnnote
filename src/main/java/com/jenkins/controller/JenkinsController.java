package com.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zxbutton on 2018/8/13.
 * 用来测试Jenkins实例
 */
@RestController
public class JenkinsController {

  @GetMapping("/index")
  private String index() {
    return "Index！！";
  }
}
