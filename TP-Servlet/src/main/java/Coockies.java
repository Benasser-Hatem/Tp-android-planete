import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;



@WebServlet("/Coockies")
public class Coockies extends HttpServlet {

 public void doGet(HttpServletRequest request, 
    HttpServletResponse response){
    try{
       response.setContentType("text/html");
       PrintWriter writer = response.getWriter();
   
       Cookie c[]=request.getCookies(); 
 
       writer.print("Name: "+c[1].getValue()); 
       writer.print("Prenom : "+c[2].getValue());
       writer.print("Date : "+c[3].getValue());
       writer.print("Sex : "+c[4].getValue());
       
       writer.close();
    }catch(Exception exp){
       System.out.println(exp);
     }
  }
}