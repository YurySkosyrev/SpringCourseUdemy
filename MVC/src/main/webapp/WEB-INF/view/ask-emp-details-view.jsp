<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<DOCTYPE html>

    <html>
    <body>
    <h2>Dear Employee, please enter your details</h2>

    <br>
    <br>
    <form:form action="showDetails" modelAttribute="employee">
        Name <form:input path="name"/>
        <form:errors path="name"/>
        <br><br>
        Name <form:input path="surname"/>
        <form:errors path="surname"/>
        <br><br>
        Name <form:input path="salary"/>
        <form:errors path="salary"/>
        <br><br>
        Department <form:select path="department">
        <form:options items="${employee.departments}"/>
    </form:select>
        <br><br>
        Which car do you want?
        <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
        <br><br>
        Foreign language(s)
        <form:checkboxes path="languages" items="${employee.languageList}"/>
        <br><br>
        phoneNumber <form:input path="phoneNumber"/>
        <form:errors path="phoneNumber"/>
        <br><br>
        email <form:input path="email"/>
        <form:errors path="email"/>
        <br><br>
        <input type="submit" value="OK">
    </form:form>
    </body>
    </html>