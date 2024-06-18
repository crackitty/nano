package se.middleware.nano;

import com.sun.net.httpserver.Headers;

/**
 *
 * @author Charlie Roche
 */
@FunctionalInterface
public interface NanoRequest {

    int process(String method, Headers requestHeaders, Headers responseHeaders, String request, ResponseWriter response);
}
