import java.io.*;
import java.util.*;

public class ProcessData {

	public static void main(String[] args) {
        HashMap<String, String> hash = new HashMap<String, String>();
        hash = CGIUtils.parseData(System.in);

        String title = "Processed Data from " + (CGIUtils.isGetRequest() ? "GET" : "POST");
        String name = hash.get("username");
        String password = hash.get("password");
        String magicnum = hash.get("magicnum");

        CGIUtils.printHtml(title, name, password, magicnum);
	}
}

class CGIUtils {

    public static HashMap<String, String> parseData(InputStream istream) {
        HashMap<String, String> form_data = new HashMap<String, String>();

        String buf = "";

        if (isGetRequest()) {
            buf = System.getProperty("query_string");
        } else {
            // TODO: use content-length?
            DataInput d = new DataInputStream(istream);
            String line;
            try {
                while((line = d.readLine()) != null) {
                    buf += line;
                }
            } catch (IOException e) {
            	e.printStackTrace();
            }
        }

        //  Split the name value pairs at '&'
        StringTokenizer pair_tokenizer = new StringTokenizer(buf,"&");

        while (pair_tokenizer.hasMoreTokens()) {
            String pair = urlDecode(pair_tokenizer.nextToken());
            
            StringTokenizer keyval_tokenizer = new StringTokenizer(pair,"=");
            String key = new String();
            String value = new String();
            if (keyval_tokenizer.hasMoreTokens())
                key = keyval_tokenizer.nextToken();
            if (keyval_tokenizer.hasMoreTokens())
                value = keyval_tokenizer.nextToken();

          form_data.put(key,value);
        }

      return form_data;
    }

    public static String urlDecode(String in) {
        StringBuffer out = new StringBuffer(in.length());
        int i = 0;

        while (i < in.length()) {
            char ch = in.charAt(i);
            i++;
            if (ch == '+') {
                ch = ' ';
            } else if (ch == '%') {
                ch = (char)Integer.parseInt(in.substring(i,i+2), 16);
                i+=2;
            }
         
            out.append(ch);
        }

        return new String(out);
    }

    public static boolean isGetRequest()
    {
        String req = System.getProperty("request_method");
        if (req != null && (req.equals("GET") || req.equals("get"))) {
            return true;
        }

        return false;
    }

    public static boolean isPostRequest()
    {
        String req = System.getProperty("request_method");
        if (req != null && (req.equals("POST") || req.equals("post"))) {
            return true;
        }

        return false;
    }

    public static void printHtml(String title, String user, String pass, String num) {
    	printHeader();
		System.out.println("<!DOCTYPE html>");
		System.out.println("<html lang=\"en\">");
		printHead(title);
        try {
	    	printBody(user, pass, Integer.parseInt(num));
        } catch (NumberFormatException e) {
            System.out.println("<body><p>magicnum isn't a number!</p></body>");
        } catch (NullPointerException e) {
            System.out.println("<body><p>magicnum wasnt provided!</p></body>");
        }
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

	public static void printBody(String user, String pass, int num) {
		System.out.println("  <body>");
        for(int i = 0; i < num; ++i) {
            System.out.println("    <h1>Hello " + user + " with a password of " + pass + "!</h1>");
        }
		System.out.println("  </body>");
	}
}