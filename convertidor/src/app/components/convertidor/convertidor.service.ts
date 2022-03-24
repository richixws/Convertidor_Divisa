import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Form } from '@angular/forms';
import { Observable } from 'rxjs';
import { Convertidor } from './convertidor';

@Injectable({
  providedIn: 'root'
})
export class ConvertidorService {

  //private urlEndPoint:string = 'http://localhost:8765/currency-exchange/from/USD/to/PEN';
  //private urlEndPoint2:string = 'http://localhost:8080';
   private urlEndPoint2:string = 'http://localhost:8765';
   //private urlEndPoint2 = '/convert';

  constructor(  private httpClient:HttpClient,) { }


  public convert(_conversion: Convertidor){
   // alert('conversion de servicio'+this.urlEndPoint2);

    let parametro=new HttpParams();
    parametro=parametro.set('from', _conversion.from);
    parametro=parametro.set('to', _conversion.to);
    parametro=parametro.set('quantity',_conversion.quantity);

    //alert(parametro.get('from'));
    //alert(parametro.get('to'))
    //alert(parametro.get('quantity'))
    //alert(this.urlEndPoint2 +"/currency-conversion"+"/from/"+_conversion.from+"/to/"+_conversion.to+"/quantity/"+_conversion.quantity);
    
    return this.httpClient.get<Convertidor>(this.urlEndPoint2 +"/currency-conversion"+"/from/"+_conversion.from+"/to/"+_conversion.to+"/quantity/"+_conversion.quantity);

  }


/*

  getCambioDivisa(from: any, to:any):Observable<Convertidor>{

    return this.httpClient.get<Convertidor>(`${this.urlEndPoint}/currency-exchange/from/${from}/to/${to}`);
      
  }


  getConversion(from: any, to:any, quantity:number):Observable<Convertidor>{

    return this.httpClient.get<Convertidor>(`${this.urlEndPoint2}/currency-conversion/from/${from}/to/${to}/quantity/${quantity}`);
      
  }
*/

}
