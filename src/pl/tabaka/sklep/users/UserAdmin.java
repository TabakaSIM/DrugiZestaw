package pl.tabaka.sklep.users;

public class UserAdmin extends User{
    public UserAdmin(String login, String password, float money) {
        super(login, password, money);
    }

    public UserAdmin(User user){
        super(user);
    }
}
