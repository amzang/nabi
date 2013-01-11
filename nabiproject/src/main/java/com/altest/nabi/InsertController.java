package com.altest.nabi;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.altest.nabi.MemDAO;
import com.altest.nabi.MemDTO;

/*
 * 회원 한명의 정보를 db에 저장하는 컨트롤러
 * 
 * 파라미터로 넘어오는 회원의 정보를 편하게 읽어오려면 
 * abstractCommandController 클래스를 상속받아서 만들어준다.
 */
public class InsertController extends AbstractCommandController{
 
 //dao객체를 new하지 않고 bean으로 부터 받기위해 멤버변수선언 및 setter()를 만든다.
 private MemDAO dao;
 public void setDao(MemDAO dao) {
  this.dao = dao;
 }
 
 //추상메소드 구현하기(역시 리턴값이 modelAndView형태이다)
 //넘어오는 파라미터값이 obj에 들어있다. 
 @Override
 protected ModelAndView handle(HttpServletRequest request,
   HttpServletResponse response, Object obj, BindException arg3)
   throws Exception {
  
  //포장해서 인자로 전달된 DTO
  MemDTO dto = (MemDTO)obj;
  //DAO 객체를 이용해서 DB에 저장하기
  dao.insert(dto);
  ModelAndView mv =new ModelAndView();
  //리다이렉트로 list.do료청하기
  mv.setViewName("redirect:/list.do");
  return mv;
  
 }

}