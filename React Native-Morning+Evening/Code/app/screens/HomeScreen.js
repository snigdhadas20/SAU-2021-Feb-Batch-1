import React from 'react';
import {StyleSheet, Text, View} from 'react-native'
import MyButton from '../components/MyButton'

function HomeScreen(props) {
    return (
        <View style={styles.bg}>
            <View style={styles.textCon}><Text style={styles.tSyles}>Notes App</Text>
            </View>
            <View style={styles.logButtons}>
                <MyButton title="Login" />
                <MyButton title="Register" />
            </View>
        </View>
    );
}


const styles = StyleSheet.create({
    bg:{
        backgroundColor: '#e6ffd6',
        flex:1,
        justifyContent:'flex-end',
        alignItems:'center'
    },
    textCon:{
        position:'absolute',
        alignItems:'center',
        top:150
    },
    tSyles:{
        fontSize: 48,
        color:'#00218c'
        
    },
    logButtons:{
        padding:20,
        width:'100%'
    }
})

export default HomeScreen;