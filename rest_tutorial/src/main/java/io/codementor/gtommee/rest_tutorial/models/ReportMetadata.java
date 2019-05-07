package io.codementor.gtommee.rest_tutorial.models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;
import java.util.logging.Level;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class ReportMetadata {

	@Id
	public String _id;
	public String reportName;
	public Date dateCreated;
	public String createdBy;
	public String filepath;	
	private final static Logger LOGGER = Logger.getLogger(ReportMetadata.class.getName());
	
	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		sdf.setTimeZone(Calendar.getInstance().getTimeZone());
		this.dateCreated = sdf.parse(dateCreated);
	}
	
	public void setDateCreated() {
		this.dateCreated = new Date();
	}
	

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}



	// Constructors
	public ReportMetadata() {
	}

	public ReportMetadata(String reportName, Date dateCreated, String createdBy, String filepath) {
		this.reportName = reportName;
		this.dateCreated = dateCreated;
		this.createdBy = createdBy;
		this.filepath = filepath;
	}

	public static Logger getLogger() {
		return LOGGER;
	}

}
