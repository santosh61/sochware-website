package sochwarelogin




class UserController {
    def login(){
        render(view: "login")

    }
    def dashBoard(){
        render(view:"dashboard")
    }
    def register(){
        def name=params.name

        def email=params.email
        def password=params.password
        def rpassword=params.rpassword
       if(password==rpassword)
       {
           User user=new User()

           user.name=name
           user.password=password
           user.email=email

           user.save()

           render(view: "dashboard")
       }




        }


}
