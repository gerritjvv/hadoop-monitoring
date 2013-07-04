package org.nts.hdm

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec
import org.ns.hdm.job.JobTrackerScrape
import java.io.File

class TestJobTrackerScraping extends FlatSpec with ShouldMatchers{

  val doc = JobTrackerScrape.parse(new File("test/resources/jobtracker.jsp"))
  
  "JobTrackerScrape heapSize" should " return (54.5, 888.94)" in {
	  
	  JobTrackerScrape.heapSize(doc) should equal (54.5F, 888.94F)
	  		
  }
  
  "JobTrackerScrape blacklisted" should "return 0" in {
    
      JobTrackerScrape.blacklisted(doc) should equal (0) 
  }
  
}