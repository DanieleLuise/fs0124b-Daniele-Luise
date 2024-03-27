import { IProducts } from "./i-products"

export interface IProd {
  products:IProducts[]
  total: number
  skip: number
  limit: number

}
