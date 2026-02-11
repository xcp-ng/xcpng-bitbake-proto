
PN = "ipset"
PE = "0"
PV = "7.22"
PR = "7.el10_0"
PACKAGES = "ipset ipset-libs ipset-service ipset-devel"


URI_ipset = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ipset-7.22-7.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ipset = "rtld(GNU_HASH) ( ) /bin/sh ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libipset.so.13()(64bit) ( ) libipset.so.13(LIBIPSET_2.0)(64bit) ( ) libipset.so.13(LIBIPSET_4.11)(64bit) ( ) libipset.so.13(LIBIPSET_4.8)(64bit) ( ) ipset-libs(x86-64) ( =  7.22-7.el10_0) kernel-64k-debug-modules-extra ( if  kernel-64k-debug-core) kernel-64k-modules-extra ( if  kernel-64k-core) kernel-debug-modules-extra ( if  kernel-debug-core) kernel-modules-extra ( if  kernel-core) kernel-rt-64k-debug-modules-extra ( if  kernel-rt-64k-debug-core) kernel-rt-64k-modules-extra ( if  kernel-rt-64k-core) kernel-rt-debug-modules-extra ( if  kernel-rt-debug-core) kernel-rt-modules-extra ( if  kernel-rt-core)"
RPROVIDES:ipset = "ipset ( =  7.22-7.el10_0) ipset(x86-64) ( =  7.22-7.el10_0)"

URI_ipset-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ipset-libs-7.22-7.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ipset-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libmnl.so.0()(64bit) ( ) libmnl.so.0(LIBMNL_1.0)(64bit) ( )"
RPROVIDES:ipset-libs = "libipset.so.13()(64bit) ( ) libipset.so.13(LIBIPSET_2.0)(64bit) ( ) libipset.so.13(LIBIPSET_4.11)(64bit) ( ) libipset.so.13(LIBIPSET_4.8)(64bit) ( ) libipset.so.13(LIBIPSET_1.0)(64bit) ( ) libipset.so.13(LIBIPSET_3.0)(64bit) ( ) libipset.so.13(LIBIPSET_4.0)(64bit) ( ) libipset.so.13(LIBIPSET_4.1)(64bit) ( ) libipset.so.13(LIBIPSET_4.10)(64bit) ( ) libipset.so.13(LIBIPSET_4.12)(64bit) ( ) libipset.so.13(LIBIPSET_4.2)(64bit) ( ) libipset.so.13(LIBIPSET_4.3)(64bit) ( ) libipset.so.13(LIBIPSET_4.4)(64bit) ( ) libipset.so.13(LIBIPSET_4.5)(64bit) ( ) libipset.so.13(LIBIPSET_4.6)(64bit) ( ) libipset.so.13(LIBIPSET_4.7)(64bit) ( ) libipset.so.13(LIBIPSET_4.9)(64bit) ( ) ipset-libs(x86-64) ( =  7.22-7.el10_0) ipset-libs ( =  7.22-7.el10_0)"

URI_ipset-service = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipset-service-7.22-7.el10_0.noarch.rpm;unpack=0"
RDEPENDS:ipset-service = "/bin/sh ( ) systemd ( ) /usr/bin/sh ( ) /usr/bin/bash ( ) iptables-nft-services ( ) ipset ( =  7.22-7.el10_0)"
RPROVIDES:ipset-service = "config(ipset-service) ( =  7.22-7.el10_0) ipset-service ( =  7.22-7.el10_0)"

URI_ipset-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ipset-devel-7.22-7.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ipset-devel = "/usr/bin/pkg-config ( ) kernel-headers ( ) libipset.so.13()(64bit) ( ) ipset-libs(x86-64) ( =  7.22-7.el10_0) pkgconfig(libmnl) ( >=  1)"
RPROVIDES:ipset-devel = "ipset-devel ( =  7.22-7.el10_0) ipset-devel(x86-64) ( =  7.22-7.el10_0) pkgconfig(libipset) ( =  7.22)"
