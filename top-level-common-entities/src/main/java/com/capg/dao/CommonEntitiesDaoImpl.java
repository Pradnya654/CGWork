package com.capg.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Repository;

import com.capg.entity.CustomTimePeriod;
import com.capg.entity.DataSource;
import com.capg.entity.Geo;
import com.capg.entity.GeoAssoc;
import com.capg.entity.NoteData;
import com.capg.entity.StatusItem;
import com.capg.entity.StatusValidChange;
import com.capg.entity.Uom;
import com.capg.entity.UomConversionDated;
import com.capg.entity.UserPreference;
import com.capg.exception.CustomException;
import com.sun.xml.bind.marshaller.NoEscapeHandler;

import net.bytebuddy.asm.Advice.Thrown;

@Repository
@Transactional
public class CommonEntitiesDaoImpl implements CommonEntitesDao {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public boolean addUom(Uom uom) throws CustomException {
		boolean flag = false;
		try {
			TypedQuery<UomConversionDated> query = entityManager.createQuery(
					"FROM UomConversionDated where uomId=:first and uomIdTo=:second", UomConversionDated.class);
			query.setParameter("first", uom.getUomConversionDated().getUomId());
			query.setParameter("second", uom.getUomConversionDated().getUomIdTo());
			UomConversionDated uomConversionDated = query.getSingleResult();
			if(uomConversionDated==null) {
				throw new CustomException("Enter Valid Uomid and UomidTo");

			}
			entityManager.persist(uom);
			flag = true;
		} catch (Exception e) {

			throw new CustomException("Enter Valid Uomid and UomidTo");
		}

		return flag;
	}

	@Override
	public boolean addUomConversionDated(UomConversionDated conversionDated) throws CustomException {
		boolean flag = false;
		try {
			entityManager.persist(conversionDated);
			flag = true;
		} catch (Exception e) {

			throw new CustomException("Enter Valid Details");
		}

		return flag;
	}

	@Override
	public boolean addCustomTimePeroiod(CustomTimePeriod customTimePeriod) throws CustomException {
		boolean flag = false;
		try {
			entityManager.persist(customTimePeriod);
			flag = true;
		} catch (Exception e) {

			throw new CustomException("Enter Valid Details");
		}

		return flag;
	}

	@Override
	public boolean addGeo(Geo geo) throws CustomException {
		boolean flag = false;
		try {
			TypedQuery<GeoAssoc> query = entityManager.createQuery("FROM GeoAssoc where geoId=:first and geoIdTo=:second",
					GeoAssoc.class);
			query.setParameter("first", geo.getGeoAssoc().getGeoId());
			query.setParameter("second", geo.getGeoAssoc().getGeoIdTo());
			GeoAssoc geoAssoc = query.getSingleResult();
			if(geoAssoc==null) {
				throw new CustomException("Enter valid geoid and geoidto");

			}
			entityManager.persist(geo);
			flag = true;
		} catch (Exception e) {

			throw new CustomException("Enter valid geoid and geoidto");
		}

		return flag;
	}

	@Override
	public boolean addGeoAssoc(GeoAssoc geoAssoc) throws CustomException {
		boolean flag = false;
		try {
			entityManager.persist(geoAssoc);
			flag = true;
		} catch (Exception e) {

			throw new CustomException("Enter Valid Details");
		}

		return flag;
	}

	@Override
	public boolean addUserPreference(UserPreference userPreference) throws CustomException {
		boolean flag = false;
		try {
			entityManager.persist(userPreference);
			flag = true;
		} catch (Exception e) {

			throw new CustomException("Enter Valid Details");
		}

		return flag;
	}

	@Override
	public boolean addStatusItem(StatusItem statusItem) throws CustomException {
		boolean flag = false;
		try {
			TypedQuery<StatusValidChange> query = entityManager.createQuery(
					"FROM StatusValidChange where statusId=:first and statusIdTo=:second", StatusValidChange.class);
			query.setParameter("first", statusItem.getStatusValidChange().getStatusId());
			query.setParameter("second", statusItem.getStatusValidChange().getStatusIdTo());
			
			StatusValidChange geoAssoc = query.getSingleResult();
			if(geoAssoc==null) {
				throw new CustomException("Enter valid statusId and statusIdTo");

			}
			entityManager.persist(statusItem);
			flag = true;
		} catch (Exception e) {

			throw new CustomException("Enter Valid statusid and statusidto");
		}

		return flag;
	}

	@Override
	public boolean addStatusValidChange(StatusValidChange statusValidChange) throws CustomException {
		boolean flag = false;
		try {
			entityManager.persist(statusValidChange);
			flag = true;
		} catch (Exception e) {

			throw new CustomException("Enter Valid Details");
		}

		return flag;
	}

	@Override
	public boolean addNoteData(NoteData noteData) throws CustomException {
		boolean flag = false;
		try {
			entityManager.persist(noteData);
			flag = true;
		} catch (Exception e) {

			throw new CustomException("Enter Valid Details");
		}

		return flag;
	}

	@Override
	public boolean addDataSource(DataSource dataSource) throws CustomException {
		boolean flag = false;
		try {
			entityManager.persist(dataSource);
			flag = true;
		} catch (Exception e) {

			throw new CustomException("Enter Valid Details");
		}

		return flag;
	}

	@Override
	public boolean deleteUom(int id) throws CustomException {
		boolean flag = false;
		try {

			entityManager.remove(entityManager.find(Uom.class, id));
			flag = true;
		} catch (Exception e) {
			throw new CustomException("Error");
		}

		return flag;

	}

	@Override
	public boolean deleteUomConversionDated(int id, int idTo) throws CustomException {
		boolean flag = false;
		

			TypedQuery<UomConversionDated> query = entityManager.createQuery(
					"FROM UomConversionDated where uomId=:first and uomIdTo=:second", UomConversionDated.class);
			query.setParameter("first", id);
			query.setParameter("second", idTo);
			UomConversionDated uomConversionDated = query.getSingleResult();
			TypedQuery<Uom> query1 = entityManager
					.createQuery("FROM Uom where uomConversionDated.uomId=:first and uomConversionDated.uomIdTo=:second", Uom.class);
			query1.setParameter("first", uomConversionDated.getUomId());
			query1.setParameter("second", uomConversionDated.getUomIdTo());
		List<Uom> list=new ArrayList<Uom>();
			 list=query1.getResultList();
			if(list.size()!=0) {
				throw new CustomException("Child Record Found");
			}
			else {
				entityManager.remove(uomConversionDated);
			}

			return flag;

	}

	@Override
	public boolean deleteCustomTimePeroiod(int id) throws CustomException {
		boolean flag = false;
		try {

			entityManager.remove(entityManager.find(CustomTimePeriod.class, id));
			flag = true;
		} catch (Exception e) {
			throw new CustomException("Error");
		}

		return flag;
	}

	@Override
	public boolean deleteGeo(int id) throws CustomException {
		boolean flag = false;
		try {

			entityManager.remove(entityManager.find(Geo.class, id));
			flag = true;
		} catch (Exception e) {
			throw new CustomException("Error");
		}

		return flag;

	}

	@Override
	public boolean deleteGeoAssoc(int id, int idTo) throws CustomException {
		boolean flag = false;

		TypedQuery<GeoAssoc> query = entityManager.createQuery("FROM GeoAssoc where geoId=:first and geoIdTo=:second",
				GeoAssoc.class);
		query.setParameter("first", id);
		query.setParameter("second", idTo);
		GeoAssoc geoAssoc = query.getSingleResult();
		TypedQuery<Geo> query1 = entityManager
				.createQuery("FROM Geo where geoAssoc.geoId=:first and geoAssoc.geoIdTo=:second", Geo.class);
		query1.setParameter("first", geoAssoc.getGeoId());
		query1.setParameter("second", geoAssoc.getGeoIdTo());
	List<Geo> list=new ArrayList<Geo>();
		 list=query1.getResultList();
		if(list.size()!=0) {
			throw new CustomException("Child Record Found");
		}
		else {
			entityManager.remove(geoAssoc);
		}

		return flag;

	}

	@Override
	public boolean deleteUserPreference(int id) throws CustomException {
		boolean flag = false;
		try {

			entityManager.remove(entityManager.find(UserPreference.class, id));
			flag = true;
		} catch (Exception e) {
			throw new CustomException("Error");
		}

		return flag;
	}

	@Override
	public boolean deleteStatusItem(int id) throws CustomException {
		boolean flag = false;
		try {

			entityManager.remove(entityManager.find(StatusItem.class, id));
			flag = true;
		} catch (Exception e) {
			throw new CustomException("Error");
		}

		return flag;
	}

	@Override
	public boolean deleteStatusValidChange(int id, int idTo) throws CustomException {
		boolean flag = false;
		

			TypedQuery<StatusValidChange> query = entityManager.createQuery(
					"FROM StatusValidChange where statusId=:first and statusIdTo=:second", StatusValidChange.class);
			query.setParameter("first", id);
			query.setParameter("second", idTo);
			
			StatusValidChange statusValidChange = query.getSingleResult();
			TypedQuery<StatusItem> query1 = entityManager
					.createQuery("FROM StatusItem where statusValidChange.statusId=:first and statusValidChange.statusIdTo=:second", StatusItem.class);
			query1.setParameter("first", statusValidChange.getStatusId());
			query1.setParameter("second", statusValidChange.getStatusIdTo());
		List<StatusItem> list=new ArrayList<StatusItem>();
			 list=query1.getResultList();
			if(list.size()!=0) {
				throw new CustomException("Child Record Found");
			}
			else {
				entityManager.remove(statusValidChange);
			}

			return flag;
	}

	@Override
	public boolean deleteNoteData(int id) throws CustomException {
		boolean flag = false;
		try {

			entityManager.remove(entityManager.find(NoteData.class, id));
			flag = true;
		} catch (Exception e) {
			throw new CustomException("Error");
		}

		return flag;
	}

	@Override
	public boolean deleteDataSource(int id) throws CustomException {
		boolean flag = false;
		try {

			entityManager.remove(entityManager.find(DataSource.class, id));
			flag = true;
		} catch (Exception e) {
			throw new CustomException("Error");
		}

		return flag;
	}

	@Override
	public boolean updateUom(Uom uom) throws CustomException {
		boolean flag = false;
		try {
			TypedQuery<UomConversionDated> query = entityManager.createQuery(
					"FROM UomConversionDated where uomId=:first and uomIdTo=:second", UomConversionDated.class);
			query.setParameter("first", uom.getUomConversionDated().getUomId());
			query.setParameter("second", uom.getUomConversionDated().getUomIdTo());
			UomConversionDated uomConversionDated = query.getSingleResult();
			if(uomConversionDated==null) {
				throw new CustomException("Enter Valid Uomid and UomidTo");

			}
			entityManager.merge(uom);
			flag = true;
		} catch (Exception e) {

			throw new CustomException("Enter Valid Uomid and UomidTo");
		}

		return flag;
	}

	@Override
	public boolean updateUomConversionDated(UomConversionDated conversionDated) throws CustomException {
		boolean flag = false;
		try {
			entityManager.merge(conversionDated);
			flag = true;
		} catch (Exception e) {

			throw new CustomException("Enter valid Details");
		}

		return flag;
	}

	@Override
	public boolean updateCustomTimePeroiod(CustomTimePeriod customTimePeriod) throws CustomException {
		boolean flag = false;
		try {
			entityManager.merge(customTimePeriod);
			flag = true;
		} catch (Exception e) {

			throw new CustomException("Enter valid Details");
		}

		return flag;
	}

	@Override
	public boolean updateGeo(Geo geo) throws CustomException {
		boolean flag = false;
		try {
			TypedQuery<GeoAssoc> query = entityManager.createQuery("FROM GeoAssoc where geoId=:first and geoIdTo=:second",
					GeoAssoc.class);
			query.setParameter("first", geo.getGeoAssoc().getGeoId());
			query.setParameter("second", geo.getGeoAssoc().getGeoIdTo());
			GeoAssoc geoAssoc = query.getSingleResult();
			if(geoAssoc==null) {
				throw new CustomException("Enter valid geoid and geoidto");

			}
			entityManager.merge(geo);
			flag = true;
		} catch (Exception e) {

			throw new CustomException("Enter valid geoId and geoIdTo");
		}

		return flag;
	}

	@Override
	public boolean updateGeoAssoc(GeoAssoc geoAssoc) throws CustomException {
		boolean flag = false;
		try {
			entityManager.merge(geoAssoc);
			flag = true;
		} catch (Exception e) {

			throw new CustomException("Enter valid Details");
		}

		return flag;
	}

	@Override
	public boolean updateUserPreference(UserPreference userPreference) throws CustomException {
		boolean flag = false;
		try {
			entityManager.merge(userPreference);
			flag = true;
		} catch (Exception e) {

			throw new CustomException("Enter valid Details");
		}

		return flag;
	}

	@Override
	public boolean updateStatusItem(StatusItem statusItem) throws CustomException {
		boolean flag = false;
		try {
			TypedQuery<StatusValidChange> query = entityManager.createQuery(
					"FROM StatusValidChange where statusId=:first and statusIdTo=:second", StatusValidChange.class);
			query.setParameter("first", statusItem.getStatusValidChange().getStatusId());
			query.setParameter("second", statusItem.getStatusValidChange().getStatusIdTo());
			
			StatusValidChange geoAssoc = query.getSingleResult();
			if(geoAssoc==null) {
				throw new CustomException("Enter valid statusId and statusIdTo");

			}
			entityManager.merge(statusItem);
			flag = true;
		} catch (Exception e) {

			throw new CustomException("Enter valid statusId and statusIdTo");
		}

		return flag;
	}

	@Override
	public boolean updateStatusValidChange(StatusValidChange statusValidChange) throws CustomException {
		boolean flag = false;
		try {
			entityManager.merge(statusValidChange);
			flag = true;
		} catch (Exception e) {

			throw new CustomException("Enter valid Details");
		}

		return flag;
	}

	@Override
	public boolean updateNoteData(NoteData noteData) throws CustomException {
		boolean flag = false;
		try {
			entityManager.merge(noteData);
			flag = true;
		} catch (Exception e) {

			throw new CustomException("Enter valid Details");
		}

		return flag;
	}

	@Override
	public boolean updateDataSource(DataSource dataSource) throws CustomException {
		boolean flag = false;
		try {
			entityManager.merge(dataSource);
			flag = true;
		} catch (Exception e) {

			throw new CustomException("Enter valid Details");
		}

		return flag;
	}

	@Override
	public List<Uom> findAllUom() throws CustomException {
		TypedQuery<Uom> query = entityManager.createQuery("From Uom", Uom.class);
		return query.getResultList();
	}

	@Override
	public List<UomConversionDated> findAllUomConversionDated() throws CustomException {
		TypedQuery<UomConversionDated> query = entityManager.createQuery("From UomConversionDated",
				UomConversionDated.class);
		return query.getResultList();
	}

	@Override
	public List<CustomTimePeriod> findAllCustomTimePeroiod() throws CustomException {
		TypedQuery<CustomTimePeriod> query = entityManager.createQuery("From CustomTimePeriod", CustomTimePeriod.class);
		return query.getResultList();
	}

	@Override
	public List<Geo> findAllGeo() throws CustomException {
		TypedQuery<Geo> query = entityManager.createQuery("From Geo", Geo.class);
		return query.getResultList();
	}

	@Override
	public List<GeoAssoc> findAllGeoAssoc() throws CustomException {
		TypedQuery<GeoAssoc> query = entityManager.createQuery("From GeoAssoc", GeoAssoc.class);
		return query.getResultList();
	}

	@Override
	public List<UserPreference> findAllUserPreference() throws CustomException {
		TypedQuery<UserPreference> query = entityManager.createQuery("From UserPreference", UserPreference.class);
		return query.getResultList();
	}

	@Override
	public List<StatusItem> findAllStatusItem() throws CustomException {
		TypedQuery<StatusItem> query = entityManager.createQuery("From StatusItem", StatusItem.class);
		return query.getResultList();
	}

	@Override
	public List<StatusValidChange> findAllStatusValidChange() throws CustomException {
		TypedQuery<StatusValidChange> query = entityManager.createQuery("From StatusValidChange",
				StatusValidChange.class);
		return query.getResultList();
	}

	@Override
	public List<NoteData> findAllNoteData() throws CustomException {
		TypedQuery<NoteData> query = entityManager.createQuery("From NoteData", NoteData.class);
		return query.getResultList();
	}

	@Override
	public List<DataSource> findAllDataSource() throws CustomException {
		TypedQuery<DataSource> query = entityManager.createQuery("From DataSource", DataSource.class);
		return query.getResultList();
	}

}
