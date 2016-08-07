<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

	<!-- Script d'accès à AngularJS -->
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
	
<title>Ma premiere Vue JSP</title>
</head>

<body>

	<h1>Résultat de l'include</h1>
		<%@ include file="index.html" %>

	<h1>Application qui sert à rien...</h1>
	<p><em>Developped by MonkeyBoy89 & Heiseinberg !</em></p>
	
	<div ng-app="myApp" ng-controller="myCtrl">
 		<p>Name: <input type="text" ng-model="name"></p>
 		<p ng-bind="name"></p>
 		
 		<p>Le père de luke s'appelle {{firstName}} {{lastName}}</p>
	</div>

	
	<p>Je m'appelle <%= (String)request.getAttribute("data") %></p>
	
	
	
	<!-- Déclaration du controller AngularJS -->
	<script>
	var app = angular.module('myApp', []);
		app.controller('myCtrl', function($scope) {
    		$scope.firstName= "Dark";
    		$scope.lastName= "Vador";
	});
	</script>
	
</body>
</html>