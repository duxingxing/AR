package com.dx.controller;

import com.dx.service.login.LoginService;
import com.dx.service.login.encryption.RSACoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by duxing on 2018/1/28.
 */
@Controller
public class LogonController {
    @Resource(name = "simpleLoginService")
    private LoginService simpleLoginService;

    @RequestMapping("/index")
    public String index() {
        return "home";
    }

    @RequestMapping("/login")
    public String login() {
        return "ilogin";
    }
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    @ResponseBody
//    public String login(String user, String pwd) {
//        try {
//            byte[] decodedData = RSACoder.decryptByPrivateKey(user,
//                    "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAMRfPUz4FvNb47V+LGqKMUxOHyVMXDQgX9v4wcWOcW6bMFA0" +
//                            "M+TFjDQe/wZA17cpeSKZlv2JdeFLs7d2zvENT1c6zxNEdVC4CbjeR1rn0fol0I8W1P5tL19egW511SJqFuy+3DeWZxeUujggMQpqf" +
//                            "ec84adCN7F0u4kszR1Mj02zAgMBAAECgYEAgNuyQRinDshkkwsZoEvQb67v1yzVcEsyPAlvNfDz1E23lVm8F8nd57HTTUotg36Og7rfjr2u" +
//                            "AcoIQ0KOJzXBsmgSOhiYk0wjSS7NmPubxQx08MXdCkgI4QzTJInOAoRdk40TcN1Gt/RDvtUtjYEG8Y5NFLQNzRY/Wf32gdP6zHkCQQDuRoY73Rtz" +
//                            "xtuGOPSQ1TA0wWq3peIitMQQN0o7bXSKwP4nvI8Kcy+KxmIemsIGYgxAX0agaXmd3I6APAOGZehFAkEA0vq/lG8D7nvfZavuDOgIkdUTvy+V+8arxeRdSTf" +
//                            "e0GZI6gc/DxJP2YvPbcbdjYICBHPVsu3BVK5FoTxUAeNplwJBANFiyh0bHT+tdUXLESehID6L5XLC5Cipf03cuG/mrK4uEGns6io9tH6X/Kt2RaCEUs3Sq+bVK" +
//                            "VlO8y6/Dj3xmZ0CQFBWELs5ppqZ6o/xbtzVQeYd574GJatQlDnvYiIuNxbNy/fpOHbJt0QUO7EGZ3ipx5DgdsACTnqrPXJO4YIykRMCQBUV+rqyjk108XnckJ6qHaO" +
//                            "vfqM1sezH8KUJuLsyYtfpwoaSL5DIXogpRurScbN07rfcqmfNwktefPJe5frqGEc=");
//            System.out.println("#######" + user);
//            String outputStr = new String(decodedData);
//            System.out.println("#######" + outputStr);
//        } catch (Exception e) {
//
//        }
//
//
//        simpleLoginService.login(user, pwd);
//        return "fail";
//    }

    @RequestMapping("/logout")
    public String logout(String user, String password) {
        return "login";
    }

    private boolean isLogin() {
        return false;
    }
}
