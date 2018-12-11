(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["main"],{

/***/ "./src/$$_lazy_route_resource lazy recursive":
/*!**********************************************************!*\
  !*** ./src/$$_lazy_route_resource lazy namespace object ***!
  \**********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncaught exception popping up in devtools
	return Promise.resolve().then(function() {
		var e = new Error("Cannot find module '" + req + "'");
		e.code = 'MODULE_NOT_FOUND';
		throw e;
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "./src/$$_lazy_route_resource lazy recursive";

/***/ }),

/***/ "./src/app/app.component.css":
/*!***********************************!*\
  !*** ./src/app/app.component.css ***!
  \***********************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/app.component.html":
/*!************************************!*\
  !*** ./src/app/app.component.html ***!
  \************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"panel\">\n\t<div class=\"panel-heading\"><h1>Welcome to admin home page</h1></div>\n</div>\t\n\n<nav class=\"navbar navbar-light\" style=\"background-color: #e3f2fd;\">\n    <div class=\"navbar-header\">\n        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\n                data-target=\".navbar-collapse\">\n            <span class=\"icon-bar\"></span>\n            <span class=\"icon-bar\"></span>\n            <span class=\"icon-bar\"></span>\n        </button>\n    </div>\n    <div class=\"navbar-collapse collapse\">\n        <ul class=\"nav navbar-nav\">\n            <li class=\"active\"><a routerLink=\"#\">Home</a></li>\n            <li><a routerLink=\"/getallcompanies\">Get All Companies</a></li>\n            <li><a routerLink=\"/createcompany\">Create Copmany</a></li>\n            <li><a routerLink=\"/removecopmany\">Remove/Update Company</a></li>\n            <li><a routerLink=\"/addcustomer\">Add Customer</a></li>\n            <li><a routerLink=\"/removeupadecustomer\">Remove/Update Customer</a></li>\n            <li><a routerLink=\"/getallcustomers\">Get All Customers</a></li>\n        </ul>\n        \n    </div>\n</nav>\n<router-outlet></router-outlet>\n"

/***/ }),

/***/ "./src/app/app.component.ts":
/*!**********************************!*\
  !*** ./src/app/app.component.ts ***!
  \**********************************/
/*! exports provided: AppComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppComponent", function() { return AppComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var AppComponent = /** @class */ (function () {
    function AppComponent() {
        this.title = 'admin';
    }
    AppComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-root',
            template: __webpack_require__(/*! ./app.component.html */ "./src/app/app.component.html"),
            styles: [__webpack_require__(/*! ./app.component.css */ "./src/app/app.component.css")]
        })
    ], AppComponent);
    return AppComponent;
}());



/***/ }),

/***/ "./src/app/app.module.ts":
/*!*******************************!*\
  !*** ./src/app/app.module.ts ***!
  \*******************************/
/*! exports provided: AppModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppModule", function() { return AppModule; });
/* harmony import */ var _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/platform-browser */ "./node_modules/@angular/platform-browser/fesm5/platform-browser.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _app_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./app.component */ "./src/app/app.component.ts");
/* harmony import */ var _components_get_all_companies_get_all_companies_component__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./components/get-all-companies/get-all-companies.component */ "./src/app/components/get-all-companies/get-all-companies.component.ts");
/* harmony import */ var _components_craete_company_craete_company_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./components/craete-company/craete-company.component */ "./src/app/components/craete-company/craete-company.component.ts");
/* harmony import */ var _angular_http__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! @angular/http */ "./node_modules/@angular/http/fesm5/http.js");
/* harmony import */ var _services_admin_requests_service__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./services/admin-requests.service */ "./src/app/services/admin-requests.service.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _components_remove_company_remove_company_component__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ./components/remove-company/remove-company.component */ "./src/app/components/remove-company/remove-company.component.ts");
/* harmony import */ var _components_addcustomer_addcustomer_component__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! ./components/addcustomer/addcustomer.component */ "./src/app/components/addcustomer/addcustomer.component.ts");
/* harmony import */ var _components_removeupdatecustomer_removeupdatecustomer_component__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! ./components/removeupdatecustomer/removeupdatecustomer.component */ "./src/app/components/removeupdatecustomer/removeupdatecustomer.component.ts");
/* harmony import */ var _components_getallcustomers_getallcustomers_component__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(/*! ./components/getallcustomers/getallcustomers.component */ "./src/app/components/getallcustomers/getallcustomers.component.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};













var AppModule = /** @class */ (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
            declarations: [
                _app_component__WEBPACK_IMPORTED_MODULE_3__["AppComponent"],
                _components_get_all_companies_get_all_companies_component__WEBPACK_IMPORTED_MODULE_4__["GetAllCompaniesComponent"],
                _components_craete_company_craete_company_component__WEBPACK_IMPORTED_MODULE_5__["CraeteCompanyComponent"],
                _components_remove_company_remove_company_component__WEBPACK_IMPORTED_MODULE_9__["RemoveCompanyComponent"],
                _components_addcustomer_addcustomer_component__WEBPACK_IMPORTED_MODULE_10__["AddcustomerComponent"],
                _components_removeupdatecustomer_removeupdatecustomer_component__WEBPACK_IMPORTED_MODULE_11__["RemoveupdatecustomerComponent"],
                _components_getallcustomers_getallcustomers_component__WEBPACK_IMPORTED_MODULE_12__["GetallcustomersComponent"],
            ],
            imports: [
                _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__["BrowserModule"],
                _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormsModule"],
                _angular_http__WEBPACK_IMPORTED_MODULE_6__["HttpModule"],
                _angular_router__WEBPACK_IMPORTED_MODULE_8__["RouterModule"].forRoot([
                    {
                        path: 'getallcompanies',
                        component: _components_get_all_companies_get_all_companies_component__WEBPACK_IMPORTED_MODULE_4__["GetAllCompaniesComponent"]
                    },
                    {
                        path: 'createcompany',
                        component: _components_craete_company_craete_company_component__WEBPACK_IMPORTED_MODULE_5__["CraeteCompanyComponent"]
                    },
                    {
                        path: 'removecopmany',
                        component: _components_remove_company_remove_company_component__WEBPACK_IMPORTED_MODULE_9__["RemoveCompanyComponent"]
                    },
                    {
                        path: 'addcustomer',
                        component: _components_addcustomer_addcustomer_component__WEBPACK_IMPORTED_MODULE_10__["AddcustomerComponent"]
                    },
                    {
                        path: 'removeupadecustomer',
                        component: _components_removeupdatecustomer_removeupdatecustomer_component__WEBPACK_IMPORTED_MODULE_11__["RemoveupdatecustomerComponent"]
                    },
                    {
                        path: 'getallcustomers',
                        component: _components_getallcustomers_getallcustomers_component__WEBPACK_IMPORTED_MODULE_12__["GetallcustomersComponent"]
                    }
                ])
            ],
            providers: [_services_admin_requests_service__WEBPACK_IMPORTED_MODULE_7__["AdminRequestsService"]],
            bootstrap: [_app_component__WEBPACK_IMPORTED_MODULE_3__["AppComponent"]]
        })
    ], AppModule);
    return AppModule;
}());



/***/ }),

/***/ "./src/app/common/company.ts":
/*!***********************************!*\
  !*** ./src/app/common/company.ts ***!
  \***********************************/
/*! exports provided: Company */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Company", function() { return Company; });
var Company = /** @class */ (function () {
    function Company(id, compName, password, email) {
        this.id = id;
        this.compName = compName;
        this.password = password;
        this.email = email;
    }
    return Company;
}());



/***/ }),

/***/ "./src/app/common/customer.ts":
/*!************************************!*\
  !*** ./src/app/common/customer.ts ***!
  \************************************/
/*! exports provided: Customer */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Customer", function() { return Customer; });
var Customer = /** @class */ (function () {
    function Customer(id, custName, password) {
        this.id = id;
        this.custName = custName;
        this.password = password;
    }
    return Customer;
}());



/***/ }),

/***/ "./src/app/components/addcustomer/addcustomer.component.css":
/*!******************************************************************!*\
  !*** ./src/app/components/addcustomer/addcustomer.component.css ***!
  \******************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/components/addcustomer/addcustomer.component.html":
/*!*******************************************************************!*\
  !*** ./src/app/components/addcustomer/addcustomer.component.html ***!
  \*******************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n\t\n\t\t<div class=\"panel panel-primary\" style=\"height:355px;width: 20%;\">\n\t<div class=\"panel-heading\"><h5>Add New Customer</h5></div> \n\t<br>\n\t\t<form class=\"form-horizontal\" style=\"margin-left: 10px; margin-right: 10px ;margin-right: 10px ;\">\n\t\t\n\t\t\t\t\t<label for=\"\">Customer ID</label>\n\t\t\t\t\t<input type=\"number\" name=\"id\" class=\"form-control\" [(ngModel)]=\"addCustomer.id\"> \n\t\t\t\t\n\t<br>\n\t\t\t\t<label for=\"\">Customer Name</label>\n\t\t\t\t<input type=\"text\" name=\"name\" class=\"form-control\" [(ngModel)]=\"addCustomer.custName\">{{addCustomer.name}}\n\t<br>\n\n\t\t\t\t<label for=\"\">Password</label>\n\t\t\t\t<input type=\"passwod\" name=\"password\" class=\"form-control\" [(ngModel)]=\"addCustomer.password\">\n\t<br>\n\t<button (click)=\"addNewCustomer()\" class=\"btn btn-primary\">Add customer</button>\n\t<br>\n</form>\n</div>\n\n"

/***/ }),

/***/ "./src/app/components/addcustomer/addcustomer.component.ts":
/*!*****************************************************************!*\
  !*** ./src/app/components/addcustomer/addcustomer.component.ts ***!
  \*****************************************************************/
/*! exports provided: AddcustomerComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AddcustomerComponent", function() { return AddcustomerComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _common_customer__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../../common/customer */ "./src/app/common/customer.ts");
/* harmony import */ var _services_admin_requests_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../../services/admin-requests.service */ "./src/app/services/admin-requests.service.ts");
/* harmony import */ var sweetalert2__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! sweetalert2 */ "./node_modules/sweetalert2/dist/sweetalert2.all.js");
/* harmony import */ var sweetalert2__WEBPACK_IMPORTED_MODULE_3___default = /*#__PURE__*/__webpack_require__.n(sweetalert2__WEBPACK_IMPORTED_MODULE_3__);
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var AddcustomerComponent = /** @class */ (function () {
    function AddcustomerComponent(_adminService) {
        this._adminService = _adminService;
        this.addCustomer = new _common_customer__WEBPACK_IMPORTED_MODULE_1__["Customer"](0, "", "");
    }
    AddcustomerComponent.prototype.ngOnInit = function () {
    };
    AddcustomerComponent.prototype.addNewCustomer = function () {
        this._adminService.createCustomer(this.addCustomer).subscribe(function (resp) {
            sweetalert2__WEBPACK_IMPORTED_MODULE_3___default()("New customer added");
        }, function (error) {
            sweetalert2__WEBPACK_IMPORTED_MODULE_3___default()(error._body);
        });
    };
    AddcustomerComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-addcustomer',
            template: __webpack_require__(/*! ./addcustomer.component.html */ "./src/app/components/addcustomer/addcustomer.component.html"),
            styles: [__webpack_require__(/*! ./addcustomer.component.css */ "./src/app/components/addcustomer/addcustomer.component.css")]
        }),
        __metadata("design:paramtypes", [_services_admin_requests_service__WEBPACK_IMPORTED_MODULE_2__["AdminRequestsService"]])
    ], AddcustomerComponent);
    return AddcustomerComponent;
}());



/***/ }),

/***/ "./src/app/components/craete-company/craete-company.component.css":
/*!************************************************************************!*\
  !*** ./src/app/components/craete-company/craete-company.component.css ***!
  \************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/components/craete-company/craete-company.component.html":
/*!*************************************************************************!*\
  !*** ./src/app/components/craete-company/craete-company.component.html ***!
  \*************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"panel panel-primary\" style=\"width:20%; margin:1%\" >\n\t<div class=\"panel-heading\"><h5 style=\"font-weight: bold\">Create company</h5></div>\n\n<form class=\"form-horizontal\" style=\"margin:5px\">\n\t\t<label for=\"\">Enter Company ID</label>\n\t\t<input type=\"number\" name=\"id\" class=\"form-control\" [(ngModel)]=\"addCompany.id\" placeholder=\"01\"> \n\t<br>\n\t\t<label for=\"\">Enter Company Name</label>\n\t\t<input type=\"text\"  class=\"form-control\" [(ngModel)]=\"addCompany.compName\" placeholder=\"Company\" name=\"compName\">\n\t<br>\n\t\t<label for=\"\">Enter Password</label>\n\t\t<input type=\"passwod\" name=\"password\" class=\"form-control\" [(ngModel)]=\"addCompany.password\"\n\t\tplaceholder=\"1234\">\n\t<br>\n\t\t<label for=\"\">Enter Email</label> \n\t\t<input type=\"text\" name=\"email\" class=\"form-control\" [(ngModel)]=\"addCompany.email\" placeholder=\"email@email.com\"> \n\t<br>\n\n\t<button (click)=\"createCompany()\" class=\"btn btn-primary\" style=\"margin-bottom: \">Create Company</button>\n\n</form>\n</div>"

/***/ }),

/***/ "./src/app/components/craete-company/craete-company.component.ts":
/*!***********************************************************************!*\
  !*** ./src/app/components/craete-company/craete-company.component.ts ***!
  \***********************************************************************/
/*! exports provided: CraeteCompanyComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "CraeteCompanyComponent", function() { return CraeteCompanyComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _common_company__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../../common/company */ "./src/app/common/company.ts");
/* harmony import */ var _services_admin_requests_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../../services/admin-requests.service */ "./src/app/services/admin-requests.service.ts");
/* harmony import */ var sweetalert2__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! sweetalert2 */ "./node_modules/sweetalert2/dist/sweetalert2.all.js");
/* harmony import */ var sweetalert2__WEBPACK_IMPORTED_MODULE_3___default = /*#__PURE__*/__webpack_require__.n(sweetalert2__WEBPACK_IMPORTED_MODULE_3__);
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var CraeteCompanyComponent = /** @class */ (function () {
    function CraeteCompanyComponent(_adminservice) {
        this._adminservice = _adminservice;
        this.addCompany = new _common_company__WEBPACK_IMPORTED_MODULE_1__["Company"](0, "", "", "");
        this.name = "check";
    }
    CraeteCompanyComponent.prototype.ngOnInit = function () {
    };
    CraeteCompanyComponent.prototype.createCompany = function () {
        this._adminservice.createNewCopmany(this.addCompany).subscribe(function (resp) {
            sweetalert2__WEBPACK_IMPORTED_MODULE_3___default()("Company created");
        }, function (error) {
            sweetalert2__WEBPACK_IMPORTED_MODULE_3___default()(error._body);
        });
    };
    CraeteCompanyComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-craete-company',
            template: __webpack_require__(/*! ./craete-company.component.html */ "./src/app/components/craete-company/craete-company.component.html"),
            styles: [__webpack_require__(/*! ./craete-company.component.css */ "./src/app/components/craete-company/craete-company.component.css")]
        }),
        __metadata("design:paramtypes", [_services_admin_requests_service__WEBPACK_IMPORTED_MODULE_2__["AdminRequestsService"]])
    ], CraeteCompanyComponent);
    return CraeteCompanyComponent;
}());



/***/ }),

/***/ "./src/app/components/get-all-companies/get-all-companies.component.css":
/*!******************************************************************************!*\
  !*** ./src/app/components/get-all-companies/get-all-companies.component.css ***!
  \******************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/components/get-all-companies/get-all-companies.component.html":
/*!*******************************************************************************!*\
  !*** ./src/app/components/get-all-companies/get-all-companies.component.html ***!
  \*******************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"panel panel-primary\" style=\"width: 50%\">\n\t<div class=\"panel-heading\">\n<h5 style=\"font-weight: bold;\">All Companies</h5>\n\t</div>\n<table class=\"table table-striped table-bordered\">\n\n\t\t<tr>\n\t\t\t<th>ID</th>\n\t\t\t<th>Company Name</th>\n\t\t\t<th>Password</th>\n\t\t\t<th>Email</th>\n\t\t</tr>\n\t\n\t<tr *ngFor = \"let company of companies\">\n\t<td>{{company.id}}</td>\t\n\t<td>{{company.compName}}</td>\n\t<td>{{company.password}}</td>\n\t<td>{{company.email}}</td>\n\t</tr>\n</table>\n<button (click)=\"loadAllComapnies()\" style=\"margin-top: 5%\">Update List</button>\n</div>\n"

/***/ }),

/***/ "./src/app/components/get-all-companies/get-all-companies.component.ts":
/*!*****************************************************************************!*\
  !*** ./src/app/components/get-all-companies/get-all-companies.component.ts ***!
  \*****************************************************************************/
/*! exports provided: GetAllCompaniesComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "GetAllCompaniesComponent", function() { return GetAllCompaniesComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _services_admin_requests_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../../services/admin-requests.service */ "./src/app/services/admin-requests.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var GetAllCompaniesComponent = /** @class */ (function () {
    function GetAllCompaniesComponent(_adminservice) {
        this._adminservice = _adminservice;
        _adminservice.getAllComapnies();
        this.companies = this._adminservice.companies;
    }
    GetAllCompaniesComponent.prototype.ngOnInit = function () {
    };
    GetAllCompaniesComponent.prototype.loadAllComapnies = function () {
        this._adminservice.getAllComapnies();
        this.companies = this._adminservice.companies;
    };
    GetAllCompaniesComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-get-all-companies',
            template: __webpack_require__(/*! ./get-all-companies.component.html */ "./src/app/components/get-all-companies/get-all-companies.component.html"),
            styles: [__webpack_require__(/*! ./get-all-companies.component.css */ "./src/app/components/get-all-companies/get-all-companies.component.css")]
        }),
        __metadata("design:paramtypes", [_services_admin_requests_service__WEBPACK_IMPORTED_MODULE_1__["AdminRequestsService"]])
    ], GetAllCompaniesComponent);
    return GetAllCompaniesComponent;
}());



/***/ }),

/***/ "./src/app/components/getallcustomers/getallcustomers.component.css":
/*!**************************************************************************!*\
  !*** ./src/app/components/getallcustomers/getallcustomers.component.css ***!
  \**************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/components/getallcustomers/getallcustomers.component.html":
/*!***************************************************************************!*\
  !*** ./src/app/components/getallcustomers/getallcustomers.component.html ***!
  \***************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"panel panel-primary\" style=\"width: 50%\" >\n\t<div class=\"panel-heading\">\n\t<h5 style=\"font-weight: bold;\">Customer List</h5>\n\t</div>\n\t<table class=\"table table table-striped table-bordered\">\n\t\t<tr>\n\t\t\t<th>ID</th>\n\t\t\t<th>Name</th>\n\t\t\t<th>Password</th>\n\t\t</tr>\n\t\t<tr *ngFor=\"let customer of customers\">\n\t\t\t<td>{{customer.id}}</td>\n\t\t\t<td>{{customer.custName}}</td>\n\t\t\t<td>{{customer.password}}</td>\n\t\t</tr>\n\n\t</table>\n\t<button (click)=\"getAllCustomers()\" style=\"margin-top: 5%\">Update List</button>\n</div>\n"

/***/ }),

/***/ "./src/app/components/getallcustomers/getallcustomers.component.ts":
/*!*************************************************************************!*\
  !*** ./src/app/components/getallcustomers/getallcustomers.component.ts ***!
  \*************************************************************************/
/*! exports provided: GetallcustomersComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "GetallcustomersComponent", function() { return GetallcustomersComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _services_admin_requests_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../../services/admin-requests.service */ "./src/app/services/admin-requests.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var GetallcustomersComponent = /** @class */ (function () {
    function GetallcustomersComponent(_adminService) {
        this._adminService = _adminService;
        _adminService.getAllCustomers();
    }
    GetallcustomersComponent.prototype.ngOnInit = function () {
    };
    GetallcustomersComponent.prototype.getAllCustomers = function () {
        console.log("check");
        this._adminService.getAllCustomers();
        this.customers = this._adminService.customers;
    };
    GetallcustomersComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-getallcustomers',
            template: __webpack_require__(/*! ./getallcustomers.component.html */ "./src/app/components/getallcustomers/getallcustomers.component.html"),
            styles: [__webpack_require__(/*! ./getallcustomers.component.css */ "./src/app/components/getallcustomers/getallcustomers.component.css")]
        }),
        __metadata("design:paramtypes", [_services_admin_requests_service__WEBPACK_IMPORTED_MODULE_1__["AdminRequestsService"]])
    ], GetallcustomersComponent);
    return GetallcustomersComponent;
}());



/***/ }),

/***/ "./src/app/components/remove-company/remove-company.component.css":
/*!************************************************************************!*\
  !*** ./src/app/components/remove-company/remove-company.component.css ***!
  \************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/components/remove-company/remove-company.component.html":
/*!*************************************************************************!*\
  !*** ./src/app/components/remove-company/remove-company.component.html ***!
  \*************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<h4>Remove/Update copmany</h4>\n<div class=\"panel panel-primary\" style=\"height:110px;width: 20%; margin:1%\">\n\t<div class=\"panel-heading\">\n\t\t<label class=\"radio-inline\"><input type=\"radio\" name=\"optradio\" checked>Search by ID</label>\n\t\t<label class=\"radio-inline\"><input type=\"radio\" name=\"optradio\">Search by Name</label>\n\t\t<input type=\"text\" name=\"\" class=\"form-control\" [(ngModel)]=\"byId\" placeholder=\"Company Name or ID number\">\n\t\t</div>\n\t\t<button (click)=\"getCompany()\" class=\"btn btn-primary btn-block\">Find Company</button>\n</div>\n\t\n<div class=\"panel panel-primary\" style=\"height:440px;width: 20%; margin: 1%\">\n\t<div class=\"panel-heading\"><h5>COMAPNY</h5></div> \n\t<br>\n\t\t<form  style=\"margin-left: 10px; margin-right: 10px\">\n\t\t\t\n\t\t\t\t\n\t\t\t\t\t<label for=\"\">Company ID</label>\n\t\t\t\t\t<input type=\"number\" class=\"form-control\" [(ngModel)]=\"companyUpdate.id\" name=\"id\"> \n\t\t\t\n\t<br>\n\t\t\t\n\t\t\t\t<label for=\"\">Company Name</label>\n\t\t\t\t<input type=\"text\" name=\"\" class=\"form-control\" [(ngModel)]=\"companyUpdate.compName\" name=\"compName\">\n\t\t\n\t<br>\n\n\t\t\t\n\t\t\t\t<label for=\"\">Password</label>\n\t\t\t\t<input type=\"passwod\" name=\"\" class=\"form-control\" [(ngModel)]=\"companyUpdate.password\" name=\"Password\">\n\t\t\t\n\t<br>\n\t\t\t\n\t\t\t\t<label for=\"\">Email</label> \n\t\t\t\t<input type=\"text\" name=\"\" class=\"form-control\" [(ngModel)]=\"companyUpdate.email\" name=\"email\"> \n\t\t\t\n\t<br>\n\n\t<button (click)=\"removeCompany()\" class=\"btn btn-primary\">Remove Company</button>&nbsp;&nbsp;&nbsp;\n\t<button (click)=\"updateCompany()\" class=\"btn btn-primary\">Update Comapny</button>\n\n</form>\n</div>"

/***/ }),

/***/ "./src/app/components/remove-company/remove-company.component.ts":
/*!***********************************************************************!*\
  !*** ./src/app/components/remove-company/remove-company.component.ts ***!
  \***********************************************************************/
/*! exports provided: RemoveCompanyComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "RemoveCompanyComponent", function() { return RemoveCompanyComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _common_company__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../../common/company */ "./src/app/common/company.ts");
/* harmony import */ var _services_admin_requests_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../../services/admin-requests.service */ "./src/app/services/admin-requests.service.ts");
/* harmony import */ var sweetalert2__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! sweetalert2 */ "./node_modules/sweetalert2/dist/sweetalert2.all.js");
/* harmony import */ var sweetalert2__WEBPACK_IMPORTED_MODULE_3___default = /*#__PURE__*/__webpack_require__.n(sweetalert2__WEBPACK_IMPORTED_MODULE_3__);
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var RemoveCompanyComponent = /** @class */ (function () {
    function RemoveCompanyComponent(_adminService) {
        this._adminService = _adminService;
        this.companyUpdate = new _common_company__WEBPACK_IMPORTED_MODULE_1__["Company"](0, "", "", "");
    }
    RemoveCompanyComponent.prototype.ngOnInit = function () {
    };
    RemoveCompanyComponent.prototype.getCompany = function () {
        var _this = this;
        this._adminService.searchCompanyById(this.byId).subscribe(function (resp) {
            _this.companyUpdate = resp.json();
            console.log(_this.companyUpdate);
        }, function (error) {
            sweetalert2__WEBPACK_IMPORTED_MODULE_3___default()(error._body);
        });
    };
    RemoveCompanyComponent.prototype.removeCompany = function () {
        this._adminService.removeCompany(this.companyUpdate);
    };
    RemoveCompanyComponent.prototype.updateCompany = function () {
        this._adminService.updateCompany(this.companyUpdate);
    };
    RemoveCompanyComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-remove-company',
            template: __webpack_require__(/*! ./remove-company.component.html */ "./src/app/components/remove-company/remove-company.component.html"),
            styles: [__webpack_require__(/*! ./remove-company.component.css */ "./src/app/components/remove-company/remove-company.component.css")]
        }),
        __metadata("design:paramtypes", [_services_admin_requests_service__WEBPACK_IMPORTED_MODULE_2__["AdminRequestsService"]])
    ], RemoveCompanyComponent);
    return RemoveCompanyComponent;
}());



/***/ }),

/***/ "./src/app/components/removeupdatecustomer/removeupdatecustomer.component.css":
/*!************************************************************************************!*\
  !*** ./src/app/components/removeupdatecustomer/removeupdatecustomer.component.css ***!
  \************************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/components/removeupdatecustomer/removeupdatecustomer.component.html":
/*!*************************************************************************************!*\
  !*** ./src/app/components/removeupdatecustomer/removeupdatecustomer.component.html ***!
  \*************************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<h4>Remove/Update customer</h4>\n<div class=\"panel panel-primary\" style=\"height:110px;width: 20%;\">\n\t<div class=\"panel-heading\">\n\t\t<label class=\"radio-inline\"><input type=\"radio\" name=\"byId\" checked>Search by ID</label>\n\t\t<label class=\"radio-inline\"><input type=\"radio\" name=\"byName\">Search by Name</label>\n\t\t<input type=\"text\" name=\"\" class=\"form-control\" [(ngModel)]=\"customerId\" placeholder=\"Company Name or ID number\">\n\t\t</div>\n\t\t<button (click)=\"getCustomerById()\" class=\"btn btn-primary\" class=\"btn btn-primary btn-block\">Find Customer</button>\n\t\n</div>\n\t\n<div class=\"panel panel-primary\" style=\"height:360px ;width: 20%;\">\n\t<div class=\"panel-heading\"><h5>Customer</h5></div> \n\t<br>\n\t\t<form  style=\"margin-left: 10px; margin-right: 10px\">\n\t\t\t\n\t\t\t\t\n\t\t\t\t\t<label for=\"\">Customer ID</label>\n\t\t\t\t\t<input type=\"number\" name=\"id\" class=\"form-control\" [(ngModel)]=\"updateCustomer.id\"> \n\t\t\t\n\t<br>\n\t\t\t\n\t\t\t\t<label for=\"\">Customer Name</label>\n\t\t\t\t<input type=\"text\" name=\"name\" class=\"form-control\" [(ngModel)]=\"updateCustomer.custName\">\n\t\t\n\t<br>\n\n\t\t\t\n\t\t\t\t<label for=\"\">Password</label>\n\t\t\t\t<input type=\"passwod\" name=\"password\" class=\"form-control\" [(ngModel)]=\"updateCustomer.password\">\n\t\t\t\n\t<br>\n\n\t<button (click)=\"removeCustomer()\" class=\"btn btn-primary\">Remove Customer</button>&nbsp;&nbsp;&nbsp;\n\t<button (click)=\"updateTheCustomer()\" class=\"btn btn-primary\">Update Customer</button>\n\n</form>\n</div>"

/***/ }),

/***/ "./src/app/components/removeupdatecustomer/removeupdatecustomer.component.ts":
/*!***********************************************************************************!*\
  !*** ./src/app/components/removeupdatecustomer/removeupdatecustomer.component.ts ***!
  \***********************************************************************************/
/*! exports provided: RemoveupdatecustomerComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "RemoveupdatecustomerComponent", function() { return RemoveupdatecustomerComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _common_customer__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../../common/customer */ "./src/app/common/customer.ts");
/* harmony import */ var _services_admin_requests_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../../services/admin-requests.service */ "./src/app/services/admin-requests.service.ts");
/* harmony import */ var sweetalert2__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! sweetalert2 */ "./node_modules/sweetalert2/dist/sweetalert2.all.js");
/* harmony import */ var sweetalert2__WEBPACK_IMPORTED_MODULE_3___default = /*#__PURE__*/__webpack_require__.n(sweetalert2__WEBPACK_IMPORTED_MODULE_3__);
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var RemoveupdatecustomerComponent = /** @class */ (function () {
    function RemoveupdatecustomerComponent(_adminService) {
        this._adminService = _adminService;
        this.updateCustomer = new _common_customer__WEBPACK_IMPORTED_MODULE_1__["Customer"](0, "", "");
    }
    RemoveupdatecustomerComponent.prototype.ngOnInit = function () {
    };
    RemoveupdatecustomerComponent.prototype.getCustomerById = function () {
        var _this = this;
        this._adminService.searchCustomerById(this.customerId).subscribe(function (resp) {
            _this.updateCustomer = resp.json();
        }, function (error) {
            sweetalert2__WEBPACK_IMPORTED_MODULE_3___default()(error._body);
        });
    };
    RemoveupdatecustomerComponent.prototype.updateTheCustomer = function () {
        this._adminService.updateCustomer(this.updateCustomer);
    };
    RemoveupdatecustomerComponent.prototype.removeCustomer = function () {
        this._adminService.removeCustomer(this.updateCustomer);
    };
    RemoveupdatecustomerComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-removeupdatecustomer',
            template: __webpack_require__(/*! ./removeupdatecustomer.component.html */ "./src/app/components/removeupdatecustomer/removeupdatecustomer.component.html"),
            styles: [__webpack_require__(/*! ./removeupdatecustomer.component.css */ "./src/app/components/removeupdatecustomer/removeupdatecustomer.component.css")]
        }),
        __metadata("design:paramtypes", [_services_admin_requests_service__WEBPACK_IMPORTED_MODULE_2__["AdminRequestsService"]])
    ], RemoveupdatecustomerComponent);
    return RemoveupdatecustomerComponent;
}());



/***/ }),

/***/ "./src/app/services/admin-requests.service.ts":
/*!****************************************************!*\
  !*** ./src/app/services/admin-requests.service.ts ***!
  \****************************************************/
/*! exports provided: AdminRequestsService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AdminRequestsService", function() { return AdminRequestsService; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_http__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/http */ "./node_modules/@angular/http/fesm5/http.js");
/* harmony import */ var sweetalert2__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! sweetalert2 */ "./node_modules/sweetalert2/dist/sweetalert2.all.js");
/* harmony import */ var sweetalert2__WEBPACK_IMPORTED_MODULE_2___default = /*#__PURE__*/__webpack_require__.n(sweetalert2__WEBPACK_IMPORTED_MODULE_2__);
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var AdminRequestsService = /** @class */ (function () {
    function AdminRequestsService(http) {
        this.http = http;
    }
    AdminRequestsService.prototype.getAllComapnies = function () {
        var _this = this;
        //this.http.get("http://localhost:8082/admin/getAllCompanies").subscribe(
        this.http.get("https://couponsystemv1.herokuapp.com/admin/getAllCompanies").subscribe(function (resp) {
            _this.companies = resp.json();
        });
    };
    AdminRequestsService.prototype.createNewCopmany = function (company) {
        // return this.http.post("http://localhost:8082/admin/createCompany" , company);
        return this.http.post("https://couponsystemv1.herokuapp.com/admin/createCompany", company);
    };
    AdminRequestsService.prototype.searchCompanyById = function (id) {
        //return  this.http.get("http://localhost:8082/admin/getCompany/" + id)
        return this.http.get("https://couponsystemv1.herokuapp.com/admin/getCompany/" + id);
    };
    // need to create for in Server Side 
    AdminRequestsService.prototype.searchCompanyByName = function (name) {
        var company;
        return company;
    };
    AdminRequestsService.prototype.removeCompany = function (company) {
        var options = new _angular_http__WEBPACK_IMPORTED_MODULE_1__["RequestOptions"]({
            body: company,
        });
        // this.http.delete("http://localhost:8082/admin/removeCompany" , options).subscribe(
        this.http.delete("https://couponsystemv1.herokuapp.com/admin/removeCompany", options).subscribe(function (resp) {
            if (resp.status == 200) {
                sweetalert2__WEBPACK_IMPORTED_MODULE_2___default()('Company was removed');
            }
        });
    };
    AdminRequestsService.prototype.updateCompany = function (company) {
        var _this = this;
        // this.http.put("http://localhost:8082/admin/companyDetailsUpdate" , company).subscribe(
        this.http.put("https://couponsystemv1.herokuapp.com/admin/companyDetailsUpdate", company).subscribe(function (resp) {
            _this.company = resp.json();
            sweetalert2__WEBPACK_IMPORTED_MODULE_2___default()('Company ' + _this.company.compName + ' was Updated');
        });
    };
    // Customer Services 
    AdminRequestsService.prototype.getAllCustomers = function () {
        var _this = this;
        // this.http.get("http://localhost:8082/admin/getCustomerList").subscribe(
        this.http.get("https://couponsystemv1.herokuapp.com/admin/getCustomerList").subscribe(function (resp) {
            _this.customers = resp.json();
        });
    };
    AdminRequestsService.prototype.createCustomer = function (customer) {
        // return this.http.post("http://localhost:8082/admin/addCustomer" , customer); 
        return this.http.post("https://couponsystemv1.herokuapp.com/admin/addCustomer", customer);
        // this.http.post("http://localhost:8082/admin/addCustomer" , customer).subscribe(
        //   (resp)=>{
        //     this.customer = resp.json(); 
        //    swal ('Customer created with ID : ' + this.customer.id );
        //   })
    };
    AdminRequestsService.prototype.searchCustomerById = function (id) {
        //return this.http.get("http://localhost:8082/admin/getCustomer/" + id);
        return this.http.get("https://couponsystemv1.herokuapp.com/admin/getCustomer/" + id);
    };
    AdminRequestsService.prototype.updateCustomer = function (customer) {
        var _this = this;
        // this.http.put("http://localhost:8082/admin/updateCustomerDetails", customer).subscribe(
        this.http.put("https://couponsystemv1.herokuapp.com/admin/updateCustomerDetails", customer).subscribe(function (resp) {
            _this.customer = resp.json();
            sweetalert2__WEBPACK_IMPORTED_MODULE_2___default()('Customer ' + _this.customer.custName + ' updated');
        });
    };
    AdminRequestsService.prototype.removeCustomer = function (customer) {
        var _this = this;
        var options = new _angular_http__WEBPACK_IMPORTED_MODULE_1__["RequestOptions"]({
            body: customer
        });
        //this.http.delete("http://localhost:8082/admin/removeCustomer" , options).subscribe(
        this.http.delete("https://couponsystemv1.herokuapp.com/admin/removeCustomer", options).subscribe(function (resp) {
            _this.customer = resp.json();
            sweetalert2__WEBPACK_IMPORTED_MODULE_2___default()('Customer ' + _this.customer.custName + ' removed');
        });
    };
    AdminRequestsService = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])({
            providedIn: 'root'
        }),
        __metadata("design:paramtypes", [_angular_http__WEBPACK_IMPORTED_MODULE_1__["Http"]])
    ], AdminRequestsService);
    return AdminRequestsService;
}());



/***/ }),

/***/ "./src/environments/environment.ts":
/*!*****************************************!*\
  !*** ./src/environments/environment.ts ***!
  \*****************************************/
/*! exports provided: environment */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "environment", function() { return environment; });
// This file can be replaced during build by using the `fileReplacements` array.
// `ng build ---prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.
var environment = {
    production: false
};
/*
 * In development mode, for easier debugging, you can ignore zone related error
 * stack frames such as `zone.run`/`zoneDelegate.invokeTask` by importing the
 * below file. Don't forget to comment it out in production mode
 * because it will have a performance impact when errors are thrown
 */
// import 'zone.js/dist/zone-error';  // Included with Angular CLI.


/***/ }),

/***/ "./src/main.ts":
/*!*********************!*\
  !*** ./src/main.ts ***!
  \*********************/
/*! no exports provided */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/platform-browser-dynamic */ "./node_modules/@angular/platform-browser-dynamic/fesm5/platform-browser-dynamic.js");
/* harmony import */ var _app_app_module__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./app/app.module */ "./src/app/app.module.ts");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./environments/environment */ "./src/environments/environment.ts");




if (_environments_environment__WEBPACK_IMPORTED_MODULE_3__["environment"].production) {
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["enableProdMode"])();
}
Object(_angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__["platformBrowserDynamic"])().bootstrapModule(_app_app_module__WEBPACK_IMPORTED_MODULE_2__["AppModule"])
    .catch(function (err) { return console.log(err); });


/***/ }),

/***/ 0:
/*!***************************!*\
  !*** multi ./src/main.ts ***!
  \***************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__(/*! /home/alexander/CouponProjectWeb/admin/src/main.ts */"./src/main.ts");


/***/ })

},[[0,"runtime","vendor"]]]);
//# sourceMappingURL=main.js.map