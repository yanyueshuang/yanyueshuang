package com.itheruan.utils;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @program: ElasticSearch
 * @description: session中用户信息
 * @author: YAN.YUE.SHUANG
 * @create: 2021-01-06 14:52
 **/
public class UserSessionUtils {
    /**
     * 用户用户map集合
     * @param request
     * @return
     */
    public static Map<String, Object> getUserMap(HttpServletRequest request) {
        return (Map<String, Object>) request.getSession().getAttribute("userMap");
    }

    /**
     * 用户用户map集合
     * @param request
     * @return
     */
    public static String getUserMapId(HttpServletRequest request) {
        Map<String, Object> userMap = (Map<String, Object>) request.getSession().getAttribute("userMap");
        return (String) userMap.get("user_id");
    }
}
