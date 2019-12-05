package com.andsomore.issueexchange.idao;

public interface ICommentaire<T> {
    public void commenterMessage(T t,IResult result);
    public void supprimerCommentaire(T t,IResult result);

}
