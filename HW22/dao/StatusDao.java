package HW22.dao;

import HW22.entity.Status;

public interface StatusDao {
    void insert(Status status);

    void update(Status status);

    void delete(long id);

    Status getById(long id);
}
