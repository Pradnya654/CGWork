package com.capg.dao;

import java.util.List;



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

public interface CommonEntitesDao {
	
	public boolean addUom(Uom uom)throws CustomException;
	public boolean addUomConversionDated(UomConversionDated conversionDated)throws CustomException;
	public boolean addCustomTimePeroiod(CustomTimePeriod customTimePeriod)throws CustomException;
	public boolean addGeo(Geo geo)throws CustomException;
	public boolean addGeoAssoc(GeoAssoc geoAssoc)throws CustomException;
	public boolean addUserPreference(UserPreference userPreference)throws CustomException;
	public boolean addStatusItem(StatusItem statusItem)throws CustomException;
	public boolean addStatusValidChange(StatusValidChange statusValidChange) throws CustomException;
	public boolean addNoteData(NoteData noteData) throws CustomException;
	public boolean addDataSource(DataSource dataSource)throws CustomException;
	
	
	public boolean deleteUom(int id)throws CustomException;
	public boolean deleteUomConversionDated(int id,int idTo)throws CustomException;
	public boolean deleteCustomTimePeroiod(int id)throws CustomException;
	public boolean deleteGeo(int id)throws CustomException;
	public boolean deleteGeoAssoc(int id,int idTo)throws CustomException;
	public boolean deleteUserPreference(int id)throws CustomException;
	public boolean deleteStatusItem(int id)throws CustomException;
	public boolean deleteStatusValidChange(int id,int idTo) throws CustomException;
	public boolean deleteNoteData(int id) throws CustomException;
	public boolean deleteDataSource(int id )throws CustomException;
	
	
	public boolean updateUom(Uom uom)throws CustomException;
	public boolean updateUomConversionDated(UomConversionDated conversionDated)throws CustomException;
	public boolean updateCustomTimePeroiod(CustomTimePeriod customTimePeriod)throws CustomException;
	public boolean updateGeo(Geo geo)throws CustomException;
	public boolean updateGeoAssoc(GeoAssoc geoAssoc)throws CustomException;
	public boolean updateUserPreference(UserPreference userPreference)throws CustomException;
	public boolean updateStatusItem(StatusItem statusItem)throws CustomException;
	public boolean updateStatusValidChange(StatusValidChange statusValidChange) throws CustomException;
	public boolean updateNoteData(NoteData noteData) throws CustomException;
	public boolean updateDataSource(DataSource dataSource)throws CustomException;
	
	
	public List<Uom> findAllUom()throws CustomException;
	public List<UomConversionDated> findAllUomConversionDated( )throws CustomException;
	public List<CustomTimePeriod> findAllCustomTimePeroiod( )throws CustomException;
	public List<Geo> findAllGeo( )throws CustomException;
	public List<GeoAssoc> findAllGeoAssoc()throws CustomException;
	public List<UserPreference> findAllUserPreference( )throws CustomException;
	public List<StatusItem> findAllStatusItem( )throws CustomException;
	public List<StatusValidChange> findAllStatusValidChange( ) throws CustomException;
	public List<NoteData> findAllNoteData( ) throws CustomException;
	public List<DataSource> findAllDataSource( )throws CustomException;
	
	
	
	
	
	
	

}
