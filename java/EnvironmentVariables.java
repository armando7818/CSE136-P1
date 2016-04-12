import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class EnvironmentVariables extends HttpServlet {
    static LinkedHashMap<String, String> browser_vars = new LinkedHashMap<String, String>();
    static LinkedHashMap<String, String> server_vars = new LinkedHashMap<String, String>();

    public static void main(String[] args) {
        printHtml("Environment Variables");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        //browser_vars.put("AUTH_TYPE", request.getAuthType());
        //browser_vars.put("SERVER_SOFTWARE", getServletContext().getServerInfo());

        printHtml("Environment Variables");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        //doGet(request, response);
        printHtml("Environment Variables");
    }

    public static void printEnvironmentVariables() {
        System.out.println("    <table>");
        System.out.println("      <tr>");
        System.out.println("        <th><b>Browser Vars</b></th>");
        System.out.println("        <th><b>Values</b></th>");
        System.out.println("      </tr>");
        for(String key : browser_vars.keySet()) {
            System.out.println("      <tr>");
            System.out.println("        <td>" + key + "</td>");
            System.out.println("        <td>" + browser_vars.get(key) + "</td>");
            System.out.println("      </tr>");
        }
        System.out.println("    </table>");

        System.out.println("<br><br><br>");

        System.out.println("    <table>");
        System.out.println("      <tr>");
        System.out.println("        <th><b>Server Vars</b></th>");
        System.out.println("        <th><b>Values</b></th>");
        System.out.println("      </tr>");
        for(String key : server_vars.keySet()) {
            System.out.println("      <tr>");
            System.out.println("        <td>" + key + "</td>");
            System.out.println("        <td>" + server_vars.get(key) + "</td>");
            System.out.println("      </tr>");
        }
        System.out.println("    </table>");
    }

    public static LinkedHashMap<String,String> getBrowserEnv() {
        LinkedHashMap<String,String> b = new LinkedHashMap<String,String>();
        /*
        b.put("CONTEXT_DOCUMENT_ROOT", System.getProperty("cgi.context_document_root"));
        b.put("CONTEXT_PREFIX", System.getProperty("cgi.context_prefix"));
        b.put("DOCUMENT_ROOT", System.getProperty("cgi.document_root"));
        b.put("GATEWAY_INTERFACE", System.getProperty("cgi.gateway_interface"));
        b.put("HTTP_ACCEPT", System.getProperty("cgi.http_accept"));
        b.put("HTTP_ACCEPT_ENCODING", System.getProperty("cgi.http_accept_encoding"));
        b.put("HTTP_ACCEPT_LANGUAGE", System.getProperty("cgi.http_accept_language"));
        b.put("HTTP_CACHE_CONTROL", System.getProperty("cgi.http_cache_control"));
        b.put("HTTP_CONNECTION", System.getProperty("cgi.http_connection"));
        b.put("HTTP_DNT", System.getProperty("cgi.http_dnt"));
        b.put("HTTP_HOST", System.getProperty("cgi.http_host"));
        b.put("HTTP_USER_AGENT", System.getProperty("cgi.http_user_agent"));
        b.put("PATH", System.getProperty("cgi.path"));
        b.put("QUERY_STRING", System.getProperty("cgi.query_string"));
        b.put("REMOTE_ADDR", System.getProperty("cgi.remote_addr"));
        b.put("REMOTE_PORT", System.getProperty("cgi.remote_port"));
        b.put("REQUEST_METHOD", System.getProperty("cgi.request_method"));
        b.put("REQUEST_SCHEME", System.getProperty("cgi.request_scheme"));
        b.put("REQUEST_URI", System.getProperty("cgi.request_uri"));
        b.put("SCRIPT_FILENAME", System.getProperty("cgi.script_filename"));
        b.put("SCRIPT_NAME", System.getProperty("cgi.script_name"));
        b.put("SERVER_ADDR", System.getProperty("cgi.server_addr"));
        b.put("SERVER_ADMIN", System.getProperty("cgi.server_admin"));
        b.put("SERVER_NAME", System.getProperty("cgi.server_name"));
        b.put("SERVER_PORT", System.getProperty("cgi.server_port"));
        b.put("SERVER_PROTOCOL", System.getProperty("cgi.server_protocol"));
        b.put("SERVER_SIGNATURE", System.getProperty("cgi.server_signature"));
        b.put("SERVER_SOFTWARE", System.getProperty("cgi.server_software"));
        */
/*
        Properties properties = System.getProperties();
        Enumeration e = properties.propertyNames();
        while(e.hasMoreElements()) {
            String key = (String)e.nextElement();
            b.put(key, properties.getProperty(key));
        }

*/
        return b;
    }


    public static LinkedHashMap<String,String> getServerEnv() {
        LinkedHashMap<String,String> s = new LinkedHashMap<String,String>();
        s.put("bbb", "zzz");
        s.put("asdf", "qwerty");
        s.put("aaa", "aaa");
        return s;
    }

    public static void printHtml(String title) {
        printHeader();
        System.out.println("<!DOCTYPE html>");
        System.out.println("<html lang=\"en\">");
        printHead(title);
        printBody();
        System.out.println("</html>");
    }

    public static void printHeader() {
        System.out.print("Content-type: text/html\n\n");
    }

    public static void printHead(String title) {
        System.out.println("  <head>");
        System.out.println("    <meta charset=\"UTF-8\">");
        System.out.println("    <title>" + title + "</title>");
        System.out.println("  </head>");
    }

    public static void printBody() {
        System.out.println("  <body>");
        printEnvironmentVariables();
        System.out.println("  </body>");
    }
}