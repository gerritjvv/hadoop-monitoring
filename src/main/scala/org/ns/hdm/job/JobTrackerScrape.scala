package org.ns.hdm.job

import java.io.File
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements
import scala.util.matching.Regex.Match

/**
 * Scrape the Jobtracker page for information
 * 
 * Memory, BlackListed TT
 * 
 */
object JobTrackerScrape {
  
  val heap_regex = """(\d*\.\d*)""".r

  def parse(file:File):Document = Jsoup.parse(file, "UTF-8", "http://test.com")
  
  /**
   * Returns a tuple of (memory-used, total-memory),
   * if no matchs is found (-1.0, -1.0) is returned
   */
  def heapSize(doc:Document): (Float, Float) =  doc.select("h2:matches(Heap Size)") match {  
    					case e:Elements =>  heap_regex.findAllMatchIn(e.text()) match{
    					  						case i:Iterator[Match] => (i.next().group(0).toFloat, i.next().group(0).toFloat)
    					  						case _ => (-1.0F, -1.0F)
    										} 
  
    					case _ => (-1.0F, -1.0F)
  					   }
 
  
  /**
   * Returns blacklisted nodes, if not match was found minus one is returned
   */
  def blacklisted(doc:Document): Int = doc.select("a[href*=blacklisted]") match {
    											case m:Elements => m.text().toInt
    											case _ => -1
  										}
  
  
}