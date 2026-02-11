
PN = "fftw"
PE = "0"
PV = "3.3.10"
PR = "15.el10"
PACKAGES = "fftw fftw-devel fftw-libs fftw-libs-double fftw-libs-long fftw-libs-quad fftw-libs-single fftw-openmpi-devel fftw-openmpi-libs fftw-openmpi-libs-double fftw-openmpi-libs-long fftw-openmpi-libs-single fftw-openmpi-static fftw-static fftw-doc"


URI_fftw = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fftw-3.3.10-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fftw = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libfftw3.so.3()(64bit) ( ) libfftw3f.so.3()(64bit) ( ) libfftw3l.so.3()(64bit) ( ) libfftw3_threads.so.3()(64bit) ( ) libfftw3f_threads.so.3()(64bit) ( ) libfftw3l_threads.so.3()(64bit) ( ) libfftw3q.so.3()(64bit) ( ) libfftw3q_threads.so.3()(64bit) ( )"
RPROVIDES:fftw = "fftw(x86-64) ( =  3.3.10-15.el10) fftw ( =  3.3.10-15.el10)"

URI_fftw-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fftw-devel-3.3.10-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fftw-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) fftw(x86-64) ( =  3.3.10-15.el10) fftw-libs(x86-64) ( =  3.3.10-15.el10)"
RPROVIDES:fftw-devel = "fftw-devel(x86-64) ( =  3.3.10-15.el10) fftw-devel ( =  3.3.10-15.el10) fftw3-devel ( =  3.3.10-15.el10) fftw3-devel(x86-64) ( =  3.3.10-15.el10) pkgconfig(fftw3) ( =  3.3.10) pkgconfig(fftw3f) ( =  3.3.10) pkgconfig(fftw3l) ( =  3.3.10) pkgconfig(fftw3q) ( =  3.3.10)"

URI_fftw-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fftw-libs-3.3.10-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fftw-libs = "fftw-libs-double(x86-64) ( =  3.3.10-15.el10) fftw-libs-long(x86-64) ( =  3.3.10-15.el10) fftw-libs-single(x86-64) ( =  3.3.10-15.el10) fftw-libs-quad(x86-64) ( =  3.3.10-15.el10)"
RPROVIDES:fftw-libs = "fftw-libs(x86-64) ( =  3.3.10-15.el10) fftw-libs ( =  3.3.10-15.el10) fftw3 ( =  3.3.10-15.el10)"

URI_fftw-libs-double = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fftw-libs-double-3.3.10-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fftw-libs-double = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgomp.so.1()(64bit) ( ) libgomp.so.1(GOMP_4.0)(64bit) ( ) libgomp.so.1(OMP_1.0)(64bit) ( )"
RPROVIDES:fftw-libs-double = "libfftw3.so.3()(64bit) ( ) libfftw3_threads.so.3()(64bit) ( ) libfftw3_omp.so.3()(64bit) ( ) fftw-libs-double(x86-64) ( =  3.3.10-15.el10) fftw-libs-double ( =  3.3.10-15.el10)"

URI_fftw-libs-long = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fftw-libs-long-3.3.10-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fftw-libs-long = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgomp.so.1()(64bit) ( ) libgomp.so.1(GOMP_4.0)(64bit) ( ) libgomp.so.1(OMP_1.0)(64bit) ( )"
RPROVIDES:fftw-libs-long = "libfftw3l.so.3()(64bit) ( ) libfftw3l_threads.so.3()(64bit) ( ) libfftw3l_omp.so.3()(64bit) ( ) fftw-libs-long(x86-64) ( =  3.3.10-15.el10) fftw-libs-long ( =  3.3.10-15.el10)"

URI_fftw-libs-quad = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fftw-libs-quad-3.3.10-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fftw-libs-quad = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgomp.so.1()(64bit) ( ) libgomp.so.1(GOMP_4.0)(64bit) ( ) libgomp.so.1(OMP_1.0)(64bit) ( ) libquadmath.so.0()(64bit) ( ) libquadmath.so.0(QUADMATH_1.0)(64bit) ( )"
RPROVIDES:fftw-libs-quad = "libfftw3q.so.3()(64bit) ( ) libfftw3q_threads.so.3()(64bit) ( ) libfftw3q_omp.so.3()(64bit) ( ) fftw-libs-quad(x86-64) ( =  3.3.10-15.el10) fftw-libs-quad ( =  3.3.10-15.el10)"

URI_fftw-libs-single = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fftw-libs-single-3.3.10-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fftw-libs-single = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgomp.so.1()(64bit) ( ) libgomp.so.1(GOMP_4.0)(64bit) ( ) libgomp.so.1(OMP_1.0)(64bit) ( )"
RPROVIDES:fftw-libs-single = "libfftw3f.so.3()(64bit) ( ) libfftw3f_threads.so.3()(64bit) ( ) libfftw3f_omp.so.3()(64bit) ( ) fftw-libs-single(x86-64) ( =  3.3.10-15.el10) fftw-libs-single ( =  3.3.10-15.el10)"

URI_fftw-openmpi-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fftw-openmpi-devel-3.3.10-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fftw-openmpi-devel = "pkgconfig ( ) openmpi-devel ( ) fftw-devel(x86-64) ( =  3.3.10-15.el10) fftw-openmpi-libs(x86-64) ( =  3.3.10-15.el10)"
RPROVIDES:fftw-openmpi-devel = "fftw-openmpi-devel(x86-64) ( =  3.3.10-15.el10) fftw-openmpi-devel ( =  3.3.10-15.el10) fftw3-openmpi-devel ( =  3.3.10-15.el10) fftw3-openmpi-devel(x86-64) ( =  3.3.10-15.el10)"

URI_fftw-openmpi-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fftw-openmpi-libs-3.3.10-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fftw-openmpi-libs = "fftw-openmpi-libs-double(x86-64) ( =  3.3.10-15.el10) fftw-openmpi-libs-long(x86-64) ( =  3.3.10-15.el10) fftw-openmpi-libs-single(x86-64) ( =  3.3.10-15.el10)"
RPROVIDES:fftw-openmpi-libs = "fftw-openmpi-libs(x86-64) ( =  3.3.10-15.el10) fftw-openmpi-libs ( =  3.3.10-15.el10) fftw3-openmpi ( =  3.3.10-15.el10)"

URI_fftw-openmpi-libs-double = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fftw-openmpi-libs-double-3.3.10-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fftw-openmpi-libs-double = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libmpi.so.40()(64bit)(openmpi-x86_64) ( ) libfftw3.so.3()(64bit) ( ) fftw-libs-double(x86-64) ( =  3.3.10-15.el10)"
RPROVIDES:fftw-openmpi-libs-double = "libfftw3_mpi.so.3()(64bit)(openmpi-x86_64) ( ) fftw-openmpi-libs-double(x86-64) ( =  3.3.10-15.el10) fftw-openmpi-libs-double ( =  3.3.10-15.el10)"

URI_fftw-openmpi-libs-long = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fftw-openmpi-libs-long-3.3.10-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fftw-openmpi-libs-long = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libmpi.so.40()(64bit)(openmpi-x86_64) ( ) libfftw3l.so.3()(64bit) ( ) fftw-libs-long(x86-64) ( =  3.3.10-15.el10)"
RPROVIDES:fftw-openmpi-libs-long = "libfftw3l_mpi.so.3()(64bit)(openmpi-x86_64) ( ) fftw-openmpi-libs-long(x86-64) ( =  3.3.10-15.el10) fftw-openmpi-libs-long ( =  3.3.10-15.el10)"

URI_fftw-openmpi-libs-single = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fftw-openmpi-libs-single-3.3.10-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fftw-openmpi-libs-single = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libmpi.so.40()(64bit)(openmpi-x86_64) ( ) libfftw3f.so.3()(64bit) ( ) fftw-libs-single(x86-64) ( =  3.3.10-15.el10)"
RPROVIDES:fftw-openmpi-libs-single = "libfftw3f_mpi.so.3()(64bit)(openmpi-x86_64) ( ) fftw-openmpi-libs-single(x86-64) ( =  3.3.10-15.el10) fftw-openmpi-libs-single ( =  3.3.10-15.el10)"

URI_fftw-openmpi-static = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fftw-openmpi-static-3.3.10-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fftw-openmpi-static = "fftw-openmpi-devel(x86-64) ( =  3.3.10-15.el10) fftw-static(x86-64) ( =  3.3.10-15.el10)"
RPROVIDES:fftw-openmpi-static = "fftw-openmpi-static ( =  3.3.10-15.el10) fftw-openmpi-static(x86-64) ( =  3.3.10-15.el10) fftw3-openmpi-static ( =  3.3.10-15.el10) fftw3-openmpi-static(x86-64) ( =  3.3.10-15.el10)"

URI_fftw-static = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fftw-static-3.3.10-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fftw-static = "fftw-devel(x86-64) ( =  3.3.10-15.el10)"
RPROVIDES:fftw-static = "fftw-static(x86-64) ( =  3.3.10-15.el10) fftw-static ( =  3.3.10-15.el10) fftw3-static ( =  3.3.10-15.el10) fftw3-static(x86-64) ( =  3.3.10-15.el10)"

URI_fftw-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/fftw-doc-3.3.10-15.el10.noarch.rpm;unpack=0"
RDEPENDS:fftw-doc = ""
RPROVIDES:fftw-doc = "fftw-doc ( =  3.3.10-15.el10)"
