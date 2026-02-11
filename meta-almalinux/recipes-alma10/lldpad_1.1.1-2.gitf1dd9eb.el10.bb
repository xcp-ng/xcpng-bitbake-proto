
PN = "lldpad"
PE = "0"
PV = "1.1.1"
PR = "2.gitf1dd9eb.el10"
PACKAGES = "lldpad lldpad-devel"


URI_lldpad = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/lldpad-1.1.1-2.gitf1dd9eb.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lldpad = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libnl-3.so.200()(64bit) ( ) libnl-3.so.200(libnl_3)(64bit) ( ) libnl3 ( ) readline ( ) libconfig ( ) libconfig.so.11()(64bit) ( )"
RPROVIDES:lldpad = "liblldp_clif.so.1()(64bit) ( ) lldpad ( =  1.1.1-2.gitf1dd9eb.el10) lldpad(x86-64) ( =  1.1.1-2.gitf1dd9eb.el10)"

URI_lldpad-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/lldpad-devel-1.1.1-2.gitf1dd9eb.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lldpad-devel = "/usr/bin/pkg-config ( ) liblldp_clif.so.1()(64bit) ( ) lldpad(x86-64) ( =  1.1.1-2.gitf1dd9eb.el10)"
RPROVIDES:lldpad-devel = "dcbd-devel ( =  1.1.1-2.gitf1dd9eb.el10) lldpad-devel ( =  1.1.1-2.gitf1dd9eb.el10) lldpad-devel(x86-64) ( =  1.1.1-2.gitf1dd9eb.el10) pkgconfig(liblldp_clif) ( =  1.0.0) pkgconfig(lldpad) ( =  1.1.1)"
