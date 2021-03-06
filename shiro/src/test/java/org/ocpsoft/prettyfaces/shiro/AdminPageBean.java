package org.ocpsoft.prettyfaces.shiro;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.ocpsoft.prettyfaces.annotation.ForwardTo;
import org.ocpsoft.prettyfaces.annotation.PathPattern;

@ManagedBean
@RequestScoped
@PathPattern("/admin/something")
@ShiroRoleRequired("admin")
@ForwardTo("/faces/protected-page.xhtml")
public class AdminPageBean
{

}
