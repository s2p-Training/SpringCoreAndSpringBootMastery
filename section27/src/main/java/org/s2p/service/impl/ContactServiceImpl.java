package org.s2p.service.impl;

import lombok.RequiredArgsConstructor;
import org.s2p.dto.ContactRequestDto;
import org.s2p.entity.Contact;
import org.s2p.repository.ContactRepository;
import org.s2p.service.ContactService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService
{
    private final ContactRepository contactRepository;


    @Override
    public boolean saveContact(ContactRequestDto contactRequestDto) {
        try {
            Contact contact = transformToEntity(contactRequestDto);
            contact.setCreatedAt(Instant.now());
            contact.setCreatedBy(contactRequestDto.getName());
            contactRepository.save(contact);
            return true;
        } catch (Exception exception) {
            return false;
        }

    }

    private Contact transformToEntity(ContactRequestDto contactRequestDto) {
        Contact contact = new Contact();
        BeanUtils.copyProperties(contactRequestDto, contact);
        return contact;
    }
}
