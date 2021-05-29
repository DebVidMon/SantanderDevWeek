import { Component, Input, OnInit  } from '@angular/core';
import Stock from 'src/app/shared/Model/stock';


@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {

  @Input()
  stock = new Stock();

  constructor() { }

  ngOnInit(): void {
  }

   get variation(): string {
    const localizedVariationString = this.stock.variacao.toLocaleString();
    const prefix = this.stock.variacao > 0 ? '+' : '-';
    return `${prefix} ${localizedVariationString.replace('-', '')}%`;
   }

}
