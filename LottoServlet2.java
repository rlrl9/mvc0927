package controller;

import java.io.IOException;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.domain.TimeVO;
@WebServlet("/lotto2")
public class LottoServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("로드완료");
		HttpSession session = request.getSession();
		int num = Integer.parseInt(request.getParameter("num"));
		int rand = (int)(Math.random()*6)+1;
		if(session.getAttribute("cnt") == null) {
			session.setAttribute("cnt", new int[1]);
		}
		
		int[] count = (int[])session.getAttribute("cnt");
		count[0]++;
		System.out.println(count[0]);
		if(count[0] >3) {
			session.setAttribute("msg","아쉽게도 기회는 3번까지입니다..");
			request.getRequestDispatcher("/jspexam/impossible.jsp").forward(request, response);
			
			return;
		}
		
		
		System.out.println("전달된 값 : "+num+", 추출된 값 : "+rand);
		TimeVO vo=new TimeVO(LocalTime.now().getHour(),LocalTime.now().getMinute());
		System.out.println(LocalTime.now().getHour()+"시"+LocalTime.now().getMinute());
		session.setAttribute("vo",vo);
		if(num==rand) {
			session.setAttribute("msg","당첨되었습니다!");
			request.getRequestDispatcher("/jspexam/impossible.jsp").forward(request, response);
			
		}else {
			request.getRequestDispatcher("/jspexam/fail.jsp").forward(request, response);
		}
	}
}


