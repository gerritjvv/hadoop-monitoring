package org.ns.hdm.job

import scala.collection.JavaConversions._
import java.io.File
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements
import scala.util.matching.Regex.Match
import java.net.URL

/**
 * Scrape the Namenode page for information
 * 
 * Memory, BlackListed TT
 * 
 */
object NamenodeScrape {
  
  val heap_regex = """(\d+\.\d*)""".r
  val num_regex = """(\d+\.?\d*)""".r

  
  val ids = Map(
                    0 -> "configured-capacity", 
                    1 -> "dfs-used", 
                    2 -> "non-dfs-used", 
                    3 -> "dfs-remaining",
                    4 -> "dfs-used-per", 
                    5 -> "dfs-remaining-per", 
                    6 -> "live-nodes", 
                    7 -> "dead-nodes", 
                    8 -> "decommissioning-nodes",
                    9 -> "number-of-under-replicated-blocks" )

                    
  def parse(file:File):Document = Jsoup.parse(file, "UTF-8", "http://test.com")
  def parse(url:String):Document = Jsoup.connect(url).get()
  
  /**
   * Returns a tuple of (memory-used, total-memory),
   * if no matches is found (-1.0, -1.0) is returned
   */
  def heapSize(doc:Document): (Float, Float) =  doc.select("b:matches(Heap Size)") match {  
    					case e:Elements =>  heap_regex.findAllMatchIn(e.text()) match{
    					  						case i:Iterator[Match] => 
    					  						   (i.next().group(0).toFloat, i.next().group(0).toFloat)
    					  						case _ => (-1.0F, -1.0F)
    										} 
  
    					case _ => (-1.0F, -1.0F)
  					   }
 
  
  /**
   * Returns all of the status properties (except the memory) scraped from the dfshealth page
   */
  def statusMap(doc:Document): Map[String, Float] =
		  	(doc.select("td[id=col3]").zipWithIndex.map { case (s, i) => (ids(i) -> num_regex.findAllMatchIn(s.text()).next().group(0).toFloat) }).toMap

  
}