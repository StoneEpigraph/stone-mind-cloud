package cn.stonemind.smt.server.base.controller;

import cn.stonemind.entity.User;
import cn.stonemind.smt.server.base.service.UserService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> userList() {
        return userService.getUserList();
    }

    @PostMapping("/putFile")
    public Map<String, String> putFile(HttpServletRequest request) throws Exception{
        Map<String, String> res = new HashMap<String, String>();
        res.put("status", "error");
        res.put("message", "失败");

        ServletInputStream is = request.getInputStream();
        StringBuilder sb = new StringBuilder("");
        byte[] buf = new byte[1024];
        int len = 0;
        while((len = is.read(buf)) != -1) {
            sb.append(new String(buf, 0, len));
        }
        System.out.println(sb.toString());
        JSONObject jsonObject = (JSONObject) JSONObject.parse(sb.toString());
        if (jsonObject.containsKey("fileCode")) {
            String fileCode = jsonObject.getString("fileCode");

            System.out.println("fileCode: " + fileCode);
            if (fileCode != null && !"".equals(fileCode.trim())) {
                res.put("status", "success");
                res.put("message", "成功");
            }
        }

        return res;
    }

    @PostMapping("/getFile")
    public Map<String, String> getFile(HttpServletRequest request) throws Exception{
        Map<String, String> res = new HashMap<String, String>();
        res.put("status", "error");
        res.put("message", "失败");

        ServletInputStream is = request.getInputStream();
        StringBuilder sb = new StringBuilder("");
        byte[] buf = new byte[1024];
        int len = 0;
        while((len = is.read(buf)) != -1) {
            sb.append(new String(buf, 0, len));
        }
        System.out.println(sb.toString());
        JSONObject jsonObject = (JSONObject) JSONObject.parse(sb.toString());
        if (jsonObject.containsKey("fileCode")) {
            String fileCode = jsonObject.getString("fileCode");

            System.out.println("fileCode: " + fileCode);
            if (fileCode != null && !"".equals(fileCode.trim())) {
                res.put("status", "success");
                res.put("message", "成功");
            }
        }

        return res;
    }

    @PostMapping("/randomStr")
    public String randomStr(HttpServletRequest request) throws Exception {
        return "123123sdfasfasdf==";
    }

    @PostMapping("/serverVerifyUrl")
    public String serverVerifyUrl(HttpServletRequest request) throws Exception {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?><verifyidentityticketresp version=\"1\"><result>-1</result><identityticket>123123123</identityticket><appserverid>\"123123\"</appserverid></verifyidentityticketresp>";
    }
}
