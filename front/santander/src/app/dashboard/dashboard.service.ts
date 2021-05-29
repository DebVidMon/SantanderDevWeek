import { Stock } from 'src/app/shared/Model/stock';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DashboardService {
  readonly baseUrl = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

   async getStocks(): Promise<Stock[]> {
   return this.http.get<Stock[]>(`${this.baseUrl}/stock`).toPromise();
   }
}
