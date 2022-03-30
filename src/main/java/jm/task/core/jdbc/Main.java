package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService dao = new UserServiceImpl();
        dao.createUsersTable();
        dao.saveUser("Maria", "Sergeeva", (byte) 68);
        dao.saveUser("Ivan", "Dorofeev", (byte) 24);
        dao.saveUser("Semen", "Alexseev", (byte) 17);
        dao.saveUser("Mike", "Pence", (byte) 46);
        dao.getAllUsers();
        dao.cleanUsersTable();
        dao.dropUsersTable();
        Util.closeConnection();
    }
}
