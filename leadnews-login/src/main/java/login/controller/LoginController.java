package login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tanran.article.loginApi.LoginControllerApi;
import com.tanran.common.result.RespResult;
import com.tanran.model.user.pojos.ApUser;

import login.service.ApUserLoginService;

@RestController
@RequestMapping("/api/v1/login")
public class LoginController implements LoginControllerApi {

    @Autowired
    private ApUserLoginService apUserLoginService;

    @Override
    @PostMapping("/login_auth")
    public RespResult login(@RequestBody ApUser user) {
        return apUserLoginService.loginAuth(user);
    }
}
