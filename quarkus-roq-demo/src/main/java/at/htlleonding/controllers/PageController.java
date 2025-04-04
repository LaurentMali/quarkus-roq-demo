package at.htlleonding.controllers;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class PageController {

    private Template home;
    private Template lecture;
    private Template technology;
    private Template project;
    private Template services;

    public PageController(Template home, Template lecture, Template technology, Template project, Template services) {
        this.home = home;
        this.lecture = lecture;
        this.technology = technology;
        this.project = project;
        this.services = services;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance getHome() {
        return home.instance();
    }

    @GET
    @Path("/lecture")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance lecture() {
        return lecture.instance();
    }

    @GET
    @Path("/technology")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance technology() {
        return technology.instance();
    }

    @GET
    @Path("/project")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance project() {
        return project.instance();
    }

    @GET
    @Path("/services")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance services() {
        return services.instance();
    }
}
