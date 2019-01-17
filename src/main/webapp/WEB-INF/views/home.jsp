<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
	<title>Home</title>
<style>
	.container {
		width: 0 auto;
	}
	table {
		border: 2px;
	}
	
</style>
</head>
<body>
	<div class="container">
		<table>
			<thead>
				<tr>
					<th>글번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>날짜</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>1</td>
					<td>제목1</td>
					<td>작성자1</td>
					<td>지금</td>
				</tr>
			</tbody>	
			<tfoot>
				<tr>
					<td>page1</td>
					<td>page1</td>
					<td>page1</td>
					<td>page1</td>
				</tr>
			</tfoot>
		</table>
	</div>
</body>
</html>
