package a.b.c;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * by Irina.Petrovskaya on 9/17/2014.
 */
public class MyServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContextTemplateResolver tr = new ServletContextTemplateResolver();
        tr.setTemplateMode("XHTML");
        tr.setPrefix("/WEB-INF/");
        tr.setSuffix(".html");
        tr.setCacheTTLMs(3600000L);
        TemplateEngine te = new TemplateEngine();
        te.setTemplateResolver(tr);
        WebContext ctx = new WebContext(request, response, getServletConfig().getServletContext(), Locale.ENGLISH);
        // set bean1 properties
        String[] myArray = {"el1","el2"};
        ArrayList<String> myList = new ArrayList<String>();// to set bean1 property of List type
        myList.add("list_el1");
        myList.add("list_el2");
        Map<String, String> myMap = new HashMap<String, String>(); // to set bean1 property of map type
        myMap.put("k1","map_val1");
        myMap.put("k2","map_val2");
        myMap.put("k3","map_val3");

        Bean1 bean1 = new Bean1("textprop2",1,true,myArray,myList, new Bean2("b2_1","b2_2",myList),
                myMap );

        // set context properties:
        ctx.setVariable("str_var1","string_var1");
        ctx.setVariable("str_var2","day");
        ctx.setVariable("prop3","test1.property3");
        ctx.setVariable("bean1", bean1);

        // process template:
        te.process("test1",ctx,response.getWriter());
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control","no-cache");
        response.setDateHeader("Expires", 1000);

    }
}
