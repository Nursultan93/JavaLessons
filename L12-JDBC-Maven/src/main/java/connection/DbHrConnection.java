package connection;

import module.EmpDep;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DbHrConnection {

    DBConnection connection = new DBConnection();

    PreparedStatement ps;
    ResultSet rs;

    public List<EmpDep> getEmployeeByDepId(Integer id){

        List<EmpDep> list  = new ArrayList<>();

        try {
            var conn =  connection.getConnection();

            ps = conn.prepareStatement("select e.FULL_NAME, e.PHONE, e.SALARY, d.NAME as DEP_NAME\n" +
                    "from Employee e\n" +
                    "inner join Department d on e.DEP_ID = d.ID\n" +
                    "where e.DEP_ID = ?");

            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {
                EmpDep e = new EmpDep();
                e.setFullName(rs.getString("FULL_NAME"));
                e.setPhone(rs.getString("PHONE"));
                e.setSalary(rs.getInt("SALARY"));
                e.setDepName(rs.getString("DEP_NAME"));

                list.add(e);
            }

            return list;
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
