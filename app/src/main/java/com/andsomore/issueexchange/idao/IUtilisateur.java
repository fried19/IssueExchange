package com.andsomore.issueexchange.idao;

public interface IUtilisateur <T>{
    public void seConnecter(T t, IConnected connected);
    public void seDeConnecter(T t, IConnected connected);

}
