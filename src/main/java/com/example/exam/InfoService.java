package com.example.exam;

import org.springframework.stereotype.Service;

@Service
public class InfoService {
    private final InfoRepository infoRepository;

    public InfoService(InfoRepository infoRepository) {
        this.infoRepository = infoRepository;
    }

    public int calculate(String type, int x, int y) {
        int result = 0;
        switch (type) {
            case "sum":
                result = x + y;
                break;
            case "mult":
                result = x * y;
                break;
            default:
                throw new IllegalArgumentException("Invalid calculation type: " + type);
        }

        Inform inform = new Inform(type, x, y, result);
        infoRepository.save(inform);
        return result;
    }

}
