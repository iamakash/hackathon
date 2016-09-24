     <!-- Sidebar -->
     <nav class="navbar navbar-inverse navbar-fixed-top" id="sidebar-wrapper" role="navigation">
         <ul class="nav sidebar-nav">
             <li class="sidebar-brand">
                 <a href="#">
                    Brand
                 </a>
             </li>
             <li>
                 <a href="${createLink(controller: "admin",action: "index")}">Home</a>
             </li>
             <li>
                 <a href="#">About</a>
             </li>
             <li>
                 <a href="#">Events</a>
             </li>
             <li>
                 <a href="#">Team</a>
             </li>
             <li class="dropdown">
               <a href="#" class="dropdown-toggle" data-toggle="dropdown">Works <span class="caret"></span></a>
               <ul class="dropdown-menu" role="menu">
                 <li class="dropdown-header">Extra</li>
                 <li><a href="${createLink(controller: "admin",action: "showMilestone")}">Mile Stone</a></li>
                 <li><a href="#">Label</a></li>
               </ul>
             </li>

         </ul>
     </nav>