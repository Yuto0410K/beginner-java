package com.example.javasamplepj.controller.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.javasamplepj.domain.model.user.User;
import com.example.javasamplepj.domain.model.user.UserRequest;
import com.example.javasamplepj.domain.service.user.UserService;

/**
 * ユーザー情報 Controller
 */
@Controller
public class UserController {

  /**
   * ユーザー情報 Service
   */
  @Autowired
  private UserService userService;

  /**
   * ユーザー情報一覧画面を表示
   * 
   * @param model Model
   * @return ユーザー情報一覧画面
   */
  @GetMapping(value = "/user/list")
  public String displayList(Model model) {
    List<User> userlist = userService.searchAll();
    model.addAttribute("userlist", userlist);
    return "user/list";
  }

  /**
   * ユーザー新規登録画面を表示
   * 
   * @param model Model
   * @return ユーザー情報一覧画面
   */
  @GetMapping(value = "/user/add")
  public String displayAdd(Model model) {
    model.addAttribute("userRequest", new UserRequest());
    return "user/add";
  }

  /**
   * ユーザー新規登録
   * 
   * @param userRequest リクエストデータ
   * @param model       Model
   * @return ユーザー情報一覧画面
   */
  @RequestMapping(value = "/user/create", method = RequestMethod.POST)
  public String create(@Validated @ModelAttribute UserRequest userRequest, BindingResult result, Model model) {

    if (result.hasErrors()) {
      // 入力チェックエラーの場合
      List<String> errorList = new ArrayList<String>();
      for (ObjectError error : result.getAllErrors()) {
        errorList.add(error.getDefaultMessage());
      }
      model.addAttribute("validationError", errorList);
      return "user/add";
    }
    // ユーザー情報の登録
    userService.insertUser(userRequest);
    return "redirect:/user/list";
  }

  /**
   * ユーザー情報詳細画面を表示
   * 
   * @param id    表示するユーザーID
   * @param model Model
   * @return ユーザー情報詳細画面
   */
  @GetMapping("/user/{id}")
  public String displayView(@PathVariable Long id, Model model) {
    User user = userService.findById(id);
    model.addAttribute("userData", user);
    return "user/view";
  }

  // /**
  // * ユーザ登録API
  // * POST /user/regist
  // * @param requestUserRegist ユーザ登録APIのリクエストボディ
  // * @return responseUserRegist ユーザ登録APIのレスポンスボディ
  // */
  // @PostMapping("regist")
  // @ResponseBody
  // public ResponseUserRegist userRegist(@RequestBody RequestUserRegist
  // requestUserRegist) {

  // // サービスクラスのユーザ登録処理呼び出し
  // ResponseUserRegist responseUserRegist =
  // userService.insertUser(requestUserRegist);

  // // APIレスポンス
  // return responseUserRegist;
  // }

  // /**
  // * ログインAPI
  // * POST /user/login
  // * @param requestLogin ログインAPIのリクエストボディ
  // * @return responseLogin ログインAPIのレスポンスボディ
  // */
  // @PostMapping(value="login", consumes=MediaType.APPLICATION_JSON_VALUE)
  // @ResponseBody
  // public ResponseLogin login(@RequestBody RequestLogin requestLogin) {

  // // サービスクラスのログイン処理呼び出し
  // ResponseLogin responseLogin = userService.login(requestLogin);

  // // APIレスポンス
  // return responseLogin;
  // }

  // /**
  // * ログインAPI
  // * GET /user/login
  // * @param requestLogin ログインAPIのリクエストボディ
  // * @return responseLogin ログインAPIのレスポンスボディ
  // */
  // @GetMapping("login")
  // public String login() {

  // ;

  // // APIレスポンス
  // return "login.html";
  // }
}