package com.altest.nabi;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.altest.nabi.MemDAO;
import com.altest.nabi.MemDTO;

/*
 * ȸ�� �Ѹ��� ������ db�� �����ϴ� ��Ʈ�ѷ�
 * 
 * �Ķ���ͷ� �Ѿ���� ȸ���� ������ ���ϰ� �о������ 
 * abstractCommandController Ŭ������ ��ӹ޾Ƽ� ������ش�.
 */
public class InsertController extends AbstractCommandController{
 
 //dao��ü�� new���� �ʰ� bean���� ���� �ޱ����� ����������� �� setter()�� �����.
 private MemDAO dao;
 public void setDao(MemDAO dao) {
  this.dao = dao;
 }
 
 //�߻�޼ҵ� �����ϱ�(���� ���ϰ��� modelAndView�����̴�)
 //�Ѿ���� �Ķ���Ͱ��� obj�� ����ִ�. 
 @Override
 protected ModelAndView handle(HttpServletRequest request,
   HttpServletResponse response, Object obj, BindException arg3)
   throws Exception {
  
  //�����ؼ� ���ڷ� ���޵� DTO
  MemDTO dto = (MemDTO)obj;
  //DAO ��ü�� �̿��ؼ� DB�� �����ϱ�
  dao.insert(dto);
  ModelAndView mv =new ModelAndView();
  //�����̷�Ʈ�� list.do��û�ϱ�
  mv.setViewName("redirect:/list.do");
  return mv;
  
 }

}