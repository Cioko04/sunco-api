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
        return tableRepository.selectKolumnOneDistinct();
    }
    public List<Table> getKolumnOneRepeated() {
        return tableRepository.selectKolumnOneRepated();
    }
    public List<Table> getKolumnTwoDistinct() {
        return tableRepository.selectKolumnTwoDistinct();
    }
    public List<Table> getKolumnTwoRepeated() {
        return tableRepository.selectKolumnTwoRepated();
    }
    public List<Table> getKolumnThreeDistinct() {
        return tableRepository.selectKolumnThreeDistinct();
    }
    public List<Table> getKolumnThreeRepeated() {
        return tableRepository.selectKolumnThreeRepated();
    }
    public List<Table> getKolumnFourDistinct() {
        return tableRepository.selectKolumnFourDistinct();
    }
    public List<Table> getKolumnFourRepeated() {
        return tableRepository.selectKolumnFourRepated();
    }
}
