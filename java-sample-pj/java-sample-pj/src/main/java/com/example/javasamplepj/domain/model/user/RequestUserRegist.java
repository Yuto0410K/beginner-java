package com.example.javasamplepj.domain.model.user;

import lombok.Data;

@Data
public class RequestUserRegist {
  // ユーザ名
  private String userName;
  // パスワード
  private String password;
  // メールアドレス
  private String mailAddress;
}