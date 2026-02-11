
PN = "ocl-icd"
PE = "0"
PV = "2.3.2"
PR = "8.el10"
PACKAGES = "ocl-icd ocl-icd-devel"


URI_ocl-icd = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ocl-icd-2.3.2-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocl-icd = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:ocl-icd = "libOpenCL.so.1()(64bit) ( ) libOpenCL.so.1(OPENCL_1.0)(64bit) ( ) libOpenCL.so.1(OPENCL_1.1)(64bit) ( ) libOpenCL.so.1(OPENCL_1.2)(64bit) ( ) libOpenCL.so.1(OPENCL_2.0)(64bit) ( ) libOpenCL.so.1(OPENCL_2.1)(64bit) ( ) libOpenCL.so.1(OPENCL_2.2)(64bit) ( ) libOpenCL.so.1(OPENCL_3.0)(64bit) ( ) ocl-icd ( =  2.3.2-8.el10) ocl-icd(x86-64) ( =  2.3.2-8.el10)"

URI_ocl-icd-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocl-icd-devel-2.3.2-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocl-icd-devel = "/usr/bin/pkg-config ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libOpenCL.so.1()(64bit) ( ) opencl-headers ( ) pkgconfig(OpenCL-Headers) ( ) ocl-icd(x86-64) ( =  2.3.2-8.el10)"
RPROVIDES:ocl-icd-devel = "ocl-icd-devel ( =  2.3.2-8.el10) ocl-icd-devel(x86-64) ( =  2.3.2-8.el10) pkgconfig(OpenCL) ( =  3.0) pkgconfig(ocl-icd) ( =  2.3.2)"
