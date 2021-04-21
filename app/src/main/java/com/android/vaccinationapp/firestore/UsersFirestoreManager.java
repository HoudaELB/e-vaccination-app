package com.android.vaccinationapp.firestore;

import com.android.vaccinationapp.datamodel.User;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

import static com.android.vaccinationapp.firestore.UsersFirestoreDbContract.COLLECTION_NAME;

public class UsersFirestoreManager {

    private static UsersFirestoreManager usersFirestoreManager;
    private FirebaseFirestore firebaseFirestore;
    private CollectionReference usersCollectionReference;


    public static UsersFirestoreManager newInstance() {
        if (usersFirestoreManager == null) {
            usersFirestoreManager = new UsersFirestoreManager();
        }
        return usersFirestoreManager;
    }

    private UsersFirestoreManager() {
        firebaseFirestore = FirebaseFirestore.getInstance();
        usersCollectionReference = firebaseFirestore.collection(COLLECTION_NAME);
    }

    public void createDocument(User user) {
        usersCollectionReference.add(user);
    }

    public void sendUsersBulk() {
        // Create a new Contact document map of values and add it to the collection
        createDocument(new User("EL BIACHE Houda", "houdaelbiache@gmail.com", "0653818691", "CD286763", 21, "Fès"));
    }

}

