package com.otg.jason.filter;

/**
 * Created by jason.guan on 2017/7/16.
 */
public class SesitiveFilter implements Filter {


    public void doFilter(Request request, Response response, FilterChain chain) {
        String requestStr = request.getRequestStr();
        String responseStr = requestStr.replace("敏感", "XXXX");
        request.setRequestStr(responseStr);
        response.setResponseStr(response.getResponseStr()+","+responseStr);
        chain.doFilter(request, response, chain);


    }



}
