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
            
             Game game = null;
            ArrayList <String> path = null;
       
            if((Game)session.getAttribute("game") == null){
                
                game = new Game();
                
            }
            else {
                game = (Game)session.getAttribute("game");
            }
            
            int cards = game.getSizeOfDeck();
            
            if (cards != 0) {
                    
                    path = new ArrayList <String>(game.getFilePathsOfRandomCards());
                    session.setAttribute("game", game);
                    session.setAttribute("path", path);
                    game.removeRandomCards();
                    game.startCounter();
                
                    for (int i = 0; i < path.size(); i++) { %>
                    <img src="<%=path.get(i)%>">&nbsp;&nbsp;
                <% }
                
            %>
            <br><br>
            Kortteja jäljellä <%=game.getSizeOfDeck()%>
                <p></p>
                <form action="game.jsp" method="get">
                    <input type="submit" value="Seuraavat kortit" />
                </form>
                <p></p>
                <form action="check.jsp" method="get">
                    <input type="submit" value="SAMA!"/>
                </form><%         
        }%>
    </body>
</html>
