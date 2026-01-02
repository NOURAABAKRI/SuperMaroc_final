public class TestDatabaseConnection {
    public static void main(String[] args) {
        try {
            System.out.println("Testing Agadir DB...");
            System.out.println(mini_admin.agadir.DAO.DBConnectionAgadir.getConnection());

            System.out.println("Testing Casa DB...");
            System.out.println(mini_admin.casa.DAO.DBConnectionCasa.getConnection());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
