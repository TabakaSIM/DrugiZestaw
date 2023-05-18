package pl.tabaka.sklep.users;

import pl.tabaka.sklep.GUI.GUI;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserList {
    private final GUI gui = GUI.getInstance();
    private final Map<String,User> userList = new HashMap<>();
    private static final UserList instance = new UserList();

    private UserList() {
    }

    public void register(User user, boolean fromDB){
        if(userList.containsKey(user.getLogin())){
            if(!fromDB)gui.showRegisterError();
            return;
        } else {
            userList.put(user.getLogin(), user);
            if(!fromDB)gui.showRegisterSucces();
            return;
        }
    }

    public User findUser(String login) {
        return this.userList.get(login);
    }

    public void showUsers(){
        for (String key : userList.keySet()){
            gui.showUser(userList.get(key));
        }
    }

    public Collection<User> getUsers(){
        return userList.values();
    }

    public static UserList getInstance(){
        return instance;
    }

    public boolean hasUser(String name) {
        return userList.containsKey(name);
    }
}
