import React from 'react';
import { FlatList, StyleSheet, View, Text, SafeAreaView } from 'react-native';
import {MaterialCommunityIcons} from '@expo/vector-icons'

var now = new Date();
const today=now.getDate() + "/"+ parseInt(now.getMonth()+1) +"/"+ now.getFullYear();

const myNotes=[
    {
        id:1,
        heading: 'Visit Grocery Shop',
        subheading:'Buy Eggs and Flour',
        type:'Personal',
        dateAdded:today
    },
    {
        id:2,
        heading: 'Visit Salon',
        subheading:'Have a HairCut',
        type:'Personal',
        dateAdded:today
    },
    {
        id:3,
        heading: 'Join Gym',
        subheading:'Golds Gym Sector 19',
        type:'Health',
        dateAdded:today
    },
    {
        id:4,
        heading: 'Visit Dentist',
        subheading:'Routine Checkup',
        type:'Health',
        dateAdded:today
    },
    {
        id:5,
        heading: 'Complete AU Assignments',
        subheading:'Check on Due Date',
        type:'Work',
        dateAdded:today
    },
    {
        id:6,
        heading: 'Complete Novel',
        subheading:'Complete Ikagai',
        type:'Personal',
        dateAdded:today
    },
    {
        id:7,
        heading: 'Rechage Mobile',
        subheading:'Expiring soon',
        type:'Personal',
        dateAdded:today
    },
    {
        id:8,
        heading: 'Take a walk around park',
        subheading:'Check newly opened coffee shop',
        type:'Personal',
        dateAdded:today
    }
];

function ListScreen(props) {
    return (
        <SafeAreaView style={styles.cont}>
            <FlatList
            
            data={myNotes}
            keyExtractor={note=>note.id.toString()}
            renderItem={({item})=>
            <View style={styles.noteTxt}>
                <Text style={styles.heading}>{item.heading}</Text>
                <Text style={styles.subheading}>{item.subheading} - {item.type}</Text>
                <Text style={styles.date}>{item.dateAdded}</Text>
        </View>}
            
            />
            <MaterialCommunityIcons name="plus-box-multiple" color="#0f07a6" style={styles.addNote} size={60} />
        </SafeAreaView>
    );
}

const styles = StyleSheet.create({
    cont:{
        marginTop:30
    },
    noteTxt:{
        borderRadius:15,
        backgroundColor:'#d5d6db',
        marginBottom:20,
        overflow:'hidden',
        padding:10,
        marginTop:10
    },
    date:{
        color:'#5b2a61',
        marginVertical:5,
        fontWeight:'bold'
    },
    subheading:{
        color:'#0b565c',
        fontWeight: 'bold'
    },
    heading:{
        marginBottom:8
    },
    addNote:{
        position:'absolute',
        bottom:10,
        right:0
    }


})

export default ListScreen;