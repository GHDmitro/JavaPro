package homeWork2;

import com.sun.tools.hat.internal.server.QueryListener;
import com.sun.tools.javac.code.Attribute;

import javax.management.Query;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

/**
 * Created by macbookair on 18.02.16.
 */
public class SqlDateAdapter extends XmlAdapter<String, Date>{


    public Date unmarshal(String v) {
        SimpleDateFormat dateFormat = new SimpleDateFormat();
        Date sqlDate = null;
        try {
            java.util.Date convertedDate = dateFormat.parse(v);
            sqlDate = new java.sql.Date(convertedDate.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return sqlDate;
    }

    @Override
    public String marshal(Date v) throws Exception {
        return v.toString();
    }

}
