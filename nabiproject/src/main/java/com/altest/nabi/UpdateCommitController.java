package test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import test.dao.MemDAO;
import test.dto.MemDTO;

public class UpdateCommitController extends AbstractCommandController{
 
 //MemDAO 객체를 주입받기 위해
 private MemDAO dao;
 public void setDao(MemDAO dao) {
  this.dao = dao;
 }
 
 @Override
 protected ModelAndView handle(HttpServletRequest request,
   HttpServletResponse response, Object obj, BindException arg3)
   throws Exception {
  //포장되서 전달된 객체를 이용해서 볼때 DB다.
  dao.update((MemDTO) obj);
  return new ModelAndView("redirect:list.do");
 }

}
