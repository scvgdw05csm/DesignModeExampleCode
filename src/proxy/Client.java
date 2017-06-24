package proxy;

import java.util.Collection;

public class Client {

    public static void main(String[] args) throws Exception {
        UserManager userManager = new UserManager();
        Collection<UserModelApi> col = userManager.getUserByDepId("0101");
        for (UserModelApi umApi : col) {
            System.out.println("userId:" + umApi.getUserId() + ", userName:" + umApi.getName());
        }
        
        for (UserModelApi umApi : col) {
            System.out.println("userId:" + umApi.getUserId() + ", userName:" + umApi.getName() + ", depId:" + umApi.getDepId());
        }
    }
}
