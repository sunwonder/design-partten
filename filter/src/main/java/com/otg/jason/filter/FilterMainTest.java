package com.otg.jason.filter;

/**
 * Created by jason.guan on 2017/7/16.
 */
public class FilterMainTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String msg = "<html>，敏感信息，大家可以看见吗";
        Request request = new Request();
        request.setRequestStr(msg);
        Response response = new Response();
        response.setResponseStr("response");
        FilterChain fc = new FilterChain();
        fc.addFilter(new HTMLFilter())
                .addFilter(new SesitiveFilter())
        ;

        fc.doFilter(request, response, fc);
        System.out.println("request--"+request.getRequestStr());
        System.out.println("response--"+response.getResponseStr());
    }

}
