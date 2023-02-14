import firebase from "firebase/app";
import 'firebase/firestore';
import 'firebase/auth';

if(!firebase.apps.length) {
    firebase.initializeApp({
        apiKey: "AIzaSyBImsbMoo9tDWfhTbNgi0OVArtpsyKqxDA",
        authDomain: "curso-firebase-cea58.firebaseapp.com",
        projectId: "curso-firebase-cea58",
        storageBucket: "curso-firebase-cea58.appspot.com",
        messagingSenderId: "119434960867",
        appId: "1:119434960867:web:15906d56b19aff1f7c0ad6",
        measurementId: "G-5LK2DZLNG5"
    })
}

export default firebase;