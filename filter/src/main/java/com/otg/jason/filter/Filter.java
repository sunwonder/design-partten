package com.otg.jason.filter;

/**
 * Created by jason.guan on 2017/7/16.
 */
public interface Filter {
    void doFilter(Request request, Response response, FilterChain chain);
}