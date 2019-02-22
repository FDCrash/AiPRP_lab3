package dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateSession;

public class WordsDao {

    public Object findByEngName(String word) {
        Session session = HibernateSession.getSessionFactory();
        Query query = session.createQuery("Select rus FROM Words where eng = :param");
        query.setParameter("param", word);
        return query.list().get(0);
    }

    public Object findByRusName(String word) {
        Session session= HibernateSession.getSessionFactory();
        Query query = session.createQuery("Select eng FROM Words where rus = :param");
        query.setParameter("param", word);
        return query.list().get(0);
    }

}
