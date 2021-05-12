package HW25.dao;

import HW25.entity.Status;

public interface StatusDao {
    void insert(Status status);

    void update(Status status);

    void delete(long id);

    Status getById(long id);
}
