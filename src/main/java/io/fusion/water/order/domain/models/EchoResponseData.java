/**
 * (C) Copyright 2021 Araf Karsh Hamid 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.fusion.water.order.domain.models;

import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Payment Status
 * 
 * @author arafkarsh
 *
 */
public class EchoResponseData {

	private String wordData;
	
	@JsonSerialize(using = DateJsonSerializer.class)
	private LocalDateTime responseTime;
	
	private int dayOftheYear;
	
	private String greetings;
	
	public EchoResponseData() {
	}
	
	/**
	 * Set Echo Word
	 * @param wordData
	 */
	public EchoResponseData(String wordData) {
		this(wordData, LocalDateTime.now(), LocalDateTime.now().getDayOfYear());
	}
	/**
	 * @param wordData
	 * @param responseTime
	 * @param dayOftheYear
	 */
	public EchoResponseData(String wordData, 
			LocalDateTime responseTime, int dayOftheYear) {
		this(wordData, responseTime, dayOftheYear, "Good Morning " + wordData);
	}	
	
	/**
	 * @param wordData
	 * @param responseTime
	 * @param dayOftheYear
	 * @param greetings
	 */
	public EchoResponseData(String wordData, LocalDateTime responseTime, 
			int dayOftheYear, String greetings) {
		super();
		this.wordData = wordData;
		this.responseTime = responseTime;
		this.dayOftheYear = dayOftheYear;
		this.greetings = greetings;
	}
	
	/**
	 * @return the wordData
	 */
	public String getWordData() {
		return wordData;
	}
	/**
	 * @return the responseTime
	 */
	public LocalDateTime getResponseTime() {
		return responseTime;
	}

	/**
	 * Returns 
	 */
	public String toString() {
		return wordData;
	}
	
	/**
	 * Returns the HashCode
	 */
	public int hashCode() {
		return wordData.hashCode();
	}

	public boolean equals(Object obj) {
		if(obj instanceof EchoResponseData erd) {
			return wordData.equals(erd.getWordData());
		}
		return false;
	}

	/**
	 * @return the dayOftheYear
	 */
	public int getDayOftheYear() {
		return dayOftheYear;
	}

	/**
	 * @return the greetings
	 */
	public String getGreetings() {
		return greetings;
	}
}
