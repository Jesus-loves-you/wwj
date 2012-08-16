package controllers

import play.api.mvc.{Action, Results, Controller}
import views._

object Home extends Controller {
  def index = Action {
    Results.Redirect(routes.Home.login)
  }

  def login = Action { 
    Ok(views.html.login())
  }
}
