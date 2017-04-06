<%-- 
    Document   : CadastroCarro.jsp
    Created on : 05/04/2017, 22:12:35
    Author     : aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        Placa:<input type="text" name="placa" value="" /><br><br>
        Nome:<input type="text" name="nome" value="" /><br><br>
        Marca:<input type="text" name="marca" value="" /><br><br>
        Modelo:<input type="text" name="modelo" value="" /><br><br>
        Preço:<input type="text" name="preco" value="" /><br><br>
        Valor da Diária:<input type="text" name="valor" value="" /><br><br>
        Dias de locação:<input type="text" name="ValorDiariaAlocacao" value="" /><br><br>
        Situação:<select name="situacao">
            <option></option>
            <option>Locado</option>
            <option>Livre</option>
        </select>
        
    </body>
</html>
