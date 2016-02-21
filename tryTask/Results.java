package homeWork2.tryTask;

import homeWork2.tryTask.Rate;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "results")
public class Results {
    @XmlElement(name = "rate")
    public Rate[] rate;
}
