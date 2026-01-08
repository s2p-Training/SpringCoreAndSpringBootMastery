package org.s2p.service;

import org.s2p.dto.ContactRequestDto;

import java.util.List;

public interface ContactService {

    boolean saveContact(ContactRequestDto contactRequestDto);
}