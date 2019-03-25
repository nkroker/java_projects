<%-- 
    Document   : manageroutes
    Created on : 5 Jun, 2017, 1:43:08 PM
    Author     : Payal Panchal
--%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="css/theme.css" type="text/css" />
    <link rel="stylesheet" href="css/media.css" type="text/css" />
    <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css" />
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,600,600italic,400italic,800,700' rel='stylesheet' type='text/css'>    
    <link href='https://fonts.googleapis.com/css?family=Oswald:400,700,300' rel='stylesheet' type='text/css'>
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>

<!-- \\ Begin Holder \\ -->
<div class="DesignHolder">
	<!-- \\ Begin Frame \\ -->
	<div class="LayoutFrame">
        <!-- \\ Begin Header \\ -->
        <header>
            <div class="Center">
                <div class="site-logo">
                	<h1><a href="#">MY <span>BUS </span>SERVICES</a></h1>
                </div>
               <div id="mobile_sec">
               <div class="mobile"><i class="fa fa-bars"></i><i class="fa fa-times"></i></div>
                <div class="menumobile">
                    <!-- \\ Begin Navigation \\ -->
                    <nav class="Navigation">
                        <ul>
                             <li class="active">                                
                                <a href="#manageroutes">Manage Routes</a>
                                <span class="menu-item-bg"></span>
                            </li>
                             <li class="active">                                
                                <a href="viewroute.jsp">View Routes</a>
                                <span class="menu-item-bg"></span>
                            </li>
                            <li>
                                <a href="admin.jsp">Back</a>
                                <span class="menu-item-bg"></span>
                            </li>
                            <li>
                                <a href="chooseuser.jsp">Signout</a>
                                <span class="menu-item-bg"></span>
                            </li>
                        </ul>
                    </nav>
                    
                    </div>
				</div>
                <div class="clear"></div>
            </div>	
        </header>
         
 <div class="Services_sec" id="manageroutes">                          
        
            <div class="Center">
                <h2>MANAGE ROUTES</h2>  
                <P>You can Manage Routes by selecting the Todays Routes</P>
            </div>
         </div>
        
           
             
             
        <form method="post" action="manageroutedb.jsp">
            <center>
          <table border="1" width="30%" cellpadding="5">
              <thead>
                    <tr>
                        <th colspan="2">Today's Routes</th>
                    </tr>
                </thead>
              <tbody>
  <tr>
    <td>s.no</td>
    <td>routes</td>
    <td>Today routes</td>
  </tr>
  <tr>
    <td>1.</td>
    <td>Route 1</td>
    <td><input type="text" name="route1" value="" /></td>
  </tr>
  <tr>
    <td>2.</td>
    <td>Route 2</td>
    <td><input type="text" name="route2" value="" /></td>
  </tr>
  <tr>
    <td>3.</td>
    <td>Route 3</td>
    <td><input type="text" name="route3" value="" /></td>
  </tr>
  <tr>
    <td>4.</td>
    <td>Route 4</td>
    <td><input type="text" name="route4" value="" /></td>
  </tr>
  <tr>
    <td>5.</td>
    <td>Route 5</td>
    <td><input type="text" name="route5" value="" /></td>
  </tr>
  <tr>
    <td>6.</td>
    <td>Route 6</td>
    <td><input type="text" name="route6" value="" /></td>
  </tr>
  <tr>
    <td>7.</td>
    <td>Route 7</td>
    <td><input type="text" name="route7" value="" /></td>
  </tr>
  <tr>
    <td>8.</td>
    <td>Route 8</td>
    <td><input type="text" name="route8" value="" /></td>
  </tr>
  <tr>
    <td>9.</td>
    <td>Route 9</td>
    <td><input type="text" name="route9" value="" /></td>
  </tr>
  <tr>
    <td>10.</td>
    <td>Route 10</td>
    <td><input type="text" name="route10" value="" /></td>
  </tr>
  
  
                  </tbody>
                 </table>
                <tr>
  <td><input type="submit" value="Submit" /></td>
  
 </tr>
            
            </center>
                </form>
        <form method="post" action="resetroute.jsp">
       <center>
   <tr>
  <td><input type="submit" value="Reset" /></td>
 </tr>
       </center>
</form>
<div class="Services_sec" id="manageroutes">                          
        
<div class="Center">
<p>My Bus Location</p>  
</div>
</div>
           
</div>
</div>
       
</div>   
<div id="loader-wrapper">
<div id="loader"></div>

    <div class="loader-section section-left"></div>
    <div class="loader-section section-right"></div>

</div>

<!-- <<Attched Javascripts>> -->
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="js/jquery.sudoSlider.min.js"></script>
<script type="text/javascript" src="js/global.js"></script>
<script type="text/javascript" src="js/modernizr.js"></script>

</body>
</html>