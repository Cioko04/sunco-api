package com.example.sunco.table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableService {
    private final TableRepository tableRepository;
    @Autowired
    public TableService(TableRepository tableRepository) {
        this.tableRepository = tableRepository;
    }

    public List<Table> getKolumnOneDistinct() {
        return tableRepository.getKolumnOneDistinct();
    }
    public List<Table> getKolumnOneRepeated() {
        return tableRepository.findAllByKolumna1In(tableRepository.getKolumnOneRepated());
    }
    public List<Table> getKolumnTwoDistinct() {
        return tableRepository.getKolumnTwoDistinct();
    }
    public List<Table> getKolumnTwoRepeated() {
        return tableRepository.findAllByKolumna2In(tableRepository.getKolumnTwoRepated());
    }
    public List<Table> getKolumnThreeDistinct() {
        return tableRepository.getKolumnThreeDistinct();
    }
    public List<Table> getKolumnThreeRepeated() {
        return tableRepository.findAllByKolumna3In(tableRepository.getKolumnThreeRepated());
    }
    public List<Table> getKolumnFourDistinct() {
        return tableRepository.getKolumnFourDistinct();
    }
    public List<Table> getKolumnFourRepeated() {
        return tableRepository.findAllByKolumna4In(tableRepository.getKolumnFourRepated());
    }
}
