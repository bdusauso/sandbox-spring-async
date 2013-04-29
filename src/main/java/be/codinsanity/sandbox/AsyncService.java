package be.codinsanity.sandbox;

import java.util.concurrent.Future;

/**
 * author : Bruno Dusausoy
 */
public interface AsyncService {

    Future<String> helloAsynchronous(String name);
}
