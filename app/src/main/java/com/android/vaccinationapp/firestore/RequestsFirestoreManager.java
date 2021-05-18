package com.android.vaccinationapp.firestore;

<<<<<<< HEAD
import com.android.vaccinationapp.model.Request;
=======
import com.android.vaccinationapp.datamodel.Request;
>>>>>>> 23e307d3430f3024371d1d548381a1a0923a590d
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

import static com.android.vaccinationapp.firestore.RequestsFirestoreDbContract.COLLECTION_NAME;

public class RequestsFirestoreManager {
    private static RequestsFirestoreManager requestsFirestoreManager;
    private FirebaseFirestore firebaseFirestore;
    private CollectionReference requestsCollectionReference;


    public static RequestsFirestoreManager newInstance() {
        if (requestsFirestoreManager == null) {
            requestsFirestoreManager = new RequestsFirestoreManager();
        }
        return requestsFirestoreManager;
    }

    private RequestsFirestoreManager() {
        firebaseFirestore = FirebaseFirestore.getInstance();
        requestsCollectionReference = firebaseFirestore.collection(COLLECTION_NAME);
    }

    public void createDocumentRequest(Request request) {
        requestsCollectionReference.add(request);
    }

}
