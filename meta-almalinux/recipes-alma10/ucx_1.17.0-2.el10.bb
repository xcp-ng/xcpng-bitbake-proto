
PN = "ucx"
PE = "0"
PV = "1.17.0"
PR = "2.el10"
PACKAGES = "ucx ucx-cma ucx-devel ucx-ib ucx-rdmacm"


URI_ucx = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ucx-1.17.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ucx = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libgomp.so.1()(64bit) ( ) libgomp.so.1(GOMP_4.0)(64bit) ( ) libgomp.so.1(OMP_1.0)(64bit) ( ) libgomp.so.1(GOMP_1.0)(64bit) ( )"
RPROVIDES:ucx = "libucm.so.0()(64bit) ( ) libucs.so.0()(64bit) ( ) libuct.so.0()(64bit) ( ) libucp.so.0()(64bit) ( ) libucs_signal.so.0()(64bit) ( ) ucx(x86-64) ( =  1.17.0-2.el10) ucx ( =  1.17.0-2.el10)"

URI_ucx-cma = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ucx-cma-1.17.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ucx-cma = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.15)(64bit) ( ) libucm.so.0()(64bit) ( ) libucs.so.0()(64bit) ( ) libuct.so.0()(64bit) ( ) ucx(x86-64) ( =  1.17.0-2.el10)"
RPROVIDES:ucx-cma = "libuct_cma.so.0()(64bit) ( ) ucx-cma ( =  1.17.0-2.el10) ucx-cma(x86-64) ( =  1.17.0-2.el10)"

URI_ucx-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ucx-devel-1.17.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ucx-devel = "/usr/bin/pkg-config ( ) libucm.so.0()(64bit) ( ) libucs.so.0()(64bit) ( ) libuct.so.0()(64bit) ( ) pkgconfig(libibverbs) ( ) libucp.so.0()(64bit) ( ) libucs_signal.so.0()(64bit) ( ) pkgconfig(librdmacm) ( ) pkgconfig(ucx-ucs) ( ) pkgconfig(ucx-uct) ( ) ucx(x86-64) ( =  1.17.0-2.el10)"
RPROVIDES:ucx-devel = "pkgconfig(ucx) ( =  1.17.0) pkgconfig(ucx-cma) ( =  1.17.0) pkgconfig(ucx-ib) ( =  1.17.0) pkgconfig(ucx-rdmacm) ( =  1.17.0) pkgconfig(ucx-ucs) ( =  1.17.0) pkgconfig(ucx-uct) ( =  1.17.0) ucx-devel ( =  1.17.0-2.el10) ucx-devel(x86-64) ( =  1.17.0-2.el10)"

URI_ucx-ib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ucx-ib-1.17.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ucx-ib = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libibverbs.so.1()(64bit) ( ) libibverbs.so.1(IBVERBS_1.1)(64bit) ( ) libibverbs.so.1(IBVERBS_1.0)(64bit) ( ) libmlx5.so.1()(64bit) ( ) libmlx5.so.1(MLX5_1.7)(64bit) ( ) libucm.so.0()(64bit) ( ) libucs.so.0()(64bit) ( ) libuct.so.0()(64bit) ( ) libmlx5.so.1(MLX5_1.2)(64bit) ( ) libmlx5.so.1(MLX5_1.8)(64bit) ( ) libibverbs.so.1(IBVERBS_1.10)(64bit) ( ) libibverbs.so.1(IBVERBS_1.12)(64bit) ( ) libibverbs.so.1(IBVERBS_1.8)(64bit) ( ) libmlx5.so.1(MLX5_1.1)(64bit) ( ) libmlx5.so.1(MLX5_1.19)(64bit) ( ) libmlx5.so.1(MLX5_1.3)(64bit) ( ) libmlx5.so.1(MLX5_1.11)(64bit) ( ) ucx(x86-64) ( =  1.17.0-2.el10)"
RPROVIDES:ucx-ib = "libuct_ib.so.0()(64bit) ( ) ucx-ib ( =  1.17.0-2.el10) ucx-ib(x86-64) ( =  1.17.0-2.el10)"

URI_ucx-rdmacm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ucx-rdmacm-1.17.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ucx-rdmacm = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libibverbs.so.1()(64bit) ( ) libibverbs.so.1(IBVERBS_1.1)(64bit) ( ) librdmacm.so.1()(64bit) ( ) libmlx5.so.1()(64bit) ( ) librdmacm.so.1(RDMACM_1.0)(64bit) ( ) libmlx5.so.1(MLX5_1.7)(64bit) ( ) libucm.so.0()(64bit) ( ) libucs.so.0()(64bit) ( ) libuct.so.0()(64bit) ( ) libmlx5.so.1(MLX5_1.8)(64bit) ( ) librdmacm.so.1(RDMACM_1.2)(64bit) ( ) libuct_ib.so.0()(64bit) ( ) ucx-ib ( =  1.17.0-2.el10) ucx-ib(x86-64) ( =  1.17.0-2.el10)"
RPROVIDES:ucx-rdmacm = "libuct_rdmacm.so.0()(64bit) ( ) ucx-rdmacm ( =  1.17.0-2.el10) ucx-rdmacm(x86-64) ( =  1.17.0-2.el10)"
