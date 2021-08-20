package com.example.dev_patika02.controller;


import com.example.dev_patika02.model.PermanentInstructor;
import com.example.dev_patika02.model.Student;
import com.example.dev_patika02.service.PermamentInstructorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PermamentInstructorController {

    private PermamentInstructorService permamentInstructorService;

    public PermamentInstructorController(PermamentInstructorService permamentInstructorService) {
        this.permamentInstructorService = permamentInstructorService;
    }

    @GetMapping("/permaments")
    public ResponseEntity<List<PermanentInstructor>> findAll(){
        return new ResponseEntity<>(permamentInstructorService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/permaments/{id}")
    public PermanentInstructor findPermamentById(@PathVariable int id){
        return  permamentInstructorService.findById(id);
    }

    @PostMapping("/permaments")
    public PermanentInstructor save(@RequestBody PermanentInstructor permanentInstructor){
        return permamentInstructorService.save(permanentInstructor);
    }


    @DeleteMapping(value = "/permaments/{id}")
    public void deletePermamentById(@PathVariable int id){
        permamentInstructorService.deleteById(id);
    }


    @PutMapping("/permaments/{id}")
    public PermanentInstructor updatePermamentById(@RequestBody  PermanentInstructor permanentInstructor,@PathVariable int id){
        return permamentInstructorService.updateOnDatabase(permanentInstructor,id);
    }

}
