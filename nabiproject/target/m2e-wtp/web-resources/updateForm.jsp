<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updateCommit.do">
 <input type="hidden" name="num" value="${dto.num }"/><br/>
 <table border="1" cellspacing="0">
  <tr>
   <th>번호</th>
   <td>${dto.num }</td>
  </tr>
  <tr>
   <th>이름</th>
   <td><input type="text" name="name" value="${dto.name }"></td>
  </tr>
  <tr>
   <th>주소</th>
   <td><input type="text" name="addr" value="${dto.addr}"></td>
  </tr>
  <tr>
   <td colspan="2">
    <input type="submit" value="전송"/>
   </td>
   </tr>
  
 </table>
 
</form>
</body>
</html>
