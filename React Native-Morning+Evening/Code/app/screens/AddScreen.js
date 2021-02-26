import React from 'react';
import { View, TextInput, StyleSheet } from 'react-native';
import MyButton from '../components/MyButton'

function AddScreen(props) {
    return (
        <View style={styles.mainCont}>
            <View style={styles.itemCont}>
            <View style={styles.textCont}>
                <TextInput style={styles.textStyle} placeholder="Enter Note Title" placeholderTextColor="#fff" /></View>
            
            <View style={styles.textCont}>
                <TextInput style={styles.textStyle} placeholder="Enter Note Desciption" placeholderTextColor="#fff" />
            </View>
            <View style={styles.textCont}>
                <TextInput style={styles.textStyle} placeholder="Enter Category" placeholderTextColor="#fff" /></View>
            </View>
            <View style={styles.logButtons}>
                <MyButton title="Add" />
            </View>

            
        </View>
    );
}

const styles = StyleSheet.create({
    mainCont:{
        marginBottom:10,
        borderRadius:20,
        width:'100%',
        backgroundColor:'blue',
        opacity:0.5,
        color:'white',
        flex:1,
        justifyContent:'center'
    },
    textCont:{
        backgroundColor:'white',
        padding:20,
        marginBottom:20
    },
    textStyle:{
        fontSize:15,
        fontFamily:"Roboto",
        color:"white",  
      },
    logButtons:{
        padding:20,
        width:'100%',
        
    }  
})

export default AddScreen;