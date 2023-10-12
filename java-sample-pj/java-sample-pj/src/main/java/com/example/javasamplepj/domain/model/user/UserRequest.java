package com.example.javasamplepj.domain.model.user;

import java.io.Serializable;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 * ユーザー情報 リクエストデータ
 */
@Data
public class UserRequest implements Serializable {
  /**
   * 名前
   */
  @NotEmpty(message = "ユーザ名を入力してください")
  @Size(max = 100, message = "名前は100桁以内で入力してください")
  private String userName;
  /**
   * パスワード
   */
  @NotEmpty(message = "パスワードを入力してください")
  @Size(min = 6, max = 16, message = "パスワードは6～16桁以内で入力してください")
  private String password;
  /**
   * メールアドレス
   */
  @NotEmpty(message = "メールアドレスを入力してください")
  @Email(message = "メールアドレス形式で入力してください")
  private String mailAddress;
  // /**
  // * 住所
  // */
  // @Size(max = 255, message = "住所は255桁以内で入力してください")
  // private String address;
  // /**
  // * 電話番号
  // */
  // @Pattern(regexp = "0\\d{1,4}-\\d{1,4}-\\d{4}", message = "電話番号の形式で入力してください")
  // private String phone;

}