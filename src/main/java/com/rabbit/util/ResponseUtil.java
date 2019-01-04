package com.rabbit.util;


import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class ResponseUtil {

    public static String CONTENT_TYPE_JSON = "application/json;charset=UTF-8";
    public static String CONTENT_TYPE_XML = "text/xml;charset=UTF-8";
    public static String CONTENT_TYPE_HTML = "text/html;charset=UTF-8";

    public static void sendJsonNoCache(HttpServletResponse response, String message) throws IOException {
        response.setContentType(CONTENT_TYPE_JSON);
        setNoCacheHeader(response);
        sendMessage(response, message);
    }
    private static void sendMessage(HttpServletResponse response, String message) throws IOException {
        StringBuilder sb = new StringBuilder();
        java.io.PrintWriter writer = response.getWriter();
        sb.append(message);
        writer.write(sb.toString());
        response.flushBuffer();
    }
    public static void setNoCacheHeader(HttpServletResponse response) {
        // HTTP 1.0
        response.setHeader("Pragma", "No-cache");
        // HTTP 1.1
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
    }
    public static void setCrossDomain(HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Headers", "Origin, No-Cache, X-Requested-With,Content-Range, X_FILENAME, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With");
    }
}