
PN = "gcc"
PE = "0"
PV = "14.2.1"
PR = "7.el10.alma.1"
PACKAGES = "libatomic libgcc libgfortran libgomp libquadmath libstdc++ cpp gcc gcc-c++ gcc-gfortran gcc-offload-amdgcn gcc-offload-nvptx gcc-plugin-annobin libasan libgccjit libgccjit-devel libgomp-offload-amdgcn libgomp-offload-nvptx libhwasan libitm libitm-devel liblsan libquadmath-devel libstdc++-devel libstdc++-docs libtsan libubsan gcc-plugin-devel libgfortran-static libquadmath-static libstdc++-static gcc-gdb-plugin libasan-static libatomic-static libhwasan-static libitm-static liblsan-static libtsan-static libubsan-static"


URI_libatomic = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libatomic-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libatomic = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:libatomic = "libatomic.so.1()(64bit) ( ) libatomic.so.1(LIBATOMIC_1.0)(64bit) ( ) libatomic.so.1(LIBATOMIC_1.1)(64bit) ( ) libatomic.so.1(LIBATOMIC_1.2)(64bit) ( ) libatomic ( =  14.2.1-7.el10.alma.1) libatomic(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_libgcc = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libgcc-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgcc = ""
RPROVIDES:libgcc = "libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libgcc_s.so.1(GCC_3.3)(64bit) ( ) libgcc_s.so.1(GCC_4.2.0)(64bit) ( ) libgcc_s.so.1(GCC_4.3.0)(64bit) ( ) libgcc_s.so.1(GCC_12.0.0)(64bit) ( ) libgcc_s.so.1(GCC_13.0.0)(64bit) ( ) libgcc_s.so.1(GCC_14.0.0)(64bit) ( ) libgcc_s.so.1(GCC_3.4)(64bit) ( ) libgcc_s.so.1(GCC_3.4.2)(64bit) ( ) libgcc_s.so.1(GCC_3.4.4)(64bit) ( ) libgcc_s.so.1(GCC_4.0.0)(64bit) ( ) libgcc_s.so.1(GCC_4.7.0)(64bit) ( ) libgcc_s.so.1(GCC_4.8.0)(64bit) ( ) libgcc_s.so.1(GCC_7.0.0)(64bit) ( ) libgcc ( =  14.2.1-7.el10.alma.1) libgcc(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_libgfortran = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libgfortran-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgfortran = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1(GCC_3.3)(64bit) ( ) libgcc_s.so.1(GCC_4.2.0)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libm.so.6(GLIBC_2.26)(64bit) ( ) libgcc_s.so.1(GCC_4.3.0)(64bit) ( )"
RPROVIDES:libgfortran = "libgfortran.so.5()(64bit) ( ) libgfortran.so.5(GFORTRAN_10)(64bit) ( ) libgfortran.so.5(GFORTRAN_10.2)(64bit) ( ) libgfortran.so.5(GFORTRAN_12)(64bit) ( ) libgfortran.so.5(GFORTRAN_13)(64bit) ( ) libgfortran.so.5(GFORTRAN_8)(64bit) ( ) libgfortran.so.5(GFORTRAN_9)(64bit) ( ) libgfortran.so.5(GFORTRAN_9.2)(64bit) ( ) libgfortran.so.5(GFORTRAN_C99_8)(64bit) ( ) libgfortran.so.5(GFORTRAN_F2C_8)(64bit) ( ) libgfortran ( =  14.2.1-7.el10.alma.1) libgfortran(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_libgomp = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libgomp-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgomp = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:libgomp = "libgomp.so.1()(64bit) ( ) libgomp.so.1(GOMP_1.0)(64bit) ( ) libgomp.so.1(GOMP_4.0)(64bit) ( ) libgomp.so.1(GOMP_2.0)(64bit) ( ) libgomp.so.1(GOMP_4.5)(64bit) ( ) libgomp.so.1(OMP_1.0)(64bit) ( ) libgomp.so.1(GOACC_2.0)(64bit) ( ) libgomp.so.1(GOACC_2.0.1)(64bit) ( ) libgomp.so.1(GOACC_2.0.2)(64bit) ( ) libgomp.so.1(GOMP_3.0)(64bit) ( ) libgomp.so.1(GOMP_4.0.1)(64bit) ( ) libgomp.so.1(GOMP_5.0)(64bit) ( ) libgomp.so.1(GOMP_5.0.1)(64bit) ( ) libgomp.so.1(GOMP_5.1)(64bit) ( ) libgomp.so.1(GOMP_5.1.1)(64bit) ( ) libgomp.so.1(GOMP_5.1.2)(64bit) ( ) libgomp.so.1(GOMP_PLUGIN_1.0)(64bit) ( ) libgomp.so.1(GOMP_PLUGIN_1.1)(64bit) ( ) libgomp.so.1(GOMP_PLUGIN_1.2)(64bit) ( ) libgomp.so.1(GOMP_PLUGIN_1.3)(64bit) ( ) libgomp.so.1(GOMP_PLUGIN_1.4)(64bit) ( ) libgomp.so.1(OACC_2.0)(64bit) ( ) libgomp.so.1(OACC_2.0.1)(64bit) ( ) libgomp.so.1(OACC_2.5)(64bit) ( ) libgomp.so.1(OACC_2.5.1)(64bit) ( ) libgomp.so.1(OACC_2.6)(64bit) ( ) libgomp.so.1(OMP_2.0)(64bit) ( ) libgomp.so.1(OMP_3.0)(64bit) ( ) libgomp.so.1(OMP_3.1)(64bit) ( ) libgomp.so.1(OMP_4.0)(64bit) ( ) libgomp.so.1(OMP_4.5)(64bit) ( ) libgomp.so.1(OMP_5.0)(64bit) ( ) libgomp.so.1(OMP_5.0.1)(64bit) ( ) libgomp.so.1(OMP_5.0.2)(64bit) ( ) libgomp.so.1(OMP_5.1)(64bit) ( ) libgomp.so.1(OMP_5.1.1)(64bit) ( ) libgomp.so.1(OMP_5.2)(64bit) ( ) libgomp ( =  14.2.1-7.el10.alma.1) libgomp(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_libquadmath = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libquadmath-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libquadmath = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.23)(64bit) ( )"
RPROVIDES:libquadmath = "libquadmath.so.0()(64bit) ( ) libquadmath.so.0(QUADMATH_1.0)(64bit) ( ) libquadmath.so.0(QUADMATH_1.1)(64bit) ( ) libquadmath.so.0(QUADMATH_1.2)(64bit) ( ) libquadmath ( =  14.2.1-7.el10.alma.1) libquadmath(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_libstdc++ = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libstdc++-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libstdc++ = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libgcc_s.so.1(GCC_3.3)(64bit) ( ) libgcc_s.so.1(GCC_4.2.0)(64bit) ( ) libgcc_s.so.1(GCC_4.3.0)(64bit) ( ) glibc ( >=  2.10.90-7)"
RPROVIDES:libstdc++ = "libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.11)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.13)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.5)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.2)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.1)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.10)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.12)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.14)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.6)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.7)(64bit) ( ) libstdc++.so.6(CXXABI_FLOAT128)(64bit) ( ) libstdc++.so.6(CXXABI_TM_1)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.1)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.10)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.12)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.13)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.16)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.2)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.23)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.24)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.25)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.27)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.28)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.31)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.33)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.4)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.6)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.7)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.8)(64bit) ( ) libstdc++ ( =  14.2.1-7.el10.alma.1) libstdc++(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_cpp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cpp-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:cpp = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libz.so.1()(64bit) ( ) libzstd.so.1()(64bit) ( ) libgmp.so.10()(64bit) ( ) libmpfr.so.6()(64bit) ( ) libmpc.so.3()(64bit) ( ) filesystem ( >=  3)"
RPROVIDES:cpp = "/lib/cpp ( ) cpp ( =  14.2.1-7.el10.alma.1) cpp(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_gcc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gcc-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gcc = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) /usr/bin/sh ( ) libz.so.1()(64bit) ( ) libzstd.so.1()(64bit) ( ) make ( ) libgmp.so.10()(64bit) ( ) libmpfr.so.6()(64bit) ( ) libgomp.so.1()(64bit) ( ) libmpc.so.3()(64bit) ( ) libgomp ( =  14.2.1-7.el10.alma.1) cpp ( =  14.2.1-7.el10.alma.1) binutils ( >=  2.31) glibc-devel ( >=  2.2.90-12) libgcc ( >=  14.2.1-7.el10.alma.1)"
RPROVIDES:gcc = "bundled(libiberty) ( ) liblto_plugin.so()(64bit) ( ) bundled(libbacktrace) ( ) bundled(libffi) ( ) gcc ( =  14.2.1-7.el10.alma.1) gcc(major) ( =  14) gcc(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_gcc-c++ = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gcc-c++-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gcc-c++ = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libz.so.1()(64bit) ( ) libzstd.so.1()(64bit) ( ) libgmp.so.10()(64bit) ( ) libmpfr.so.6()(64bit) ( ) libmpc.so.3()(64bit) ( ) libz.so.1(ZLIB_1.2.2)(64bit) ( ) gcc ( =  14.2.1-7.el10.alma.1) libstdc++-devel ( =  14.2.1-7.el10.alma.1) libstdc++ ( =  14.2.1-7.el10.alma.1)"
RPROVIDES:gcc-c++ = "g++ ( =  14.2.1-7.el10.alma.1) gcc-c++ ( =  14.2.1-7.el10.alma.1) gcc-c++(x86-64) ( =  14.2.1-7.el10.alma.1) gcc-g++ ( =  14.2.1-7.el10.alma.1)"

URI_gcc-gfortran = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gcc-gfortran-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gcc-gfortran = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libz.so.1()(64bit) ( ) libzstd.so.1()(64bit) ( ) libgmp.so.10()(64bit) ( ) libmpfr.so.6()(64bit) ( ) libgfortran.so.5()(64bit) ( ) libmpc.so.3()(64bit) ( ) gcc ( =  14.2.1-7.el10.alma.1) libquadmath ( =  14.2.1-7.el10.alma.1) libquadmath-devel ( =  14.2.1-7.el10.alma.1) libgfortran ( =  14.2.1-7.el10.alma.1)"
RPROVIDES:gcc-gfortran = "gcc-fortran ( =  14.2.1-7.el10.alma.1) gcc-gfortran ( =  14.2.1-7.el10.alma.1) gcc-gfortran(x86-64) ( =  14.2.1-7.el10.alma.1) gfortran ( =  14.2.1-7.el10.alma.1)"

URI_gcc-offload-amdgcn = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gcc-offload-amdgcn-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gcc-offload-amdgcn = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libzstd.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.3)(64bit) ( ) libgcc_s.so.1(GCC_4.2.0)(64bit) ( ) libgmp.so.10()(64bit) ( ) libmpfr.so.6()(64bit) ( ) libmpc.so.3()(64bit) ( ) gcc ( =  14.2.1-7.el10.alma.1) libgomp-offload-amdgcn ( =  14.2.1-7.el10.alma.1) lld ( >=  15) llvm ( >=  15)"
RPROVIDES:gcc-offload-amdgcn = "liblto_plugin.so()(64bit) ( ) gcc-offload-amdgcn ( =  14.2.1-7.el10.alma.1) gcc-offload-amdgcn(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_gcc-offload-nvptx = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gcc-offload-nvptx-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gcc-offload-nvptx = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libzstd.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.3)(64bit) ( ) libgcc_s.so.1(GCC_4.2.0)(64bit) ( ) libgmp.so.10()(64bit) ( ) libmpfr.so.6()(64bit) ( ) libmpc.so.3()(64bit) ( ) gcc ( =  14.2.1-7.el10.alma.1) libgomp-offload-nvptx ( =  14.2.1-7.el10.alma.1)"
RPROVIDES:gcc-offload-nvptx = "gcc-offload-nvptx ( =  14.2.1-7.el10.alma.1) gcc-offload-nvptx(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_gcc-plugin-annobin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gcc-plugin-annobin-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gcc-plugin-annobin = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libstdc++.so.6()(64bit) ( ) gcc ( =  14.2.1-7.el10.alma.1)"
RPROVIDES:gcc-plugin-annobin = "gcc-plugin-annobin ( =  14.2.1-7.el10.alma.1) gcc-plugin-annobin(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_libasan = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libasan-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libasan = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libgcc_s.so.1(GCC_3.3)(64bit) ( ) libm.so.6(GLIBC_2.23)(64bit) ( )"
RPROVIDES:libasan = "libasan.so.8()(64bit) ( ) libasan ( =  14.2.1-7.el10.alma.1) libasan(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_libgccjit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgccjit-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgccjit = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libz.so.1()(64bit) ( ) libzstd.so.1()(64bit) ( ) libgmp.so.10()(64bit) ( ) libmpfr.so.6()(64bit) ( ) libmpc.so.3()(64bit) ( ) gcc ( =  14.2.1-7.el10.alma.1)"
RPROVIDES:libgccjit = "libgccjit.so.0()(64bit) ( ) libgccjit.so.0(LIBGCCJIT_ABI_0)(64bit) ( ) libgccjit.so.0(LIBGCCJIT_ABI_1)(64bit) ( ) libgccjit.so.0(LIBGCCJIT_ABI_10)(64bit) ( ) libgccjit.so.0(LIBGCCJIT_ABI_11)(64bit) ( ) libgccjit.so.0(LIBGCCJIT_ABI_12)(64bit) ( ) libgccjit.so.0(LIBGCCJIT_ABI_13)(64bit) ( ) libgccjit.so.0(LIBGCCJIT_ABI_14)(64bit) ( ) libgccjit.so.0(LIBGCCJIT_ABI_15)(64bit) ( ) libgccjit.so.0(LIBGCCJIT_ABI_16)(64bit) ( ) libgccjit.so.0(LIBGCCJIT_ABI_17)(64bit) ( ) libgccjit.so.0(LIBGCCJIT_ABI_18)(64bit) ( ) libgccjit.so.0(LIBGCCJIT_ABI_19)(64bit) ( ) libgccjit.so.0(LIBGCCJIT_ABI_2)(64bit) ( ) libgccjit.so.0(LIBGCCJIT_ABI_20)(64bit) ( ) libgccjit.so.0(LIBGCCJIT_ABI_21)(64bit) ( ) libgccjit.so.0(LIBGCCJIT_ABI_22)(64bit) ( ) libgccjit.so.0(LIBGCCJIT_ABI_23)(64bit) ( ) libgccjit.so.0(LIBGCCJIT_ABI_24)(64bit) ( ) libgccjit.so.0(LIBGCCJIT_ABI_25)(64bit) ( ) libgccjit.so.0(LIBGCCJIT_ABI_26)(64bit) ( ) libgccjit.so.0(LIBGCCJIT_ABI_27)(64bit) ( ) libgccjit.so.0(LIBGCCJIT_ABI_3)(64bit) ( ) libgccjit.so.0(LIBGCCJIT_ABI_4)(64bit) ( ) libgccjit.so.0(LIBGCCJIT_ABI_5)(64bit) ( ) libgccjit.so.0(LIBGCCJIT_ABI_6)(64bit) ( ) libgccjit.so.0(LIBGCCJIT_ABI_7)(64bit) ( ) libgccjit.so.0(LIBGCCJIT_ABI_8)(64bit) ( ) libgccjit.so.0(LIBGCCJIT_ABI_9)(64bit) ( ) libgccjit ( =  14.2.1-7.el10.alma.1) libgccjit(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_libgccjit-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgccjit-devel-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgccjit-devel = "libgccjit.so.0()(64bit) ( ) libgccjit ( =  14.2.1-7.el10.alma.1)"
RPROVIDES:libgccjit-devel = "libgccjit-devel ( =  14.2.1-7.el10.alma.1) libgccjit-devel(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_libgomp-offload-amdgcn = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgomp-offload-amdgcn-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgomp-offload-amdgcn = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgomp.so.1()(64bit) ( ) libgomp.so.1(GOMP_PLUGIN_1.0)(64bit) ( ) libgomp.so.1(GOMP_PLUGIN_1.3)(64bit) ( ) libgomp.so.1(GOMP_PLUGIN_1.4)(64bit) ( ) libgomp.so.1(GOMP_PLUGIN_1.1)(64bit) ( ) libgomp ( =  14.2.1-7.el10.alma.1)"
RPROVIDES:libgomp-offload-amdgcn = "libgomp-plugin-gcn.so.1()(64bit) ( ) libgomp-offload-amdgcn ( =  14.2.1-7.el10.alma.1) libgomp-offload-amdgcn(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_libgomp-offload-nvptx = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgomp-offload-nvptx-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgomp-offload-nvptx = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libgomp.so.1()(64bit) ( ) libgomp.so.1(GOMP_PLUGIN_1.0)(64bit) ( ) libgomp.so.1(GOMP_PLUGIN_1.3)(64bit) ( ) libgomp.so.1(GOMP_PLUGIN_1.4)(64bit) ( ) libgomp.so.1(GOMP_PLUGIN_1.2)(64bit) ( ) libgomp ( =  14.2.1-7.el10.alma.1)"
RPROVIDES:libgomp-offload-nvptx = "libgomp-plugin-nvptx.so.1()(64bit) ( ) libgomp-offload-nvptx ( =  14.2.1-7.el10.alma.1) libgomp-offload-nvptx(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_libhwasan = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libhwasan-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libhwasan = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libgcc_s.so.1(GCC_3.3)(64bit) ( )"
RPROVIDES:libhwasan = "libhwasan.so.0()(64bit) ( ) libhwasan ( =  14.2.1-7.el10.alma.1) libhwasan(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_libitm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libitm-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libitm = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:libitm = "libitm.so.1()(64bit) ( ) libitm.so.1(LIBITM_1.0)(64bit) ( ) libitm.so.1(LIBITM_1.1)(64bit) ( ) libitm ( =  14.2.1-7.el10.alma.1) libitm(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_libitm-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libitm-devel-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libitm-devel = "gcc ( =  14.2.1-7.el10.alma.1) libitm ( =  14.2.1-7.el10.alma.1)"
RPROVIDES:libitm-devel = "libitm-devel ( =  14.2.1-7.el10.alma.1) libitm-devel(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_liblsan = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/liblsan-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:liblsan = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libgcc_s.so.1(GCC_3.3)(64bit) ( )"
RPROVIDES:liblsan = "liblsan.so.0()(64bit) ( ) liblsan ( =  14.2.1-7.el10.alma.1) liblsan(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_libquadmath-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libquadmath-devel-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libquadmath-devel = "gcc ( =  14.2.1-7.el10.alma.1) libquadmath ( =  14.2.1-7.el10.alma.1)"
RPROVIDES:libquadmath-devel = "libquadmath-devel ( =  14.2.1-7.el10.alma.1) libquadmath-devel(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_libstdc++-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libstdc++-devel-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libstdc++-devel = "libstdc++(x86-64) ( =  14.2.1-7.el10.alma.1)"
RPROVIDES:libstdc++-devel = "libstdc++-devel ( =  14.2.1-7.el10.alma.1) libstdc++-devel(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_libstdc++-docs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libstdc++-docs-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libstdc++-docs = ""
RPROVIDES:libstdc++-docs = "libstdc++-docs ( =  14.2.1-7.el10.alma.1) libstdc++-docs(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_libtsan = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libtsan-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtsan = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libgcc_s.so.1(GCC_3.3)(64bit) ( ) libm.so.6(GLIBC_2.23)(64bit) ( )"
RPROVIDES:libtsan = "libtsan.so.2()(64bit) ( ) libtsan ( =  14.2.1-7.el10.alma.1) libtsan(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_libubsan = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libubsan-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libubsan = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgcc_s.so.1(GCC_3.3)(64bit) ( )"
RPROVIDES:libubsan = "libubsan.so.1()(64bit) ( ) libubsan ( =  14.2.1-7.el10.alma.1) libubsan(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_gcc-plugin-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gcc-plugin-devel-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gcc-plugin-devel = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) gcc ( =  14.2.1-7.el10.alma.1) gmp-devel ( >=  4.1.2-8) libmpc-devel ( >=  0.8.1) mpfr-devel ( >=  3.1.0)"
RPROVIDES:gcc-plugin-devel = "gcc-plugin-devel ( =  14.2.1-7.el10.alma.1) gcc-plugin-devel(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_libgfortran-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libgfortran-static-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgfortran-static = "gcc ( =  14.2.1-7.el10.alma.1) libquadmath-static ( =  14.2.1-7.el10.alma.1) libgfortran ( =  14.2.1-7.el10.alma.1)"
RPROVIDES:libgfortran-static = "libgfortran-static ( =  14.2.1-7.el10.alma.1) libgfortran-static(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_libquadmath-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libquadmath-static-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libquadmath-static = "libquadmath-devel ( =  14.2.1-7.el10.alma.1)"
RPROVIDES:libquadmath-static = "libquadmath-static ( =  14.2.1-7.el10.alma.1) libquadmath-static(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_libstdc++-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libstdc++-static-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libstdc++-static = "libstdc++-devel ( =  14.2.1-7.el10.alma.1)"
RPROVIDES:libstdc++-static = "libstdc++-static ( =  14.2.1-7.el10.alma.1) libstdc++-static(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_gcc-gdb-plugin = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gcc-gdb-plugin-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gcc-gdb-plugin = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libm.so.6()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) gcc ( =  14.2.1-7.el10.alma.1)"
RPROVIDES:gcc-gdb-plugin = "libcc1.so.0()(64bit) ( ) libcc1plugin.so.0()(64bit) ( ) libcp1plugin.so.0()(64bit) ( ) gcc-gdb-plugin ( =  14.2.1-7.el10.alma.1) gcc-gdb-plugin(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_libasan-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libasan-static-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libasan-static = "libasan ( =  14.2.1-7.el10.alma.1)"
RPROVIDES:libasan-static = "libasan-static ( =  14.2.1-7.el10.alma.1) libasan-static(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_libatomic-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libatomic-static-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libatomic-static = "libatomic ( =  14.2.1-7.el10.alma.1)"
RPROVIDES:libatomic-static = "libatomic-static ( =  14.2.1-7.el10.alma.1) libatomic-static(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_libhwasan-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libhwasan-static-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libhwasan-static = "libhwasan ( =  14.2.1-7.el10.alma.1)"
RPROVIDES:libhwasan-static = "libhwasan-static ( =  14.2.1-7.el10.alma.1) libhwasan-static(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_libitm-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libitm-static-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libitm-static = "libitm-devel ( =  14.2.1-7.el10.alma.1)"
RPROVIDES:libitm-static = "libitm-static ( =  14.2.1-7.el10.alma.1) libitm-static(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_liblsan-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/liblsan-static-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:liblsan-static = "liblsan ( =  14.2.1-7.el10.alma.1)"
RPROVIDES:liblsan-static = "liblsan-static ( =  14.2.1-7.el10.alma.1) liblsan-static(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_libtsan-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libtsan-static-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtsan-static = "libtsan ( =  14.2.1-7.el10.alma.1)"
RPROVIDES:libtsan-static = "libtsan-static ( =  14.2.1-7.el10.alma.1) libtsan-static(x86-64) ( =  14.2.1-7.el10.alma.1)"

URI_libubsan-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libubsan-static-14.2.1-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libubsan-static = "libubsan ( =  14.2.1-7.el10.alma.1)"
RPROVIDES:libubsan-static = "libubsan-static ( =  14.2.1-7.el10.alma.1) libubsan-static(x86-64) ( =  14.2.1-7.el10.alma.1)"
