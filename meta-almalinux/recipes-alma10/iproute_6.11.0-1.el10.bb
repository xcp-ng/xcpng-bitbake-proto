
PN = "iproute"
PE = "0"
PV = "6.11.0"
PR = "1.el10"
PACKAGES = "iproute iproute-tc iproute-devel iproute-doc"


URI_iproute = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/iproute-6.11.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:iproute = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libcap.so.2()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libelf.so.1()(64bit) ( ) libelf.so.1(ELFUTILS_1.0)(64bit) ( ) libmnl.so.0()(64bit) ( ) libmnl.so.0(LIBMNL_1.0)(64bit) ( ) libbpf.so.1()(64bit) ( ) libbpf ( ) libbpf.so.1(LIBBPF_0.0.1)(64bit) ( ) libbpf.so.1(LIBBPF_0.0.6)(64bit) ( ) libbpf.so.1(LIBBPF_0.0.7)(64bit) ( ) libbpf.so.1(LIBBPF_0.1.0)(64bit) ( ) libbpf.so.1(LIBBPF_0.2.0)(64bit) ( ) libbpf.so.1(LIBBPF_0.6.0)(64bit) ( ) libmnl.so.0(LIBMNL_1.1)(64bit) ( ) psmisc ( ) libbpf.so.1(LIBBPF_0.0.4)(64bit) ( ) libbpf.so.1(LIBBPF_0.5.0)(64bit) ( )"
RPROVIDES:iproute = "/sbin/ip ( ) iproute(x86-64) ( =  6.11.0-1.el10) config(iproute) ( =  6.11.0-1.el10) iproute ( =  6.11.0-1.el10)"

URI_iproute-tc = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/iproute-tc-6.11.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:iproute-tc = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libcap.so.2()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libelf.so.1()(64bit) ( ) libelf.so.1(ELFUTILS_1.0)(64bit) ( ) libmnl.so.0()(64bit) ( ) libmnl.so.0(LIBMNL_1.0)(64bit) ( ) libbpf.so.1()(64bit) ( ) libxtables.so.12()(64bit) ( ) libbpf.so.1(LIBBPF_0.0.1)(64bit) ( ) libbpf.so.1(LIBBPF_0.0.6)(64bit) ( ) libbpf.so.1(LIBBPF_0.0.7)(64bit) ( ) libbpf.so.1(LIBBPF_0.1.0)(64bit) ( ) libbpf.so.1(LIBBPF_0.2.0)(64bit) ( ) libbpf.so.1(LIBBPF_0.6.0)(64bit) ( ) iproute(x86-64) ( =  6.11.0-1.el10)"
RPROVIDES:iproute-tc = "/sbin/tc ( ) iproute-tc ( =  6.11.0-1.el10) iproute-tc(x86-64) ( =  6.11.0-1.el10)"

URI_iproute-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/iproute-devel-6.11.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:iproute-devel = "iproute ( =  6.11.0-1.el10)"
RPROVIDES:iproute-devel = "iproute-devel ( =  6.11.0-1.el10) iproute-devel(x86-64) ( =  6.11.0-1.el10) iproute-static ( =  6.11.0-1.el10)"

URI_iproute-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/iproute-doc-6.11.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:iproute-doc = "iproute ( =  6.11.0-1.el10)"
RPROVIDES:iproute-doc = "iproute-doc ( =  6.11.0-1.el10) iproute-doc(x86-64) ( =  6.11.0-1.el10)"
