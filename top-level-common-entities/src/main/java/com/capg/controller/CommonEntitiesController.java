package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.dao.CommonEntitesDao;
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


@RestController
@CrossOrigin("*")
public class CommonEntitiesController {
	
	@Autowired
	CommonEntitesDao commonEntitesDao;
	
	@GetMapping("/findAllUom")
	public List<Uom> findAllUom()throws CustomException{
		return commonEntitesDao.findAllUom();
	}
	@GetMapping("/findAllUomConversionDated")
	public List<UomConversionDated> findAllUomConversionDated( )throws CustomException{
		return commonEntitesDao.findAllUomConversionDated();
	}
	@GetMapping("/findAllCustomTimePeriod")
	public List<CustomTimePeriod> findAllCustomTimePeroiod( )throws CustomException{
		return commonEntitesDao.findAllCustomTimePeroiod();
		
	}
	@GetMapping("/findAllGeo")
	public List<Geo> findAllGeo( )throws CustomException{
		return commonEntitesDao.findAllGeo();
	}
	
	@GetMapping("/findAllGeoAssoc")
	public List<GeoAssoc> findAllGeoAssoc()throws CustomException{
		return commonEntitesDao.findAllGeoAssoc();
		
	}
	
	@GetMapping("/findAllUserPreference")
	public List<UserPreference> findAllUserPreference( )throws CustomException{
		return commonEntitesDao.findAllUserPreference();
	}
	
	@GetMapping("/findAllStatusItem")
	public List<StatusItem> findAllStatusItem( )throws CustomException{
		return commonEntitesDao.findAllStatusItem();
	}
	@GetMapping("/findAllStatusValidChange")
	public List<StatusValidChange> findAllStatusValidChange( ) throws CustomException{
		return commonEntitesDao.findAllStatusValidChange();
	}
	@GetMapping("/findAllNoteData")
	public List<NoteData> findAllNoteData( ) throws CustomException{
		return commonEntitesDao.findAllNoteData();
	}
	@GetMapping("/findAllDataSource")
	public List<DataSource> findAllDataSource( )throws CustomException{
		return commonEntitesDao.findAllDataSource();
	}
	@PostMapping("/addUom")
	public boolean addUom(@RequestBody Uom uom)throws CustomException{
		return commonEntitesDao.addUom(uom);
	}
	@PostMapping("/addUomConversionDated")
	public boolean addUomConversionDated(@RequestBody UomConversionDated conversionDated)throws CustomException{
		return commonEntitesDao.addUomConversionDated(conversionDated);
	}
	@PostMapping("/addCustomTimePeriod")
	public boolean addCustomTimePeroiod(@RequestBody CustomTimePeriod customTimePeriod)throws CustomException{
		return commonEntitesDao.addCustomTimePeroiod(customTimePeriod);
	}
	@PostMapping("/addGeo")
	public boolean addGeo(@RequestBody Geo geo)throws CustomException{
		return commonEntitesDao.addGeo(geo);
	}
	@PostMapping("/addGeoAssoc")
	public boolean addGeoAssoc(@RequestBody GeoAssoc geoAssoc)throws CustomException{
		return commonEntitesDao.addGeoAssoc(geoAssoc);
	}
	@PostMapping("/addUserPreference")
	public boolean addUserPreference(@RequestBody UserPreference userPreference)throws CustomException{
		return commonEntitesDao.addUserPreference(userPreference);
	}
	@PostMapping("/addStatusItem")
	public boolean addStatusItem(@RequestBody StatusItem statusItem)throws CustomException{
		return commonEntitesDao.addStatusItem(statusItem);
	}
	@PostMapping("/addStatusValidChange")
	public boolean addStatusValidChange(@RequestBody StatusValidChange statusValidChange) throws CustomException{
		return commonEntitesDao.addStatusValidChange(statusValidChange);
		
	}
	@PostMapping("/addNoteData")
	public boolean addNoteData(@RequestBody NoteData noteData) throws CustomException{
		return commonEntitesDao.addNoteData(noteData);
	}
	@PostMapping("/addDataSource")
	public boolean addDataSource(@RequestBody DataSource dataSource)throws CustomException{
		return commonEntitesDao.addDataSource(dataSource);
	}
	@DeleteMapping("/deleteUom/{id}")
	public boolean deleteUom(@PathVariable("id") int id)throws CustomException{
		return commonEntitesDao.deleteUom(id);
	}
	@DeleteMapping("/deleteUomConversionDated/{id}/{idTo}")
	public boolean deleteUomConversionDated(@PathVariable("id") int id,@PathVariable("idTo") int idTo)throws CustomException{
		return commonEntitesDao.deleteUomConversionDated(id,idTo);
	}
	@DeleteMapping("/deleteCustomTimePeriod/{id}")
	public boolean deleteCustomTimePeroiod(@PathVariable("id") int id)throws CustomException{
		return commonEntitesDao.deleteCustomTimePeroiod(id);
		
	}
	@DeleteMapping("/deleteGeo/{id}")
	public boolean deleteGeo(@PathVariable("id") int id)throws CustomException{
		return commonEntitesDao.deleteGeo(id);
		
	}
	@DeleteMapping("/deleteGeoAssoc/{id}/{idTo}")
	public boolean deleteGeoAssoc(@PathVariable("id") int id,@PathVariable("idTo") int idTo)throws CustomException{
		return commonEntitesDao.deleteGeoAssoc(id,idTo);
	}
	@DeleteMapping("/deleteUserPreference/{id}")
	public boolean deleteUserPreference(@PathVariable("id") int id)throws CustomException{
		return commonEntitesDao.deleteUserPreference(id);
	}
	@DeleteMapping("/deleteStatusItem/{id}")
	public boolean deleteStatusItem(@PathVariable("id") int id)throws CustomException{
		return commonEntitesDao.deleteStatusItem(id);
	}
	@DeleteMapping("/deleteStatusValidChange/{id}/{idTo}")
	public boolean deleteStatusValidChange(@PathVariable("id") int id,@PathVariable("idTo") int idTo) throws CustomException{
		return commonEntitesDao.deleteStatusValidChange(id,idTo);
	}
	@DeleteMapping("/deleteNoteData/{id}")
	public boolean deleteNoteData(@PathVariable("id") int id) throws CustomException{
		return commonEntitesDao.deleteNoteData(id);
	}
	@DeleteMapping("/deleteDataSource/{id}")
	public boolean deleteDataSource(@PathVariable("id") int id)throws CustomException{
		return commonEntitesDao.deleteDataSource(id);
	}
	
	@PutMapping("/updateUom")
	public boolean updateUom(@RequestBody Uom uom)throws CustomException{
		return commonEntitesDao.updateUom(uom);
	}
	@PutMapping("/updateUomConversionDated")
	public boolean updateUomConversionDated(@RequestBody UomConversionDated conversionDated)throws CustomException{
		return commonEntitesDao.updateUomConversionDated(conversionDated);
	}
	@PutMapping("/updateCustomTimePeriod")
	public boolean updateCustomTimePeroiod(@RequestBody CustomTimePeriod customTimePeriod)throws CustomException{
		return commonEntitesDao.updateCustomTimePeroiod(customTimePeriod);
	}
	@PutMapping("/updateGeo")
	public boolean updateGeo(@RequestBody Geo geo)throws CustomException{
		return commonEntitesDao.updateGeo(geo);
	}
	@PutMapping("/updateGeoAssoc")
	public boolean updateGeoAssoc(@RequestBody GeoAssoc geoAssoc)throws CustomException{
		return commonEntitesDao.updateGeoAssoc(geoAssoc);
	}
	@PutMapping("/updateUserPreference")
	public boolean updateUserPreference(@RequestBody UserPreference userPreference)throws CustomException{
		return commonEntitesDao.updateUserPreference(userPreference);
	}
	@PutMapping("/updateStatusItem")
	public boolean updateStatusItem(@RequestBody StatusItem statusItem)throws CustomException{
		return commonEntitesDao.updateStatusItem(statusItem);
	}
	@PutMapping("/updateStatusValidChange")
	public boolean updateStatusValidChange(@RequestBody StatusValidChange statusValidChange) throws CustomException{
		return commonEntitesDao.updateStatusValidChange(statusValidChange);
	}
	@PutMapping("/updateNoteData")
	public boolean updateNoteData(@RequestBody NoteData noteData) throws CustomException{
		return commonEntitesDao.updateNoteData(noteData);
	}
	@PutMapping("/updateDataSource")
	public boolean updateDataSource(@RequestBody DataSource dataSource)throws CustomException{
		return commonEntitesDao.updateDataSource(dataSource);
	}
	
	
	

}
