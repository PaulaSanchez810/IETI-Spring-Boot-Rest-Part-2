package co.edu.escuelaing.ieti.controller;

import co.edu.escuelaing.ieti.data.Task;
import co.edu.escuelaing.ieti.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/t1/task")
public class TaskController {

    private  final TaskService taskService;

    public TaskController(@Autowired TaskService taskService, TaskService taskService1) {

        this.taskService = taskService1;
    }

    @GetMapping
    public ResponseEntity<List<Task>> all(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(taskService.all());
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

        }

    }

    @GetMapping( "/{id}" )
    public ResponseEntity<Task> findById( @PathVariable String id )
    {
        try{
            return ResponseEntity.status(HttpStatus.OK).body(taskService.findById(id));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

        }

    }


    @PostMapping
    public ResponseEntity<Task> create( @RequestBody Task taskDto )
    {
        try{
            return ResponseEntity.status(HttpStatus.OK).body(taskService.create(taskDto));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

        }

    }

    @PutMapping( "/{id}" )
    public ResponseEntity<Task> update( @RequestBody Task userDto, @PathVariable String id )
    {
        try{
            return ResponseEntity.status(HttpStatus.OK).body(taskService.update(userDto, id));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

        }


    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete( @PathVariable String id )
    {
        try{
            taskService.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body(Boolean.TRUE);
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Boolean.FALSE);

        }
    }
}
