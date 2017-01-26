<html>
<head><title>title</title>
<body>
<div id="header">
</div>

<div id="content">
  <fieldset>
  	<legend>Add Person</legend>
  <form name="person" action="ftlsuccess" method="post">
  	Firstname: <input type="text" name="name" />	<br/>
  	Lastname: <input type="text" name="surname" />	<br/>
  	<input type="submit" value="   Save   " />
  </form>
  </fieldset>
  <br/>
  <table class="datatable">
    <tr>
      <th>Name</th>
      <th>Surname</th>
    </tr>
    <#list model["personList"] as person>
      <tr>
        <td>${person.name}</td>
        <td>${person.surname}</td>
      </tr>
    </#list>
  </table>

</div>  
</body>
</html>  