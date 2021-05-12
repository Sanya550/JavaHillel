package HW25.service;

import HW25.dao.StatusDao;
import HW25.dao.StatusDaoImpl;
import HW25.entity.Status;
import HW25.util.LoggerUtil;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class StatusServiceImpl implements StatusService {
    Logger logger = LoggerUtil.getLogger(StatusServiceImpl.class);

    @Override
    public void insert(Status status) {
        logger.log(Level.DEBUG, status.toString());

        StatusDao statusDao = new StatusDaoImpl();
        status.setAlias(status.getAlias());
        status.setDescription(status.getDescription());
        statusDao.insert(status);
    }

    @Override
    public void update(Status status) {
        logger.log(Level.DEBUG, status.toString());

        StatusDao statusDao = new StatusDaoImpl();
        status.setId(status.getId());
        status.setAlias(status.getAlias());
        status.setDescription(status.getDescription());
        statusDao.insert(status);
    }

    @Override
    public Status getById(long id) {
        logger.log(Level.DEBUG, id);

        StatusDao statusDao = new StatusDaoImpl();
        return statusDao.getById(id);
    }

    @Override
    public void delete(long id) {
        logger.log(Level.DEBUG, id);

        StatusDao statusDao = new StatusDaoImpl();
        statusDao.delete(id);
    }
}
