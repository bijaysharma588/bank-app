<%-- 
    Document   : profileController
    Created on : Jul 6, 2018, 8:00:15 PM
    Author     : Bijay Sharma
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>THis is my Jsp page</title>
    </head>
    <body>
        <%!
            Statement stm;
            String str;
            Connection con;
            File file;
            int maxSize=9000*9;
            int maxFactSize=9000*9;
            String path="C:/Users/Bijay Sharma/Documents/NetBeansProjects/sampleProfile/web/image";
            %>
            <%
                String type=request.getContentType();
                out.println(type);
                if(type.indexOf("multipart/form-data")>=0)
                        {
                    out.println("Its a multipart data.");
                    DiskFileItemFactory disFact=new DiskFileItemFactory();
                    disFact.setSizeThreshold(maxFactSize);
                    disFact.setRepository(new File("c:\\temp"));
                    ServletFileUpload upload=new ServletFileUpload(disFact);
                    upload.setSizeMax(maxSize);
                    List lis=upload.parseRequest(request);
                    Iterator itr=lis.iterator();
                    while(itr.hasNext()){
                     
                        FileItem item=(FileItem)itr.next();
                        if(!item.isFormField()){
                            str=item.getName();
                            str=str.substring(0,1) + "bijay"+ str.substring(str.indexOf("."));
                            out.println(str);
                            file=new File(path,str);
                            item.write(file);
                            out.println("Successfully uploaded...");
                            
                        }
                    }
                }
                %>
                
                <%
                    try{
                      String query="insert into imgpath values('"+str+"')";  
                Class.forName("oracle.jdbc.OracleDriver");
                con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","root","B+9843023930");
                stm=con.createStatement();
                stm.executeLargeUpdate(query);
                out.println("filePath stored.");
                
                    }
                    catch(Exception ex){
                     ex.printStackTrace();
                    }
                
                
                
                
                %>
                <a href="imageShow.jsp">click to show data</a>
                
    </body>
</html>
