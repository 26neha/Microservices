package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    //fake list of contacts

    List<Contact> list=List.of(
            new Contact(1L, "amit@gmail.com", "Amit", 7890L),
            new Contact(2L, "anil@gmail.com", "Anil", 1234L),
            new Contact(3L, "sunil@gmail.com", "Sunil", 7899L),
            new Contact(4L, "sameer@gmail.com", "Sameer", 4578L),
            new Contact(5L, "rohan@gmail.com", "Rohan", 7891L));

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
