package kr.co.cgv.domain;

import java.util.List;

//바둑판으로 만들기 위해서 줄과 리스트를 받아주는 DTO
public class ListtableVO {
	private String row;
	private List<String> column;
	public String getRow() {
		return row;
	}
	public void setRow(String row) {
		this.row = row;
	}
	public List<String> getColumn() {
		return column;
	}
	public void setColumn(List<String> column) {
		this.column = column;
	}
	
}
