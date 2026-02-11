
PN = "opensm"
PE = "0"
PV = "3.3.24"
PR = "12.el10"
PACKAGES = "opensm opensm-libs opensm-devel opensm-static"


URI_opensm = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/opensm-3.3.24-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:opensm = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/bash ( ) logrotate ( ) rdma ( ) libopensm.so.9()(64bit) ( ) libopensm.so.9(OPENSM_1.5)(64bit) ( ) libosmcomp.so.5()(64bit) ( ) libosmcomp.so.5(OSMCOMP_2.3)(64bit) ( ) libosmvendor.so.5()(64bit) ( ) libosmvendor.so.5(OSMVENDOR_2.0)(64bit) ( ) opensm-libs(x86-64) ( =  3.3.24-12.el10)"
RPROVIDES:opensm = "config(opensm) ( =  3.3.24-12.el10) opensm ( =  3.3.24-12.el10) opensm(x86-64) ( =  3.3.24-12.el10)"

URI_opensm-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/opensm-libs-3.3.24-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:opensm-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libibumad.so.3()(64bit) ( ) libibumad.so.3(IBUMAD_1.0)(64bit) ( )"
RPROVIDES:opensm-libs = "libopensm.so.9()(64bit) ( ) libopensm.so.9(OPENSM_1.5)(64bit) ( ) libosmcomp.so.5()(64bit) ( ) libosmcomp.so.5(OSMCOMP_2.3)(64bit) ( ) libosmvendor.so.5()(64bit) ( ) libosmvendor.so.5(OSMVENDOR_2.0)(64bit) ( ) opensm-libs(x86-64) ( =  3.3.24-12.el10) opensm-libs ( =  3.3.24-12.el10)"

URI_opensm-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/opensm-devel-3.3.24-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:opensm-devel = "libopensm.so.9()(64bit) ( ) libosmcomp.so.5()(64bit) ( ) libosmvendor.so.5()(64bit) ( ) opensm-libs(x86-64) ( =  3.3.24-12.el10)"
RPROVIDES:opensm-devel = "opensm-devel ( =  3.3.24-12.el10) opensm-devel(x86-64) ( =  3.3.24-12.el10)"

URI_opensm-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/opensm-static-3.3.24-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:opensm-static = "opensm-devel(x86-64) ( =  3.3.24-12.el10)"
RPROVIDES:opensm-static = "opensm-static ( =  3.3.24-12.el10) opensm-static(x86-64) ( =  3.3.24-12.el10)"
