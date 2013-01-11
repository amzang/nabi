package test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import test.dao.MemDAO;

public class DeleteController implements Controller{

 //dao��ü�� new���� �ʰ� bean���� ���� �ޱ����� ����������� �� setter()�� �����.
 private MemDAO dao;
 public void setDao(MemDAO dao) {
  this.dao = dao;
 }
 
 @Override
 public ModelAndView handleRequest(HttpServletRequest Request,
   HttpServletResponse response) throws Exception {
  //������ ȸ����ȣ �о����
  int num = Integer.parseInt(Request.getParameter("num"));
  dao.delete(num);
  return new ModelAndView("redirect:/list.do");
 }
 
}

