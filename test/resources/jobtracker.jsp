<html><head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<title>localhost Hadoop Map/Reduce Administration</title>
<link rel="stylesheet" type="text/css" href="jobtracker_files/hadoop.css">
<script type="text/javascript" src="jobtracker_files/jobtracker.js"></script>
<script type="text/javascript" src="jobtracker_files/sorttable.js"></script>
</head>
<body>



<h1>localhost Hadoop Map/Reduce Administration</h1>

<div id="quicklinks">
  <a href="#quicklinks" onclick="toggle('quicklinks-list'); return false;">Quick Links</a>
  <ul id="quicklinks-list">
    <li><a href="#scheduling_info">Scheduling Info</a></li>
    <li><a href="#running_jobs">Running Jobs</a></li>
    <li><a href="#retired_jobs">Retired Jobs</a></li>
    <li><a href="#local_logs">Local Logs</a></li>
  </ul>
</div>

<b>State:</b> RUNNING<br>
<b>Started:</b> Thu Jul 04 11:42:28 CEST 2013<br>
<b>Version:</b> 1.0.4,
                r1393290<br>
<b>Compiled:</b> Wed Oct  3 05:13:58 UTC 2012 by 
                 hortonfo<br>
<b>Identifier:</b> 201307041142<br>                 
                   
<hr>
<h2>Cluster Summary (Heap Size is 54.5 MB/888.94 MB)</h2>
<table border="1" cellpadding="5" cellspacing="0">
<tbody><tr><th>Running Map Tasks</th><th>Running Reduce Tasks</th><th>Total Submissions</th><th>Nodes</th><th>Occupied Map Slots</th><th>Occupied Reduce Slots</th><th>Reserved Map Slots</th><th>Reserved Reduce Slots</th><th>Map Task Capacity</th><th>Reduce Task Capacity</th><th>Avg. Tasks/Node</th><th>Blacklisted Nodes</th><th>Graylisted Nodes</th><th>Excluded Nodes</th></tr>
<tr><td>0</td><td>0</td><td>0</td><td><a href="http://localhost:50030/machines.jsp?type=active">1</a></td><td>0</td><td>0</td><td>0</td><td>0</td><td>1</td><td>1</td><td>2.00</td><td><a href="http://localhost:50030/machines.jsp?type=blacklisted">0</a></td><td><a href="http://localhost:50030/machines.jsp?type=graylisted">0</a></td><td><a href="http://localhost:50030/machines.jsp?type=excluded">0</a></td></tr></tbody></table>
<br>
<hr>
<h2 id="scheduling_info">Scheduling Information</h2>
<table class="sortable" border="2" cellpadding="5" cellspacing="2">
<thead style="font-weight: bold">
<tr>
<td> Queue Name </td>
<td> State </td>
<td> Scheduling Information</td>
</tr>
</thead>
<tbody>

<tr>
<td><a href="http://localhost:50030/jobqueue_details.jsp?queueName=default">default</a></td>
<td>running</td>
<td>N/A
</td>
</tr>

</tbody>
<tfoot></tfoot></table>
<hr>
<b>Filter (Jobid, Priority, User, Name)</b> <input id="filter" onkeyup="applyfilter()" type="text"> <br>
<span class="small">Example: 'user:smith 3200' will filter by 'smith' only in the user field and '3200' in all fields</span>
<hr>

<h2 id="running_jobs">Running Jobs</h2>
<table class="sortable" border="1" cellpadding="5" cellspacing="0"><thead><tr><td colspan="8" align="center"><i>none</i></td></tr></thead>
<tbody>
</tbody><tfoot></tfoot></table>

<hr>





<h2 id="retired_jobs">Retired Jobs</h2>
<table border="1" cellpadding="5" cellspacing="0">
<tbody><tr><td colspan="8" align="center"><i>none</i></td></tr>
</tbody></table>

<hr>

<h2 id="local_logs">Local Logs</h2>
<a href="http://localhost:50030/logs/">Log</a> directory,
<a href="http://localhost:50030/jobhistoryhome.jsp">
Job Tracker History</a>

<hr>
This is <a href="http://hadoop.apache.org/">Apache Hadoop</a> release 1.0.4


</body></html>