# SpringBoot-Learning
Learning how Java Spring works for web applications
# Name
'           '
# Specs
A web application with a vue frontend and Spring Boot backend hosted on docker.
The website can register and login users.
Users can click buttons to figure out an idea of what kind of food they want to pick up
Each button will submit a query through the google maps api within a certain radius at the users location and find food
Users can star their favorite restaurants and can view as a page.
# How its made™

First 15 Commits:
    Created base code for:
        {UserDao, UserService,
         User, UserDataAccess}
    UserDataAccess:
        POST METHOD WORKS
        GET METHOD WORKS
    User:
       Constructor Parameters accepted via JSON
       Register Form in Vue follows json attibutes
    UserDao:
        function outline for UserService
    UserService:
        Actions to List<User>
        ADD/GET ONLY
        FIXME: update, del, listall

