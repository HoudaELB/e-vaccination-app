package com.android.vaccinationapp.firestore;

<<<<<<< HEAD
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

import com.android.vaccinationapp.model.User;

=======
import com.android.vaccinationapp.datamodel.User;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

>>>>>>> 23e307d3430f3024371d1d548381a1a0923a590d
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
        createDocument(new User("EL BIACHE Houda", "houdaelbiache@gmail.com", "0653818691", "CD286763", 21, "Fès"));
    }

}

