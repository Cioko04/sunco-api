package com.example.sunco.table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
public class TableController {
    private final TableService tableService;

    @Autowired
    public TableController(TableService tableService) {
        this.tableService = tableService;
    }

    @GetMapping(path = "one/distinct")
    public List<Table> getKolumnOneDistinct() {
        return tableService.getKolumnOneDistinct();
    }
    @GetMapping(path = "one/repeated")
    public List<Table> getKolumnOneRepeated() {
        return tableService.getKolumnOneRepeated();
    }
    @GetMapping(path = "two/distinct")
    public List<Table> getKolumnTwoDistinct() {
        return tableService.getKolumnTwoDistinct();
    }
    @GetMapping(path = "two/repeated")
    public List<Table> getKolumnTwoRepeated() {
        return tableService.getKolumnTwoRepeated();
    }
    @GetMapping(path = "three/distinct")
    public List<Table> getKolumnThreeDistinct() {
        return tableService.getKolumnThreeDistinct();
    }
    @GetMapping(path = "three/repeated")
    public List<Table> getKolumnThreeRepeated() {
        return tableService.getKolumnThreeRepeated();
    }
    @GetMapping(path = "four/distinct")
    public List<Table> getKolumnFourDistinct() {
        return tableService.getKolumnFourDistinct();
    }
    @GetMapping(path = "four/repeated")
    public List<Table> getKolumnFourRepeated() {
        return tableService.getKolumnFourRepeated();
    }
}
