package test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import test.dao.MemDAO;
import test.dto.MemDTO;

public class UpdateController implements Controller{
 private MemDAO dao;
 public void setDao(MemDAO dao) {
  this.dao = dao;
 }
 @Override
 public ModelAndView handleRequest(HttpServletRequest request,
   HttpServletResponse response) throws Exception {
  //파라미터로 넘어온 회원번호 읽어오기
  int num = Integer.parseInt(request.getParameter("num"));
  //회원 한명의 정보 얻어오기
  MemDTO dto = dao.getData(num);
  //생성자로 필요한 정보를 넘겨주고 객체 생성한 후에 리턴
  ModelAndView mv = new ModelAndView("updateForm", "dto", dto);
  return mv;
 }
 
 
 
}

