<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Campañas</title>
        <%@include file="/public/header.jsp" %>
    </head>
    <body>
        <%@include file="/public/topbar.jsp" %>
        <div class="container-fluid">
            <div class="row">
                <%@include file="/public/menu.jsp" %>

                <!-- CONTENIDO -->
                <section class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
                    <a href="<%=request.getContextPath()%>/campain/create" class="btn btn-primary pull-right" >Nuevo</a>
                    <h1 class="page-header">Campañas</h1>

                    <table class="table table-hover table-striped">

                        <tr class="bg-info">
                            <th width="70%">Campaña</th>
                             <th width="30%">Programación</th>
                            <th></th>
                        </tr>

                        <c:forEach var="i" items="${campain}">
                            <tr>
                                <td><c:out value="${i.nombre}"/></td>
                                <td><c:out value='${i.fechaInicio}'/> - <c:out value ='${i.fechaFin}'/> </td>

                                <td>
                                    <div class="btn-group">
                                        <button class="btn btn-link dropdown-toggle" data-toggle="dropdown">
                                            <span class="glyphicon glyphicon-cog"></span>
                                        </button>
                                        <ul class="dropdown-menu pull-right" role="menu">
                                            <li><a href="<%=request.getContextPath()%>/campain/update/${i.id}">Editar</a></li>
                                            <li><a href="<%=request.getContextPath()%>/campain/delete/${i.id}">Eliminar</a></li>
                                        </ul>
                                    </div>
                                </td>
                            </tr>
                        </c:forEach>

                    </table>
                </section>
                <!-- CONTENIDO -->
                
                
            </div>
        </div>
    </body>
    <%@include file="/public/footer.jsp" %>
</html>
