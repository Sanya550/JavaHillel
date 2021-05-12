package HW22.service;

import HW22.dao.StatusDao;
import HW22.dao.StatusDaoImpl;
import HW22.entity.Status;

public class StatusServiceImpl implements StatusService {

    @Override
    public void insert(Status status) {
        StatusDao statusDao = new StatusDaoImpl();
        status.setAlias(status.getAlias());
        status.setDescription(status.getDescription());
        statusDao.insert(status);
    }

    @Override
    public void update(Status status) {
        StatusDao statusDao = new StatusDaoImpl();
        status.setId(status.getId());
        status.setAlias(status.getAlias());
        status.setDescription(status.getDescription());
        statusDao.insert(status);
    }

    @Override
    public Status getById(long id) {
        StatusDao statusDao = new StatusDaoImpl();
        return statusDao.getById(id);
    }

    @Override
    public void delete(long id) {
        StatusDao statusDao = new StatusDaoImpl();
        statusDao.delete(id);
    }
}
