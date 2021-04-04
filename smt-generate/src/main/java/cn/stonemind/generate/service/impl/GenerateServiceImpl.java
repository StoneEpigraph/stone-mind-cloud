package cn.stonemind.generate.service.impl;

import cn.stonemind.entity.BaseResponse;
import cn.stonemind.generate.mapper.GenerateMapper;
import cn.stonemind.generate.service.GenerateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("generateService")
public class GenerateServiceImpl implements GenerateService {

    @Autowired
    private GenerateMapper generateMapper;

    @Override
    public BaseResponse getDatabase() {
        List<String> databases = generateMapper.getDatabase();
        return new BaseResponse().data(databases);
    }
}
