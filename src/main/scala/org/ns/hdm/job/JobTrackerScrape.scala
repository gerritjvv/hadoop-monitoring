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
  
  //Cluster Summary (Heap Size is 54.5 MB/888.94 MB)
/*
 * 	val (m1:Float, m2:Float) = r.findAllMatchIn(p.text) match {
             case m:Iterator[Match] => (m.next().toFloat, m.next().toFloat)
             case _ => (-1, -1)
 * 
 */
  def parse(file:File):Document = Jsoup.parse(file, "UTF-8", "http://test.com")
  
  def heapSize(doc:Document): (Float, Float) =  doc.select("h2:matches(Heap Size)") match {  
    					case e:Elements =>  heap_regex.findAllMatchIn(e.text()) match{
    					  						case i:Iterator[Match] => (i.next().group(0).toFloat, i.next().group(0).toFloat)
    					  						case _ => (-1.0F, -1.0F)
    										} 
  
    					case _ => (-1.0F, -1.0F)
  					   }
 
  
  
}