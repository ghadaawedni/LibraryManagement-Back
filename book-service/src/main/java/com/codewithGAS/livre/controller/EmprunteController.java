package com.codewithGAS.livre.controller;
import com.codewithGAS.livre.entity.EmprunteDTO;
import com.codewithGAS.livre.entity.Emprunte;
import com.codewithGAS.livre.repository.EmprunteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/books")
@CrossOrigin(allowedHeaders = "**")
public class EmprunteController {
    @Autowired
    private EmprunteRepository emprunteRepository;
    @Autowired
    private BookController bookController;

    @GetMapping("/empruntes/all")
    public List<EmprunteDTO> getAllEmprunte() {

        List<Emprunte> Emp = emprunteRepository.findAll();
        List<EmprunteDTO> EmpDTO =  Emp.stream().map(emprunte -> {
            //rest Template
            EmprunteDTO empDto = new EmprunteDTO(emprunte.getId(),emprunte.getBookId(),emprunte.getStudentId(),emprunte.getDateEmprunte(),emprunte.getDatePrevue(),emprunte.getDateRetour()
            ,bookController.getBook(emprunte.getBookId()).getBookName(),"aymen");
            return empDto;

        }).collect(Collectors.toList());
        return EmpDTO;
    }

    @PostMapping("/empruntes/save")
    public Emprunte saveEmprunte(@RequestBody Emprunte emprunte) {
        return emprunteRepository.save(emprunte);
    }

    @DeleteMapping("/empruntes/{id}")
    public void deleteEmprunte(@PathVariable("id") Long emprunteId) {  emprunteRepository.deleteById(emprunteId);  }

}
