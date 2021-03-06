package com.example.project.dynamodb.model;

import java.util.Date;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGenerateStrategy;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedTimestamp;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="tbl-document")
public class TxnDocument {

	@DynamoDBHashKey(attributeName="documentId")
	@DynamoDBAutoGeneratedKey
	private String documentId;
	
	@DynamoDBAttribute(attributeName="documentName")
	private String documentName;
	
	@DynamoDBAttribute(attributeName="documentType")
	private String documentType;
	
	@DynamoDBAttribute(attributeName="documentOwner")
	private String documentOwner;
	
	@DynamoDBAttribute(attributeName="documentCategory")
	private String documentCategory;
	
	@DynamoDBAttribute(attributeName="createdDateTime")
	@DynamoDBAutoGeneratedTimestamp(strategy=DynamoDBAutoGenerateStrategy.CREATE)
	private Date createdDateTime;
	
	@DynamoDBAttribute(attributeName="isActive")
	private Boolean isActive;
	
	public TxnDocument() {}

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentOwner() {
		return documentOwner;
	}

	public void setDocumentOwner(String documentOwner) {
		this.documentOwner = documentOwner;
	}

	public String getDocumentCategory() {
		return documentCategory;
	}

	public void setDocumentCategory(String documentCategory) {
		this.documentCategory = documentCategory;
	}

	public Date getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "TxnDocument [documentId=" + documentId + ", documentName=" + documentName + ", documentType="
				+ documentType + ", documentOwner=" + documentOwner + ", documentCategory=" + documentCategory
				+ ", createdDateTime=" + createdDateTime + ", isActive=" + isActive + "]";
	}

	public TxnDocument(String documentId, String documentName, String documentType, String documentOwner,
			String documentCategory, Date createdDateTime, Boolean isActive) {
		super();
		this.documentId = documentId;
		this.documentName = documentName;
		this.documentType = documentType;
		this.documentOwner = documentOwner;
		this.documentCategory = documentCategory;
		this.createdDateTime = createdDateTime;
		this.isActive = isActive;
	}
}