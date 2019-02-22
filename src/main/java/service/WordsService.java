package service;

import dao.WordsDao;

public class WordsService {

    public String find(String word){
        String result="";
        String rusA = "йцукенгшщзхъфывапролжэячсмитьбю";
        if(rusA.indexOf(word.charAt(0))!=-1){
            result=findEng(word);
        }
        String engA = "qwertyuiopasdfghjklzxcvbnm";
        if(engA.indexOf(word.charAt(0))!=-1){
            result=findRus(word);
        }
        return result;
    }

    public String findEng(String rus){
        return String.valueOf(new WordsDao().findByRusName(rus));
    }

    public String findRus(String eng){
        return String.valueOf(new WordsDao().findByEngName(eng));
    }
}
