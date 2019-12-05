package com.andsomore.issueexchange.idao;

public interface IArticle <T>{
    public void posterArticle(T t,IResult iResult);
    public void supprimerArticle(T t,IResult result);
}
