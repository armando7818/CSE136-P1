import java.util.*;

public class EnvironmentVariables {
    public static void main(String[] args) {
        printHtml("Environment Variables");
    }

    public static void printEnvironmentVariables() {
        LinkedHashMap<String, String> browser_vars = getBrowserEnv();
        LinkedHashMap<String, String> server_vars = getServerEnv();

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
        
        b.put("HTTP_ACCEPT", System.getProperty("http_accept"));
        b.put("HTTP_ACCEPT_ENCODING", System.getProperty("http_accept_encoding"));
        b.put("HTTP_ACCEPT_LANGUAGE", System.getProperty("http_accept_language"));
        b.put("HTTP_CACHE_CONTROL", System.getProperty("http_cache_control"));
        b.put("HTTP_CONNECTION", System.getProperty("http_connection"));
        b.put("HTTP_DNT", System.getProperty("http_dnt"));
        b.put("HTTP_HOST", System.getProperty("http_host"));
        b.put("HTTP_USER_AGENT", System.getProperty("http_user_agent"));

        b.put("QUERY_STRING", System.getProperty("query_string"));
        b.put("REMOTE_ADDR", System.getProperty("remote_addr"));
        b.put("REMOTE_PORT", System.getProperty("remote_port"));
        b.put("REQUEST_METHOD", System.getProperty("request_method"));
        b.put("REQUEST_SCHEME", System.getProperty("request_scheme"));
        b.put("REQUEST_URI", System.getProperty("request_uri"));

        return b;
    }


    public static LinkedHashMap<String,String> getServerEnv() {
        LinkedHashMap<String,String> s = new LinkedHashMap<String,String>();
        s.put("CONTEXT_DOCUMENT_ROOT", System.getProperty("context_document_root"));
        s.put("CONTEXT_PREFIX", System.getProperty("context_prefix"));
        s.put("DOCUMENT_ROOT", System.getProperty("document_root"));
        s.put("GATEWAY_INTERFACE", System.getProperty("gateway_interface"));
        s.put("PATH", System.getProperty("path"));

        s.put("SCRIPT_FILENAME", System.getProperty("script_filename"));
        s.put("SCRIPT_NAME", System.getProperty("script_name"));

        s.put("SERVER_ADDR", System.getProperty("server_addr"));
        s.put("SERVER_ADMIN", System.getProperty("server_admin"));
        s.put("SERVER_NAME", System.getProperty("server_name"));
        s.put("SERVER_PORT", System.getProperty("server_port"));
        s.put("SERVER_PROTOCOL", System.getProperty("server_protocol"));
        s.put("SERVER_SIGNATURE", System.getProperty("server_signature"));
        s.put("SERVER_SOFTWARE", System.getProperty("server_software"));
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
        System.out.print("Content-type: text/html\r\n\r\n");
    }

    public static void printHead(String title) {
        System.out.println("  <head>");
        System.out.println("    <meta charset=\"UTF-8\">");
        System.out.println("    <title>" + title + "</title>");
        System.out.println("  </head>");
    }

    public static void printBody() {
        System.out.println("  <body>");
        System.out.println("    <h1>Environment Variables</h1>");
        printEnvironmentVariables();
        System.out.println("  </body>");
    }
}