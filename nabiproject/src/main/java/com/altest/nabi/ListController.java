package test.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import test.dao.MemDAO;
import test.dto.MemDTO;

public class ListController implements Controller{
 //MemDAO 객체를 주입받기 위해
 private MemDAO dao;
 public void setDao(MemDAO dao) {
  this.dao = dao;
 }
 
 @Override
 public ModelAndView handleRequest(HttpServletRequest arg0,
   HttpServletResponse arg1) throws Exception {
  ArrayList<MemDTO> list=dao.getList();
  ModelAndView mv = new ModelAndView();
  //뷰페이지 설정
  mv.setViewName("showList");
  //가지고 갈 데이터를 담고
  mv.addObject("list", list);
  //객체를 리턴한다.
  return mv;
 }

}

