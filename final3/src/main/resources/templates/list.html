<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org" th:with="lang=${#locale.language}" th:lang="${lang}">
<div class="container pl-0">
    <div class="row pb-3 pt-3 mb-2 pl-0 ml-0">
        <div class="col-12 pl-0"><a type="button" th:href="${(#mvc.url('UC#addUserForm')).build()}"
                                    class="btn btn-secondary">Create new user</a></div>
    </div>
</div>
<br>
<p></p>
<b>
    <th>1.Name</th>
    <th>2.Last name</th>
    <br>
    <th>3.E-mail</th>
    <th>4.Password</th>
</b>
<br>
<p></p>
<div th:each="user,rowStat : ${users}"
     th:classappend="${rowStat.count % 2 != 0 ? 'bg-light text-dark' : 'bg-secondary text-white'}">
    <div th:text="'1.'+ ${user.getFirstName() +' 2.'+  user.getLastName() }"/>
    <div th:text="' 3.'+ ${user.getEmail() + ' 4.'+user.getPassword()}"/>
    <form  th:action="@{/users/{id}/edit(id=${user.getId()})}">
        <input type="submit" value="Edit"/>
    </form>
    <form th:method="DELETE" th:action="@{'/users/delete/' + ${user.getId()}}">
        <input type="submit" value="Delete"/>
    </form>
    <p>
    <p>
</div>
</div>
</div>
<div class="container" th:remove="${users.size() != 0} ? all">
    <div class="row p-3 mb-2 bg-light text-dark">
        <div class="col-12">Users not found. Please insert.</div>
    </div>
</div>
</body>
</html>
