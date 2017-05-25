<%-- 
    Document   : game
    Created on : Oct 31, 2016, 9:24:29 AM
    Author     : n5leee00
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="org.mypackage.deck.Deck" %>
<%@page import="org.mypackage.deck.Game" %>
<%@page import="org.mypackage.deck.Card" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        
        <h1></h1>
        
         <%
            
            Game game = new Game();
            
            ArrayList <String> path = (ArrayList<String>)session.getAttribute("path");
            
            session.getAttribute("game");
            
            game.stopCounter();
            game.calculateReactionTime();
            
         %><img src="<%=path.get(0)%>">&nbsp;&nbsp;
         <img src="<%=path.get(1)%>">
            <br><br>
            
                <p>Kortit olivat samat. Reaktioaika: <%=game.getReactionTime()%> ms
                <p>Aloita tästä uusi peli.</p>
                <form action="game.jsp" method="post">
                    <input type="submit" value="Seuraavat kortit" />
                </form>
            
           
                
                
                             
        
    </body>
</html>