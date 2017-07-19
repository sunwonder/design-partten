package com.otg.jason.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jason.guan on 2017/7/16.
 */
public class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<Filter>();
    int index = 0;

    public FilterChain addFilter(Filter f) {
        this.filters.add(f);
        return this;
    }


    public void doFilter(Request request, Response response, FilterChain chain) {
        if(index == filters.size()) return ;

        Filter f = filters.get(index);
        index ++;
        f.doFilter(request, response, chain);
    }
}