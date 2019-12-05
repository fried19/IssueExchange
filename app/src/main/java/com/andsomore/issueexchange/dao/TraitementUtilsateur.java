package com.andsomore.issueexchange.dao;


import android.util.Log;

import com.andsomore.issueexchange.Singleton.ApplicationContext;
import com.andsomore.issueexchange.entite.Utilisateur;
import com.andsomore.issueexchange.idao.IConnected;
import com.andsomore.issueexchange.idao.IResult;
import com.andsomore.issueexchange.idao.IUtilisateur;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import static android.content.ContentValues.TAG;

public class TraitementUtilsateur implements IUtilisateur<Utilisateur> {

     private FirebaseAuth auth = FirebaseAuth.getInstance();
    @Override
    public void seConnecter(Utilisateur utilisateur, IConnected connected) {

    }

    @Override
    public void seDeConnecter(Utilisateur utilisateur, IConnected connected) {
        

    }


}
