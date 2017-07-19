package com.otg.jason.filter;

/**
 * Created by jason.guan on 2017/7/16.
 */
public class HTMLFilter implements Filter {



    public void doFilter(Request request, Response response, FilterChain chain) {
        //process the html tag <>
        String requestStr =  request.getRequestStr();
        String responseStr = requestStr.replace('<', '[')
                .replace('>', ']') ;
        request.setRequestStr(responseStr);
        response.setResponseStr(response.getResponseStr()+","+responseStr);
        chain.doFilter(request, response, chain);

    }

}