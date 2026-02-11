
PN = "libvma"
PE = "0"
PV = "9.8.60"
PR = "3.el10"
PACKAGES = "libvma libvma-utils libvma-devel"


URI_libvma = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvma-9.8.60-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvma = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) ( ) libnl-3.so.200()(64bit) ( ) libnl-3.so.200(libnl_3)(64bit) ( ) libibverbs.so.1()(64bit) ( ) libibverbs.so.1(IBVERBS_1.1)(64bit) ( ) librdmacm.so.1()(64bit) ( ) libibverbs.so.1(IBVERBS_1.0)(64bit) ( ) libmlx5.so.1()(64bit) ( ) librdmacm.so.1(RDMACM_1.0)(64bit) ( ) libmlx5.so.1(MLX5_1.7)(64bit) ( ) libmlx5.so.1(MLX5_1.2)(64bit) ( ) libnl-route-3.so.200()(64bit) ( ) libmlx5.so.1(MLX5_1.0)(64bit) ( ) libmlx5.so.1(MLX5_1.14)(64bit) ( ) libmlx5.so.1(MLX5_1.4)(64bit) ( ) libnl-route-3.so.200(libnl_3)(64bit) ( )"
RPROVIDES:libvma = "libvma.so.9()(64bit) ( ) libvma(x86-64) ( =  9.8.60-3.el10) config(libvma) ( =  9.8.60-3.el10) libvma ( =  9.8.60-3.el10)"

URI_libvma-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvma-utils-9.8.60-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvma-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libvma(x86-64) ( =  9.8.60-3.el10)"
RPROVIDES:libvma-utils = "libvma-utils ( =  9.8.60-3.el10) libvma-utils(x86-64) ( =  9.8.60-3.el10)"

URI_libvma-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libvma-devel-9.8.60-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvma-devel = "libvma(x86-64) ( =  9.8.60-3.el10)"
RPROVIDES:libvma-devel = "libvma-devel ( =  9.8.60-3.el10) libvma-devel(x86-64) ( =  9.8.60-3.el10)"
