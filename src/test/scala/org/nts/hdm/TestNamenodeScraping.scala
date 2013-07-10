package org.nts.hdm

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec
import org.ns.hdm.job.JobTrackerScrape
import java.io.File
import org.ns.hdm.job.NamenodeScrape

class TestNamenodeScraping extends FlatSpec with ShouldMatchers{

  val doc = NamenodeScrape.parse(new File("test/resources/dfshealth.jsp"))
  
  "NamenodeScrape heapSize" should " return (54.5, 888.94)" in {
	  
	  NamenodeScrape.heapSize(doc) should equal (54.5F, 888.94F)

  }

  "NamenodeScape configured capacity" should "return 0" in {
      NamenodeScrape.statusMap(doc)("number-of-under-replicated-blocks") should equal (0F)
  }
  
  "NamenodeScape dead-nodes" should "return 0" in {
      NamenodeScrape.statusMap(doc)("dead-nodes") should equal (0F)
  }
 
  "NamenodeScape non-dfs-used" should "return 1.85" in {
      NamenodeScrape.statusMap(doc)("non-dfs-used") should equal (1.85F)
  }
 
  "NamenodeScape dfs-used-per" should "return 0" in {
      NamenodeScrape.statusMap(doc)("dfs-used-per") should equal (0F)
  }
  
  "NamenodeScape dfs-remaining-per" should "return 46.73" in {
      NamenodeScrape.statusMap(doc)("dfs-remaining-per") should equal (46.73F)
  }
  
  "NamenodeScape decommissioning-nodes" should "return 0" in {
      NamenodeScrape.statusMap(doc)("decommissioning-nodes") should equal (0F)
  }
 
  "NamenodeScape live-nodes" should "return 1" in {
      NamenodeScrape.statusMap(doc)("live-nodes") should equal (1F)
  }
   
  "NamenodeScape dfs-remaining" should "return 1.63" in {
      NamenodeScrape.statusMap(doc)("dfs-remaining") should equal (1.63F)
  }
   
  "NamenodeScape configured-capacity" should "return 3.48" in {
      NamenodeScrape.statusMap(doc)("configured-capacity") should equal (3.48F)
  }
  
  "NamenodeScape dfs-used" should "return 3.48" in {
      NamenodeScrape.statusMap(doc)("dfs-used") should equal (48F)
  }
  
  
}

