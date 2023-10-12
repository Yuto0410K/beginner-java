package com.example.javasamplepj.domain.service.user;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.javasamplepj.domain.model.user.User;
import com.example.javasamplepj.domain.model.user.UserRequest;
import com.example.javasamplepj.domain.repository.UserRepository;
import com.example.javasamplepj.util.user.PasswordUtil;

/**
 * ユーザー情報 Service
 */
// @RequiredArgsConstructor
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {
  /**
   * ユーザー情報 Repository
   */
  @Autowired
  private UserRepository userRepository;

  /**
   * ユーザー情報 全検索
   * 
   * @return 検索結果
   */
  public List<User> searchAll() {
    return userRepository.findAll();
  }

  /**
   * ユーザー情報 主キー検索
   * 
   * @return 検索結果
   */
  public User findById(Long id) {
    return userRepository.findById(id);
  }

  // /**
  // * ユーザー情報 新規登録
  // * @param user ユーザー情報
  // */
  // public void create(RequestUserRegist requestUserRegist) {
  // Date now = new Date();
  // User user = new User();
  // user.setUserName(requestUserRegist.getUserName());
  // user.setPassword(requestUserRegist.());
  // user.setMailAddress(requestUserRegist.getPhone());
  // // user.setCreateDate(now);
  // // user.setUpdateDate(now);
  // userRepository.save(user);
  // }

  /**
   * ユーザ登録する情報のDBインサート処理
   * 
   * @param RequestUserRegist ユーザ登録APIのリクエストボディ
   */
  public void insertUser(UserRequest userRequest) {
    User user = new User();
    user = createUser(userRequest);
    userRepository.create(user);
    // ResponseUserRegist responseUserRegist = new ResponseUserRegist();
    // responseUserRegist.setUserId(user.getUserId());
    // responseUserRegist.setUserName(user.getUserName());
    // responseUserRegist.setMailAddress(user.getMailAddress());
    // return responseUserRegist;
  };

  /**
   * ユーザ登録するユーザ情報の作成処理
   * 
   * @param userRequest ユーザ登録APIのリクエストボディ
   * @return user ユーザ情報
   */
  private User createUser(UserRequest userRequest) {
    String hashPw;
    Date now = new Date();
    User user = new User();
    hashPw = PasswordUtil.hashSHA256(userRequest.getPassword());
    user.setUserName(userRequest.getUserName());
    user.setPassword(hashPw);
    user.setMailAddress(userRequest.getMailAddress());
    user.setCreateDate(now);
    user.setUpdateDate(now);
    return user;
  };
}