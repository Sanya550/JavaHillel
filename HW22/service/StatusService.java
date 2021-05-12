package HW22.service;

import HW22.entity.Status;

public interface StatusService {
    void insert(Status status);

    void update(Status status);

    Status getById(long id);

    void delete(long id);

}
