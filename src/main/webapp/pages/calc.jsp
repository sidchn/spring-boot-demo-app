<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head><title>Calculator</title></head>
<body>
  <h1> Calculator </h1>
  	<form action="result">
	  <input type="number" name="operand1"></br>
	  <input type="number" name="operand2"></br>
	  <input list="operations" name="operation"></br>
	  <datalist id="operations">
  <option value="+">
  <option value="-">
  <option value="*">
  <option value="/">
	</datalist>
	  <input type="submit"></br>
	</form>
<h2>Result: ${result}</h2>	

</body>
</html>