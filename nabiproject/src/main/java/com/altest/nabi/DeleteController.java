package test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import test.dao.MemDAO;

public class DeleteController implements Controller{

 //dao객체를 new하지 않고 bean으로 부터 받기위해 멤버변수선언 및 setter()를 만든다.
 private MemDAO dao;
 public void setDao(MemDAO dao) {
  this.dao = dao;
 }
 
 @Override
 public ModelAndView handleRequest(HttpServletRequest Request,
   HttpServletResponse response) throws Exception {
  //삭제할 회원번호 읽어오기
  int num = Integer.parseInt(Request.getParameter("num"));
  dao.delete(num);
  return new ModelAndView("redirect:/list.do");
 }
 
}

