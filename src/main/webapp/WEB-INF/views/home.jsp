<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Board</title>
<style>
	.container {
		width: 500px;
		margin: 80 auto;
	}
	.container div table{
		width: 500px;
		heigth: 100px;
	}
	table, th, tr, td{
		text-align: center;
		border: 1px solid #000;
	}
</style>
</head>
<body>
	<div class="container">
		<div>
			<form action="boardinsert" method="post" id="insertForm">
				<label for="title">제목 : </label>
				<input type="text" id="title" name="title"/>
				<label for="content">내용 : </label>
				<input type="text" id="content" name="content"/>
				<button type="submit" id="insertBtn">글작성</button>
			</form>
		</div>
		<div>
			<table>
				<thead>
					<tr>
						<th>글번호</th>
						<th>제목</th>
						<th>내용</th>
						<th>작성자</th>
						<th>날짜</th>
						
					</tr>
				</thead>
				<tbody>
					<c:choose>
						<c:when test="${empty list }">
							<tr>
								<td colspan="5">게시글이 없습니다.</td>
						</c:when>
						<c:otherwise>
							<c:forEach var="tmp" items="${list }">
								<tr>
									<td>${tmp.b_num}</td>
									<td>${tmp.title }</td>
									<td>${tmp.content }</td>
									<td>작성자</td>
									<td>${tmp.regdate }</td>
									<td>
										<input name="delete" type="button" value="삭제"
											onclick="javascript:location.href='/board/boarddelete?dNum=${tmp.b_num}'"/>
									</td>
								</tr>						
							</c:forEach>
						</c:otherwise>
					</c:choose>
				</tbody>	
				<tfoot>
					<tr>
						<td colspan="6">page1</td>
					</tr>
				</tfoot>
			</table>
		</div>
	</div>

</body>
</html>
