package com.example.javasamplepj.domain.model.user;

import lombok.Data;

@Data
public class ResponseLogin {
  // ステータス
  private String status;
  // ユーザID
  private String userId;
  // ユーザ名
  private String userName;
  // メールアドレス
  private String mailAddress;
}