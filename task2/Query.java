package homeWork2.task2;

import com.sun.xml.internal.txw2.annotation.XmlNamespace;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.Date;

/**
 * Created by macbookair on 19.02.16.
 */
@XmlRootElement(name = "query")
public class Query {

    //для чего этот namespace, нужно ли его припысывать если и так работает???
    @XmlAttribute(namespace = "http://www.yahooapis.com/v1/base.rng")
    public int count;
    @XmlAttribute(namespace = "http://www.yahooapis.com/v1/base.rng")
    public String created;
    @XmlAttribute(namespace = "http://www.yahooapis.com/v1/base.rng")
    public String lang;
    @XmlElement(name = "results")
    public Results results;

    public Query() {
    }

//
}
