package com.cicada.springboot.tomcat;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.startup.Tomcat.FixContextListener;

import com.cicada.springboot.servlet.IndexServlet;

/**
 * 使用 Java 创建 Tomcat 服务器
 * 
 * @author baihan
 *
 */
public class TomcatApp {
    private static int PORT = 8080;
    private static String CONTEXT_PATH = "/cicada";
    private static String SERVLET_NAME = "indexServlet";

    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        // 端口
        tomcat.setPort(PORT);
        // 是否设置自动部署
        tomcat.getHost().setAutoDeploy(false);
        // 创建上下文
        StandardContext standardContext = new StandardContext();
        standardContext.setPath(CONTEXT_PATH);
        // 监听上下文
        standardContext.addLifecycleListener(new FixContextListener());
        // Tomcat容器添加上下文
        tomcat.getHost().addChild(standardContext);
        // 创建Servlet
        tomcat.addServlet(CONTEXT_PATH, SERVLET_NAME, new IndexServlet());
        // Servlet url映射
        standardContext.addServletMappingDecoded("/index", SERVLET_NAME);
        tomcat.start();
        System.out.println("Tomcat 服务器启动成功.");
        // 异步进行接收请求
        tomcat.getServer().await();

    }
}
