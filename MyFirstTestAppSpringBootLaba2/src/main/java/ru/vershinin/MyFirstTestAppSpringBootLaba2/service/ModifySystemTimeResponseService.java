package ru.vershinin.MyFirstTestAppSpringBootLaba2.service;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.vershinin.MyFirstTestAppSpringBootLaba2.model.Response;
import ru.vershinin.MyFirstTestAppSpringBootLaba2.util.DateTimeUtil;

import java.util.Date;
import java.util.UUID;
@Service
@Qualifier("ModifySystemTimeResponseService")
public class ModifySystemTimeResponseService extends ModifyResponseService {
    @Override
    public Response modify(Response response) {
        UUID uuid = UUID.randomUUID();
        response.setSystemTime(DateTimeUtil.getCustomFormat().format(new Date()));

        return response;
    }
}
