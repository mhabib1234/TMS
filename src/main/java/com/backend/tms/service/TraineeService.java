package com.backend.tms.service;

import com.backend.tms.model.Trainee.TraineeReqModel;
import com.backend.tms.model.Trainee.TraineeUpdateReqModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TraineeService {
    ResponseEntity<Object> getAllTrainees();
    ResponseEntity<Object> getAllTrainee();
    public ResponseEntity<Object> getBatchByTraineeId(Long traineeId);
    ResponseEntity<Object> getTraineeById(Long traineeId);
    ResponseEntity<Object> updateTrainee(Long traineeId, TraineeUpdateReqModel traineeModel);
    ResponseEntity<Object> deleteTrainee(Long traineeId);

}
