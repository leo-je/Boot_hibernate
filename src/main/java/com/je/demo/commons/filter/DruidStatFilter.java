/**
* by shengte lee 2017年11月15日 上午10:34:27
*/
package com.je.demo.commons.filter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import com.alibaba.druid.support.http.WebStatFilter;

//druid过滤器. 
@WebFilter(filterName = "druidWebStatFilter", urlPatterns = "/*",
 initParams = {
     // 忽略资源
     @WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")
 }
)
public class DruidStatFilter extends WebStatFilter {
}
