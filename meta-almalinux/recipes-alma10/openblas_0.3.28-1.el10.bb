
PN = "openblas"
PE = "0"
PV = "0.3.28"
PR = "1.el10"
PACKAGES = "openblas openblas-openmp openblas-openmp64 openblas-serial openblas-devel openblas-openmp64_ openblas-serial64 openblas-serial64_ openblas-static openblas-threads openblas-threads64 openblas-threads64_"


URI_openblas = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openblas-0.3.28-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openblas = ""
RPROVIDES:openblas = "openblas ( =  0.3.28-1.el10) bundled(lapack) ( =  3.11.0) openblas(x86-64) ( =  0.3.28-1.el10)"

URI_openblas-openmp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openblas-openmp-0.3.28-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openblas-openmp = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libgomp.so.1()(64bit) ( ) libgfortran.so.5()(64bit) ( ) libgfortran.so.5(GFORTRAN_8)(64bit) ( ) libgomp.so.1(GOMP_4.0)(64bit) ( ) libgomp.so.1(OMP_1.0)(64bit) ( ) libgomp.so.1(GOMP_2.0)(64bit) ( ) libgomp.so.1(OMP_3.0)(64bit) ( ) libgomp.so.1(OMP_4.5)(64bit) ( ) openblas ( =  0.3.28-1.el10)"
RPROVIDES:openblas-openmp = "libopenblaso.so.0()(64bit) ( ) openblas-openmp ( =  0.3.28-1.el10) openblas-openmp(x86-64) ( =  0.3.28-1.el10)"

URI_openblas-openmp64 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openblas-openmp64-0.3.28-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openblas-openmp64 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libgomp.so.1()(64bit) ( ) libgfortran.so.5()(64bit) ( ) libgfortran.so.5(GFORTRAN_8)(64bit) ( ) libgomp.so.1(GOMP_4.0)(64bit) ( ) libgomp.so.1(OMP_1.0)(64bit) ( ) libgomp.so.1(GOMP_2.0)(64bit) ( ) libgomp.so.1(OMP_3.0)(64bit) ( ) libgomp.so.1(OMP_4.5)(64bit) ( ) openblas ( =  0.3.28-1.el10)"
RPROVIDES:openblas-openmp64 = "libopenblaso64.so.0()(64bit) ( ) openblas-openmp64 ( =  0.3.28-1.el10) openblas-openmp64(x86-64) ( =  0.3.28-1.el10)"

URI_openblas-serial = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openblas-serial-0.3.28-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openblas-serial = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libgfortran.so.5()(64bit) ( ) libgfortran.so.5(GFORTRAN_8)(64bit) ( ) openblas ( =  0.3.28-1.el10)"
RPROVIDES:openblas-serial = "libopenblas.so.0()(64bit) ( ) openblas-serial ( =  0.3.28-1.el10) openblas-serial(x86-64) ( =  0.3.28-1.el10)"

URI_openblas-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/openblas-devel-0.3.28-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openblas-devel = "libopenblaso64_.so.0()(64bit) ( ) libopenblaso.so.0()(64bit) ( ) libopenblaso64.so.0()(64bit) ( ) openblas-srpm-macros ( ) openblas-openmp64_(x86-64) ( =  0.3.28-1.el10) openblas-serial64(x86-64) ( =  0.3.28-1.el10) openblas-serial64_(x86-64) ( =  0.3.28-1.el10) openblas-threads(x86-64) ( =  0.3.28-1.el10) openblas-threads64(x86-64) ( =  0.3.28-1.el10) openblas-threads64_(x86-64) ( =  0.3.28-1.el10) openblas(x86-64) ( =  0.3.28-1.el10) openblas-openmp(x86-64) ( =  0.3.28-1.el10) openblas-openmp64(x86-64) ( =  0.3.28-1.el10) openblas-serial(x86-64) ( =  0.3.28-1.el10)"
RPROVIDES:openblas-devel = "openblas-devel(x86-64) ( =  0.3.28-1.el10) openblas-devel ( =  0.3.28-1.el10)"

URI_openblas-openmp64_ = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/openblas-openmp64_-0.3.28-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openblas-openmp64_ = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libgfortran.so.5()(64bit) ( ) libgfortran.so.5(GFORTRAN_8)(64bit) ( ) libgomp.so.1()(64bit) ( ) libgomp.so.1(GOMP_4.0)(64bit) ( ) libgomp.so.1(OMP_1.0)(64bit) ( ) libgomp.so.1(GOMP_2.0)(64bit) ( ) libgomp.so.1(OMP_3.0)(64bit) ( ) libgomp.so.1(OMP_4.5)(64bit) ( ) openblas ( =  0.3.28-1.el10)"
RPROVIDES:openblas-openmp64_ = "libopenblaso64_.so.0()(64bit) ( ) openblas-openmp64_(x86-64) ( =  0.3.28-1.el10) openblas-openmp64_ ( =  0.3.28-1.el10)"

URI_openblas-serial64 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/openblas-serial64-0.3.28-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openblas-serial64 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libgfortran.so.5()(64bit) ( ) libgfortran.so.5(GFORTRAN_8)(64bit) ( ) openblas ( =  0.3.28-1.el10)"
RPROVIDES:openblas-serial64 = "libopenblas64.so.0()(64bit) ( ) openblas-serial64(x86-64) ( =  0.3.28-1.el10) openblas-serial64 ( =  0.3.28-1.el10)"

URI_openblas-serial64_ = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/openblas-serial64_-0.3.28-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openblas-serial64_ = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libgfortran.so.5()(64bit) ( ) libgfortran.so.5(GFORTRAN_8)(64bit) ( ) openblas ( =  0.3.28-1.el10)"
RPROVIDES:openblas-serial64_ = "libopenblas64_.so.0()(64bit) ( ) openblas-serial64_(x86-64) ( =  0.3.28-1.el10) openblas-serial64_ ( =  0.3.28-1.el10)"

URI_openblas-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/openblas-static-0.3.28-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openblas-static = "openblas-devel(x86-64) ( =  0.3.28-1.el10)"
RPROVIDES:openblas-static = "openblas-static ( =  0.3.28-1.el10) openblas-static(x86-64) ( =  0.3.28-1.el10)"

URI_openblas-threads = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/openblas-threads-0.3.28-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openblas-threads = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libgfortran.so.5()(64bit) ( ) libgfortran.so.5(GFORTRAN_8)(64bit) ( ) openblas ( =  0.3.28-1.el10)"
RPROVIDES:openblas-threads = "libopenblasp.so.0()(64bit) ( ) openblas-threads(x86-64) ( =  0.3.28-1.el10) openblas-threads ( =  0.3.28-1.el10)"

URI_openblas-threads64 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/openblas-threads64-0.3.28-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openblas-threads64 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libgfortran.so.5()(64bit) ( ) libgfortran.so.5(GFORTRAN_8)(64bit) ( ) openblas ( =  0.3.28-1.el10)"
RPROVIDES:openblas-threads64 = "libopenblasp64.so.0()(64bit) ( ) openblas-threads64(x86-64) ( =  0.3.28-1.el10) openblas-threads64 ( =  0.3.28-1.el10)"

URI_openblas-threads64_ = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/openblas-threads64_-0.3.28-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openblas-threads64_ = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libgfortran.so.5()(64bit) ( ) libgfortran.so.5(GFORTRAN_8)(64bit) ( ) openblas ( =  0.3.28-1.el10)"
RPROVIDES:openblas-threads64_ = "libopenblasp64_.so.0()(64bit) ( ) openblas-threads64_(x86-64) ( =  0.3.28-1.el10) openblas-threads64_ ( =  0.3.28-1.el10)"
