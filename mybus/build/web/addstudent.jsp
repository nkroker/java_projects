<%-- 
    Document   : addstudent
    Created on : 5 Jun, 2017, 11:44:36 AM
    Author     : Payal Panchal
--%>

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
                                <a href="#addstudent">Add Student</a>
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
         <div class="Services_sec" id="addstudent">                          
        
            <div class="Center">
                <h2>ADD STUDENTS</h2>  
                <P>You can add students by registered their USERNAME and PASSWORD</P>
            </div>
         </div>
        
 
        
        <body>
        <form method="post" action="registration.jsp">
            <center>
            <table border="1" width="30%" cellpadding="5">
                <thead>
                    <tr>
                        <th colspan="2">Enter Information Here....</th>
                    </tr>
                </thead>
                <tbody>
                   
                    <tr>
                        <td>User Name</td>
                        <td><input type="text" name="username" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="text" name="password" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Submit" respomsesendRedirect("registration.jsp");/></td>
                       
                    </tr>
                    
                </tbody>
            </table>
            </center>
        </form>
        
        
</div>            
</div>        
        <!-- // End Container // -->
	<!-- // End Layout Frame // -->
        <!-- // End Design Holder // -->
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
