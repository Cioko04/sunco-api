package com.example.sunco.table;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TableRepository extends JpaRepository<Table, Long> {
    @Query(value = "SELECT t FROM tabela_testowa t GROUP BY t.kolumna1 HAVING COUNT(t.kolumna1) = 1", nativeQuery = false)
    List<Table> selectKolumnOneDistinct();
    @Query(value = "SELECT t FROM tabela_testowa t GROUP BY t.kolumna1 HAVING COUNT(t.kolumna1) > 1", nativeQuery = false)
    List<Table> selectKolumnOneRepated();
    @Query(value = "SELECT t FROM tabela_testowa t GROUP BY t.kolumna2 HAVING COUNT(t.kolumna1) = 1", nativeQuery = false)
    List<Table> selectKolumnTwoDistinct();
    @Query(value = "SELECT t FROM tabela_testowa t GROUP BY t.kolumna2 HAVING COUNT(t.kolumna1) > 1", nativeQuery = false)
    List<Table> selectKolumnTwoRepated();
    @Query(value = "SELECT t FROM tabela_testowa t GROUP BY t.kolumna3 HAVING COUNT(t.kolumna1) = 1", nativeQuery = false)
    List<Table> selectKolumnThreeDistinct();
    @Query(value = "SELECT t FROM tabela_testowa t GROUP BY t.kolumna3 HAVING COUNT(t.kolumna1) > 1", nativeQuery = false)
    List<Table> selectKolumnThreeRepated();
    @Query(value = "SELECT t FROM tabela_testowa t GROUP BY t.kolumna4 HAVING COUNT(t.kolumna1) = 1", nativeQuery = false)
    List<Table> selectKolumnFourDistinct();
    @Query(value = "SELECT t FROM tabela_testowa t GROUP BY t.kolumna4 HAVING COUNT(t.kolumna1) > 1", nativeQuery = false)
    List<Table> selectKolumnFourRepated();
}
