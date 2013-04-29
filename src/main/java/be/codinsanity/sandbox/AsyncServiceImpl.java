package be.codinsanity.sandbox;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

/**
 * author : Bruno Dusausoy
 */
@Service
public class AsyncServiceImpl implements AsyncService {

    @Override
    @Async
    public Future<String> helloAsynchronous(String name) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new AsyncResult<String>("Hello " + name);
    }
}
