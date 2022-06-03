<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Back Office</h1>



        <ul>
            <c:forEach items="${stock}" var="matelas">
                <c:if test="${matelas.prix > 2000}">
                    <li> Matelas: ${matelas.getNom()}, le prix est de ${matelas.prix}€.
                        <form method="POST" action="addToCart">
                            <input type="hidden" name="matelasId" value="${matelas.id}"/>
                            <input type="submit" value="Ajouter au panier"/>
                        </form>
                    </li>
                    <br />
                </c:if>
            </c:forEach>
        </ul>

        <form action="index" method="POST">
            <label for="nom">Nom</label>
            <input type="text" name="nom" id="nom"/>
            <label for="prix">Prix</label>
            <input type="number" name="prix" id="prix"/>
            <input type="submit" value="Envoyer"/>
        </form>

        <c:choose>
            <c:when test="${stock.size() == 0}">
                Le stock est vide
            </c:when>
            <c:when test="${stock.size() == 1}">
                Il y a un matelas
            </c:when>           
            <c:otherwise>
                Il y a beaucoup de matelas
            </c:otherwise>
        </c:choose>

    </body>
</html>
