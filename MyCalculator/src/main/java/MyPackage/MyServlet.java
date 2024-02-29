package MyPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String[] jokes = {
		    "Why do Java developers wear glasses? Because they don't C#!",
		    "I told my computer I needed a break, and now it won't stop sending me Kit Kat bars.",
		    "Why don't programmers like nature? It has too many bugs.",
		    "How many programmers does it take to change a light bulb? None, it's a hardware problem.",
		    "Why did the programmer quit his job? Because he didn't get arrays.",
		    "Why do programmers prefer dark mode? Because light attracts bugs!",
		    "Why did the computer go to therapy? Because it had too many bytes of emotional baggage.",
		    "Why did the programmer go broke? Because he used up all his cache!",
		    "Why was the JavaScript developer sad? Because he didn't know how to 'null' his feelings.",
		    "Why was the programming book sad? Because it had too many bad chapters.",
		    "Why do programmers prefer dogs? Because they have good fetch skills!",
		    "Why do programmers always mix up Halloween and Christmas? Because Oct 31 equals Dec 25.",
		    "Why did the SQL query go to therapy? Because it had too many relational issues."
		};

    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str1 = request.getParameter("num1");//voh tho integer ke values hai , tho usko string meh hi leyna padega bydefault aur fir type casting karleyna baadme 
		String str2 = request.getParameter("num2");
		String str3 = request.getParameter("bt1");
		
		//converting sring to int
		int a = Integer.parseInt(str1);//parse matlab conversion hi chalraha hai
		int b = Integer.parseInt(str2);
	//	int sum = num1 + num2 ; haar baar plus nahi kar rahe hai, issliye isko hatadiya
		int ans;
		if(str3.equals("1")) ans= a+b;
		else if(str3.equals("2")) ans=a-b;
		else if(str3.equals("3")) ans=a*b;
		else if(str3.equals("4")) ans=a/b;
		else ans=a%b;
		//response.getWriter().append("Ans= "+ ans);, issbaar rresponse meh hum jsp page ko send karnge
		 int randomIndex = (int) (Math.random() * jokes.length);//yaha random number nikalre
	     String randomJoke = jokes[randomIndex];//uss random index number se joke nikala idhar
	     response.sendRedirect("NewFile.jsp?ans="+ans+"&joke="+randomJoke);
		//uppar wala likhte hi voh print url meh hoga naa ki webpage par 
	} 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
