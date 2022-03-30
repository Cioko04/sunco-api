package com.example.sunco.table;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface TableRepository extends JpaRepository<Table, Long> {
    @Query(value = "SELECT t FROM tabela_testowa t GROUP BY t.kolumna1 HAVING COUNT(t.kolumna1) = 1", nativeQuery = false)
    List<Table> getKolumnOneDistinct();
    @Query(value = "SELECT t.kolumna1 FROM tabela_testowa t GROUP BY t.kolumna1 HAVING COUNT(t.kolumna1) > 1", nativeQuery = false)
    Set<String> getKolumnOneRepated();
    List<Table> findAllByKolumna1In(Set<String> kolumna1);
    @Query(value = "SELECT t FROM tabela_testowa t GROUP BY t.kolumna2 HAVING COUNT(t.kolumna2) = 1", nativeQuery = false)
    List<Table> getKolumnTwoDistinct();
    @Query(value = "SELECT t.kolumna2 FROM tabela_testowa t GROUP BY t.kolumna2 HAVING COUNT(t.kolumna2) > 1", nativeQuery = false)
    Set<String> getKolumnTwoRepated();
    List<Table> findAllByKolumna2In(Set<String> kolumna2);
    @Query(value = "SELECT t FROM tabela_testowa t GROUP BY t.kolumna3 HAVING COUNT(t.kolumna3) = 1", nativeQuery = false)
    List<Table> getKolumnThreeDistinct();
    @Query(value = "SELECT t.kolumna3 FROM tabela_testowa t GROUP BY t.kolumna3 HAVING COUNT(t.kolumna3) > 1", nativeQuery = false)
    Set<String> getKolumnThreeRepated();
    List<Table> findAllByKolumna3In(Set<String> kolumna3);
    @Query(value = "SELECT t FROM tabela_testowa t GROUP BY t.kolumna4 HAVING COUNT(t.kolumna4) = 1", nativeQuery = false)
    List<Table> getKolumnFourDistinct();
    @Query(value = "SELECT t.kolumna4 FROM tabela_testowa t GROUP BY t.kolumna4 HAVING COUNT(t.kolumna4) > 1", nativeQuery = false)
    Set<Long> getKolumnFourRepated();
    List<Table> findAllByKolumna4In(Set<Long> kolumna4);
}
