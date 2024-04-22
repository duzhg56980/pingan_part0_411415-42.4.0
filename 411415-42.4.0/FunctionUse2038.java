import org.postgresql.jdbc.PgConnection;
public class FunctionUse2038 {
public void funcUse() {
PgConnection pgconnection = new PgConnection();
pgconnection.setTypeMapImpl(null);
}
}