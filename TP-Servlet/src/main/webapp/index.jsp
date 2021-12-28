<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>

<head>
    <meta charset="utf-8">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

</head>

<body>
 
    <div class="container">
        <h3>Java Servlet</h3>
        <div class="panel panel-primary">

            <div class="panel-body">
                 <form method = "POST" action="MyServlet">
                    <div class="form-group">
                        <label for="pwd">Nom :</label>
                        <input type="text" required class="form-control" name="Nom" placeholder="Saisir votre nom">
                    </div>
                    <div class="form-group">
                        <label for="pwd">Prenom :</label>
                        <input type="text" required class="form-control" name="Prenom" placeholder="Saisir votre prenom">
                    </div>
                    <div class="form-group">
                        <label for="pwd">Date de naissance :</label>
                        <input type="date" required class="form-control" name="Date" placeholder="Saisir votre nom">
                    </div>
                    <label for="pwd">Sex :</label> 
                    <input type="radio" id="sex" name="sex" value="female"  />  Female
                    <input type="radio" id="sex" name="sex"  value="Male" />  Male
                    </div>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </form>
            </div>
        </div>
    </div>

    <body>

</html>