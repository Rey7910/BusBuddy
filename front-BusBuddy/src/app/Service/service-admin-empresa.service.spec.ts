import { TestBed } from '@angular/core/testing';

import { ServiceAdminEmpresaService } from './service-admin-empresa.service';

describe('ServiceAdminEmpresaService', () => {
  let service: ServiceAdminEmpresaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ServiceAdminEmpresaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
