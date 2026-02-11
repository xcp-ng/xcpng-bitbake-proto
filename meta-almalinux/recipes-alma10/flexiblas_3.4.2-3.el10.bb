
PN = "flexiblas"
PE = "0"
PV = "3.4.2"
PR = "3.el10"
PACKAGES = "flexiblas flexiblas-devel flexiblas-netlib flexiblas-netlib64 flexiblas-openblas-openmp flexiblas-openblas-openmp64 flexiblas-openblas-serial flexiblas-hook-profile flexiblas-hook-profile64 flexiblas-openblas-serial64 flexiblas-openblas-threads flexiblas-openblas-threads64"


URI_flexiblas = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flexiblas-3.4.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flexiblas = "flexiblas-netlib(x86-64) ( =  3.4.2-3.el10)"
RPROVIDES:flexiblas = "flexiblas(x86-64) ( =  3.4.2-3.el10) flexiblas ( =  3.4.2-3.el10)"

URI_flexiblas-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flexiblas-devel-3.4.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flexiblas-devel = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/pkg-config ( ) libflexiblas.so.3()(64bit) ( ) libflexiblas64.so.3()(64bit) ( ) libflexiblas64_api.so.3()(64bit) ( ) libflexiblas64_mgmt.so.3()(64bit) ( ) libflexiblas_api.so.3()(64bit) ( ) libflexiblas_mgmt.so.3()(64bit) ( ) flexiblas(x86-64) ( =  3.4.2-3.el10) flexiblas-netlib(x86-64) ( =  3.4.2-3.el10) flexiblas-netlib64(x86-64) ( =  3.4.2-3.el10)"
RPROVIDES:flexiblas-devel = "flexiblas-devel ( =  3.4.2-3.el10) flexiblas-devel(x86-64) ( =  3.4.2-3.el10) pkgconfig(flexiblas) ( =  3.4.2) pkgconfig(flexiblas64) ( =  3.4.2) pkgconfig(flexiblas64_api) ( =  3.4.2) pkgconfig(flexiblas_api) ( =  3.4.2)"

URI_flexiblas-netlib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flexiblas-netlib-3.4.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flexiblas-netlib = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_4.0.0)(64bit) ( ) libgfortran.so.5()(64bit) ( ) libgfortran.so.5(GFORTRAN_8)(64bit) ( ) libquadmath.so.0()(64bit) ( ) flexiblas(x86-64) ( =  3.4.2-3.el10) flexiblas-openblas-openmp(x86-64) ( =  3.4.2-3.el10)"
RPROVIDES:flexiblas-netlib = "libflexiblas.so.3()(64bit) ( ) libflexiblas_api.so.3()(64bit) ( ) libflexiblas_fallback_lapack.so()(64bit) ( ) libflexiblas_mgmt.so.3()(64bit) ( ) libflexiblas_netlib.so()(64bit) ( ) flexiblas-netlib(x86-64) ( =  3.4.2-3.el10) config(flexiblas-netlib) ( =  3.4.2-3.el10) flexiblas-netlib ( =  3.4.2-3.el10)"

URI_flexiblas-netlib64 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flexiblas-netlib64-3.4.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flexiblas-netlib64 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_4.0.0)(64bit) ( ) libgfortran.so.5()(64bit) ( ) libgfortran.so.5(GFORTRAN_8)(64bit) ( ) libquadmath.so.0()(64bit) ( ) flexiblas(x86-64) ( =  3.4.2-3.el10) flexiblas-openblas-openmp64(x86-64) ( =  3.4.2-3.el10)"
RPROVIDES:flexiblas-netlib64 = "libflexiblas64.so.3()(64bit) ( ) libflexiblas64_api.so.3()(64bit) ( ) libflexiblas64_mgmt.so.3()(64bit) ( ) libflexiblas_fallback_lapack.so()(64bit) ( ) libflexiblas_netlib.so()(64bit) ( ) flexiblas-netlib64(x86-64) ( =  3.4.2-3.el10) config(flexiblas-netlib64) ( =  3.4.2-3.el10) flexiblas-netlib64 ( =  3.4.2-3.el10)"

URI_flexiblas-openblas-openmp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flexiblas-openblas-openmp-3.4.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flexiblas-openblas-openmp = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.2.5)(64bit) ( ) libopenblaso.so.0()(64bit) ( ) flexiblas(x86-64) ( =  3.4.2-3.el10) flexiblas-netlib(x86-64) ( =  3.4.2-3.el10)"
RPROVIDES:flexiblas-openblas-openmp = "libflexiblas_openblasopenmp.so()(64bit) ( ) flexiblas-openblas-openmp(x86-64) ( =  3.4.2-3.el10) flexiblas-openblas-openmp ( =  3.4.2-3.el10)"

URI_flexiblas-openblas-openmp64 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flexiblas-openblas-openmp64-3.4.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flexiblas-openblas-openmp64 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.2.5)(64bit) ( ) libopenblaso64.so.0()(64bit) ( ) flexiblas(x86-64) ( =  3.4.2-3.el10) flexiblas-netlib64(x86-64) ( =  3.4.2-3.el10)"
RPROVIDES:flexiblas-openblas-openmp64 = "libflexiblas_openblasopenmp64.so()(64bit) ( ) flexiblas-openblas-openmp64(x86-64) ( =  3.4.2-3.el10) flexiblas-openblas-openmp64 ( =  3.4.2-3.el10)"

URI_flexiblas-openblas-serial = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flexiblas-openblas-serial-3.4.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flexiblas-openblas-serial = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.2.5)(64bit) ( ) libopenblas.so.0()(64bit) ( ) flexiblas(x86-64) ( =  3.4.2-3.el10) flexiblas-netlib(x86-64) ( =  3.4.2-3.el10)"
RPROVIDES:flexiblas-openblas-serial = "libflexiblas_openblasserial.so()(64bit) ( ) flexiblas-openblas-serial ( =  3.4.2-3.el10) flexiblas-openblas-serial(x86-64) ( =  3.4.2-3.el10)"

URI_flexiblas-hook-profile = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/flexiblas-hook-profile-3.4.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flexiblas-hook-profile = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libgfortran.so.5()(64bit) ( ) libquadmath.so.0()(64bit) ( ) libflexiblas.so.3()(64bit) ( ) flexiblas(x86-64) ( =  3.4.2-3.el10) flexiblas-netlib(x86-64) ( =  3.4.2-3.el10)"
RPROVIDES:flexiblas-hook-profile = "libflexiblas_hook_profile.so()(64bit) ( ) flexiblas-hook-profile ( =  3.4.2-3.el10) flexiblas-hook-profile(x86-64) ( =  3.4.2-3.el10)"

URI_flexiblas-hook-profile64 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/flexiblas-hook-profile64-3.4.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flexiblas-hook-profile64 = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libgfortran.so.5()(64bit) ( ) libquadmath.so.0()(64bit) ( ) libflexiblas64.so.3()(64bit) ( ) flexiblas(x86-64) ( =  3.4.2-3.el10) flexiblas-netlib64(x86-64) ( =  3.4.2-3.el10)"
RPROVIDES:flexiblas-hook-profile64 = "libflexiblas_hook_profile.so()(64bit) ( ) flexiblas-hook-profile64 ( =  3.4.2-3.el10) flexiblas-hook-profile64(x86-64) ( =  3.4.2-3.el10)"

URI_flexiblas-openblas-serial64 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/flexiblas-openblas-serial64-3.4.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flexiblas-openblas-serial64 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.2.5)(64bit) ( ) libopenblas64.so.0()(64bit) ( ) flexiblas(x86-64) ( =  3.4.2-3.el10) flexiblas-netlib64(x86-64) ( =  3.4.2-3.el10)"
RPROVIDES:flexiblas-openblas-serial64 = "libflexiblas_openblasserial64.so()(64bit) ( ) flexiblas-openblas-serial64 ( =  3.4.2-3.el10) flexiblas-openblas-serial64(x86-64) ( =  3.4.2-3.el10)"

URI_flexiblas-openblas-threads = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/flexiblas-openblas-threads-3.4.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flexiblas-openblas-threads = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.2.5)(64bit) ( ) libopenblasp.so.0()(64bit) ( ) flexiblas(x86-64) ( =  3.4.2-3.el10) flexiblas-netlib(x86-64) ( =  3.4.2-3.el10)"
RPROVIDES:flexiblas-openblas-threads = "libflexiblas_openblaspthread.so()(64bit) ( ) flexiblas-openblas-threads ( =  3.4.2-3.el10) flexiblas-openblas-threads(x86-64) ( =  3.4.2-3.el10)"

URI_flexiblas-openblas-threads64 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/flexiblas-openblas-threads64-3.4.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flexiblas-openblas-threads64 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.2.5)(64bit) ( ) libopenblasp64.so.0()(64bit) ( ) flexiblas(x86-64) ( =  3.4.2-3.el10) flexiblas-netlib64(x86-64) ( =  3.4.2-3.el10)"
RPROVIDES:flexiblas-openblas-threads64 = "libflexiblas_openblaspthread64.so()(64bit) ( ) flexiblas-openblas-threads64 ( =  3.4.2-3.el10) flexiblas-openblas-threads64(x86-64) ( =  3.4.2-3.el10)"
