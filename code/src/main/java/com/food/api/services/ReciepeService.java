package com.food.api.services;

import org.springframework.stereotype.Service;

import com.food.api.dto.Request;
import com.food.api.repository.ApiRepository;
import com.food.api.entity.Url;

import javax.persistence.EntityNotFoundException;
import java.util.Date;

@Service
public class ReciepeService {

    private final ApiRepository urlRepository;
    private final BaseConversion conversion;

    public ReciepeService(ApiRepository urlRepository, BaseConversion baseConversion) {
        this.urlRepository = urlRepository;
        this.conversion = baseConversion;
    }

    public String convertToShortUrl(Request request) {
        var url = new Url();
        url.setLongUrl(request.getLongUrl());
        url.setExpiresDate(request.getExpiresDate());
        url.setCreatedDate(new Date());
        var entity = urlRepository.save(url);

        return conversion.encode(entity.getId());
    }

    public String getOriginalUrl(String shortUrl) {
        var id = conversion.decode(shortUrl);
        var entity = urlRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("There is no entity with " + shortUrl));

        if (entity.getExpiresDate() != null && entity.getExpiresDate().before(new Date())){
            urlRepository.delete(entity);
            throw new EntityNotFoundException("Link expired!");
        }

        return entity.getLongUrl();
    }
}
