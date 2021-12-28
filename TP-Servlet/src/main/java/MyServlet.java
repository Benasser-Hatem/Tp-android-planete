

 
import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    	try{
       
        String name = request.getParameter("Nom");
        String prenom = request.getParameter("Prenom");
        String date = request.getParameter("Date");
        String sex = request.getParameter("sex");

        System.out.println("nom: " + name);
        System.out.println("prenom: " + prenom);
        System.out.println("date: " + date);      
        System.out.println("sex : " + sex);  
        
        PrintWriter writer = response.getWriter();
                      
        Cookie c1=new Cookie("Nom",name);
        Cookie c2=new Cookie("Prenom",prenom);
        Cookie c3=new Cookie("Date",date);
        Cookie c4=new Cookie("Sex",sex);

        response.addCookie(c1);
        response.addCookie(c2);
        response.addCookie(c3);
        response.addCookie(c4);
        
 String htmlRespone = "<html>";
        
        htmlRespone += "<br><h2> Nom : " + name + "<br/>";      
        htmlRespone += "<br><h2>Prenom : " +prenom+ "</br>"; 
        htmlRespone += "<br><h2>Date : " + date + "</h2></br>"; 
        htmlRespone += "<br><h2>Sex : " + sex + "</h2></br>";
        htmlRespone += "<br><a href='Coockies'>View Cookies</a>";
        htmlRespone += "</html>";
        
        writer.println(htmlRespone);
       
      
        writer.close();
        }catch(Exception exp){
        System.out.println(exp);
  }
     
    }
 
}