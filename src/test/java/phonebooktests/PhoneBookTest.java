package phonebooktests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import phonebook.PhoneBook;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    PhoneBook phoneBook;

    @BeforeEach
    public void setUp(){
        phoneBook  = new PhoneBook();
    }

    @Test
    void createPhoneBookWithoutParameters(){

        Assertions.assertTrue(phoneBook.getMap() instanceof HashMap);
    }

    @Test
    void addAllTest() {

        //Arrange - Given
        String name = "Joe";
        String [] phoneNumbers = {
                "302-234-5678",
                "302-756-8900",
                "302-234-5670",
                "302-756-8990"
        };


        //Act - When
        phoneBook.addAll(name, phoneNumbers);
        List<String> actual =  phoneBook.lookup(name);


        //Assert -Then
        Assertions.assertEquals(Arrays.asList(phoneNumbers), actual);

    }


    @Test
    void removeTest() {


        //Arrange - Given
        phoneBook.add("John", "302-100-2000");
        phoneBook.add("Jane", "302-200-3000");


        //Act - When
        phoneBook.remove("Jane");
        String actual =  phoneBook.reverseLookup("302-100-2000");
        String expected = phoneBook.getAllContactNames().toString().replace("[","").replace("]","");

        //Assert -Then
        Assertions.assertEquals(expected, actual);




    }

    @Test
    void reverseLookupTest() {


        //Arrange - Given
        phoneBook.add("Jerry", "302-123-4567");



        //Act - When
        String actual = phoneBook.reverseLookup("302-123-4567");


        //Assert -Then
        Assertions.assertEquals("Jerry", actual);


    }

}