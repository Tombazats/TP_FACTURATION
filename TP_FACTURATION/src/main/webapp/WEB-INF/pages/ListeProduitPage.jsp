
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

</head>
<body>

<h1>Liste des produits</h1>

<div class="container">

 <nav>
    <div class="nav-wrapper">
      <a href="home" class="brand-logo">HOME</a>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
        <li><a href="listeproduit?action=list">PRODUIT</a></li>
        <li><a href="listefactures">FACTURE</a></li>
        <li><a href="listeclient?action=listeclient">CLIENT</a></li>
      </ul>
    </div>
  </nav>
  
  

   
   <table>
           <c:forEach items="${produits}" var="produit">
            <tr>
                <td><c:out value="${produit.getId()}"/></td>
                <td><c:out value="${produit.getNom()}"/></td>
                <td><c:out value="${produit.getPrix()}"/></td>
            </tr>
           </c:forEach>
   </table>
   
   <a href="listeproduit?action=creer">Créer un produit</a>

</div>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

</body>
</html>