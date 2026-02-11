
PN = "lapack"
PE = "0"
PV = "3.12.0"
PR = "7.el10"
PACKAGES = "blas lapack blas-devel blas64 blas64_ lapack-devel lapack-static lapack64 lapack64_ blas-static"


URI_blas = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/blas-3.12.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:blas = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libgcc_s.so.1(GCC_4.0.0)(64bit) ( ) libgfortran.so.5()(64bit) ( ) libgfortran.so.5(GFORTRAN_8)(64bit) ( )"
RPROVIDES:blas = "libblas.so.3()(64bit) ( ) libcblas.so.3()(64bit) ( ) blas(x86-64) ( =  3.12.0-7.el10) blas ( =  3.12.0-7.el10)"

URI_lapack = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lapack-3.12.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lapack = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libgcc_s.so.1(GCC_4.0.0)(64bit) ( ) libgfortran.so.5()(64bit) ( ) libgfortran.so.5(GFORTRAN_8)(64bit) ( ) libblas.so.3()(64bit) ( ) blas(x86-64) ( =  3.12.0-7.el10)"
RPROVIDES:lapack = "liblapack.so.3()(64bit) ( ) liblapacke.so.3()(64bit) ( ) libtmglib.so.3()(64bit) ( ) lapack ( =  3.12.0-7.el10) lapack(x86-64) ( =  3.12.0-7.el10)"

URI_blas-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/blas-devel-3.12.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:blas-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) libblas64.so.3()(64bit) ( ) libblas64_.so.3()(64bit) ( ) pkgconfig(blas) ( ) libcblas64.so.3()(64bit) ( ) libcblas64_.so.3()(64bit) ( ) pkgconfig(blas64) ( ) pkgconfig(blas64_) ( ) gcc-gfortran ( ) libblas.so.3()(64bit) ( ) libcblas.so.3()(64bit) ( ) blas64(x86-64) ( =  3.12.0-7.el10) blas64_(x86-64) ( =  3.12.0-7.el10) blas(x86-64) ( =  3.12.0-7.el10)"
RPROVIDES:blas-devel = "blas-devel(x86-64) ( =  3.12.0-7.el10) blas-devel ( =  3.12.0-7.el10) cmake(cblas) ( =  3.12.0) cmake(cblas64) ( =  3.12.0) cmake(cblas64_) ( =  3.12.0) pkgconfig(blas) ( =  3.12.0) pkgconfig(blas64) ( =  3.12.0) pkgconfig(blas64_) ( =  3.12.0) pkgconfig(cblas) ( =  3.12.0) pkgconfig(cblas64) ( =  3.12.0) pkgconfig(cblas64_) ( =  3.12.0)"

URI_blas64 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/blas64-3.12.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:blas64 = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libgfortran.so.5()(64bit) ( ) libgfortran.so.5(GFORTRAN_8)(64bit) ( ) libgcc_s.so.1(GCC_4.0.0)(64bit) ( )"
RPROVIDES:blas64 = "libblas64.so.3()(64bit) ( ) libcblas64.so.3()(64bit) ( ) blas64(x86-64) ( =  3.12.0-7.el10) blas64 ( =  3.12.0-7.el10)"

URI_blas64_ = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/blas64_-3.12.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:blas64_ = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libgfortran.so.5()(64bit) ( ) libgfortran.so.5(GFORTRAN_8)(64bit) ( ) libgcc_s.so.1(GCC_4.0.0)(64bit) ( )"
RPROVIDES:blas64_ = "libblas64_.so.3()(64bit) ( ) libcblas64_.so.3()(64bit) ( ) blas64_(x86-64) ( =  3.12.0-7.el10) blas64_ ( =  3.12.0-7.el10)"

URI_lapack-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/lapack-devel-3.12.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lapack-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) pkgconfig(blas) ( ) liblapack64.so.3()(64bit) ( ) liblapack64_.so.3()(64bit) ( ) pkgconfig(lapack) ( ) liblapack.so.3()(64bit) ( ) liblapacke.so.3()(64bit) ( ) libtmglib.so.3()(64bit) ( ) blas-devel(x86-64) ( =  3.12.0-7.el10) lapack64(x86-64) ( =  3.12.0-7.el10) lapack64_(x86-64) ( =  3.12.0-7.el10) lapack(x86-64) ( =  3.12.0-7.el10)"
RPROVIDES:lapack-devel = "lapack-devel(x86-64) ( =  3.12.0-7.el10) cmake(lapack) ( =  3.12.0) cmake(lapack64) ( =  3.12.0) cmake(lapack64_) ( =  3.12.0) cmake(lapacke) ( =  3.12.0) lapack-devel ( =  3.12.0-7.el10) pkgconfig(lapack) ( =  3.12.0) pkgconfig(lapack64) ( =  3.12.0) pkgconfig(lapack64_) ( =  3.12.0) pkgconfig(lapacke) ( =  3.12.0)"

URI_lapack-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/lapack-static-3.12.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lapack-static = "lapack-devel(x86-64) ( =  3.12.0-7.el10)"
RPROVIDES:lapack-static = "lapack-static ( =  3.12.0-7.el10) lapack-static(x86-64) ( =  3.12.0-7.el10)"

URI_lapack64 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/lapack64-3.12.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lapack64 = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libgfortran.so.5()(64bit) ( ) libgfortran.so.5(GFORTRAN_8)(64bit) ( ) libgcc_s.so.1(GCC_4.0.0)(64bit) ( ) libblas64.so.3()(64bit) ( ) blas64(x86-64) ( =  3.12.0-7.el10)"
RPROVIDES:lapack64 = "liblapack64.so.3()(64bit) ( ) lapack64(x86-64) ( =  3.12.0-7.el10) lapack64 ( =  3.12.0-7.el10)"

URI_lapack64_ = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/lapack64_-3.12.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lapack64_ = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libgfortran.so.5()(64bit) ( ) libgfortran.so.5(GFORTRAN_8)(64bit) ( ) libgcc_s.so.1(GCC_4.0.0)(64bit) ( ) libblas64_.so.3()(64bit) ( ) blas64_(x86-64) ( =  3.12.0-7.el10)"
RPROVIDES:lapack64_ = "liblapack64_.so.3()(64bit) ( ) lapack64_(x86-64) ( =  3.12.0-7.el10) lapack64_ ( =  3.12.0-7.el10)"

URI_blas-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/blas-static-3.12.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:blas-static = "blas-devel(x86-64) ( =  3.12.0-7.el10)"
RPROVIDES:blas-static = "blas-static ( =  3.12.0-7.el10) blas-static(x86-64) ( =  3.12.0-7.el10)"
