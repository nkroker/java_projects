<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8" />
    
   <title>Admin View Routes..</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="css/theme.css" type="text/css" />
    <link rel="stylesheet" href="css/media.css" type="text/css" />
    <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css" />
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,600,600italic,400italic,800,700' rel='stylesheet' type='text/css'>    
    <link href='https://fonts.googleapis.com/css?family=Oswald:400,700,300' rel='stylesheet' type='text/css'>

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
                                <a href="#viewroutes">View Routes</a>
                                <span class="menu-item-bg"></span>
                            </li>
                            <li>
                                <a href="student.jsp">Back</a>
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
         
 <div class="Services_sec" id="viewroutes">                          
        
            <div class="Center">
                <h2>VIEW ROUTES</h2>  
                <P>Here you get view of today's routes....</P>
            </div>
         </div>
<center>
<table border="1" width="30%" cellpadding="5">
              <thead>
                    <tr>
                        <th colspan="2">Today's Routes</th>
                    </tr>
                </thead>
              <tbody>
    <tr>
    <td>S.no</td>
    <td>Routes</td>
    <td>Today Routes</td>
    </tr>
    <tr>
    <td>1.</td>
    <td>Route 1</td>
    <td><%out.println("Route 1");%></td>
    </tr>
    <tr>
    <td>2.</td>
    <td>Route 2</td>
    <td><%out.println("Route 1");%></td>
    </tr>
    <tr>
    <td>3.</td>
    <td>Route 3</td>
    <td><%out.println("Route 1");%></td>
  </tr>
  <tr>
    <td>4.</td>
    <td>Route 4</td>
    <td><%out.println("Route 1");%></td>
  </tr>
  <tr>
    <td>5.</td>
    <td>Route 5</td>
    <td><%out.println("Route 1");%></td>
  </tr>
  <tr>
    <td>6.</td>
    <td>Route 6</td>
    <td><%out.println("Route 1");%></td>
  </tr>
  <tr>
    <td>7.</td>
    <td>Route 7</td>
    <td><%out.println("Route 1");%></td>
  </tr>
  <tr>
    <td>8.</td>
    <td>Route 8</td>
    <td><%out.println("Route 1");%></td>
  </tr>
  <tr>
    <td>9.</td>
    <td>Route 9</td>
    <td><%out.println("Route 1");%></td>
  </tr>
  <tr>
    <td>10.</td>
    <td>Route 10</td>
    <td><%out.println("Route 1");%></td>
  </tr>
</tbody>
</table>
</center>
  <div class="Services_sec" id="manageroutes">                          
        
            <div class="Center">
                <p>My Bus Location</p>  
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