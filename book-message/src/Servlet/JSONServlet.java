package Servlet;


import model.books;
import net.sf.json.JSONArray;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
@WebServlet( "/JSONServlet")
public class JSONServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse
            response) throws ServletException, IOException {
        //创建list集合
        List<books> book= new ArrayList<books>();

        books  b =new books();
        b.setId(1);
        b.setName("西游记");
        b.setType("1");
        book.add(b);
        System.out.println(b);


        books  b1 =new books();
        b1.setId(2);
        b1.setName("红楼梦");
        b1.setType("1");
        book.add(b1);

        //创建JSONArray对象
        JSONArray jsonArray=JSONArray.fromObject(book);
        System.out.println("jsonArray = " + jsonArray);
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print(jsonArray);
        out.flush();
        out.close();
    }


    public void doPost(HttpServletRequest request, HttpServletResponse
            response) throws ServletException, IOException {
        doGet(request,response);
    }
}

