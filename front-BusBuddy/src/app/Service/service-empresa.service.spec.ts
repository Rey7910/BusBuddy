import { TestBed } from '@angular/core/testing';

import { ServiceEmpresaService } from './service-empresa.service';

describe('ServiceEmpresaService', () => {
  let service: ServiceEmpresaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ServiceEmpresaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
