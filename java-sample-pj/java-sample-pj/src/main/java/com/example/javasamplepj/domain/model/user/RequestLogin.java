package com.example.javasamplepj.domain.model.user;

import lombok.Data;

@Data
public class RequestLogin {
  // メールアドレス
  private String mailAddress;
  // パスワード
  private String password;
}