
PN = "xapian-core"
PE = "0"
PV = "1.4.23"
PR = "4.el10"
PACKAGES = "xapian-core xapian-core-libs xapian-core-devel"


URI_xapian-core = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xapian-core-1.4.23-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xapian-core = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) /usr/bin/sh ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libxapian.so.30()(64bit) ( ) xapian-core-libs(x86-64) ( =  1.4.23-4.el10)"
RPROVIDES:xapian-core = "xapian-core ( =  1.4.23-4.el10) xapian-core(x86-64) ( =  1.4.23-4.el10)"

URI_xapian-core-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xapian-core-libs-1.4.23-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xapian-core-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libm.so.6(GLIBC_2.39)(64bit) ( )"
RPROVIDES:xapian-core-libs = "libxapian.so.30()(64bit) ( ) xapian-core-libs(x86-64) ( =  1.4.23-4.el10) xapian-core-libs ( =  1.4.23-4.el10)"

URI_xapian-core-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xapian-core-devel-1.4.23-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xapian-core-devel = "/usr/bin/pkg-config ( ) /usr/bin/sh ( ) libuuid-devel ( ) libxapian.so.30()(64bit) ( ) xapian-core(x86-64) ( =  1.4.23-4.el10) xapian-core-libs(x86-64) ( =  1.4.23-4.el10)"
RPROVIDES:xapian-core-devel = "pkgconfig(xapian-core) ( =  1.4.23) xapian-core-devel ( =  1.4.23-4.el10) xapian-core-devel(x86-64) ( =  1.4.23-4.el10)"
