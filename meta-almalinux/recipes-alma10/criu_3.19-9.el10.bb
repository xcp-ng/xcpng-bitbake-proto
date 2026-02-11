
PN = "criu"
PE = "0"
PV = "3.19"
PR = "9.el10"
PACKAGES = "crit criu criu-libs python3-criu criu-devel criu-ns"


URI_crit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/crit-3.19-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:crit = "/usr/bin/python3 ( ) python(abi) ( =  3.12) python3-criu ( =  3.19-9.el10)"
RPROVIDES:crit = "crit ( =  3.19-9.el10) crit(x86-64) ( =  3.19-9.el10) python3.12dist(crit) ( =  3.19) python3dist(crit) ( =  3.19)"

URI_criu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/criu-3.19-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:criu = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) /usr/bin/bash ( ) ld-linux-x86-64.so.2()(64bit) ( ) libgnutls.so.30()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libprotobuf-c.so.1()(64bit) ( ) libprotobuf-c.so.1(LIBPROTOBUF_C_1.0.0)(64bit) ( ) libnl-3.so.200()(64bit) ( ) libnl-3.so.200(libnl_3)(64bit) ( ) ld-linux-x86-64.so.2(GLIBC_2.35)(64bit) ( ) libnet.so.1()(64bit) ( ) libnl-3.so.200(libnl_3_2_27)(64bit) ( ) libnftables.so.1()(64bit) ( ) libnftables.so.1(LIBNFTABLES_1)(64bit) ( )"
RPROVIDES:criu = "criu ( =  3.19-9.el10) criu(x86-64) ( =  3.19-9.el10)"

URI_criu-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/criu-libs-3.19-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:criu-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libprotobuf-c.so.1()(64bit) ( ) libprotobuf-c.so.1(LIBPROTOBUF_C_1.0.0)(64bit) ( ) criu ( =  3.19-9.el10)"
RPROVIDES:criu-libs = "libcriu.so.2()(64bit) ( ) criu-libs ( =  3.19-9.el10) criu-libs(x86-64) ( =  3.19-9.el10)"

URI_python3-criu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-criu-3.19-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-criu = "python3-protobuf ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-criu = "python3-criu ( =  3.19-9.el10) python-criu ( =  3.19-9.el10) python3-criu(x86-64) ( =  3.19-9.el10) python3.12-criu ( =  3.19-9.el10) python3.12dist(pycriu) ( =  3.19) python3dist(pycriu) ( =  3.19)"

URI_criu-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/criu-devel-3.19-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:criu-devel = "/usr/bin/pkg-config ( ) pkgconfig(libprotobuf-c) ( ) libcriu.so.2()(64bit) ( ) criu ( =  3.19-9.el10) criu-libs ( =  3.19-9.el10)"
RPROVIDES:criu-devel = "criu-devel ( =  3.19-9.el10) criu-devel(x86-64) ( =  3.19-9.el10) pkgconfig(criu) ( =  3.19)"

URI_criu-ns = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/criu-ns-3.19-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:criu-ns = "/usr/bin/python3 ( ) criu ( =  3.19-9.el10)"
RPROVIDES:criu-ns = "criu-ns ( =  3.19-9.el10) criu-ns(x86-64) ( =  3.19-9.el10)"
