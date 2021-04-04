package cn.stonemind.generate.controller;

import cn.stonemind.entity.BaseResponse;
import cn.stonemind.generate.service.GenerateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("generate")
@RestController
public class GenerateController {

    @Autowired
    private GenerateService generateService;

    @PostMapping("database")
    public BaseResponse getDatabase() {
        return generateService.getDatabase();
    }
}
