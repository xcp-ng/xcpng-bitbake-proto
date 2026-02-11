
PN = "xdp-tools"
PE = "0"
PV = "1.5.5"
PR = "1.el10_0"
PACKAGES = "libxdp xdp-tools libxdp-devel libxdp-static"


URI_libxdp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libxdp-1.5.5-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxdp = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libbpf.so.1()(64bit) ( ) libbpf.so.1(LIBBPF_0.0.1)(64bit) ( ) libbpf.so.1(LIBBPF_0.0.7)(64bit) ( ) libbpf.so.1(LIBBPF_0.1.0)(64bit) ( ) libbpf.so.1(LIBBPF_0.0.6)(64bit) ( ) libbpf.so.1(LIBBPF_0.0.8)(64bit) ( ) libbpf.so.1(LIBBPF_0.0.9)(64bit) ( ) libbpf.so.1(LIBBPF_0.6.0)(64bit) ( ) libbpf.so.1(LIBBPF_0.5.0)(64bit) ( ) libbpf.so.1(LIBBPF_0.2.0)(64bit) ( ) libbpf.so.1(LIBBPF_0.7.0)(64bit) ( ) libbpf.so.1(LIBBPF_0.0.2)(64bit) ( )"
RPROVIDES:libxdp = "libxdp.so.1()(64bit) ( ) libxdp.so.1(LIBXDP_1.0.0)(64bit) ( ) libxdp.so.1(LIBXDP_1.2.0)(64bit) ( ) libxdp.so.1(LIBXDP_1.3.0)(64bit) ( ) libxdp.so.1(LIBXDP_1.4.0)(64bit) ( ) libxdp.so.1(LIBXDP_1.5.0)(64bit) ( ) libxdp ( =  1.5.5-1.el10_0) libxdp(x86-64) ( =  1.5.5-1.el10_0)"

URI_xdp-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xdp-tools-1.5.5-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:xdp-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) /usr/bin/bash ( ) libbpf.so.1()(64bit) ( ) libbpf.so.1(LIBBPF_0.0.1)(64bit) ( ) libbpf.so.1(LIBBPF_0.0.7)(64bit) ( ) libbpf.so.1(LIBBPF_0.1.0)(64bit) ( ) libbpf.so.1(LIBBPF_0.0.6)(64bit) ( ) libbpf.so.1(LIBBPF_0.0.8)(64bit) ( ) libbpf.so.1(LIBBPF_0.0.9)(64bit) ( ) libbpf.so.1(LIBBPF_0.6.0)(64bit) ( ) libbpf.so.1(LIBBPF_0.0.4)(64bit) ( ) libbpf.so.1(LIBBPF_0.8.0)(64bit) ( ) libpcap.so.1()(64bit) ( ) libbpf.so.1(LIBBPF_0.7.0)(64bit) ( ) libxdp.so.1()(64bit) ( ) libxdp.so.1(LIBXDP_1.0.0)(64bit) ( ) libxdp.so.1(LIBXDP_1.2.0)(64bit) ( ) libxdp.so.1(LIBXDP_1.3.0)(64bit) ( ) libxdp ( =  1.5.5-1.el10_0)"
RPROVIDES:xdp-tools = "xdp-tools ( =  1.5.5-1.el10_0) xdp-tools(x86-64) ( =  1.5.5-1.el10_0)"

URI_libxdp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libxdp-devel-1.5.5-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxdp-devel = "/usr/bin/pkg-config ( ) kernel-headers ( ) pkgconfig(libbpf) ( ) libxdp.so.1()(64bit) ( ) libxdp ( =  1.5.5-1.el10_0)"
RPROVIDES:libxdp-devel = "libxdp-devel ( =  1.5.5-1.el10_0) libxdp-devel(x86-64) ( =  1.5.5-1.el10_0) pkgconfig(libxdp) ( =  1.5.5)"

URI_libxdp-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libxdp-static-1.5.5-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxdp-static = "libxdp-devel ( =  1.5.5-1.el10_0)"
RPROVIDES:libxdp-static = "libxdp-static ( =  1.5.5-1.el10_0) libxdp-static(x86-64) ( =  1.5.5-1.el10_0)"
