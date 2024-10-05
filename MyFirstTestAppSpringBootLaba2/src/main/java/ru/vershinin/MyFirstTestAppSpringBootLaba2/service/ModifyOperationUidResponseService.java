package ru.vershinin.MyFirstTestAppSpringBootLaba2.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.vershinin.MyFirstTestAppSpringBootLaba2.model.Response;

import java.util.UUID;
@Service
@Qualifier("ModifyOperationUidResponseService")
public class ModifyOperationUidResponseService extends ModifyResponseService {
    @Override
    public Response modify(Response response) {
        UUID uuid = UUID.randomUUID();
        response.setOperationUid(uuid.toString());

        return response;
    }
}
