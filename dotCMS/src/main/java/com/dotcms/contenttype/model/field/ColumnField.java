package com.dotcms.contenttype.model.field;

import com.google.common.collect.ImmutableList;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@JsonSerialize(as = ImmutableColumnField.class)
@JsonDeserialize(as = ImmutableColumnField.class)
@Value.Immutable
public abstract class ColumnField extends Field {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public  Class type() {
		return  ColumnField.class;
	}

	@JsonIgnore
	@Value.Derived
	@Override
	public List<DataTypes> acceptedDataTypes(){
		return ImmutableList.of(DataTypes.SYSTEM);
	}
	@Value.Default
	@Override
	public DataTypes dataType(){
		return DataTypes.SYSTEM;
	};
	public abstract static class Builder implements FieldBuilder {}
}
