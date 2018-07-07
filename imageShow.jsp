<%-- 
    Document   : imageShow
    Created on : Jul 7, 2018, 1:10:24 AM
    Author     : Bijay Sharma
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My second JSP page</title>
    </head>
    <body>
        <%!
            Statement stm;
            Connection con;
            ResultSet res;
            String impath;
        %>
        <%
                    try{
                      String query="select * from imgpath";  
                Class.forName("oracle.jdbc.OracleDriver");
                con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","root","B+9843023930");
                stm=con.createStatement();
                res=stm.executeQuery(query);
               while(res.next()){
                   res.getString("impath");
                   %>
                            <div>
                                <img src="image/<%=impath%>" height="150" width="150"> 
                            </div>
                   
                    <%
               }
                
                    }
                    catch(Exception ex){
                     ex.printStackTrace();
                    }
                %>
                
        
        
    </body>
</html>
