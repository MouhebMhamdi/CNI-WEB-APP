import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './Layouts/navbar/navbar.component';
import { FooterComponent } from './Layouts/footer/footer.component';
import { ContactComponent } from './Pages/contact/contact.component';
import { HeaderComponent } from './Pages/header/header.component';
import { HomePageComponent } from './Pages/home-page/home-page.component';
import { AboutComponent } from './Pages/about/about.component';
import { ServicesComponent } from './Pages/services/services.component';
import { FrequentlyQuestionComponent } from './Pages/frequently-question/frequently-question.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    FooterComponent,
    HeaderComponent,
    ContactComponent,
    HomePageComponent,
    AboutComponent,
    ServicesComponent,
    FrequentlyQuestionComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
